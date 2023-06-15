package vista;

import controlador.ListaEnlazada;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ListaCostosDetalle;

public class ReporteListaCostosDetalle extends javax.swing.JInternalFrame {

    ListaEnlazada listaCostosDetalle;

    public ReporteListaCostosDetalle(ListaEnlazada listaCostosDetalle) {
        this.listaCostosDetalle = listaCostosDetalle;
        initComponents();

        String cursor = "src/imagenes/seleccion.png";
        ImageIcon imgCursor = new ImageIcon(cursor);
        Cursor cursorC = Toolkit.getDefaultToolkit().createCustomCursor(imgCursor.getImage(), new Point(1, 1), null);
        this.setCursor(cursorC);

        DefaultTableModel modelo = new DefaultTableModel();
        String[] cabecera = {"Peso Mínimo", "Pesos Máximo", "Sucursal", "Servicio", "Precio", "Lista de Costos"};
        modelo.setColumnIdentifiers(cabecera);

        Object[] elementos = listaCostosDetalle.imprimirLista();
        
        for (Object elemento : elementos) {
            ListaCostosDetalle lista = (ListaCostosDetalle) elemento;
            Object[] datos = {lista.getPesoMinimo(), lista.getPesoMaximo(), lista.getSucursal(), lista.getServicio(), lista.getPrecio(), lista.getListaCostos()};
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
        lbTitulo.setText("INFORMACIÓN DE LISTA DE COSTOS DETALLADA:");

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
        JOptionPane.showMessageDialog(null, "Valor: " + valor + "\n" + "Renglón/Columna: " + numRenglon + ", " + numColmuna);
    }//GEN-LAST:event_tbInfoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tbInfo;
    // End of variables declaration//GEN-END:variables
}
