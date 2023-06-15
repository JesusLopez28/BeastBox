package vista;

import controlador.ListaEnlazada;
import controlador.Pila;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import modelo.ListaCostos;
import modelo.Usuario;

public class MenuPrincipal extends javax.swing.JFrame {

    ListaEnlazada listaUsuarios;
    Pila pilaEnvios = new Pila(500);
    ListaEnlazada listaCostos = new ListaEnlazada(100);
    ListaEnlazada listaCostosDetalle = new ListaEnlazada(100);
    Pila pilaRecibidos = new Pila(500);
    Pila pilaRecolecciones = new Pila(500);
    public String user;

    public MenuPrincipal(ListaEnlazada listaUsuarios, String user) {
        this.listaUsuarios = listaUsuarios;
        this.user = user;
        initComponents();

        String cursor = "src/imagenes/seleccion.png";
        ImageIcon imgCursor = new ImageIcon(cursor);
        Cursor cursorC = Toolkit.getDefaultToolkit().createCustomCursor(imgCursor.getImage(), new Point(1, 1), null);
        this.setCursor(cursorC);

        Usuario usuario = (Usuario) listaUsuarios.buscarPorAtributo(user);

        if (usuario != null && usuario.getLevel() == 1) {
            itemActualizarInfo.setVisible(true);
            itemRegistrarUsuarios.setVisible(true);
            menuListas.setVisible(true);
            menuReportes.setVisible(true);

        } else {
            itemActualizarInfo.setVisible(false);
            itemRegistrarUsuarios.setVisible(false);
            menuListas.setVisible(false);
            menuReportes.setVisible(false);
        }

        if (listaCostos.estaVacia()) {
            listaCostos.insertar(new ListaCostos("MENUDEO", 200, 200, 200, 200, 200));
            listaCostos.insertar(new ListaCostos("MAYOREO", 100, 100, 100, 100, 100));
        }
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        destPane = new javax.swing.JDesktopPane();
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
        itemReporteRecolecciones = new javax.swing.JMenuItem();
        itemReporteRecibidas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(150, 166, 217));
        setIconImage(getIconImage());

