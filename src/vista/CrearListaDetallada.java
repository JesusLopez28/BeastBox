package vista;

import controlador.Pila;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class CrearListaDetallada extends javax.swing.JFrame {

        Pila pilaCostoDetalle;
    
    public CrearListaDetallada(Pila pilaCostoDetalle) {
        this.pilaCostoDetalle = pilaCostoDetalle;
        initComponents();

        String cursor = "src/imagenes/seleccion.png";
        ImageIcon imgCursor = new ImageIcon(cursor);
        Cursor cursorC = Toolkit.getDefaultToolkit().createCustomCursor(imgCursor.getImage(), new Point(1, 1), null);
        this.setCursor(cursorC);
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
        lblNombreLista = new javax.swing.JLabel();
        txtNombreLista = new javax.swing.JTextField();
        lblPesoMaximo = new javax.swing.JLabel();
        txtAreaRemota = new javax.swing.JPasswordField();
        btnAgregar = new javax.swing.JButton();
        btnRecuperar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbC1 = new javax.swing.JLabel();
        txtPaqueteFragil = new javax.swing.JTextField();
        lbR1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSeguro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblPesoMaximo1 = new javax.swing.JLabel();
        txtAreaRemota1 = new javax.swing.JPasswordField();

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

        lblNombreLista.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lblNombreLista.setText("Nombre de lista:");

        txtNombreLista.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        lblPesoMaximo.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lblPesoMaximo.setText("Peso Maximo:");

        txtAreaRemota.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        txtAreaRemota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaRemotaActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(63, 82, 191));
        btnAgregar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("CREAR LISTA");
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

        lbC1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbC1.setText("Seguro:");

        txtPaqueteFragil.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        lbR1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbR1.setText("Paquete frágil");

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel2.setText("AGREGAR ELEMENTO ");

        txtSeguro.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/paquetes (1).png"))); // NOI18N
        jLabel3.setText(" ");

        lblPesoMaximo1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lblPesoMaximo1.setText("Peso Maximo:");

        txtAreaRemota1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        txtAreaRemota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaRemota1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbImagen)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbC1)
                    .addComponent(lblNombreLista)
                    .addComponent(lblPesoMaximo)
                    .addComponent(lbR1)
                    .addComponent(txtNombreLista, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(txtAreaRemota)
                    .addComponent(txtPaqueteFragil)
                    .addComponent(txtSeguro))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAreaRemota1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblPesoMaximo1)
                                .addGap(0, 153, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(183, 183, 183))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRecuperar)
                        .addGap(152, 152, 152))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbImagen)
                        .addGap(43, 43, 43))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNombreLista)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesoMaximo)
                    .addComponent(lblPesoMaximo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAreaRemota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAreaRemota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(lbC1)
                .addGap(9, 9, 9)
                .addComponent(txtSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addComponent(lbR1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPaqueteFragil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(18, 18, 18)
                .addComponent(btnRecuperar)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarActionPerformed

    }//GEN-LAST:event_btnRecuperarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String servicio, listaCostos, auxString, auxString1, auxString2, auxString3;
        float pesoMinimo, pesoMaximo, zona, precio;
        
        
       
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtAreaRemotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaRemotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaRemotaActionPerformed

    private void txtAreaRemota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaRemota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaRemota1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearListaDetallada.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnRecuperar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbC1;
    private javax.swing.JLabel lbImagen;
    private javax.swing.JLabel lbR;
    private javax.swing.JLabel lbR1;
    private javax.swing.JLabel lblNombreLista;
    private javax.swing.JLabel lblPesoMaximo;
    private javax.swing.JLabel lblPesoMaximo1;
    private javax.swing.JPasswordField txtAreaRemota;
    private javax.swing.JPasswordField txtAreaRemota1;
    private javax.swing.JTextField txtNombreLista;
    private javax.swing.JTextField txtPaqueteFragil;
    private javax.swing.JTextField txtRespuesta;
    private javax.swing.JTextField txtSeguro;
    // End of variables declaration//GEN-END:variables
}
