package vistas;

import javax.swing.table.DefaultTableModel;
import model.CatalogodeProductos;
import model.Producto;

public class frmConsultasporRubro extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;

    public frmConsultasporRubro() {
        initComponents();
        this.setClosable(true);   // X para cerrar
        this.setIconifiable(true); // Minimizar
        this.setMaximizable(true); // Maximizar
        this.setResizable(true);   // Redimensionar
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        modelo = new DefaultTableModel(
                new Object[][]{},
                new String[]{"Codigo", "Descripcion", "Precio", "Categoria", "Stock"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        jTable1.setModel(modelo);
        jComboRubro.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
                    filtrarPorRubro();
                }
            }
        });
        // Llenar combo con valores del Rubro
        jComboRubro.setModel(new javax.swing.DefaultComboBoxModel<>(Producto.Rubro.values()));

    }

    private void filtrarPorRubro() {
        Producto.Rubro rubroSeleccionado = (Producto.Rubro) jComboRubro.getSelectedItem();

        if (rubroSeleccionado != null) {
            modelo.setRowCount(0); // Limpio la tabla

            for (Producto p : CatalogodeProductos.getProductos()) {
                if (p.getRubro() == rubroSeleccionado) {
                    modelo.addRow(new Object[]{
                        p.getCodigo(),
                        p.getDescripcion(),
                        p.getPrecio(),
                        p.getRubro(),
                        p.getStock()
                    });
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboRubro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listado por Rubro");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Rubro: ");

        jComboRubro.setBackground(new java.awt.Color(255, 255, 255));
        jComboRubro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboRubro.setForeground(new java.awt.Color(0, 0, 0));
        jComboRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboRubroActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripcion", "Precio", "Categoria", "Stock"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/magnifier_magnifying_glass_icon_149435.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jComboRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboRubroActionPerformed
        Producto.Rubro rubroSeleccionado = (Producto.Rubro) jComboRubro.getSelectedItem();
        if (rubroSeleccionado != null) {
            modelo.setRowCount(0);
            for (Producto p : CatalogodeProductos.getProductos()) {
                if (p.getRubro() == rubroSeleccionado) {
                    modelo.addRow(new Object[]{
                        p.getCodigo(),
                        p.getDescripcion(),
                        p.getPrecio(),
                        p.getRubro(),
                        p.getStock()
                    });
                }
            }
        }
    }//GEN-LAST:event_jComboRubroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Producto.Rubro> jComboRubro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
