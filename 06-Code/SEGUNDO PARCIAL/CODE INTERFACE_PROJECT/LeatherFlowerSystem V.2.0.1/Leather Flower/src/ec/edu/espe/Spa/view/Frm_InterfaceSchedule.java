
package ec.edu.espe.Spa.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Steven Pozo, Erick Moreira, Elkin Pabón, Diego Ponce, DCCO-ESPE, DEES Developers
 */
public class Frm_InterfaceSchedule extends javax.swing.JFrame {

    /**
     * Creates new form Frm_InterfaceSchedule
     */
    public Frm_InterfaceSchedule() {
        initComponents();
        this.setTitle("Leather Flower");
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        Panel_Home panelH;
        panelH = new Panel_Home();
        showPanel(panelH);
    }
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Images/logoSinFondo.png"));
        return retValue;
    }
    private void showPanel(JPanel p){
        p.setSize(900,550);
        p.setLocation(0,0);
        
        panel_allData.removeAll();
        panel_allData.add(p,BorderLayout.CENTER);
        panel_allData.revalidate();
        panel_allData.repaint();
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
        panel_allData = new javax.swing.JPanel();
        Panel_Exit = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Panel_Customers = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Panel_HomeSchedule = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Panel_Schedule = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Panel_Update = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Panel_Delete = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        logoSinFondo = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_allData.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_allDataLayout = new javax.swing.GroupLayout(panel_allData);
        panel_allData.setLayout(panel_allDataLayout);
        panel_allDataLayout.setHorizontalGroup(
            panel_allDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        panel_allDataLayout.setVerticalGroup(
            panel_allDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        jPanel1.add(panel_allData, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 900, 550));

        Panel_Exit.setBackground(new java.awt.Color(192, 192, 192));
        Panel_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_ExitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel_ExitMousePressed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit1.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("EXIT");

        javax.swing.GroupLayout Panel_ExitLayout = new javax.swing.GroupLayout(Panel_Exit);
        Panel_Exit.setLayout(Panel_ExitLayout);
        Panel_ExitLayout.setHorizontalGroup(
            Panel_ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ExitLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        Panel_ExitLayout.setVerticalGroup(
            Panel_ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ExitLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(Panel_ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(28, 28, 28))
        );

        jPanel1.add(Panel_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 310, -1));

        Panel_Customers.setBackground(new java.awt.Color(192, 192, 192));
        Panel_Customers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_CustomersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_CustomersMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel_CustomersMousePressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/customer1.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("LIST CUSTOMERS");

        javax.swing.GroupLayout Panel_CustomersLayout = new javax.swing.GroupLayout(Panel_Customers);
        Panel_Customers.setLayout(Panel_CustomersLayout);
        Panel_CustomersLayout.setHorizontalGroup(
            Panel_CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_CustomersLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        Panel_CustomersLayout.setVerticalGroup(
            Panel_CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_CustomersLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(Panel_CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(28, 28, 28))
        );

        jPanel1.add(Panel_Customers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 310, 70));

        Panel_HomeSchedule.setBackground(new java.awt.Color(192, 192, 192));
        Panel_HomeSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_HomeScheduleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_HomeScheduleMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel_HomeScheduleMousePressed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home1.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("HOME");

        javax.swing.GroupLayout Panel_HomeScheduleLayout = new javax.swing.GroupLayout(Panel_HomeSchedule);
        Panel_HomeSchedule.setLayout(Panel_HomeScheduleLayout);
        Panel_HomeScheduleLayout.setHorizontalGroup(
            Panel_HomeScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_HomeScheduleLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(199, Short.MAX_VALUE))
        );
        Panel_HomeScheduleLayout.setVerticalGroup(
            Panel_HomeScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_HomeScheduleLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(Panel_HomeScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(28, 28, 28))
        );

        jPanel1.add(Panel_HomeSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 310, 70));

        Panel_Schedule.setBackground(new java.awt.Color(192, 192, 192));
        Panel_Schedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_ScheduleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_ScheduleMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel_ScheduleMousePressed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AGENDAR.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("SCHEDULE APPOINTMENT");

        javax.swing.GroupLayout Panel_ScheduleLayout = new javax.swing.GroupLayout(Panel_Schedule);
        Panel_Schedule.setLayout(Panel_ScheduleLayout);
        Panel_ScheduleLayout.setHorizontalGroup(
            Panel_ScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ScheduleLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        Panel_ScheduleLayout.setVerticalGroup(
            Panel_ScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ScheduleLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(Panel_ScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28))
        );

        jPanel1.add(Panel_Schedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 310, 70));

        Panel_Update.setBackground(new java.awt.Color(192, 192, 192));
        Panel_Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_UpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_UpdateMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel_UpdateMousePressed(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/actualizar1_1.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("UPDATE APPOINTMENT");

        javax.swing.GroupLayout Panel_UpdateLayout = new javax.swing.GroupLayout(Panel_Update);
        Panel_Update.setLayout(Panel_UpdateLayout);
        Panel_UpdateLayout.setHorizontalGroup(
            Panel_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_UpdateLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        Panel_UpdateLayout.setVerticalGroup(
            Panel_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_UpdateLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(Panel_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(28, 28, 28))
        );

        jPanel1.add(Panel_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 310, 70));

        Panel_Delete.setBackground(new java.awt.Color(192, 192, 192));
        Panel_Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_DeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_DeleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel_DeleteMousePressed(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete1.png"))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("DELETE APPOINTMENT");

        javax.swing.GroupLayout Panel_DeleteLayout = new javax.swing.GroupLayout(Panel_Delete);
        Panel_Delete.setLayout(Panel_DeleteLayout);
        Panel_DeleteLayout.setHorizontalGroup(
            Panel_DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_DeleteLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        Panel_DeleteLayout.setVerticalGroup(
            Panel_DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_DeleteLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(Panel_DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addGap(28, 28, 28))
        );

        jPanel1.add(Panel_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 310, 70));

        logoSinFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logoSinFondo.png"))); // NOI18N
        jPanel1.add(logoSinFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, -1));

        jLabel14.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        jLabel14.setText("SPA");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 50, -1));

        jLabel15.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        jLabel15.setText("LEATHER");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 110, -1));

        jLabel16.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        jLabel16.setText("FLOWER");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 110, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/franja_MA.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 620));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/franja_MA.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 650, 70));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/franja_MA.jpg"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 650, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/franja_MA.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 620, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void Panel_ScheduleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ScheduleMousePressed
        Panel_allData panelAD;
        panelAD = new Panel_allData();
        showPanel(panelAD);
    }//GEN-LAST:event_Panel_ScheduleMousePressed

    private void Panel_ScheduleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ScheduleMouseEntered
        Panel_Schedule.setBackground(Color.white);
    }//GEN-LAST:event_Panel_ScheduleMouseEntered

    private void Panel_ScheduleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ScheduleMouseExited
        Panel_Schedule.setBackground(Color.lightGray);
    }//GEN-LAST:event_Panel_ScheduleMouseExited

    private void Panel_CustomersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CustomersMouseEntered
        Panel_Customers.setBackground(Color.white);
    }//GEN-LAST:event_Panel_CustomersMouseEntered

    private void Panel_CustomersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CustomersMouseExited
        Panel_Customers.setBackground(Color.lightGray);
    }//GEN-LAST:event_Panel_CustomersMouseExited

    private void Panel_ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ExitMouseEntered
        Panel_Exit.setBackground(Color.white);
    }//GEN-LAST:event_Panel_ExitMouseEntered

    private void Panel_ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ExitMouseExited
        Panel_Exit.setBackground(Color.lightGray);
    }//GEN-LAST:event_Panel_ExitMouseExited

    private void Panel_ExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ExitMousePressed
        
      int i =  JOptionPane.showConfirmDialog(this,"Do you want to leave the program?","Warning",JOptionPane.WARNING_MESSAGE);
        
      if(i==0){
        Frm_InterfaceInicial FrmII;
        FrmII = new Frm_InterfaceInicial();
        
        FrmII.setVisible(true);
        this.setVisible(false);
      }else if(i==1){
          this.setVisible(true);
      }
    }//GEN-LAST:event_Panel_ExitMousePressed

    private void Panel_CustomersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CustomersMousePressed
        Panel_tableCustomer panelTC;
        panelTC = new Panel_tableCustomer();
        showPanel(panelTC);
    }//GEN-LAST:event_Panel_CustomersMousePressed

    private void Panel_HomeScheduleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_HomeScheduleMouseEntered
        Panel_HomeSchedule.setBackground(Color.white);
    }//GEN-LAST:event_Panel_HomeScheduleMouseEntered

    private void Panel_HomeScheduleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_HomeScheduleMouseExited
        Panel_HomeSchedule.setBackground(Color.lightGray);
    }//GEN-LAST:event_Panel_HomeScheduleMouseExited

    private void Panel_HomeScheduleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_HomeScheduleMousePressed
        Panel_Home panelH;
        panelH = new Panel_Home();
        
        showPanel(panelH);
    }//GEN-LAST:event_Panel_HomeScheduleMousePressed

    private void Panel_UpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_UpdateMouseEntered
        Panel_Update.setBackground(Color.white);
    }//GEN-LAST:event_Panel_UpdateMouseEntered

    private void Panel_UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_UpdateMouseExited
        Panel_Update.setBackground(Color.lightGray);
    }//GEN-LAST:event_Panel_UpdateMouseExited

    private void Panel_UpdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_UpdateMousePressed
        Panel_UpdateCustomer panelUC;
        panelUC = new Panel_UpdateCustomer();
        
        showPanel(panelUC);
    }//GEN-LAST:event_Panel_UpdateMousePressed

    private void Panel_DeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_DeleteMouseEntered
        Panel_Delete.setBackground(Color.white);
    }//GEN-LAST:event_Panel_DeleteMouseEntered

    private void Panel_DeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_DeleteMouseExited
        Panel_Delete.setBackground(Color.lightGray);
    }//GEN-LAST:event_Panel_DeleteMouseExited

    private void Panel_DeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_DeleteMousePressed
        Panel_DeleteCustomer panelDelete;
        panelDelete = new Panel_DeleteCustomer();
                
        showPanel(panelDelete);
    }//GEN-LAST:event_Panel_DeleteMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_InterfaceSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_InterfaceSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_InterfaceSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_InterfaceSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_InterfaceSchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Customers;
    private javax.swing.JPanel Panel_Delete;
    private javax.swing.JPanel Panel_Exit;
    private javax.swing.JPanel Panel_HomeSchedule;
    private javax.swing.JPanel Panel_Schedule;
    private javax.swing.JPanel Panel_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoSinFondo;
    private javax.swing.JPanel panel_allData;
    // End of variables declaration//GEN-END:variables
}
