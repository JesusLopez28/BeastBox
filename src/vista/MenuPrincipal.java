package vista;

import controlador.ListaEnlazada;
import java.awt.Image;
import java.awt.Toolkit;

public class MenuPrincipal extends javax.swing.JFrame {

    ListaEnlazada listaUsuarios;

    public MenuPrincipal(ListaEnlazada listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
        initComponents();
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

        jPanel4 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuUsuarios = new javax.swing.JMenu();
        menuEnvios = new javax.swing.JMenu();
        menuListas = new javax.swing.JMenu();
        menuReportes = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(150, 166, 217));
        setIconImage(getIconImage());

        jPanel4.setBackground(new java.awt.Color(242, 242, 240));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(67, 90, 217));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N

        menuUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        menuUsuarios.setText("Usuarios");
        menuUsuarios.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jMenuBar1.add(menuUsuarios);

        menuEnvios.setForeground(new java.awt.Color(255, 255, 255));
        menuEnvios.setText("Envíos");
        menuEnvios.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jMenuBar1.add(menuEnvios);

        menuListas.setForeground(new java.awt.Color(255, 255, 255));
        menuListas.setText("Lista de costos");
        menuListas.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jMenuBar1.add(menuListas);

        menuReportes.setForeground(new java.awt.Color(255, 255, 255));
        menuReportes.setText("Reportes");
        menuReportes.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jMenuBar1.add(menuReportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnIngresar1;
    private javax.swing.JButton btnRecuperar;
    private javax.swing.JButton btnRecuperar1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbC;
    private javax.swing.JLabel lbC1;
    private javax.swing.JLabel lbImagen;
    private javax.swing.JLabel lbImagen1;
    private javax.swing.JLabel lbU;
    private javax.swing.JLabel lbU1;
    private javax.swing.JMenu menuEnvios;
    private javax.swing.JMenu menuListas;
    private javax.swing.JMenu menuReportes;
    private javax.swing.JMenu menuUsuarios;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JPasswordField txtContraseña1;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtUser1;
    // End of variables declaration//GEN-END:variables
}
