package main;

import apuestas.Apuesta;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Stack;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import reportes.Reporte;

public class Main extends javax.swing.JFrame {

    private Apuesta[] apuestas;
    Reporte reporte = new Reporte();

    public Main() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        botonProcesar = new javax.swing.JButton();
        botonResultados = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        itemImportar = new javax.swing.JMenuItem();
        menuAcciones = new javax.swing.JMenu();
        itemApuesta = new javax.swing.JMenuItem();
        itemLimpiar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areaTexto1.setEditable(false);
        areaTexto1.setColumns(20);
        areaTexto1.setRows(5);
        areaTexto1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(areaTexto1);

        jLabel1.setText("Area de texto para ingresar apuestas");

        botonProcesar.setText("Procesar Apuestas");
        botonProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProcesarActionPerformed(evt);
            }
        });

        botonResultados.setText("Ver Resultados");
        botonResultados.setEnabled(false);
        botonResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResultadosActionPerformed(evt);
            }
        });

        menu1.setText("Archivo");

        itemImportar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemImportar.setText("Importar Apuestas");
        itemImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemImportarActionPerformed(evt);
            }
        });
        menu1.add(itemImportar);

        jMenuBar1.add(menu1);

        menuAcciones.setText("Acciones");

        itemApuesta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemApuesta.setText("Agregar Apuesta");
        itemApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemApuestaActionPerformed(evt);
            }
        });
        menuAcciones.add(itemApuesta);

        itemLimpiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemLimpiar.setText("Limpiar");
        itemLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLimpiarActionPerformed(evt);
            }
        });
        menuAcciones.add(itemLimpiar);

        jMenuBar1.add(menuAcciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(botonProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(botonResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemImportarActionPerformed
        botonResultados.setEnabled(false);
        File fichero;
        JFileChooser seleccionar = new JFileChooser();

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de Texto", "txt");
        seleccionar.setAcceptAllFileFilterUsed(false);
        seleccionar.addChoosableFileFilter(filtro);
        seleccionar.showOpenDialog(null);
        fichero = seleccionar.getSelectedFile();
        try {
            FileReader Lector = new FileReader(fichero);
            BufferedReader bufer = new BufferedReader(Lector);
            String linea = "";

            while ((linea = bufer.readLine()) != null) {
                areaTexto1.append(linea);
                areaTexto1.append("\n");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar archivo");
        }

    }//GEN-LAST:event_itemImportarActionPerformed

    private void itemLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLimpiarActionPerformed
        areaTexto1.setText(null);
        botonResultados.setEnabled(false);
    }//GEN-LAST:event_itemLimpiarActionPerformed

    private void botonProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProcesarActionPerformed
        if (areaTexto1.equals("")) {
            JOptionPane.showMessageDialog(null, "No haz ingresado apuestas");
        } else {
            try {
                String texto = areaTexto1.getText();
                int cantidadLineas = contarLineas();
                int numero = 0;
                apuestas = new Apuesta[cantidadLineas];
                String[] lineas = obtenerLineas(cantidadLineas, texto);
                for (int i = 0; i < lineas.length; i++) {
                    agregarApuestas(apuestas, numero, lineas[i]);
                    numero++;
                }

                Verificacion verificacion = new Verificacion(reporte);
                verificacion.verificarApuestas(apuestas);
                botonResultados.setEnabled(true);
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }//GEN-LAST:event_botonProcesarActionPerformed

    private void botonResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResultadosActionPerformed

        Resultados ventanaResultados = new Resultados(apuestas, reporte);

    }//GEN-LAST:event_botonResultadosActionPerformed

    private void itemApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemApuestaActionPerformed
        NuevaApuesta nvApuesta = new NuevaApuesta(areaTexto1);
        nvApuesta.setVisible(true);
    }//GEN-LAST:event_itemApuestaActionPerformed

    public String[] obtenerLineas(int numeroLineas, String texto) {
        String[] lineas = new String[numeroLineas];
        int lineasContadas = 0;
        int ultima = 0;
        for (int i = 0; i < texto.length() - 1; i++) {
            if (texto.substring(i, i + 1).equals("\n")) {
                lineas[lineasContadas] = texto.substring(ultima, i);
                lineasContadas++;
                ultima = i + 1;

            }
        }
        lineas[lineasContadas] = texto.substring(ultima, texto.length() - 1);
        return lineas;
    }

    public void agregarApuestas(Apuesta[] apuestas, int numero, String linea) {
        Apuesta nuevaApuesta = new Apuesta();
        int[] lugares = new int[10];
        double pasos = 0;
        try {
            long startTime = System.currentTimeMillis();
            int comas[] = new int[11];
            int x = 0;
            for (int i = 0; i < linea.length() - 1; i++) {
                pasos++;
                int j = i + 1;
                if (",".equals(linea.substring(i, j))) {
                    pasos++;
                    comas[x] = i;
                    x++;
                }
            }

            String nombre = linea.substring(1, comas[0] - 1);
            double monto = Double.parseDouble(linea.substring(comas[0] + 2, comas[1] - 1));
            lugares[0] = Integer.parseInt(linea.substring(comas[1] + 2, comas[2] - 1));
            lugares[1] = Integer.parseInt(linea.substring(comas[2] + 2, comas[3] - 1));
            lugares[2] = Integer.parseInt(linea.substring(comas[3] + 2, comas[4] - 1));
            lugares[3] = Integer.parseInt(linea.substring(comas[4] + 2, comas[5] - 1));
            lugares[4] = Integer.parseInt(linea.substring(comas[5] + 2, comas[6] - 1));
            lugares[5] = Integer.parseInt(linea.substring(comas[6] + 2, comas[7] - 1));
            lugares[6] = Integer.parseInt(linea.substring(comas[7] + 2, comas[8] - 1));
            lugares[7] = Integer.parseInt(linea.substring(comas[8] + 2, comas[9] - 1));
            lugares[8] = Integer.parseInt(linea.substring(comas[9] + 2, comas[10] - 1));
            lugares[9] = Integer.parseInt(linea.substring(comas[10] + 2, linea.length() - 1));

            nuevaApuesta.setNombre(nombre);
            nuevaApuesta.setMonto(monto);
            nuevaApuesta.setOrden(lugares);
            nuevaApuesta.setValidacion(true);
            pasos += 10;
            long endTime = System.currentTimeMillis();
            reporte.setTiempoIngreso(((endTime - startTime)/1000));
            reporte.setPasosIngreso(pasos);
        } catch (Exception e) {
            nuevaApuesta.setError("Datos Faltantes");
            nuevaApuesta.setValidacion(false);
        }
        apuestas[numero] = nuevaApuesta;
    }

    public int contarLineas() {
        int linea = 0;
        String texto = areaTexto1.getText();
        for (int i = 0; i < texto.length() - 1; i++) {
            if (texto.substring(i, i + 1).equals("\n")) {
                linea++;
            }
        }
        linea++;
        return linea;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTexto1;
    private javax.swing.JButton botonProcesar;
    private javax.swing.JButton botonResultados;
    private javax.swing.JMenuItem itemApuesta;
    private javax.swing.JMenuItem itemImportar;
    private javax.swing.JMenuItem itemLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenu menuAcciones;
    // End of variables declaration//GEN-END:variables

}
