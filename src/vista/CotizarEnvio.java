package vista;

import controlador.ListaEnlazada;
import controlador.Pila;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Envio;
import modelo.ListaCostos;
import modelo.Usuario;

public class CotizarEnvio extends javax.swing.JFrame {

    Pila pilaEnvio;
    ListaEnlazada listaCostos;
    ListaEnlazada listaCostosDetalle;
    ListaEnlazada listaUsuarios;
    String user;

    public CotizarEnvio(Pila pilaEnvio, ListaEnlazada listaCostos, ListaEnlazada listaCostosDetalle, ListaEnlazada listaUsuarios, String user) {
        this.pilaEnvio = pilaEnvio;
        this.listaCostos = listaCostos;
        this.listaCostosDetalle = listaCostosDetalle;
        this.listaUsuarios = listaUsuarios;
        this.user = user;
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
        lblOrigen = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        btnCotizar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblLargo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jboxDestino = new javax.swing.JComboBox();
        lblOrigen1 = new javax.swing.JLabel();
        jboxOrigen1 = new javax.swing.JComboBox();
        SliderPeso = new javax.swing.JSlider();
        lblPeso1 = new javax.swing.JLabel();
        SliderLargo = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        SliderAncho = new javax.swing.JSlider();
        SliderAltura = new javax.swing.JSlider();
        lblKg = new javax.swing.JLabel();
        lblm = new javax.swing.JLabel();
        lblm2 = new javax.swing.JLabel();
        lblm3 = new javax.swing.JLabel();
        chSeguro = new javax.swing.JCheckBox();
        chPaqueteFragil = new javax.swing.JCheckBox();
        comboServicio = new javax.swing.JComboBox();
        lblZona1 = new javax.swing.JLabel();

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

        btnCotizar.setBackground(new java.awt.Color(63, 82, 191));
        btnCotizar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnCotizar.setForeground(new java.awt.Color(255, 255, 255));
        btnCotizar.setText("COTIZAR");
        btnCotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCotizarActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(150, 166, 217));
        btnRegresar.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        lblLargo.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lblLargo.setText("Largo:");

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel2.setText("Cotizar/Generar Envio");

        jboxDestino.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jboxDestino.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Guadalajara", "Monterrey", "Tampico", "Cancún", "Puerto Vallarta", "Mazatlán" }));

        lblOrigen1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lblOrigen1.setText("Sucursal de destino:");

        jboxOrigen1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jboxOrigen1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Guadalajara", "Monterrey", "Tampico", "Cancún", "Puerto Vallarta", "Mazatlán" }));

