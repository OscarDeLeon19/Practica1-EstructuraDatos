package main;

import apuestas.Apuesta;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import reportes.Reporte;

public class Verificacion {

    private int errores;
    private Reporte reporte;

    /**
     * Constructor de la clase verificacion
     *
     * @param reporte El reporte de apuestas
     */
    public Verificacion(Reporte reporte) {
        this.reporte = reporte;
    }

    /**
     * Verifica que las apuestas no tengan repetidos
     *
     * @param apuestas El arreglo de apuestas
     */
    public void verificarApuestas(Apuesta[] apuestas) {
        double[] pasos = new double[apuestas.length];
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < apuestas.length; i++) {
            if (apuestas[i].isValidacion() == true) {
                pasos[i] = comprobarRepetidos(apuestas[i]);
            }
        }
        long endTime = System.currentTimeMillis();
        int promedio = 0;
        for (int i = 0; i < apuestas.length; i++) {
            promedio += pasos[i];
        }
        promedio = promedio/apuestas.length;
        reporte.setTiempoVerificacion(((endTime - startTime) / 1000));
        reporte.setPasosVerificacion(promedio);
        exportarErrores(apuestas);
    }

    /**
     * Exporta los errores de las apuestas a un archivo de texto
     *
     * @param apuestas El arreglo de apuestas
     */
    public void exportarErrores(Apuesta[] apuestas) {
        errores = 0;
        String texto = "";
        for (int i = 0; i < apuestas.length; i++) {
            if (apuestas[i].isValidacion() == false) {
                errores++;
                texto = texto + "Error en apuesta No." + i + ": " + apuestas[i].getError() + "\n";
            }
        }
        if (errores > 0) {
            int opcionExportar = JOptionPane.showConfirmDialog(null, "Desea exportar los errores");
            if (opcionExportar == JOptionPane.YES_OPTION) {
                try {
                    FileWriter escribir;
                    PrintWriter linea;
                    JFileChooser seleccionar = new JFileChooser();
                    FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de Texto", "txt");
                    seleccionar.setAcceptAllFileFilterUsed(false);
                    seleccionar.addChoosableFileFilter(filtro);
                    File fichero;
                    int Guardar = seleccionar.showDialog(null, "Guardar");
                    if (Guardar == JFileChooser.APPROVE_OPTION) {
                        fichero = seleccionar.getSelectedFile();
                        if (fichero.exists()) {
                            int opcion = JOptionPane.showConfirmDialog(null, "Deseas sobrescribir");
                            if (opcion == JOptionPane.YES_OPTION) {
                                fichero.createNewFile();
                                escribir = new FileWriter(fichero, false);
                                escribir.write(texto);
                                escribir.close();
                                JOptionPane.showMessageDialog(null, "Reporte de errores Exportado");
                            } else {
                                JOptionPane.showMessageDialog(null, "No se guardo el archivo");
                            }
                        } else {
                            fichero.createNewFile();
                            escribir = new FileWriter(fichero, false);
                            escribir.write(texto);
                            escribir.close();
                            JOptionPane.showMessageDialog(null, "Reporte de errores Exportado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al guardar");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error " + e);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay errores para exportar");
        }
    }

    /**
     * Comprueba que no hayan repetidos en una apuesta
     *
     * @param apuesta La apuesta
     * @param nuevos_pasos Los pasos realizados
     */
    public double comprobarRepetidos(Apuesta apuesta) {
        double nuevos_pasos = 0;

        int[] orden = apuesta.getOrden();
        boolean repetido = false;
        for (int i = 1; i <= 10; i++) {
            int repeticiones = 0;
            nuevos_pasos++;
            for (int j = 0; j < 10; j++) {
                nuevos_pasos++;
                if (orden[j] == i) {
                    nuevos_pasos++;
                    repeticiones++;
                    j = 10;
                }
            }
            if (repeticiones > 1) {
                nuevos_pasos++;
                repetido = true;
            }
            if (repeticiones == 0) {
                repetido = true;
            }
        }
        if (repetido == true) {
            nuevos_pasos++;
            apuesta.setValidacion(false);
            apuesta.setError("La apuesta tiene valores repetidos y falta un valor");
        }
        System.out.println("Pasos: " + nuevos_pasos);
        return nuevos_pasos;
    }

}
