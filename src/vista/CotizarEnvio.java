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
        btnAgregar = new javax.swing.JButton();
        btnRecuperar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblLargo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jboxDestino = new javax.swing.JComboBox();
        lblOrigen1 = new javax.swing.JLabel();
        jboxOrigen1 = new javax.swing.JComboBox();
        SliderPeso = new javax.swing.JSlider();
        lblPeso1 = new javax.swing.JLabel();
        SliderAltura = new javax.swing.JSlider();
        SliderLargo = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        SliderAncho = new javax.swing.JSlider();

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

        btnAgregar.setBackground(new java.awt.Color(63, 82, 191));
        btnAgregar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnRecuperar.setBackground(new java.awt.Color(150, 166, 217));
        btnRecuperar.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        btnRecuperar.setForeground(new java.awt.Color(255, 255, 255));
        btnRecuperar.setText("OLVIDÉ MI CONTRASEÑA");
        btnRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarActionPerformed(evt);
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
        SliderPeso.setPaintLabels(true);
        SliderPeso.setPaintTicks(true);
        SliderPeso.setValue(1);

        lblPeso1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lblPeso1.setText("Altura:");

        SliderAltura.setMaximum(130);
        SliderAltura.setMinimum(1);
        SliderAltura.setPaintLabels(true);
        SliderAltura.setPaintTicks(true);
        SliderAltura.setValue(1);

        SliderLargo.setMaximum(130);
        SliderLargo.setMinimum(1);
        SliderLargo.setPaintLabels(true);
        SliderLargo.setPaintTicks(true);
        SliderLargo.setValue(1);

        jLabel3.setText("Ancho:");

        SliderAncho.setMaximum(130);
        SliderAncho.setMinimum(1);
        SliderAncho.setPaintLabels(true);
        SliderAncho.setPaintTicks(true);
        SliderAncho.setValue(1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(253, 253, 253))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOrigen)
                    .addComponent(lblPeso)
                    .addComponent(lblLargo)
                    .addComponent(jboxOrigen1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SliderPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SliderLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jboxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrigen1)
                    .addComponent(lblPeso1)
                    .addComponent(SliderAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(SliderAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(150, 150, 150))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(btnAgregar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(btnRecuperar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbImagen)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbImagen)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
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
                    .addComponent(SliderAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLargo)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SliderLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SliderAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnAgregar)
                .addGap(18, 18, 18)
                .addComponent(btnRecuperar)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarActionPerformed
       
    }//GEN-LAST:event_btnRecuperarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       
    }//GEN-LAST:event_btnAgregarActionPerformed

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
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnRecuperar;
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
    private javax.swing.JLabel lblLargo;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JLabel lblOrigen1;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPeso1;
    private javax.swing.JTextField txtRespuesta;
    // End of variables declaration//GEN-END:variables
}