        jPanel2.setBackground(new java.awt.Color(150, 166, 217));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/beastBox.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("LA MEJOR PAQUETERÍA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(jLabel5)
                .addGap(0, 62, Short.MAX_VALUE))
        );

        destPane.setBackground(new java.awt.Color(242, 242, 240));

        javax.swing.GroupLayout destPaneLayout = new javax.swing.GroupLayout(destPane);
        destPane.setLayout(destPaneLayout);
        destPaneLayout.setHorizontalGroup(
            destPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 968, Short.MAX_VALUE)
        );
        destPaneLayout.setVerticalGroup(
            destPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(67, 90, 217));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N

        menuUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        menuUsuarios.setText("Usuarios");
        menuUsuarios.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N

        itemRegistrarUsuarios.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemRegistrarUsuarios.setText("Registrar Usuario");
        itemRegistrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistrarUsuariosActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemRegistrarUsuarios);

        itemActualizarInfo.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemActualizarInfo.setText("Actualizar Información");
        itemActualizarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarInfoActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemActualizarInfo);

        itemCerrarSesion.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemCerrarSesion.setText("Cerrar Sesión");
        itemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCerrarSesionActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemCerrarSesion);

        jMenuBar1.add(menuUsuarios);

        menuEnvios.setForeground(new java.awt.Color(255, 255, 255));
        menuEnvios.setText("Envíos");
        menuEnvios.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N

        itemCotizar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemCotizar.setText("Cotizar");
        itemCotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCotizarActionPerformed(evt);
            }
        });
        menuEnvios.add(itemCotizar);

        itemCancelar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemCancelar.setText("Cancelar");
        itemCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCancelarActionPerformed(evt);
            }
        });
        menuEnvios.add(itemCancelar);

        itemRegistrarEntrada.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemRegistrarEntrada.setText("Registrar entrada");
        itemRegistrarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistrarEntradaActionPerformed(evt);
            }
        });
        menuEnvios.add(itemRegistrarEntrada);

        itemRegistrarEnvio.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemRegistrarEnvio.setText("Registrar envío");
        itemRegistrarEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistrarEnvioActionPerformed(evt);
            }
        });
        menuEnvios.add(itemRegistrarEnvio);

        itemRegistrarLlegada.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemRegistrarLlegada.setText("Registrar llegada");
        itemRegistrarLlegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistrarLlegadaActionPerformed(evt);
            }
        });
        menuEnvios.add(itemRegistrarLlegada);

        itemRegistrarSalida.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemRegistrarSalida.setText("Registrar salida");
        itemRegistrarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistrarSalidaActionPerformed(evt);
            }
        });
        menuEnvios.add(itemRegistrarSalida);

        jMenuBar1.add(menuEnvios);

        menuListas.setForeground(new java.awt.Color(255, 255, 255));
        menuListas.setText("Lista de costos");
        menuListas.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N

        itemListaCostos.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemListaCostos.setText("Agregar lista de costos");
        itemListaCostos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListaCostosActionPerformed(evt);
            }
        });
        menuListas.add(itemListaCostos);

        itemListaCostosDetalle.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemListaCostosDetalle.setText("Aregar elemento a lista de costos");
        itemListaCostosDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListaCostosDetalleActionPerformed(evt);
            }
        });
        menuListas.add(itemListaCostosDetalle);

        jMenuBar1.add(menuListas);

        menuReportes.setForeground(new java.awt.Color(255, 255, 255));
        menuReportes.setText("Reportes");
        menuReportes.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N

        itemReporteUsuarios.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemReporteUsuarios.setText("Reporte usuarios");
        itemReporteUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteUsuariosActionPerformed(evt);
            }
        });
        menuReportes.add(itemReporteUsuarios);

        itemReporteEnvios.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemReporteEnvios.setText("Reporte envíos");
        itemReporteEnvios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteEnviosActionPerformed(evt);
            }
        });
        menuReportes.add(itemReporteEnvios);

        itemReporteLCostos.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemReporteLCostos.setText("Reporte lista de costos");
        itemReporteLCostos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteLCostosActionPerformed(evt);
            }
        });
        menuReportes.add(itemReporteLCostos);

        itemReporteLCostosDetalle.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemReporteLCostosDetalle.setText("Reporte lista de costos detallada");
        itemReporteLCostosDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteLCostosDetalleActionPerformed(evt);
            }
        });
        menuReportes.add(itemReporteLCostosDetalle);

        itemReporteRecolecciones.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemReporteRecolecciones.setText("Reporte recolecciones");
        itemReporteRecolecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteRecoleccionesActionPerformed(evt);
            }
        });
        menuReportes.add(itemReporteRecolecciones);

        itemReporteRecibidas.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        itemReporteRecibidas.setText("Reporte recibidas");
        itemReporteRecibidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteRecibidasActionPerformed(evt);
            }
        });
        menuReportes.add(itemReporteRecibidas);

        jMenuBar1.add(menuReportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(destPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(destPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemReporteEnviosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteEnviosActionPerformed
        // TODO add your handling code here:
        ReporteEnvios reporteEnvios = new ReporteEnvios();
        destPane.add(reporteEnvios);
        reporteEnvios.show();
    }//GEN-LAST:event_itemReporteEnviosActionPerformed

    private void itemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarSesionActionPerformed
        // TODO add your handling code here:
        Login login = new Login(listaUsuarios);
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_itemCerrarSesionActionPerformed

    private void itemRegistrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarUsuariosActionPerformed
        // TODO add your handling code here:
        RegistroUsuarios registroUsuarios = new RegistroUsuarios(listaUsuarios, listaCostos);
        registroUsuarios.setVisible(true);
        registroUsuarios.setLocationRelativeTo(null);
    }//GEN-LAST:event_itemRegistrarUsuariosActionPerformed

    private void itemListaCostosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListaCostosActionPerformed
        // TODO add your handling code here:
        CrearLista crearLista = new CrearLista(listaCostos);
        crearLista.setVisible(true);
        crearLista.setLocationRelativeTo(null);
    }//GEN-LAST:event_itemListaCostosActionPerformed

    private void itemListaCostosDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListaCostosDetalleActionPerformed
        CrearListaDetallada crearListaDetallada = new CrearListaDetallada(listaCostosDetalle, listaCostos);
        crearListaDetallada.setVisible(true);
        crearListaDetallada.setLocationRelativeTo(null);
    }//GEN-LAST:event_itemListaCostosDetalleActionPerformed

    private void itemActualizarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarInfoActionPerformed
        // TODO add your handling code here:
        ActualizacionRegistro actualizacionRegistro = new ActualizacionRegistro(listaUsuarios, listaCostos);
        actualizacionRegistro.setVisible(true);
        actualizacionRegistro.setLocationRelativeTo(null);
    }//GEN-LAST:event_itemActualizarInfoActionPerformed

    private void itemCotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCotizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemCotizarActionPerformed

    private void itemCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemCancelarActionPerformed

    private void itemRegistrarEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarEnvioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemRegistrarEnvioActionPerformed

    private void itemRegistrarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemRegistrarEntradaActionPerformed

    private void itemRegistrarLlegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarLlegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemRegistrarLlegadaActionPerformed

    private void itemRegistrarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemRegistrarSalidaActionPerformed

    private void itemReporteUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteUsuariosActionPerformed
        // TODO add your handling code here:
        ReporteUsuarios reporteUsuarios = new ReporteUsuarios(listaUsuarios);
        destPane.add(reporteUsuarios);
        reporteUsuarios.show();
    }//GEN-LAST:event_itemReporteUsuariosActionPerformed

    private void itemReporteLCostosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteLCostosActionPerformed
        // TODO add your handling code here:
        ReporteListaCostos reporteListaCostos = new ReporteListaCostos(listaCostos);
        destPane.add(reporteListaCostos);
        reporteListaCostos.show();
    }//GEN-LAST:event_itemReporteLCostosActionPerformed

    private void itemReporteLCostosDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteLCostosDetalleActionPerformed
        // TODO add your handling code here:
        ReporteListaCostosDetalle reporteListaCostosDetalle = new ReporteListaCostosDetalle(listaCostosDetalle);
        destPane.add(reporteListaCostosDetalle);
        reporteListaCostosDetalle.show();
    }//GEN-LAST:event_itemReporteLCostosDetalleActionPerformed

    private void itemReporteRecoleccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteRecoleccionesActionPerformed
        // TODO add your handling code here:
        ReporteRecolecciones reporteRecolecciones = new ReporteRecolecciones();
        destPane.add(reporteRecolecciones);
        reporteRecolecciones.show();
    }//GEN-LAST:event_itemReporteRecoleccionesActionPerformed

    private void itemReporteRecibidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteRecibidasActionPerformed
        // TODO add your handling code here:
        ReporteRecibidas reporteRecibidas = new ReporteRecibidas();
        destPane.add(reporteRecibidas);
        reporteRecibidas.show();
    }//GEN-LAST:event_itemReporteRecibidasActionPerformed

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
    public static javax.swing.JDesktopPane destPane;
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
    private javax.swing.JMenuItem itemReporteRecibidas;
    private javax.swing.JMenuItem itemReporteRecolecciones;
    private javax.swing.JMenuItem itemReporteUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu menuEnvios;
    private javax.swing.JMenu menuListas;
    private javax.swing.JMenu menuReportes;
    private javax.swing.JMenu menuUsuarios;
    // End of variables declaration//GEN-END:variables
}
