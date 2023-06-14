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
        itemRegistrarUsuarios = new javax.swing.JMenuItem();
        itemActualizarInfo = new javax.swing.JMenuItem();
        itemCerrarSesion = new javax.swing.JMenuItem();
        menuEnvios = new javax.swing.JMenu();
        itemCotizar = new javax.swing.JMenuItem();
        itemCancelar = new javax.swing.JMenuItem();
        itemRegistrarEntrada = new javax.swing.JMenuItem();
        itemRegistrarEnvio = new javax.swing.JMenuItem();
        itemRegistrarLlegada = new javax.swing.JMenuItem();
        itemRegistrarSalida = new javax.swing.JMenuItem();
        menuListas = new javax.swing.JMenu();
        itemListaCostos = new javax.swing.JMenuItem();
        itemListaCostosDetalle = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();
        itemReporteUsuarios = new javax.swing.JMenuItem();
        itemReporteEnvios = new javax.swing.JMenuItem();
        itemReporteLCostos = new javax.swing.JMenuItem();
        itemReporteLCostosDetalle = new javax.swing.JMenuItem();

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
            .addGap(0, 471, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(67, 90, 217));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N

        menuUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        menuUsuarios.setText("Usuarios");
        menuUsuarios.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N

        itemRegistrarUsuarios.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemRegistrarUsuarios.setText("Registrar Usuario");
        menuUsuarios.add(itemRegistrarUsuarios);

        itemActualizarInfo.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemActualizarInfo.setText("Actualizar Información");
        menuUsuarios.add(itemActualizarInfo);

        itemCerrarSesion.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemCerrarSesion.setText("Cerrar Sesión");
        menuUsuarios.add(itemCerrarSesion);

        jMenuBar1.add(menuUsuarios);

        menuEnvios.setForeground(new java.awt.Color(255, 255, 255));
        menuEnvios.setText("Envíos");
        menuEnvios.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N

        itemCotizar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemCotizar.setText("Cotizar");
        menuEnvios.add(itemCotizar);

        itemCancelar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemCancelar.setText("Cancelar");
        menuEnvios.add(itemCancelar);

        itemRegistrarEntrada.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemRegistrarEntrada.setText("Registrar entrada");
        menuEnvios.add(itemRegistrarEntrada);

        itemRegistrarEnvio.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemRegistrarEnvio.setText("Registrar envío");
        menuEnvios.add(itemRegistrarEnvio);

        itemRegistrarLlegada.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemRegistrarLlegada.setText("Registrar llegada");
        menuEnvios.add(itemRegistrarLlegada);

        itemRegistrarSalida.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemRegistrarSalida.setText("Registrar salida");
        menuEnvios.add(itemRegistrarSalida);

        jMenuBar1.add(menuEnvios);

        menuListas.setForeground(new java.awt.Color(255, 255, 255));
        menuListas.setText("Lista de costos");
        menuListas.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N

        itemListaCostos.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemListaCostos.setText("Agregar lista de costos");
        menuListas.add(itemListaCostos);

        itemListaCostosDetalle.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemListaCostosDetalle.setText("Aregar elemento a lista de costos");
        menuListas.add(itemListaCostosDetalle);

        jMenuBar1.add(menuListas);

        menuReportes.setForeground(new java.awt.Color(255, 255, 255));
        menuReportes.setText("Reportes");
        menuReportes.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N

        itemReporteUsuarios.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemReporteUsuarios.setText("Reporte usuarios");
        menuReportes.add(itemReporteUsuarios);

        itemReporteEnvios.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemReporteEnvios.setText("Reporte envíos");
        menuReportes.add(itemReporteEnvios);

        itemReporteLCostos.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemReporteLCostos.setText("Reporte lista de costos");
        menuReportes.add(itemReporteLCostos);

        itemReporteLCostosDetalle.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemReporteLCostosDetalle.setText("Reporte lista de costos detallada");
        menuReportes.add(itemReporteLCostosDetalle);

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
    private javax.swing.JMenuItem itemActualizarInfo;
    private javax.swing.JMenuItem itemCancelar;
    private javax.swing.JMenuItem itemCerrarSesion;
    private javax.swing.JMenuItem itemCotizar;
    private javax.swing.JMenuItem itemListaCostos;
    private javax.swing.JMenuItem itemListaCostosDetalle;
    private javax.swing.JMenuItem itemRegistrarEntrada;
    private javax.swing.JMenuItem itemRegistrarEnvio;
    private javax.swing.JMenuItem itemRegistrarLlegada;
    private javax.swing.JMenuItem itemRegistrarSalida;
    private javax.swing.JMenuItem itemRegistrarUsuarios;
    private javax.swing.JMenuItem itemReporteEnvios;
    private javax.swing.JMenuItem itemReporteLCostos;
    private javax.swing.JMenuItem itemReporteLCostosDetalle;
    private javax.swing.JMenuItem itemReporteUsuarios;
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
