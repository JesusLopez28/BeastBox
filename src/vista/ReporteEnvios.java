package vista;

import controlador.Pila;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Envio;

public class ReporteEnvios extends javax.swing.JInternalFrame {

    Pila pilaEnvios;

    public ReporteEnvios(Pila pilaEnvios) {
        this.pilaEnvios = pilaEnvios;
        initComponents();

        String cursor = "src/imagenes/seleccion.png";
        ImageIcon imgCursor = new ImageIcon(cursor);
        Cursor cursorC = Toolkit.getDefaultToolkit().createCustomCursor(imgCursor.getImage(), new Point(1, 1), null);
        this.setCursor(cursorC);

        DefaultTableModel modelo = new DefaultTableModel();
        String[] cabecera = {"Número de guía", "Sucursal Origen", "Sucursal Destino", "Peso", "Alto", "Largo", "Ancho", "Usuario", "Estatus"};
        modelo.setColumnIdentifiers(cabecera);

        Object[] elementos = pilaEnvios.imprimirPila();

        for (Object elemento : elementos) {
            Envio envio = (Envio) elemento;
            Object[] datos = {envio.getNumeroGuia(), envio.getSucursalOrigen(), envio.getSucursalDestino(), envio.getPeso(), envio.getAlto(), envio.getLargo(), envio.getAncho(), envio.getUser(), envio.getStatus()};
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
        lbTitulo.setText("INFORMACIÓN DE ENVÍOS:");

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
