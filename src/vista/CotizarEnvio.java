package vista;

import controlador.ListaEnlazada;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class CotizarEnvio extends javax.swing.JFrame {

   

    public CotizarEnvio() {
  
    }

    public CotizarEnvio(ListaEnlazada listaUsuarios) {
      
    }

    @Override
    public Image getIconImage() {
        Image valorRetornado = Toolkit.getDefaultToolkit().getImage(
                ClassLoader.getSystemResource("imagenes/beastBoxIcon.png"));
        return valorRetornado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        txtRespuesta = new javax.swing.JTextField();
        lbR = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbImagen = new javax.swing.JLabel();
        lblOrigen = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        btnCotizar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblLargo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jboxDestino = new javax.swing.JComboBox();
        lblOrigen1 = new javax.swing.JLabel();
        jboxOrigen1 = new javax.swing.JComboBox();
        SliderPeso = new javax.swing.JSlider();
        lblPeso1 = new javax.swing.JLabel();
        SliderLargo = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        SliderAncho = new javax.swing.JSlider();
        SliderAltura = new javax.swing.JSlider();
        lblKg = new javax.swing.JLabel();
        lblm = new javax.swing.JLabel();
        lblm2 = new javax.swing.JLabel();
        lblm3 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        btnRegresar2 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtRespuesta.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        lbR.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbR.setText("Respuesta:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(150, 166, 217));
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(67, 90, 217));

        jPanel2.setBackground(new java.awt.Color(242, 242, 240));

        lbImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/beastBoxIcon.png"))); // NOI18N

        lblOrigen.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lblOrigen.setText("Sucursal de origen:");

        lblPeso.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lblPeso.setText("Peso:");

        btnCotizar.setBackground(new java.awt.Color(63, 82, 191));
        btnCotizar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnCotizar.setForeground(new java.awt.Color(255, 255, 255));
        btnCotizar.setText("COTIZAR");
        btnCotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCotizarActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(150, 166, 217));
        btnRegresar.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        lblLargo.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lblLargo.setText("Largo:");

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel2.setText("Cotizar Envio");

        jboxDestino.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Guadalajara", "Monterrey", "Tampico", "Cancún", "Puerto Vallarta", "Mazatlán" }));

        lblOrigen1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lblOrigen1.setText("Sucursal de destino:");

        jboxOrigen1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Guadalajara", "Monterrey", "Tampico", "Cancún", "Puerto Vallarta", "Mazatlán" }));

        SliderPeso.setMaximum(130);
        SliderPeso.setMinimum(1);
        SliderPeso.setMinorTickSpacing(10);
        SliderPeso.setPaintLabels(true);
        SliderPeso.setPaintTicks(true);
        SliderPeso.setValue(1);
        SliderPeso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderPesoStateChanged(evt);
            }
        });

        lblPeso1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lblPeso1.setText("Altura:");

        SliderLargo.setMaximum(130);
        SliderLargo.setMinimum(1);
        SliderLargo.setMinorTickSpacing(10);
        SliderLargo.setPaintLabels(true);
        SliderLargo.setPaintTicks(true);
        SliderLargo.setValue(1);
        SliderLargo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderLargoStateChanged(evt);
            }
        });

        jLabel3.setText("Ancho:");

        SliderAncho.setMaximum(130);
        SliderAncho.setMinimum(1);
        SliderAncho.setMinorTickSpacing(10);
        SliderAncho.setPaintLabels(true);
        SliderAncho.setPaintTicks(true);
        SliderAncho.setValue(1);
        SliderAncho.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderAnchoStateChanged(evt);
            }
        });

        SliderAltura.setMaximum(130);
        SliderAltura.setMinimum(1);
        SliderAltura.setMinorTickSpacing(10);
        SliderAltura.setPaintTicks(true);
        SliderAltura.setSnapToTicks(true);
        SliderAltura.setValue(10);
        SliderAltura.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderAlturaStateChanged(evt);
            }
        });

        lblKg.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lblKg.setText("Kg:");

        lblm.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lblm.setText("M:");

        lblm2.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lblm2.setText("M:");

        lblm3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lblm3.setText("M:");

        lblPrecio.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        lblPrecio.setText("Precio");

        btnGenerar.setBackground(new java.awt.Color(63, 82, 191));
        btnGenerar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerar.setText("GENERAR");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        btnRegresar2.setBackground(new java.awt.Color(150, 166, 217));
        btnRegresar2.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        btnRegresar2.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar2.setText("Regresar");
        btnRegresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOrigen)
                            .addComponent(lblPeso)
                            .addComponent(lblLargo)
                            .addComponent(jboxOrigen1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SliderPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SliderLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbImagen)
                        .addGap(207, 207, 207)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKg)
                            .addComponent(lblm2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jboxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOrigen1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPeso1)
                                    .addComponent(SliderAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblm))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(SliderAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblm3)))
                        .addGap(138, 138, 138))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(btnCotizar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(lblPrecio))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbImagen)
                    .addComponent(jLabel2))
                .addGap(78, 78, 78)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrigen)
                    .addComponent(lblOrigen1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jboxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jboxOrigen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPeso)
                    .addComponent(lblPeso1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SliderPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SliderAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKg)
                    .addComponent(lblm))
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLargo)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SliderLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SliderAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblm2)
                    .addComponent(lblm3))
                .addGap(42, 42, 42)
                .addComponent(btnCotizar)
                .addGap(18, 18, 18)
                .addComponent(btnRegresar)
                .addGap(18, 18, 18)
                .addComponent(lblPrecio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegresar2)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
       
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnCotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCotizarActionPerformed
       
    }//GEN-LAST:event_btnCotizarActionPerformed

    private void SliderPesoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderPesoStateChanged
       lblKg.setText("Kg: "+SliderPeso.getValue());
    }//GEN-LAST:event_SliderPesoStateChanged

    private void SliderAlturaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderAlturaStateChanged
        lblm.setText("M: "+SliderAltura.getValue());
    }//GEN-LAST:event_SliderAlturaStateChanged

    private void SliderLargoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderLargoStateChanged
        lblm2.setText("M: "+SliderLargo.getValue());
    }//GEN-LAST:event_SliderLargoStateChanged

    private void SliderAnchoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderAnchoStateChanged
       lblm3.setText("M: "+SliderAncho.getValue());
    }//GEN-LAST:event_SliderAnchoStateChanged

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnRegresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresar2ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CotizarEnvio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider SliderAltura;
    private javax.swing.JSlider SliderAncho;
    private javax.swing.JSlider SliderLargo;
    private javax.swing.JSlider SliderPeso;
    private javax.swing.JButton btnCotizar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRegresar2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox jboxDestino;
    private javax.swing.JComboBox jboxOrigen1;
    private javax.swing.JLabel lbImagen;
    private javax.swing.JLabel lbR;
    private javax.swing.JLabel lblKg;
    private javax.swing.JLabel lblLargo;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JLabel lblOrigen1;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPeso1;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblm;
    private javax.swing.JLabel lblm2;
    private javax.swing.JLabel lblm3;
    private javax.swing.JTextField txtRespuesta;
    // End of variables declaration//GEN-END:variables
}
