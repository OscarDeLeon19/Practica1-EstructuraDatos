package main;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class NuevaApuesta extends javax.swing.JFrame {
    
    private JTextArea areaApuestas;
    private JButton botonProcesar;
    /**
     * Constructor de la clase NuevaApuesta
     * @param areaApuestas El area de texto donde las apuestas se ingresan
     * @param botonProcesar El boton para procesar dichas apuestas
     */
    public NuevaApuesta(JTextArea areaApuestas, JButton botonProcesar) {
        this.areaApuestas = areaApuestas;
        this.botonProcesar = botonProcesar;
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textoMonto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textoOrden = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nueva Apuesta");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Monto: ");

        jLabel4.setText("Ingresa el orden de los caballos separados por comas.");

        jLabel5.setText("Solo los numeros y sin espacios");

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(textoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(137, 137, 137)
                                            .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(92, 92, 92)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(35, 35, 35)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(textoMonto))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGap(11, 11, 11)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textoMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(textoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Obtiene los datos del Frame y los guarda en una nueva linea.
     * @param evt 
     */
    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        
        try {
            String texto = "";
            double monto = Double.parseDouble(textoMonto.getText());
            String orden = textoOrden.getText();
            texto = "<" + textoNombre.getText() + ">,<" + monto + ">,";
            
            int comas[] = new int[9];
            int x = 0;
            for (int i = 0; i < orden.length() - 1; i++) {
                int j = i + 1;
                if (",".equals(orden.substring(i, j))) {
                    comas[x] = i;
                    x++;
                }
            }
            
            texto = texto + "<" + orden.substring(0, comas[0]) + ">,";
            texto = texto + "<" + orden.substring(comas[0] + 1, comas[1]) + ">,";
            texto = texto + "<" + orden.substring(comas[1] + 1, comas[2]) + ">,";
            texto = texto + "<" + orden.substring(comas[2] + 1, comas[3]) + ">,";
            texto = texto + "<" + orden.substring(comas[3] + 1, comas[4]) + ">,";
            texto = texto + "<" + orden.substring(comas[4] + 1, comas[5]) + ">,";
            texto = texto + "<" + orden.substring(comas[5] + 1, comas[6]) + ">,";
            texto = texto + "<" + orden.substring(comas[6] + 1, comas[7]) + ">,";
            texto = texto + "<" + orden.substring(comas[7] + 1, comas[8]) + ">,";
            texto = texto + "<" + orden.substring(comas[8] + 1, orden.length()) + ">";
            
            areaApuestas.append(texto);
            areaApuestas.append("\n");
            botonProcesar.setEnabled(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Apuesta invalida");
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField textoMonto;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoOrden;
    // End of variables declaration//GEN-END:variables
}
