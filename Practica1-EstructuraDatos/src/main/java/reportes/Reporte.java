package reportes;

public class Reporte extends javax.swing.JFrame {

    private long tiempoIngreso = 0;
    private double pasosIngreso = 0;
    private long tiempoVerificacion = 0;
    private double pasosVerificacion = 0;
    private long tiempoResultados = 0;
    private double pasosResultados = 0;
    private long tiempoOrdenamientoP = 0;
    private double pasosOrdenamientoP = 0;
    private long tiempoOrdenamientoA = 0;
    private double pasosOrdenamientoA = 0;

    public Reporte() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public long getTiempoIngreso() {
        return tiempoIngreso;
    }

    public void setTiempoIngreso(long tiempoIngreso) {
        this.tiempoIngreso = tiempoIngreso;
        actualizarReporte();
    }

    public double getPasosIngreso() {
        return pasosIngreso;
    }

    public void setPasosIngreso(double pasosIngreso) {
        this.pasosIngreso = pasosIngreso;
        actualizarReporte();
    }

    public long getTiempoVerificacion() {
        return tiempoVerificacion;
    }

    public void setTiempoVerificacion(long tiempoVerificacion) {
        this.tiempoVerificacion = tiempoVerificacion;
        actualizarReporte();
    }

    public double getPasosVerificacion() {
        return pasosVerificacion;
    }

    public void setPasosVerificacion(double pasosVerificacion) {
        this.pasosVerificacion = pasosVerificacion;
        actualizarReporte();
    }

    public long getTiempoResultados() {
        return tiempoResultados;
    }

    public void setTiempoResultados(long tiempoResultados) {
        this.tiempoResultados = tiempoResultados;
        actualizarReporte();
    }

    public double getPasosResultados() {
        return pasosResultados;
    }

    public void setPasosResultados(double pasosResultados) {
        this.pasosResultados = pasosResultados;
        actualizarReporte();
    }

    public long getTiempoOrdenamientoP() {
        return tiempoOrdenamientoP;
    }

    public void setTiempoOrdenamientoP(long tiempoOrdenamientoN) {
        this.tiempoOrdenamientoP = tiempoOrdenamientoN;
        actualizarReporte();
    }

    public double getPasosOrdenamientoP() {
        return pasosOrdenamientoP;
    }

    public void setPasosOrdenamientoP(double pasosOrdenamientoN) {
        this.pasosOrdenamientoP = pasosOrdenamientoN;
        actualizarReporte();
    }

    public long getTiempoOrdenamientoA() {
        return tiempoOrdenamientoA;
    }

    public void setTiempoOrdenamientoA(long tiempoOrdenamientoA) {
        this.tiempoOrdenamientoA = tiempoOrdenamientoA;
        actualizarReporte();
    }

    public double getPasosOrdenamientoA() {
        return pasosOrdenamientoA;
    }

    public void setPasosOrdenamientoA(double pasosOrdenamientoA) {
        this.pasosOrdenamientoA = pasosOrdenamientoA;
        actualizarReporte();
    }

    public void actualizarReporte() {
        labelTiempo1.setText("" + tiempoIngreso + " s");
        labelTiempo2.setText("" + tiempoVerificacion+ " s");
        labelTiempo3.setText("" + tiempoResultados+ " s");
        labelTiempo4.setText("" + tiempoOrdenamientoA+ " s");
        labelTiempo5.setText("" + tiempoOrdenamientoP+ " s");

        labelProceso1.setText("" + pasosIngreso);
        labelProceso2.setText("" + pasosVerificacion);
        labelProceso3.setText("" + pasosResultados);
        labelProceso4.setText("" + pasosOrdenamientoA);
        labelProceso5.setText("" + pasosOrdenamientoP);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelTiempo1 = new javax.swing.JLabel();
        labelProceso1 = new javax.swing.JLabel();
        labelTiempo2 = new javax.swing.JLabel();
        labelProceso2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelTiempo3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelProceso3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        labelTiempo4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        labelTiempo5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labelProceso4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        labelProceso5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        labelMayor = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        labelMenor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte");

        jLabel1.setText("Ingreso de Apuestas");

        jLabel2.setText("Tiempo de proceso:");

        jLabel3.setText("Pasos Realizados");

        jLabel4.setText("Verificacion de Apuestas");

        jLabel5.setText("Tiempo de Proceso:");

        jLabel6.setText("Pasos Realizados:");

        jLabel7.setText("Calculo de Resultados");

        jLabel8.setText("Tiempo de proceso: ");

        jLabel9.setText("Pasos Realizados: ");

        jLabel10.setText("Ordenamiento de Apuestas");

        jLabel11.setText("Tiempo:");

        jLabel12.setText("Ordenamiento por nombre:");

        jLabel13.setText("Ordenamiento por punteo:");

        jLabel14.setText("Pasos");

        jLabel15.setText("Ordenamiento por nombre:");

        jLabel16.setText("Ordenamiento por punteo:");

        jLabel17.setText("Mayor cantidad de pasos:");

        jLabel18.setText("Menor cantidad de pasos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelTiempo1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelTiempo3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(labelTiempo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(27, 27, 27)
                                    .addComponent(labelProceso1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(labelProceso2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(labelProceso3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel10))
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelTiempo4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelTiempo5))
                            .addComponent(jLabel14)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelProceso4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelProceso5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelMayor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelMenor))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel7)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelTiempo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelProceso1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(labelTiempo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labelProceso2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(labelTiempo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(labelProceso3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(labelTiempo4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(labelTiempo5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(labelProceso4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(labelProceso5))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(labelMayor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(labelMenor))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelMayor;
    private javax.swing.JLabel labelMenor;
    private javax.swing.JLabel labelProceso1;
    private javax.swing.JLabel labelProceso2;
    private javax.swing.JLabel labelProceso3;
    private javax.swing.JLabel labelProceso4;
    private javax.swing.JLabel labelProceso5;
    private javax.swing.JLabel labelTiempo1;
    private javax.swing.JLabel labelTiempo2;
    private javax.swing.JLabel labelTiempo3;
    private javax.swing.JLabel labelTiempo4;
    private javax.swing.JLabel labelTiempo5;
    // End of variables declaration//GEN-END:variables
}
