package vistas;

import javax.swing.JOptionPane;
import model.Producto;
import javax.swing.table.DefaultTableModel;
import java.util.TreeSet;
import model.CatalogodeProductos;

public class frmGestiondeProductos extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;

    public frmGestiondeProductos() {
        initComponents();
        modelo = new DefaultTableModel(
                new Object[][]{},
                new String[]{"Código", "Descripcion", "Precio", "Rubro", "Stock"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTable1.setModel(modelo);

        // Llenar combos con valores del Rubro
        jComboRubro.setModel(new javax.swing.DefaultComboBoxModel<>(Producto.Rubro.values()));
        jComboFiltrar.setModel(new javax.swing.DefaultComboBoxModel<>(Producto.Rubro.values()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboFiltrar = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboRubro = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jBotonBuscar = new javax.swing.JButton();
        jBotonCerrar = new javax.swing.JButton();
        jBotonNuevo = new javax.swing.JButton();
        jBotonGuardar = new javax.swing.JButton();
        jBotonActualizar = new javax.swing.JButton();
        jBotonEliminar = new javax.swing.JButton();

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestión de Productos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Filtrar por categoria: ");

        jComboFiltrar.setBackground(new java.awt.Color(255, 255, 255));
        jComboFiltrar.setForeground(new java.awt.Color(0, 0, 0));
        jComboFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboFiltrarActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Descripcion ", "Precio", "Categoria", "Stock"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Codigo: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Descripcion: ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Rubro: ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Stock: ");

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboRubro.setBackground(new java.awt.Color(255, 255, 255));
        jComboRubro.setForeground(new java.awt.Color(0, 0, 0));
        jComboRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboRubroActionPerformed(evt);
            }
        });

        jSpinner1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jSpinner1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jSpinner1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField1)
                        .addComponent(jTextField2)
                        .addComponent(jTextField3)
                        .addComponent(jComboRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jBotonBuscar.setBackground(new java.awt.Color(204, 204, 204));
        jBotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/magnifier_magnifying_glass_icon_149435.png"))); // NOI18N
        jBotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonBuscarActionPerformed(evt);
            }
        });

        jBotonCerrar.setBackground(new java.awt.Color(204, 204, 204));
        jBotonCerrar.setForeground(new java.awt.Color(0, 0, 0));
        jBotonCerrar.setText("Cerrar");
        jBotonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonCerrarActionPerformed(evt);
            }
        });

        jBotonNuevo.setBackground(new java.awt.Color(204, 204, 204));
        jBotonNuevo.setForeground(new java.awt.Color(0, 0, 0));
        jBotonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nuevo.png"))); // NOI18N
        jBotonNuevo.setText("Nuevo");
        jBotonNuevo.setBorder(null);
        jBotonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonNuevoActionPerformed(evt);
            }
        });

        jBotonGuardar.setBackground(new java.awt.Color(204, 204, 204));
        jBotonGuardar.setForeground(new java.awt.Color(0, 0, 0));
        jBotonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Guardar.png"))); // NOI18N
        jBotonGuardar.setText("Guardar");
        jBotonGuardar.setBorder(null);
        jBotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonGuardarActionPerformed(evt);
            }
        });

        jBotonActualizar.setBackground(new java.awt.Color(204, 204, 204));
        jBotonActualizar.setForeground(new java.awt.Color(0, 0, 0));
        jBotonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Actualizar.png"))); // NOI18N
        jBotonActualizar.setText("Actualizar");
        jBotonActualizar.setBorder(null);
        jBotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonActualizarActionPerformed(evt);
            }
        });

        jBotonEliminar.setBackground(new java.awt.Color(204, 204, 204));
        jBotonEliminar.setForeground(new java.awt.Color(0, 0, 0));
        jBotonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminar.png"))); // NOI18N
        jBotonEliminar.setText("Eliminar");
        jBotonEliminar.setBorder(null);
        jBotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jBotonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jBotonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jBotonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jBotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBotonCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBotonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 45, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jBotonBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBotonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonNuevo)
                    .addComponent(jBotonGuardar)
                    .addComponent(jBotonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBotonEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonActualizarActionPerformed
        try {
            int codigo = Integer.parseInt(jTextField1.getText());
            Producto p = CatalogodeProductos.buscarPorCodigo(codigo);

            if (p != null) {
                p.setDescripcion(jTextField2.getText());
                p.setPrecio(Double.parseDouble(jTextField3.getText()));
                p.setStock((int) jSpinner1.getValue());
                p.setRubro((Producto.Rubro) jComboRubro.getSelectedItem());

                JOptionPane.showMessageDialog(this, "Producto actualizado correctamente");
                mostrarProductos(CatalogodeProductos.getProductos());
            } else {
                JOptionPane.showMessageDialog(this, "Producto no encontrado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al actualizar: " + e.getMessage());
        }
    }//GEN-LAST:event_jBotonActualizarActionPerformed

    private void jBotonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonNuevoActionPerformed
        jTextField1.setText(""); // Código
        jTextField2.setText(""); // Descripción
        jTextField3.setText(""); // Precio
        jSpinner1.setValue(0);   // Stock
        jComboRubro.setSelectedIndex(0); // Primer rubro
        jTextField1.requestFocus();
    }//GEN-LAST:event_jBotonNuevoActionPerformed

    private void jBotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonGuardarActionPerformed
        try {
            int codigo = Integer.parseInt(jTextField1.getText());
            String descripcion = jTextField2.getText();
            double precio = Double.parseDouble(jTextField3.getText());
            int stock = (int) jSpinner1.getValue();
            Producto.Rubro rubro = (Producto.Rubro) jComboRubro.getSelectedItem();

            if (descripcion.isEmpty()) {
                JOptionPane.showMessageDialog(this, "La descripción no puede estar vacía");
                return;
            }

            Producto p = new Producto(codigo, descripcion, precio, stock, rubro);

            if (CatalogodeProductos.agregarProducto(p)) {
                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                modelo.addRow(new Object[]{codigo, descripcion, precio, rubro, stock});

                JOptionPane.showMessageDialog(this, "Producto agregado correctamente");
            } else {
                JOptionPane.showMessageDialog(this, "Ya existe un producto con ese código");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error en los valores numéricos");
        }
    }//GEN-LAST:event_jBotonGuardarActionPerformed

    private void jBotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonEliminarActionPerformed
        int fila = jTable1.getSelectedRow();
        if (fila >= 0) {
            int codigo = (int) modelo.getValueAt(fila, 0);
            Producto p = CatalogodeProductos.buscarPorCodigo(codigo);

            if (p != null && CatalogodeProductos.eliminarProducto(p)) {
                modelo.removeRow(fila);
                JOptionPane.showMessageDialog(this, "Producto eliminado correctamente");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un producto para eliminar");
        }
    }//GEN-LAST:event_jBotonEliminarActionPerformed

    private void jBotonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBotonCerrarActionPerformed

    private void jBotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonBuscarActionPerformed
        try {
            int codigo = Integer.parseInt(jTextField1.getText());
            Producto encontrado = CatalogodeProductos.buscarPorCodigo(codigo);

            if (encontrado != null) {
                jTextField2.setText(encontrado.getDescripcion());
                jTextField3.setText(String.valueOf(encontrado.getPrecio()));
                jSpinner1.setValue(encontrado.getStock());
                jComboRubro.setSelectedItem(encontrado.getRubro());
            } else {
                JOptionPane.showMessageDialog(this, "Producto no encontrado");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un código válido");
        }
    }//GEN-LAST:event_jBotonBuscarActionPerformed

    private void jComboFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboFiltrarActionPerformed
        Producto.Rubro rubroSeleccionado = (Producto.Rubro) jComboFiltrar.getSelectedItem();
        if (rubroSeleccionado != null) {
            javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTable1.getModel();
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
    }//GEN-LAST:event_jComboFiltrarActionPerformed

    private void jComboRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboRubroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboRubroActionPerformed

    private void mostrarProductos(TreeSet<Producto> productos) {
        modelo.setRowCount(0);
        for (Producto p : productos) {
            modelo.addRow(new Object[]{
                p.getCodigo(),
                p.getDescripcion(),
                p.getPrecio(),
                p.getRubro(),
                p.getStock()
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonActualizar;
    private javax.swing.JButton jBotonBuscar;
    private javax.swing.JButton jBotonCerrar;
    private javax.swing.JButton jBotonEliminar;
    private javax.swing.JButton jBotonGuardar;
    private javax.swing.JButton jBotonNuevo;
    private javax.swing.JComboBox<Producto.Rubro> jComboFiltrar;
    private javax.swing.JComboBox<Producto.Rubro> jComboRubro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
