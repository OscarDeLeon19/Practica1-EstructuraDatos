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

public class Verificacion {

    JTextArea areaResultados;

    public Verificacion(JTextArea areaResultados) {
        this.areaResultados = areaResultados;
    }

    public void verificarApuestas(Apuesta[] apuestas) {
        for (int i = 0; i < apuestas.length; i++) {
            if (apuestas[i].isValidacion() == true) {
                comprobarRepetidos(apuestas[i]);
            }
        }
        exportarErrores(apuestas);
    }

    public void exportarErrores(Apuesta[] apuestas) {
        int errores = 0;
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

    public void comprobarRepetidos(Apuesta apuesta) {
        int[] orden = apuesta.getOrden();
        boolean repetido = false;
        for (int i = 1; i <= 10; i++) {
            int repeticiones = 0;
            for (int j = 0; j < 10; j++) {
                if (orden[j] == i) {
                    repeticiones++;
                }
            }
            if (repeticiones > 1) {
                repetido = true;
            }
        }
        if (repetido == true) {
            apuesta.setValidacion(false);
            apuesta.setError("La apuesta tiene valores repetidos");
        }
    }

}
