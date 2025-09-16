package vistas;
//Integrantes: Manceñido Xenia, Ortiz Lourdes, Ortiz Santiago, Ozan Santiago 
import java.awt.Image;

public class frmMenuPrincipal extends javax.swing.JFrame {

    private Image image;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName());

    public frmMenuPrincipal() {
        initComponents();

        //cargar la imagen desde donde pusimos la img
        image = new javax.swing.ImageIcon(getClass().getResource("/Images/escaleras.png")).getImage();

        //sobrescribir paintComponent de jDesktopPane1
        jDesktopPane1 = new javax.swing.JDesktopPane() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);
                if (image != null) {
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            }
        };

        //reemplazar el content del frame por el nuevo DesktopPane
        setContentPane(jDesktopPane1);
        setJMenuBar(jMenuBar1); //volver a agregar la barra de menú
        pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jGestióndeProductos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jConsultasporNombre = new javax.swing.JMenuItem();
        jConsultasporPrecio = new javax.swing.JMenuItem();
        jConsultasporRubro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 768));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );

        jMenu1.setText("Administración");

        jGestióndeProductos.setText("Gestión de Productos");
        jGestióndeProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGestióndeProductosActionPerformed(evt);
            }
        });
        jMenu1.add(jGestióndeProductos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        jConsultasporNombre.setText("Consultas por Nombre");
        jConsultasporNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultasporNombreActionPerformed(evt);
            }
        });
        jMenu2.add(jConsultasporNombre);

        jConsultasporPrecio.setText("Consultas por Precio");
        jConsultasporPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultasporPrecioActionPerformed(evt);
            }
        });
        jMenu2.add(jConsultasporPrecio);

        jConsultasporRubro.setText("Consultas por Rubro");
        jConsultasporRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultasporRubroActionPerformed(evt);
            }
        });
        jMenu2.add(jConsultasporRubro);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jGestióndeProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGestióndeProductosActionPerformed
        frmGestiondeProductos gestion = new frmGestiondeProductos();
        jDesktopPane1.add(gestion);
        gestion.setVisible(true);
        try {
            gestion.setSelected(true);
        } catch (java.beans.PropertyVetoException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jGestióndeProductosActionPerformed

    private void jConsultasporPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultasporPrecioActionPerformed
        frmConsultasporPrecio consultas = new frmConsultasporPrecio();
        jDesktopPane1.add(consultas);
        consultas.setVisible(true);
        try {
            consultas.setSelected(true);
        } catch (java.beans.PropertyVetoException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jConsultasporPrecioActionPerformed

    private void jConsultasporRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultasporRubroActionPerformed
        frmConsultasporRubro consultas = new frmConsultasporRubro();
        jDesktopPane1.add(consultas);
        consultas.setVisible(true);
        try {
            consultas.setSelected(true);
        } catch (java.beans.PropertyVetoException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jConsultasporRubroActionPerformed

    private void jConsultasporNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultasporNombreActionPerformed
        frmConsultasporNombre consultas = new frmConsultasporNombre();
        jDesktopPane1.add(consultas);
        consultas.setVisible(true);
        try {
            consultas.setSelected(true);
        } catch (java.beans.PropertyVetoException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jConsultasporNombreActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new frmMenuPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jConsultasporNombre;
    private javax.swing.JMenuItem jConsultasporPrecio;
    private javax.swing.JMenuItem jConsultasporRubro;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuItem jGestióndeProductos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
