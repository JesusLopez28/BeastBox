package vista;

import controlador.ListaEnlazada;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class ActualizacionRegistro extends javax.swing.JFrame {

   

    public ActualizacionRegistro() {
  
    }

    public ActualizacionRegistro(ListaEnlazada listaUsuarios) {
      
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
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbImagen = new javax.swing.JLabel();
        lbU = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lbC = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnAgregar = new javax.swing.JButton();
        btnRecuperar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbC1 = new javax.swing.JLabel();
        lbC2 = new javax.swing.JLabel();
        comboNivel = new javax.swing.JComboBox();
        comboPregunta = new javax.swing.JComboBox();
        txtRespuesta1 = new javax.swing.JTextField();
        lbR1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtRespuesta.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        lbR.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbR.setText("Respuesta:");

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel3.setText("ACTUALIZACIÓN DE ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(150, 166, 217));
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(67, 90, 217));

        jPanel2.setBackground(new java.awt.Color(242, 242, 240));

        lbImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/beastBoxIcon.png"))); // NOI18N

        lbU.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbU.setText("Usuario:");

        txtUser.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        lbC.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbC.setText("Contraseña:");

        txtContraseña.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

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

        lbC1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbC1.setText("Nivel:");

        lbC2.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbC2.setText("Pregunta:");

        comboNivel.setBackground(new java.awt.Color(150, 166, 217));
        comboNivel.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        comboNivel.setForeground(new java.awt.Color(255, 255, 255));
        comboNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Usuario/Empleado" }));

        comboPregunta.setBackground(new java.awt.Color(150, 166, 217));
        comboPregunta.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        comboPregunta.setForeground(new java.awt.Color(255, 255, 255));
        comboPregunta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre de tu primera mascota", "Fecha de cumpleaños de mamá", "En que ciudad naciste", "Lugar dónde fuiste al colegio" }));

        txtRespuesta1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        txtRespuesta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespuesta1ActionPerformed(evt);
            }
        });

        lbR1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbR1.setText("Respuesta:");

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel2.setText("REGISTRO");

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel4.setText("ACTUALIZACIÓN DE ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbImagen)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbU)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbC)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbC1)
                            .addComponent(comboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbC2)
                            .addComponent(comboPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbR1)
                            .addComponent(txtRespuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(btnRecuperar))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnAgregar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbImagen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(21, 21, 21)
                .addComponent(lbU)
                .addGap(18, 18, 18)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbC)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbC1)
                .addGap(18, 18, 18)
                .addComponent(comboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbC2)
                .addGap(18, 18, 18)
                .addComponent(comboPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbR1)
                .addGap(18, 18, 18)
                .addComponent(txtRespuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRecuperar))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarActionPerformed
       
    }//GEN-LAST:event_btnRecuperarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtRespuesta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespuesta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespuesta1ActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizacionRegistro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnRecuperar;
    private javax.swing.JComboBox comboNivel;
    private javax.swing.JComboBox comboPregunta;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbC;
    private javax.swing.JLabel lbC1;
    private javax.swing.JLabel lbC2;
    private javax.swing.JLabel lbImagen;
    private javax.swing.JLabel lbR;
    private javax.swing.JLabel lbR1;
    private javax.swing.JLabel lbU;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtRespuesta;
    private javax.swing.JTextField txtRespuesta1;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