        SliderPeso.setMaximum(130);
        SliderPeso.setMinimum(1);
        SliderPeso.setMinorTickSpacing(10);
        SliderPeso.setPaintLabels(true);
        SliderPeso.setPaintTicks(true);
        SliderPeso.setValue(1);
        SliderPeso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderPesoStateChanged(evt);
            }
        });

        lblPeso1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lblPeso1.setText("Altura:");

        SliderLargo.setMaximum(130);
        SliderLargo.setMinimum(1);
        SliderLargo.setMinorTickSpacing(10);
        SliderLargo.setPaintLabels(true);
        SliderLargo.setPaintTicks(true);
        SliderLargo.setValue(1);
        SliderLargo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderLargoStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel3.setText("Ancho:");

        SliderAncho.setMaximum(130);
        SliderAncho.setMinimum(1);
        SliderAncho.setMinorTickSpacing(10);
        SliderAncho.setPaintLabels(true);
        SliderAncho.setPaintTicks(true);
        SliderAncho.setValue(1);
        SliderAncho.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderAnchoStateChanged(evt);
            }
        });

        SliderAltura.setMaximum(130);
        SliderAltura.setMinimum(1);
        SliderAltura.setMinorTickSpacing(10);
        SliderAltura.setPaintTicks(true);
        SliderAltura.setSnapToTicks(true);
        SliderAltura.setValue(10);
        SliderAltura.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderAlturaStateChanged(evt);
            }
        });

        lblKg.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lblKg.setText("Kg:");

        lblm.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lblm.setText("M:");

        lblm2.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lblm2.setText("M:");

        lblm3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lblm3.setText("M:");

        chSeguro.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        chSeguro.setText("Seguro");
        chSeguro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        chPaqueteFragil.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        chPaqueteFragil.setText("Paquete fragil");
        chPaqueteFragil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        comboServicio.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        comboServicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Terrestre", "Express" }));

        lblZona1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lblZona1.setText("Servicio:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbImagen)
                        .addGap(166, 166, 166)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblZona1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(comboServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)
                                .addComponent(btnCotizar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SliderPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOrigen)
                            .addComponent(lblPeso)
                            .addComponent(lblLargo)
                            .addComponent(jboxOrigen1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(chSeguro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SliderLargo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKg)
                            .addComponent(lblm2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jboxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOrigen1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPeso1)
                                    .addComponent(SliderAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblm))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(SliderAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblm3))
                            .addComponent(chPaqueteFragil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbImagen)
                    .addComponent(jLabel2))
                .addGap(50, 50, 50)
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
                    .addComponent(SliderAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKg)
                    .addComponent(lblm))
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLargo)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SliderLargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SliderAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblm2)
                    .addComponent(lblm3))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chPaqueteFragil)
                    .addComponent(chSeguro))
                .addGap(18, 18, 18)
                .addComponent(lblZona1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCotizar))
                .addGap(18, 18, 18)
                .addComponent(btnRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnCotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCotizarActionPerformed
        String lista = "";
        float area = 0, seguro = 0, fragil = 0, execeso = 0, dimension = 0;
        float alto = 0, largo = 0, ancho = 0, peso = 0;
        Usuario usuario = (Usuario) listaUsuarios.buscarPorAtributo(user);
        if (usuario != null) {
            lista = usuario.getListaCostos();
        }
        ListaCostos listaC = (ListaCostos) listaCostos.buscarPorAtributo(lista);
        if (listaC != null) {
            area = listaC.getAreaRemota();
            seguro = listaC.getSeguro();
            fragil = listaC.getPaqueteFragil();
            execeso = listaC.getExcesoPeso();
            dimension = listaC.getSobreDimension();
        }

        String sucursalOrigen = "";
        if (jboxOrigen1.getSelectedItem() != null) {
            sucursalOrigen = (String) jboxOrigen1.getSelectedItem();
        }
        String sucursalDestino = "";
        if (jboxDestino.getSelectedItem() != null) {
            sucursalDestino = (String) jboxDestino.getSelectedItem();
        }
        String servicio = "";
        if (comboServicio.getSelectedItem() != null) {
            servicio = (String) comboServicio.getSelectedItem();
        }

        peso = (float) SliderPeso.getValue();
        alto = (float) SliderAltura.getValue();
        largo = (float) SliderLargo.getValue();
        ancho = (float) SliderAncho.getValue();
        float precio = listaCostosDetalle.obtenerPrecio(lista, sucursalOrigen, servicio, peso);

        if (chPaqueteFragil.isSelected()) {
            precio += fragil;
        }

        if (chSeguro.isSelected()) {
            precio += seguro;
        }

        if (peso > 100) {
            precio += execeso;
        }

        if (alto > 100 || largo > 100 || ancho > 100) {
            precio += dimension;
        }

        if (sucursalDestino.equals("Tampico")) {
            precio += area;
        }

        float subtotal = precio;
        float iva = (float) (subtotal * (0.16));
        float total = iva + subtotal;
        DecimalFormat formatoPrecio = new DecimalFormat("#0.00");
        String fSub = formatoPrecio.format(subtotal);
        String fIva = formatoPrecio.format(iva);
        String fTotal = formatoPrecio.format(total);

        String mensaje = "Subtotal: $" + fSub + "\n";
        mensaje += "IVA (16%): $" + fIva + "\n";
        mensaje += "Total: $" + fTotal + "\n";

        mensaje += "\n¿Desea generar la guía?";

        int opcion = JOptionPane.showConfirmDialog(null, mensaje, "Desglose de precios", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            Random random = new Random();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < 10; i++) {
                int digit = random.nextInt(10);
                sb.append(digit);
            }
            String numeroGuia = sb.toString();
            pilaEnvio.push(new Envio(numeroGuia, sucursalOrigen, sucursalDestino, peso, alto, largo, ancho, user, "Generado"));
            JOptionPane.showMessageDialog(null, "Se generó la guía correctamente.", "Generar guía", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se generó la guía.", "Generar guía", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnCotizarActionPerformed

    private void SliderPesoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderPesoStateChanged
        lblKg.setText("Kg: " + SliderPeso.getValue());
    }//GEN-LAST:event_SliderPesoStateChanged

    private void SliderAlturaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderAlturaStateChanged
        lblm.setText("M: " + SliderAltura.getValue());
    }//GEN-LAST:event_SliderAlturaStateChanged

    private void SliderLargoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderLargoStateChanged
        lblm2.setText("M: " + SliderLargo.getValue());
    }//GEN-LAST:event_SliderLargoStateChanged

    private void SliderAnchoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderAnchoStateChanged
        lblm3.setText("M: " + SliderAncho.getValue());
    }//GEN-LAST:event_SliderAnchoStateChanged

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
    private javax.swing.JButton btnCotizar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JCheckBox chPaqueteFragil;
    private javax.swing.JCheckBox chSeguro;
    private javax.swing.JComboBox comboServicio;
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
    private javax.swing.JLabel lblKg;
    private javax.swing.JLabel lblLargo;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JLabel lblOrigen1;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPeso1;
    private javax.swing.JLabel lblZona1;
    private javax.swing.JLabel lblm;
    private javax.swing.JLabel lblm2;
    private javax.swing.JLabel lblm3;
    private javax.swing.JTextField txtRespuesta;
    // End of variables declaration//GEN-END:variables
}
