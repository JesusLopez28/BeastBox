package vista;

import controlador.ListaEnlazada;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;

public class ReporteUsuarios extends javax.swing.JInternalFrame {

    ListaEnlazada listaUsuarios;

    public ReporteUsuarios(ListaEnlazada listaUsuarios) {
        initComponents();
        this.listaUsuarios = listaUsuarios;
        String cursor = "src/imagenes/seleccion.png";
        ImageIcon imgCursor = new ImageIcon(cursor);
        Cursor cursorC = Toolkit.getDefaultToolkit().createCustomCursor(imgCursor.getImage(), new Point(1, 1), null);
        this.setCursor(cursorC);

        DefaultTableModel modelo = new DefaultTableModel();
        String[] cabecera = {"Usuario", "Contraseña", "Pregunta", "Respuesta", "Nivel", "Lista de Costos"};
        modelo.setColumnIdentifiers(cabecera);

        Object[] elementos = listaUsuarios.imprimirLista();

        for (Object elemento : elementos) {
            Usuario user = (Usuario) elemento;
            Object[] datos = {user.getUser(), user.getPassword(), user.getPregunta(), user.getRespuesta(), user.getLevel(), user.getListaCostos()};
            modelo.addRow(datos);
        }
        tbInfo.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbInfo = new javax.swing.JTable();
        lbTitulo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        tbInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbInfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbInfo);

        lbTitulo.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("INFORMACIÓN DE USUARIOS:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitulo)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbInfoMouseClicked
        // TODO add your handling code here:
        int numRenglon = tbInfo.getSelectedRow();
        int numColmuna = tbInfo.getSelectedColumn();
        String valor = tbInfo.getValueAt(numRenglon, numColmuna).toString();

        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar al usuario seleccionado?", "Eliminar usuario", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            Usuario usuarioEncontrado = (Usuario) listaUsuarios.buscarPorAtributo(valor);

            if (usuarioEncontrado != null) {
                listaUsuarios.eliminar(usuarioEncontrado);
                JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente.", "Eliminar usuario", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "El usuario no se encontró en la lista.", "Eliminar usuario", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se eliminó al usuario.", "Eliminar usuario", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_tbInfoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tbInfo;
    // End of variables declaration//GEN-END:variables
}
