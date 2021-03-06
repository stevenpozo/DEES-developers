
package ec.edu.espe.Spa.view;

import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import ec.edu.espe.Spa.controller.CustomerController;
import ec.edu.espe.Spa.controller.ServiceController;
import ec.edu.espe.Spa.model.Customer;
import ec.edu.espe.Spa.model.MongoDBConnection;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author Steven Pozo, DCCO-ESPE, DEES Developers
 */
public class Panel_DeleteCustomer extends javax.swing.JPanel {

    /**
     * Creates new form Panel_DeleteCustomer
     */
    public Panel_DeleteCustomer() {
        initComponents();
        MongoDBConnection MongoDB;
        MongoDB = new MongoDBConnection();
        MongoDB.connectDatabase();
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
        btn_Delete = new javax.swing.JButton();
        txt_idDelete = new javax.swing.JTextField();
        lbl_DElete = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_FullNames = new javax.swing.JTextField();
        txt_Surnames = new javax.swing.JTextField();
        txt_Id = new javax.swing.JTextField();
        txt_Cellphone = new javax.swing.JTextField();
        txt_Email = new javax.swing.JTextField();
        txt_Type = new javax.swing.JTextField();
        txt_Cost = new javax.swing.JTextField();
        txt_TimeOT = new javax.swing.JTextField();
        txt_Hour = new javax.swing.JFormattedTextField();
        txt_Date = new javax.swing.JTextField();
        btn_Search = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Delete.setBackground(new java.awt.Color(102, 255, 204));
        btn_Delete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_Delete.setText("DELETE");
        btn_Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_DeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_DeleteMouseExited(evt);
            }
        });
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, -1, -1));
        jPanel1.add(txt_idDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 210, 30));

        lbl_DElete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_DElete.setText("DELETE CUSTOMER");
        jPanel1.add(lbl_DElete, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/franjacyan.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 10, 160));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/franjacyan.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 10, 160));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/franjacyan.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 320, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/franjacyan.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 10, 160));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("FULL NAMES:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("SURNAMES:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("ID:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("CELLPHONE:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("E- MAIL:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("TYPE OF SERVICE:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("COST:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 50, 20));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("TIME OF TREATMENT:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, -1, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("DATE:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("HOUR OF ATTENTION:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        txt_FullNames.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_FullNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FullNamesActionPerformed(evt);
            }
        });
        txt_FullNames.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_FullNamesKeyTyped(evt);
            }
        });
        jPanel1.add(txt_FullNames, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 200, 20));

        txt_Surnames.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Surnames.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_SurnamesKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Surnames, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 200, 20));

        txt_Id.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_IdKeyPressed(evt);
            }
        });
        jPanel1.add(txt_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 200, -1));

        txt_Cellphone.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Cellphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_CellphoneKeyPressed(evt);
            }
        });
        jPanel1.add(txt_Cellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 200, 20));

        txt_Email.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txt_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 200, 20));

        txt_Type.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txt_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 200, -1));

        txt_Cost.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Cost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CostKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 200, -1));

        txt_TimeOT.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txt_TimeOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 200, 20));

        try {
            txt_Hour.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_Hour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_HourActionPerformed(evt);
            }
        });
        txt_Hour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_HourKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_HourKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 50, -1));

        txt_Date.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txt_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 200, -1));

        btn_Search.setBackground(new java.awt.Color(153, 255, 204));
        btn_Search.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_Search.setText("SEARCH");
        btn_Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SearchMouseExited(evt);
            }
        });
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel3.setText("ENTER CUSTOMER ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SpaFondo1.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SpaFondo1.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 330, 550));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SpaFondo1.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 310, 550));

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

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        CustomerController customerC;
        customerC = new CustomerController("Customers");
        MongoCollection<Document> collection = MongoDBConnection.database.getCollection("Customers");
        
        
        Document doc = collection.find(eq("identification", txt_idDelete.getText())).first(); 
        int i =  JOptionPane.showConfirmDialog(this,"Delete Customer?","Warning",JOptionPane.WARNING_MESSAGE);
        
      if(i==0){
        customerC.deleteToDatabase(doc);
        JOptionPane.showMessageDialog(this, "Customer has been deleted");
      }else if(i==1){
          this.setVisible(true);
      }
       
//        customerC.deleteToDatabase(doc);
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void txt_FullNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FullNamesActionPerformed
        //
    }//GEN-LAST:event_txt_FullNamesActionPerformed

    private void txt_FullNamesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_FullNamesKeyTyped

        //   validado por Erick Moreira
        char validateLetters = evt.getKeyChar();
        if(Character.isDigit(validateLetters)){
            evt.consume();
            JOptionPane.showMessageDialog(txt_FullNames, "Enter only letters","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txt_FullNamesKeyTyped

    private void txt_SurnamesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SurnamesKeyTyped
        //   validado por Erick Moreira
        char validateLetters = evt.getKeyChar();
        if(Character.isDigit(validateLetters)){
            evt.consume();
            JOptionPane.showMessageDialog(txt_Surnames, "Enter only letters","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txt_SurnamesKeyTyped

    private void txt_IdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IdKeyPressed
        String value = txt_Id.getText();
        int legth = value.length(); //saca la longitud del string
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            txt_Id.setEditable(true);
            if(legth>=10){

                JOptionPane.showMessageDialog(this, "ID must have 10 digits","Warning",JOptionPane.WARNING_MESSAGE);
                //   txt_Id.setEditable(true);
                txt_Id.setText("");

            }
        }else {
            JOptionPane.showMessageDialog(this, "Enter only numbers","Warning",JOptionPane.WARNING_MESSAGE);
            //  txt_Id.setEditable(true);
            txt_Id.setText("");
        }
    }//GEN-LAST:event_txt_IdKeyPressed

    private void txt_CellphoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CellphoneKeyPressed
        String value = txt_Cellphone.getText();
        int legth = value.length(); //saca la longitud del string
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            txt_Cellphone.setEditable(true);
            if(legth>=10){

                JOptionPane.showMessageDialog(this, "Cellphone number must have 10 digits","Warning",JOptionPane.WARNING_MESSAGE);
                txt_Cellphone.setText("");

            }
        }else {
            JOptionPane.showMessageDialog(this, "Enter only numbers","Warning",JOptionPane.WARNING_MESSAGE);
            txt_Cellphone.setText("");
        }
    }//GEN-LAST:event_txt_CellphoneKeyPressed

    private void txt_CostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CostKeyTyped
        char character = evt.getKeyChar();

        if(((character < '0' || character > '9')) && (character != KeyEvent.VK_BACK_SPACE)
            && (character != '.' || txt_Cost.getText().contains(".") )){
            evt.consume();
        }
    }//GEN-LAST:event_txt_CostKeyTyped

    private void txt_HourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_HourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_HourActionPerformed

    private void txt_HourKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_HourKeyPressed
        ServiceController h;
        h = new ServiceController();
        if(h.Validar_CampoHora(txt_Hour.getText())== false){

        }
    }//GEN-LAST:event_txt_HourKeyPressed

    private void txt_HourKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_HourKeyTyped

    }//GEN-LAST:event_txt_HourKeyTyped

    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed

        CustomerController customerC;
        customerC = new CustomerController("Customers");
        MongoCollection<Document> collection = MongoDBConnection.database.getCollection("Customers");

        Document doc = collection.find(eq("identification", txt_idDelete.getText())).first();
        // System.out.println(doc.toJson());
        Gson gson = new Gson();
        Customer customer = gson.fromJson(doc.toJson(), Customer.class);

        txt_FullNames.setText(customer.getFullNames());
        txt_Surnames.setText(customer.getSurnames());
        txt_Id.setText(customer.getIdentification());
        txt_Cellphone.setText(customer.getCellphone());
        txt_Email.setText(customer.getEmail());
        txt_Cost.setText(customer.getCost());
        txt_TimeOT.setText(customer.getTimeOfTreatment());
        txt_Type.setText(customer.getTypeOfService());
        txt_Date.setText(customer.getDate());
        txt_Hour.setText(customer.getHourOfAttention());

    }//GEN-LAST:event_btn_SearchActionPerformed

    private void btn_SearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchMouseEntered
       btn_Search.setBackground(Color.green);
    }//GEN-LAST:event_btn_SearchMouseEntered

    private void btn_SearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchMouseExited
        btn_Search.setBackground(Color.cyan);
    }//GEN-LAST:event_btn_SearchMouseExited

    private void btn_DeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DeleteMouseEntered
        btn_Delete.setBackground(Color.green);
    }//GEN-LAST:event_btn_DeleteMouseEntered

    private void btn_DeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DeleteMouseExited
        btn_Delete.setBackground(Color.cyan);
    }//GEN-LAST:event_btn_DeleteMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Search;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_DElete;
    private javax.swing.JTextField txt_Cellphone;
    private javax.swing.JTextField txt_Cost;
    private javax.swing.JTextField txt_Date;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_FullNames;
    private javax.swing.JFormattedTextField txt_Hour;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_Surnames;
    private javax.swing.JTextField txt_TimeOT;
    private javax.swing.JTextField txt_Type;
    private javax.swing.JTextField txt_idDelete;
    // End of variables declaration//GEN-END:variables
}
