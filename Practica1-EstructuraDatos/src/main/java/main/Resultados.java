/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import apuestas.Apuesta;
import javax.swing.JOptionPane;

/**
 *
 * @author oscar
 */
public class Resultados extends javax.swing.JFrame {

    int[] resultados;
    Apuesta[] apuestas;

    public Resultados(Apuesta[] apuestas) {
        this.apuestas = apuestas;
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        iniciar();
    }

    public void iniciar() {
        JOptionPane.showMessageDialog(null, "La carrera ha terminado. Ingresa los resultados");
        resultados = new int[10];
        VentanaOrden vtnOrden = new VentanaOrden(resultados, areaResultadosCarrera, this);
        vtnOrden.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaResultadosCarrera = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaResultadosApuestas = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        botonPunteo = new javax.swing.JButton();
        botonNombre = new javax.swing.JButton();
        botonVerResultados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Resultados de la carrera");

        areaResultadosCarrera.setColumns(20);
        areaResultadosCarrera.setRows(5);
        areaResultadosCarrera.setEnabled(false);
        jScrollPane1.setViewportView(areaResultadosCarrera);

        areaResultadosApuestas.setColumns(20);
        areaResultadosApuestas.setRows(5);
        areaResultadosApuestas.setEnabled(false);
        jScrollPane2.setViewportView(areaResultadosApuestas);

        jLabel2.setText("Resultados de Apuestas");

        botonPunteo.setText("Ordenar por Punteo");
        botonPunteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPunteoActionPerformed(evt);
            }
        });

        botonNombre.setText("Ordenar por Nombre");
        botonNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNombreActionPerformed(evt);
            }
        });

        botonVerResultados.setText("Ver Resultados");
        botonVerResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerResultadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(160, 160, 160))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(botonVerResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(botonPunteo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonVerResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonPunteo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVerResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerResultadosActionPerformed
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < apuestas.length; j++) {

                if (apuestas[j].isValidacion() == true) {
                    int[] orden = apuestas[j].getOrden();
                    if (resultados[i] == orden[i]) {
                        if (i == 0) {
                            apuestas[j].aumentarPunteo(10);
                        } else if (i == 1) {
                            apuestas[j].aumentarPunteo(9);
                        } else if (i == 2) {
                            apuestas[j].aumentarPunteo(8);
                        } else if (i == 3) {
                            apuestas[j].aumentarPunteo(7);
                        } else if (i == 4) {
                            apuestas[j].aumentarPunteo(6);
                        } else if (i == 5) {
                            apuestas[j].aumentarPunteo(5);
                        } else if (i == 6) {
                            apuestas[j].aumentarPunteo(4);
                        } else if (i == 7) {
                            apuestas[j].aumentarPunteo(3);
                        } else if (i == 8) {
                            apuestas[j].aumentarPunteo(2);
                        } else if (i == 9) {
                            apuestas[j].aumentarPunteo(1);
                        }
                    }
                }
            }
        }
        ordenarPorPunteo();
    }//GEN-LAST:event_botonVerResultadosActionPerformed

    private void botonPunteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPunteoActionPerformed
        ordenarPorPunteo();
    }//GEN-LAST:event_botonPunteoActionPerformed

    private void botonNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNombreActionPerformed
        ordenarPorNombre();
    }//GEN-LAST:event_botonNombreActionPerformed

    public void escribirApuestas() {

        for (int i = apuestas.length - 1; i >= 0; i--) {
            if (apuestas[i].isValidacion() == true) {
                String texto = "";
                texto = apuestas[i].getNombre() + " Punteo: " + apuestas[i].getPunteo();
                areaResultadosApuestas.append(texto);
                areaResultadosApuestas.append("\n");
            }
        }
    }

    public void ordenarPorNombre() {
        areaResultadosApuestas.setText(null);
        for (int i = 0; i < apuestas.length; i++) {
            for (int j = 0; j < apuestas.length - 1; j++) {
                if (apuestas[j].getNombre().compareTo(apuestas[j + 1].getNombre()) > 0) {
                    Apuesta auxiliar;
                    auxiliar = apuestas[j];
                    apuestas[j] = apuestas[j + 1];
                    apuestas[j + 1] = auxiliar;
                }
            }
        }
        for (int i = 0; i < apuestas.length; i++) {
            if (apuestas[i].isValidacion() == true) {
                String texto = "";
                texto = apuestas[i].getNombre() + " Punteo: " + apuestas[i].getPunteo();
                areaResultadosApuestas.append(texto);
                areaResultadosApuestas.append("\n");
            }
        }
    }

    public void ordenarPorPunteo() {
        areaResultadosApuestas.setText(null);
        int posicion;
        Apuesta menor = new Apuesta();
        Apuesta auxiliar = new Apuesta();

        for (int i = 0; i < apuestas.length; i++) {
            menor = apuestas[i];
            posicion = i;
            for (int j = i + 1; j < apuestas.length; j++) {
                if (apuestas[j].getPunteo() < menor.getPunteo()) {
                    menor = apuestas[j];
                    posicion = j;
                }
            }
            if (posicion != i) {
                auxiliar = apuestas[i];
                apuestas[i] = apuestas[posicion];
                apuestas[posicion] = auxiliar;
            }
        }
        for (int i = apuestas.length - 1; i >= 0; i--) {
            if (apuestas[i].isValidacion() == true) {
                String texto = "";
                texto = apuestas[i].getNombre() + " Punteo: " + apuestas[i].getPunteo();
                areaResultadosApuestas.append(texto);
                areaResultadosApuestas.append("\n");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaResultadosApuestas;
    private javax.swing.JTextArea areaResultadosCarrera;
    private javax.swing.JButton botonNombre;
    private javax.swing.JButton botonPunteo;
    private javax.swing.JButton botonVerResultados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
