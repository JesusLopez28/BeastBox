package vista;

import controlador.ListaEnlazada;
import controlador.Pila;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.ListaCostos;
import modelo.Usuario;

public class CrearLista extends javax.swing.JFrame {
    
    Pila pilaCostos;
    
    public CrearLista(Pila pilaCostos) {
        this.pilaCostos = pilaCostos;
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
        lbU = new javax.swing.JLabel();
        txtNombreLista = new javax.swing.JTextField();
        lbC = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbC1 = new javax.swing.JLabel();
        txtExcesoPeso = new javax.swing.JTextField();
        lbR1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSeguro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        lblPeso = new javax.swing.JLabel();
        txtPaqueteFragil1 = new javax.swing.JTextField();
        lblPeso1 = new javax.swing.JLabel();
        txtSobreDimension = new javax.swing.JTextField();
        txtAreaRemota = new javax.swing.JTextField();

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

        lbU.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbU.setText("Nombre de la Lista:");

        txtNombreLista.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        lbC.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbC.setText("Precio por area remota:");

        btnAgregar.setBackground(new java.awt.Color(63, 82, 191));
        btnAgregar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("CREAR LISTA");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lbC1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbC1.setText("Seguro:");

        txtExcesoPeso.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        lbR1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lbR1.setText("Paquete frágil");

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel2.setText("CREAR LISTA");

        txtSeguro.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/paquetes (1).png"))); // NOI18N
        jLabel3.setText(" ");

        btnRegresar.setBackground(new java.awt.Color(150, 166, 217));
        btnRegresar.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        lblPeso.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lblPeso.setText("Exceso de peso:");

        txtPaqueteFragil1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        lblPeso1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lblPeso1.setText("Sobredimension:");

        txtSobreDimension.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        txtAreaRemota.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbImagen)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(183, 183, 183))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addGap(194, 194, 194))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPeso1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPeso)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSobreDimension, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbC1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbU, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbC, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbR1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreLista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(txtExcesoPeso, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSeguro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPaqueteFragil1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAreaRemota, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(25, 25, 25))))
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
                        .addComponent(lbU)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbC)
                .addGap(13, 13, 13)
                .addComponent(txtAreaRemota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbC1)
                .addGap(9, 9, 9)
                .addComponent(txtSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addComponent(lbR1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPaqueteFragil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(lblPeso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtExcesoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPeso1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSobreDimension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(18, 18, 18)
                .addComponent(btnRegresar)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombre, auxString, auxString1, auxString2, auxString3, auxString4;
        float areaRemota, seguro, paqueteFragil, excesoPeso, sobreDimension;
        
        nombre = txtNombreLista.getText();
        auxString = txtAreaRemota.getText();
        auxString1 = txtSeguro.getText();
        auxString2 = txtPaqueteFragil1.getText();
        auxString3 = txtExcesoPeso.getText();
        auxString4 = txtSobreDimension.getText();
        
        areaRemota = Float.parseFloat(auxString);
        seguro = Float.parseFloat(auxString1);
        paqueteFragil = Float.parseFloat(auxString2);
        excesoPeso = Float.parseFloat(auxString3);
        sobreDimension = Float.parseFloat(auxString4);
        
        if (!nombre.isEmpty() && !auxString.isEmpty() && !auxString1.isEmpty() && !auxString2.isEmpty() && !auxString3.isEmpty() && !auxString4.isEmpty()) {
            pilaCostos.push(new ListaCostos(nombre, areaRemota, seguro, paqueteFragil, excesoPeso, sobreDimension));
            JOptionPane.showMessageDialog(null, "Los datos se han agregado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearLista.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbC;
    private javax.swing.JLabel lbC1;
    private javax.swing.JLabel lbImagen;
    private javax.swing.JLabel lbR;
    private javax.swing.JLabel lbR1;
    private javax.swing.JLabel lbU;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPeso1;
    private javax.swing.JTextField txtAreaRemota;
    private javax.swing.JTextField txtExcesoPeso;
    private javax.swing.JTextField txtNombreLista;
    private javax.swing.JTextField txtPaqueteFragil1;
    private javax.swing.JTextField txtRespuesta;
    private javax.swing.JTextField txtSeguro;
    private javax.swing.JTextField txtSobreDimension;
    // End of variables declaration//GEN-END:variables
}
