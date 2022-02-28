package main;

import apuestas.Apuesta;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Resultados {

    JTextArea areaResultados;

    public Resultados(JTextArea areaResultados) {
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
    
    public void exportarErrores(Apuesta[] apuestas){
        int errores = 0;
        String texto = "";
        for (int i = 0; i < apuestas.length; i++) {
            if (apuestas[i].isValidacion() == false) {
                errores++;
                texto = texto + " Error en apuesta No." + apuestas[i].getError() + "\n";
            }
        }
        if (errores > 0){
            
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
            if (repeticiones > 1){
                repetido = true;
            }
        }
        if (repetido == true){
            apuesta.setValidacion(false);
            apuesta.setError("La apuesta tiene valores repetidos");
        }
    }

}
