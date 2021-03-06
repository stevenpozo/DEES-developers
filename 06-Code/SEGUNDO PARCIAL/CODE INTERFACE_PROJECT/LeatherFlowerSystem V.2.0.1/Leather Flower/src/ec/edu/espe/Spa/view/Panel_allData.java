
package ec.edu.espe.Spa.view;


import com.toedter.calendar.JDateChooser;
import ec.edu.espe.Spa.controller.CustomerController;
import ec.edu.espe.Spa.controller.ServiceController;
import ec.edu.espe.Spa.model.MongoDBConnection;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


/**
 *
 * @author Steven Pozo, Erick Moreira, Elkin Pabón, Diego Ponce, DCCO-ESPE, DEES Developers
 */
public class Panel_allData extends javax.swing.JPanel {

    /**
     * Creates new form Panel_allData
     */
    public Panel_allData() {
        initComponents();
        MongoDBConnection mongoDB;
        mongoDB = new MongoDBConnection();
        mongoDB.connectDatabase();
    }
    
SimpleDateFormat formDate = new SimpleDateFormat("dd-MM-yy");
    
    public String getDate(JDateChooser jdDate){
        if(jdDate.getDate() != null){
            return formDate.format(jdDate.getDate());
        } 
        else{
            return null;
        }
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
        lbDataCustomer = new javax.swing.JLabel();
        lblSN = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblCEllphone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblTOS = new javax.swing.JLabel();
        lblCost = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblFN1 = new javax.swing.JLabel();
        txt_Surnames = new javax.swing.JTextField();
        txt_FullNames = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txt_Id = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txt_Cellphone = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txt_Email = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txt_Cost = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txt_TimeOT = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        cmb_Type = new javax.swing.JComboBox<>();
        jSeparator8 = new javax.swing.JSeparator();
        btn_Register = new javax.swing.JButton();
        btn_NewRegister = new javax.swing.JButton();
        btn_Cancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        calendarDate = new com.toedter.calendar.JDateChooser();
        txt_Hour = new javax.swing.JFormattedTextField();
        btn_Invoice = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_Register1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbDataCustomer.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbDataCustomer.setText("REGISTER CUSTOMER");
        jPanel1.add(lbDataCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        lblSN.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSN.setForeground(new java.awt.Color(51, 51, 255));
        lblSN.setText("SURNAMES:");
        jPanel1.add(lblSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, 30));

        lblId.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblId.setForeground(new java.awt.Color(51, 51, 255));
        lblId.setText("ID:");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 30, -1));

        lblCEllphone.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCEllphone.setForeground(new java.awt.Color(51, 51, 255));
        lblCEllphone.setText("CELLPHONE:");
        jPanel1.add(lblCEllphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        lblEmail.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(51, 51, 255));
        lblEmail.setText("E-MAIL:");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        lblTOS.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTOS.setForeground(new java.awt.Color(51, 51, 255));
        lblTOS.setText("TYPE OF SERVICE:");
        jPanel1.add(lblTOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, -1));

        lblCost.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCost.setForeground(new java.awt.Color(51, 51, 255));
        lblCost.setText("COST:");
        jPanel1.add(lblCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("TIME OF TREATMENT:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, -1));

        lblFN1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblFN1.setForeground(new java.awt.Color(51, 51, 255));
        lblFN1.setText("FULL NAMES:");
        jPanel1.add(lblFN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        txt_Surnames.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Surnames.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_SurnamesKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Surnames, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 270, 40));

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
        jPanel1.add(txt_FullNames, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 270, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 270, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 270, 10));

        txt_Id.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_IdKeyPressed(evt);
            }
        });
        jPanel1.add(txt_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 270, 40));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 270, 10));

        txt_Cellphone.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Cellphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_CellphoneKeyPressed(evt);
            }
        });
        jPanel1.add(txt_Cellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 270, 40));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 270, 10));

        txt_Email.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txt_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 270, 40));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 270, 10));

        txt_Cost.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Cost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CostKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 260, 40));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 260, 10));

        txt_TimeOT.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txt_TimeOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 260, 40));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 260, 10));

        cmb_Type.setBackground(new java.awt.Color(153, 255, 204));
        cmb_Type.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmb_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laser Depilation", "Facial Treatment", "Stain Blurring", "Deep Hydration", "Chemical Peeling", "Platelet Rich Plasma", "Reduction Measures", "Body Toning", "Blurring of Stretch Marks", "Increasing of Buttocks", "Ionic Detox", "Microblanding", " " }));
        jPanel1.add(cmb_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 260, 40));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 260, 10));

        btn_Register.setBackground(new java.awt.Color(0, 255, 255));
        btn_Register.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_Register.setText("REGISTER");
        btn_Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_RegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_RegisterMouseExited(evt);
            }
        });
        btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 110, 30));

        btn_NewRegister.setBackground(new java.awt.Color(0, 255, 255));
        btn_NewRegister.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_NewRegister.setText("NEW REGISTER");
        btn_NewRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_NewRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_NewRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_NewRegisterMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_NewRegisterMousePressed(evt);
            }
        });
        btn_NewRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btn_NewRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, -1, 30));

        btn_Cancel.setBackground(new java.awt.Color(0, 255, 255));
        btn_Cancel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_Cancel.setText("CANCEL");
        btn_Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CancelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_CancelMousePressed(evt);
            }
        });
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 90, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("DATE:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 70, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("HOUR OF ATTENTION:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 210, 30));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 260, 10));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 260, 10));
        jPanel1.add(calendarDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 260, 40));

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
        jPanel1.add(txt_Hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 50, 30));

        btn_Invoice.setBackground(new java.awt.Color(0, 255, 255));
        btn_Invoice.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_Invoice.setText("INVOICE");
        btn_Invoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_InvoiceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_InvoiceMouseExited(evt);
            }
        });
        btn_Invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InvoiceActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Invoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 120, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/doc_Impresion1.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, 30, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SpaFondo1.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SpaFondo1.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 330, 550));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SpaFondo1.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 310, 550));

        btn_Register1.setBackground(new java.awt.Color(0, 255, 204));
        btn_Register1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_Register1.setText("REGISTER");
        btn_Register1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Register1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Register1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Register1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, -1, -1));

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

    private void btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegisterActionPerformed
    CustomerController customerController;
    customerController = new CustomerController("Customers");
        
    int i =  JOptionPane.showConfirmDialog(this,"Register Customer?","Aviso",JOptionPane.WARNING_MESSAGE);
        
      if(i==0){
        customerController.createToDatabase(customerController.RegisterAndBuildDocument(txt_FullNames.getText(), 
                txt_Surnames.getText(),
                txt_Id.getText(),
                txt_Cellphone.getText(),
                txt_Email.getText(), 
                cmb_Type.getSelectedItem().toString(), 
                txt_Cost.getText(), 
                txt_TimeOT.getText(), 
                formDate.format(calendarDate.getDate()), 
                txt_Hour.getText()));

        JOptionPane.showMessageDialog(this, "Data saved successfully");
      }else if(i==1){
          this.setVisible(true);
      }
    }//GEN-LAST:event_btn_RegisterActionPerformed

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

    private void btn_Register1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Register1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Register1ActionPerformed

    private void btn_NewRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewRegisterActionPerformed
        
      int i =  JOptionPane.showConfirmDialog(this,"Register a new Customer?","Warning",JOptionPane.WARNING_MESSAGE);
        
      if(i==0){
        txt_FullNames.setText("");
        txt_Surnames.setText("");
        txt_Id.setText("");
        txt_Cellphone.setText("");
        txt_Email.setText("");
        txt_Cost.setText("");
        txt_TimeOT.setText("");
        txt_Hour.setText("");
      }else if(i==1){
          this.setVisible(true);
      }
    }//GEN-LAST:event_btn_NewRegisterActionPerformed

    private void btn_CancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMouseEntered
        btn_Cancel.setBackground(Color.red);
    }//GEN-LAST:event_btn_CancelMouseEntered

    private void btn_CancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMouseExited
        btn_Cancel.setBackground(Color.cyan);
    }//GEN-LAST:event_btn_CancelMouseExited

    private void btn_RegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RegisterMouseEntered
        btn_Register.setBackground(Color.green);
    }//GEN-LAST:event_btn_RegisterMouseEntered

    private void btn_RegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RegisterMouseExited
        btn_Register.setBackground(Color.cyan);
    }//GEN-LAST:event_btn_RegisterMouseExited

    private void btn_NewRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewRegisterMouseEntered
        btn_NewRegister.setBackground(Color.green);
    }//GEN-LAST:event_btn_NewRegisterMouseEntered

    private void btn_NewRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewRegisterMouseExited
        btn_NewRegister.setBackground(Color.cyan);
    }//GEN-LAST:event_btn_NewRegisterMouseExited

    private void btn_CancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CancelMousePressed
        int i =  JOptionPane.showConfirmDialog(this,"Do you want cancel? you don't save data","Warning",JOptionPane.WARNING_MESSAGE);
        if(i==0){
        txt_FullNames.setText("");
        txt_Surnames.setText("");
        txt_Id.setText("");
        txt_Cellphone.setText("");
        txt_Email.setText("");
        txt_Cost.setText("");
        txt_TimeOT.setText("");
        txt_Hour.setText("");
        }else if(i==1){
            this.setVisible(true);
        }
    }//GEN-LAST:event_btn_CancelMousePressed

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

    private void txt_SurnamesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SurnamesKeyTyped
        //   validado por Erick Moreira
        char validateLetters = evt.getKeyChar();
        if(Character.isDigit(validateLetters)){
        evt.consume();
        JOptionPane.showMessageDialog(txt_Surnames, "Enter only letters","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txt_SurnamesKeyTyped

    private void txt_CostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CostKeyTyped
        char character = evt.getKeyChar();
        
        if(((character < '0' || character > '9')) && (character != KeyEvent.VK_BACK_SPACE)
            && (character != '.' || txt_Cost.getText().contains(".") )){
            evt.consume();
        }
    }//GEN-LAST:event_txt_CostKeyTyped

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        //
    }//GEN-LAST:event_btn_CancelActionPerformed

    private void btn_NewRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NewRegisterMousePressed
        int i =  JOptionPane.showConfirmDialog(this,"Register a new customer?","Aviso",JOptionPane.WARNING_MESSAGE);
        if(i==0){
        txt_FullNames.setText("");
        txt_Surnames.setText("");
        txt_Id.setText("");
        txt_Cellphone.setText("");
        txt_Email.setText("");
        txt_Cost.setText("");
        txt_TimeOT.setText("");
        txt_Hour.setText("");
        }else if(i==1){
            this.setVisible(true);
        }
    }//GEN-LAST:event_btn_NewRegisterMousePressed

    private void btn_InvoiceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InvoiceMouseEntered
        btn_Invoice.setBackground(Color.green);
    }//GEN-LAST:event_btn_InvoiceMouseEntered

    private void btn_InvoiceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InvoiceMouseExited
        btn_Invoice.setBackground(Color.cyan);
    }//GEN-LAST:event_btn_InvoiceMouseExited

    private void btn_InvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InvoiceActionPerformed
        Frm_InvoiceCustomer FrmIC;
        FrmIC = new Frm_InvoiceCustomer();
        
        FrmIC.setVisible(true);
    }//GEN-LAST:event_btn_InvoiceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Invoice;
    private javax.swing.JButton btn_NewRegister;
    private javax.swing.JButton btn_Register;
    private javax.swing.JButton btn_Register1;
    private com.toedter.calendar.JDateChooser calendarDate;
    private javax.swing.JComboBox<String> cmb_Type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbDataCustomer;
    private javax.swing.JLabel lblCEllphone;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFN1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblSN;
    private javax.swing.JLabel lblTOS;
    private javax.swing.JTextField txt_Cellphone;
    private javax.swing.JTextField txt_Cost;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_FullNames;
    private javax.swing.JFormattedTextField txt_Hour;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_Surnames;
    private javax.swing.JTextField txt_TimeOT;
    // End of variables declaration//GEN-END:variables
}
