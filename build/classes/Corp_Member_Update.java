
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/* * @author AGAMUYI PRECIOUS
 */
public class Corp_Member_Update extends javax.swing.JFrame {

    /**
     * Creates new form Corp_Member_Update
     */
    public Corp_Member_Update() {
        super("Corp_Member_Update");
        initComponents();
    }
Connection con =null;
PreparedStatement pst =null;
ResultSet rs =null;

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        sex = new javax.swing.JTextField();
        Age = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        No = new javax.swing.JTextField();
        Origin = new javax.swing.JTextField();
        Graduation = new javax.swing.JTextField();
        qualification = new javax.swing.JTextField();
        Round = new javax.swing.JTextField();
        Place = new javax.swing.JTextField();
        Town = new javax.swing.JTextField();
        Local = new javax.swing.JTextField();
        Nature = new javax.swing.JTextField();
        Deployment = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Redeploy = new javax.swing.JTextField();
        register = new javax.swing.JTextField();
        cert = new javax.swing.JTextField();
        code = new javax.swing.JTextField();
        any = new javax.swing.JTextField();
        post = new javax.swing.JTextField();
        search = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        rest = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        srch = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Remrk = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Name:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 20, 90, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Sex:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 60, 80, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Age:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 90, 80, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Marital Status:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 130, 140, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("Nysc-Call-Up-No:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 170, 150, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("State Of Origin:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 210, 140, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("Institution Of Graduation:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 250, 190, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("Qualification and Discipline:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 290, 200, 15);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("Place Of Primary Assignment:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 330, 210, 15);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("Town:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 380, 90, 15);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setText("Local Government:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 420, 160, 15);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 51));
        jLabel12.setText("Nature Of Primary Assignment:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 460, 220, 15);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 51));
        jLabel13.setText("YearRound Comm.Development Project:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(30, 500, 270, 15);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 51));
        jLabel14.setText("State Of Original Deployment:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(30, 540, 220, 15);
        jPanel1.add(Name);
        Name.setBounds(280, 10, 210, 30);
        jPanel1.add(sex);
        sex.setBounds(280, 50, 210, 30);
        jPanel1.add(Age);
        Age.setBounds(280, 90, 210, 30);
        jPanel1.add(status);
        status.setBounds(280, 130, 210, 30);
        jPanel1.add(No);
        No.setBounds(280, 170, 210, 30);
        jPanel1.add(Origin);
        Origin.setBounds(280, 210, 210, 30);
        jPanel1.add(Graduation);
        Graduation.setBounds(280, 250, 210, 30);
        jPanel1.add(qualification);
        qualification.setBounds(280, 290, 210, 30);
        jPanel1.add(Round);
        Round.setBounds(280, 490, 210, 30);
        jPanel1.add(Place);
        Place.setBounds(280, 330, 210, 30);
        jPanel1.add(Town);
        Town.setBounds(280, 370, 210, 30);
        jPanel1.add(Local);
        Local.setBounds(280, 410, 210, 30);
        jPanel1.add(Nature);
        Nature.setBounds(280, 450, 210, 30);
        jPanel1.add(Deployment);
        Deployment.setBounds(280, 530, 210, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 51));
        jLabel15.setText("Date Of First  Registration(If Redeployed):");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(530, 90, 240, 15);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 51));
        jLabel16.setText("State Of Registration:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(530, 130, 170, 15);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 51));
        jLabel17.setText("Certificate No:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(530, 170, 140, 15);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 51));
        jLabel18.setText("State Code:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(530, 220, 120, 15);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 51));
        jLabel19.setText("Award(If Any):");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(530, 270, 130, 15);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 51));
        jLabel20.setText("Post Service Contact Address:");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(530, 320, 200, 15);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 51));
        jLabel21.setText("Remark:");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(530, 370, 110, 15);
        jPanel1.add(Redeploy);
        Redeploy.setBounds(770, 80, 210, 30);
        jPanel1.add(register);
        register.setBounds(770, 120, 210, 30);
        jPanel1.add(cert);
        cert.setBounds(770, 160, 210, 30);
        jPanel1.add(code);
        code.setBounds(770, 210, 210, 30);
        jPanel1.add(any);
        any.setBounds(770, 260, 210, 30);
        jPanel1.add(post);
        post.setBounds(770, 310, 210, 30);
        jPanel1.add(search);
        search.setBounds(980, 10, 150, 30);

        Update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 0, 51));
        Update.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\NYSC CORPS_MEMBER REGISTRATION  SYSTEM\\my icons\\Update_50px.png")); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update);
        Update.setBounds(600, 450, 140, 50);

        delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 0, 51));
        delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\NYSC CORPS_MEMBER REGISTRATION  SYSTEM\\my icons\\Delete_50px.png")); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(750, 450, 127, 50);

        rest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rest.setForeground(new java.awt.Color(255, 0, 51));
        rest.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\NYSC CORPS_MEMBER REGISTRATION  SYSTEM\\my icons\\Reset_50px.png")); // NOI18N
        rest.setText("Rest");
        rest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restActionPerformed(evt);
            }
        });
        jPanel1.add(rest);
        rest.setBounds(890, 450, 130, 50);

        Back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 0, 51));
        Back.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\NYSC CORPS_MEMBER REGISTRATION  SYSTEM\\my icons\\Back Arrow_50px.png")); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(1040, 450, 130, 50);

        srch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        srch.setForeground(new java.awt.Color(255, 0, 51));
        srch.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\NYSC CORPS_MEMBER REGISTRATION  SYSTEM\\my icons\\Search_50px.png")); // NOI18N
        srch.setText("Search");
        srch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchActionPerformed(evt);
            }
        });
        jPanel1.add(srch);
        srch.setBounds(1140, 0, 129, 59);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 51));
        jLabel22.setText("State Code:");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(870, 10, 80, 30);

        Remrk.setColumns(20);
        Remrk.setRows(5);
        jScrollPane1.setViewportView(Remrk);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(770, 350, 210, 60);

        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\NYSC CORPS_MEMBER REGISTRATION  SYSTEM\\Pit1.jpg")); // NOI18N
        jLabel23.setText("jLabel23");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(0, -22, 1300, 1480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void restActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restActionPerformed
                                                          Name.setText(null);
                                                          sex.setText(null);
                                                          Age.setText(null);
                                                          status.setText(null);
                                                          No.setText(null);
                                                          Origin.setText(null);
                                                          Graduation.setText(null);
                                                         Place.setText(null);
                                                          Town.setText(null);
                                                          Local.setText(null);
                                                          Nature.setText(null);
                                                          Round.setText(null);
                                                          Deployment.setText(null);
                                                          Redeploy.setText(null);
                                                          register.setText(null);
                                                          cert.setText(null);
                                                          code.setText(null);
                                                          any.setText(null);
                                                          post.setText(null);
                                                          Remrk.setText(null);
                                                          search.setText(null);
                                                          qualification.setText(null);
  
    }//GEN-LAST:event_restActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
                                                       setVisible(false);
                                                       Home info = new Home();
                                                       info.setVisible(true);
                                                       this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
                                                   if(Name.getText().equals("")){
                                                       JOptionPane.showMessageDialog(null,"The fields are empty please fill\n Thank you");
                                                   }else{
                                                       try{
                                                           
                                                       String value1 = Name.getText();
                                                       String value2 = sex.getText();
                                                       String value3 = Age.getText();
                                                       String value4 = status.getText();
                                                       String value5 = No.getText();
                                                       String value6 = Origin.getText();
                                                       String value7 = Graduation.getText();
                                                       String value8 = qualification.getText();
                                                       String value9 = Place.getText();
                                                       String value10 = Town.getText();
                                                       String value11 = Local.getText();
                                                       String value12 = Nature.getText();
                                                       String value13 = Round.getText();
                                                       String value14 = Deployment.getText();
                                                       String value15 = Redeploy.getText();
                                                       String value16 = register.getText();
                                                       String value17 = cert.getText();
                                                       String value18 = code.getText();
                                                       String value19 = any.getText();
                                                       String value20 = post.getText();
                                                       String value21 = Remrk.getText();
         
         
                                                        String value22 = search.getText();

                                                           
                                                           
                                                           
                                                           
                                                           
                                                    
String sql = "UPDATE registration SET name = '"+value1+"',sex= '"+value2+"',age = '"+value3+"',marital_status = '"+value4+"', nysc_call_up_no= '"+value5+"',state_origin ='"+value6+"',institution_graduation ='"+value7+"',qualification_discipline ='"+value8+"',place_primary_assignment='"+value9+"'"
 + ",town='"+value10+"',local_government ='"+value11+"',nature_primary_assignment ='"+value12+"',yr_round_comm_dev_project='"+value13+"',state_original_deployment ='"+value14+"',date_first_registration='"+value15+"',date_registration ='"+value16+"',certificate_no='"+value17+"',state_code ='"+value18+"',award ='"+value19+"',post_service_contact_address ='"+value20+"',remark ='"+value21+"' WHERE state_code = '"+value22+"'";

                                                           Nysc_Connect.getConnection();
                                                          con=DriverManager.getConnection("jdbc:mysql://localhost/nysc resgistration system","root","");
                                                          pst =con.prepareStatement(sql);
                                                          pst.execute();
                                                           
                                                          JOptionPane.showMessageDialog(null, "Corps Member Details Successfully Updated");  
                                                           
                                                       }catch(Exception e){
                                                           JOptionPane.showMessageDialog(null, e);
                                                       }
                                                     
                                                   }
    }//GEN-LAST:event_UpdateActionPerformed

    private void srchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchActionPerformed
                                                         if(search.getText().equals("")){
                                                             JOptionPane.showMessageDialog(null,"Please fill in the field\n Thank you");
                                                         }else{
                                                           try{
                                                               
                                                  Nysc_Connect.getConnection();
                                                  con=DriverManager.getConnection("jdbc:mysql://localhost/nysc resgistration system","root","");
                                                  
                                                   String sql = "SELECT * FROM registration WHERE state_code = ?";
                                                   
                                                   pst = con.prepareStatement(sql);
                                                  pst.setString(1,search.getText());
                                                  
                                                   rs = pst.executeQuery();
                                                   if(rs.next()){
          
                                                   String rex1 = rs.getString("name");
                                                   Name.setText(rex1);
          
         
                                                  String rex2 = rs.getString("sex");
                                                  sex.setText(rex2);
         
                                                  String rex3 = rs.getString("age");
                                                  Age.setText(rex3);
         
                                                 String rex4 = rs.getString("marital_status");
                                                 status.setText(rex4);
                                                 String rex5 = rs.getString("nysc_call_up_no");
                                                 No.setText(rex5);
                                                 String rex6 = rs.getString("state_origin");
                                                  Origin.setText(rex6);
                                                  String rex7 = rs.getString("institution_graduation");
                                                  Graduation.setText(rex7);
                                                  String rex8 = rs.getString("qualification_discipline");
                                                   qualification.setText(rex8);
                                                   String rex9 = rs.getString("place_primary_assignment");
                                                   Place.setText(rex9);
                                                   String rex10 = rs.getString("town");
                                                   Town.setText(rex10);
                                                   String rex11 = rs.getString("local_government");
                                                    Local.setText(rex11);
                                                    String rex12 = rs.getString("nature_primary_assignment");
                                                    Nature.setText(rex12);
                                                    String rex13 = rs.getString("yr_round_comm_dev_project");
                                                   Round.setText(rex13);
                                                   String rex14 = rs.getString("state_original_deployment");
                                                   Deployment.setText(rex14);
                                                   String rex15 = rs.getString("date_first_registration");
                                                   Redeploy.setText(rex15);
                                                   String rex16 = rs.getString("date_registration");
                                                   register.setText(rex16);
                                                   String rex17 = rs.getString("certificate_no");
                                                   cert.setText(rex17);
                                                    String rex18 = rs.getString("state_code");
                                                   code.setText(rex18);
                                                   String rex19 = rs.getString("award");
                                                   any.setText(rex19);
                                                   String rex20 = rs.getString("post_service_contact_address");
                                                   post.setText(rex20);
                                                   String rex21 = rs.getString("remark");
                                                   Remrk.setText(rex21);
         
                                                              rs.close();
                                                              pst.close();  
                                                           }else{
                                                       JOptionPane.showMessageDialog(null, "No Record of Corp Member Found");
      }
        
                                                               
                                                           } catch(Exception e){
                                                               
                                                               JOptionPane.showMessageDialog(null, e);
                                                                   } 
                                                             
                                                          
                                                             
                                                         }                                                    
    }//GEN-LAST:event_srchActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
                                                     int x=JOptionPane.showConfirmDialog(null, "Do you really want to delete","Delete",JOptionPane.YES_NO_OPTION);
                                                         if(x==0){
        
        
        try{
    
                                                 String sql = "DELETE  FROM registration WHERE state_code = ?";
                                                   pst = con.prepareStatement(sql);
                                                   pst.setString(1,search.getText()); 
                                                  pst.executeUpdate();
       
                                                 setVisible(false);
                                                  Corp_Member_View info = new Corp_Member_View();
                                                 info.setVisible(true);
                                                 JOptionPane.showMessageDialog(null, "Successfully deleted");
      
                                                            }catch(Exception e){
                                                 JOptionPane.showMessageDialog(null, e);
}
}
    }//GEN-LAST:event_deleteActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
   ImageIcon image = new ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\NYSC CORPS_MEMBER REGISTRATION  SYSTEM\\src\\py.jpg");
    this.setIconImage(image.getImage());
    this.setTitle("Corp_Member_Update");
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Corp_Member_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Corp_Member_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Corp_Member_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Corp_Member_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Corp_Member_Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age;
    private javax.swing.JButton Back;
    private javax.swing.JTextField Deployment;
    private javax.swing.JTextField Graduation;
    private javax.swing.JTextField Local;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Nature;
    private javax.swing.JTextField No;
    private javax.swing.JTextField Origin;
    private javax.swing.JTextField Place;
    private javax.swing.JTextField Redeploy;
    private javax.swing.JTextArea Remrk;
    private javax.swing.JTextField Round;
    private javax.swing.JTextField Town;
    private javax.swing.JButton Update;
    private javax.swing.JTextField any;
    private javax.swing.JTextField cert;
    private javax.swing.JTextField code;
    private javax.swing.JButton delete;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField post;
    private javax.swing.JTextField qualification;
    private javax.swing.JTextField register;
    private javax.swing.JButton rest;
    private javax.swing.JTextField search;
    private javax.swing.JTextField sex;
    private javax.swing.JButton srch;
    private javax.swing.JTextField status;
    // End of variables declaration//GEN-END:variables
}
