
package ec.edu.espe.Spa.view;

/**
 *
 * @author Steven Pozo, Erick Moreira, Elkin Pabón, Diego Ponce, DCCO-ESPE, DEES Developers
 */
public class Panel_InformationDEES extends javax.swing.JPanel {

    /**
     * Creates new form FrmContactssss
     */
    public Panel_InformationDEES() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAbout = new javax.swing.JTextArea();
        lbl_DEES = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(810, 530));
        setPreferredSize(new java.awt.Dimension(810, 530));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAbout.setColumns(20);
        txtAbout.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAbout.setRows(5);
        txtAbout.setText("Esta aplicación fue desarrollada como proyecto para el segundo semestre del software.\ncarrera de ingeniería bajo los conceptos de programación orientada a objetos y todos sus\nderivados.\nEste producto formará parte del negocio \"Leather Flower SPA\" con todos los derechos reservados.");
        txtAbout.setEnabled(false);
        jScrollPane1.setViewportView(txtAbout);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 590, -1));

        lbl_DEES.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_DEES.setText("ELABORADA POR DEES Dev's");
        jPanel1.add(lbl_DEES, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FONDO SPA_paneles.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 530));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FONDO SPA_paneles.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 340, 530));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FONDO SPA_paneles.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 340, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_DEES;
    private javax.swing.JTextArea txtAbout;
    // End of variables declaration//GEN-END:variables
}
