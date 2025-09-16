package vistas;

import javax.swing.table.DefaultTableModel;
import model.CatalogodeProductos;
import model.Producto;

public class frmConsultasporNombre extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;

    public frmConsultasporNombre() {
        initComponents();
        this.setClosable(true);   // X de cerrar
        this.setIconifiable(true); // Minimizar
        this.setMaximizable(true); // Maximizar
        this.setResizable(true);   // Redimensionar
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        modelo = new DefaultTableModel(
                new Object[][]{},
                new String[]{"Código", "Descripción", "Precio", "Categoría", "Stock"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabla.setModel(modelo);

        // Cuando el usuario escribe, filtramos
        tfDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtrarPorNombre();
            }
        });
    }

    private void filtrarPorNombre() {
        String texto = tfDesc.getText().trim();
        modelo.setRowCount(0);
        if (texto.isEmpty()) {
            return;
        }

        for (Producto p : CatalogodeProductos.buscarPorNombre(texto)) {
            modelo.addRow(new Object[]{
                p.getCodigo(),
                p.getDescripcion(),
                p.getPrecio(),
                p.getRubro(),
                p.getStock()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfDesc = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        imgBuscar = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbSubtitulo = new javax.swing.JLabel();

        tfDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Descripción", "Precio", "Categoría", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        imgBuscar.setBackground(new java.awt.Color(255, 255, 255));
        imgBuscar.setForeground(new java.awt.Color(255, 255, 255));
        imgBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/magnifier_magnifying_glass_icon_149435.png"))); // NOI18N

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Listado por Nombre");

        lbSubtitulo.setBackground(new java.awt.Color(0, 0, 0));
        lbSubtitulo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbSubtitulo.setForeground(new java.awt.Color(0, 0, 0));
        lbSubtitulo.setText("Ingrese descripción");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbSubtitulo)
                                .addComponent(lbTitulo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(47, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTitulo)
                        .addGap(19, 19, 19)
                        .addComponent(lbSubtitulo))
                    .addComponent(imgBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(tfDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDescActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSubtitulo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tfDesc;
    // End of variables declaration//GEN-END:variables
}
