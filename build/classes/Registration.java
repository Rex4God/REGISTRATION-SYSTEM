
import com.github.sarxos.webcam.Webcam;
import java.awt.Dimension;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



/**
 *
 * @author AGAMUYI PRECIOUS
 */
public class Registration extends javax.swing.JFrame {

                     
    
    

    public Registration() {
        initComponents();
    }
                     Connection con = null;
                      ResultSet rs    =null;
                      PreparedStatement pst =null;

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
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
        nature = new javax.swing.JTextField();
        project = new javax.swing.JTextField();
        state = new javax.swing.JTextField();
        local = new javax.swing.JTextField();
        town = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        place = new javax.swing.JTextField();
        discipline = new javax.swing.JTextField();
        institution = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        sex = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        marital = new javax.swing.JTextField();
        nysc = new javax.swing.JTextField();
        origin = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        first = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        certificate = new javax.swing.JTextField();
        code = new javax.swing.JTextField();
        award = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        rmrk = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        sub = new javax.swing.JButton();
        rest = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 255), 6), "Corp Members Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tarzan", 1, 14), new java.awt.Color(255, 102, 51))); // NOI18N
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 102));
        jLabel1.setText("Name:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 30, 90, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 102));
        jLabel2.setText("Sex:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 70, 90, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 102));
        jLabel3.setText("Age:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 110, 100, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 102));
        jLabel4.setText("Marital Status:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 160, 140, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 102));
        jLabel5.setText("Nysc-Call-Up-No:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 200, 160, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 102));
        jLabel6.setText("State of Origin:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 230, 140, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 102));
        jLabel7.setText("Institution Of Graduation:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 270, 190, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 102));
        jLabel8.setText("Qualification and Discipline:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 310, 220, 15);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 102));
        jLabel9.setText("Place Of Primary Assignment:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 350, 230, 15);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 102));
        jLabel10.setText("Town:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 400, 100, 15);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 102));
        jLabel11.setText("Local Government:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 440, 160, 15);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 102));
        jLabel12.setText("Nature Of Primary Assignment:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 480, 220, 15);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 102));
        jLabel13.setText("YearRound Comm. Development Project:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 520, 280, 15);
        jPanel2.add(nature);
        nature.setBounds(310, 470, 180, 30);
        jPanel2.add(project);
        project.setBounds(310, 510, 180, 30);
        jPanel2.add(state);
        state.setBounds(310, 560, 180, 30);

        local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localActionPerformed(evt);
            }
        });
        jPanel2.add(local);
        local.setBounds(310, 430, 180, 30);
        jPanel2.add(town);
        town.setBounds(310, 390, 180, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 102));
        jLabel14.setText("State Of Original Deployment:");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(10, 560, 220, 15);
        jPanel2.add(place);
        place.setBounds(310, 340, 180, 30);
        jPanel2.add(discipline);
        discipline.setBounds(310, 300, 180, 30);
        jPanel2.add(institution);
        institution.setBounds(310, 260, 180, 30);
        jPanel2.add(name);
        name.setBounds(310, 20, 180, 30);
        jPanel2.add(sex);
        sex.setBounds(310, 60, 180, 30);
        jPanel2.add(age);
        age.setBounds(310, 100, 180, 30);
        jPanel2.add(marital);
        marital.setBounds(310, 140, 180, 30);
        jPanel2.add(nysc);
        nysc.setBounds(310, 180, 180, 30);
        jPanel2.add(origin);
        origin.setBounds(310, 220, 180, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\NYSC CORPS_MEMBER REGISTRATION  SYSTEM\\piy.jpg")); // NOI18N
        jLabel15.setText("jLabel15");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(-50, 20, 560, 590);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 520, 620);
        jPanel1.add(first);
        first.setBounds(900, 10, 150, 30);
        jPanel1.add(date);
        date.setBounds(900, 50, 150, 30);
        jPanel1.add(certificate);
        certificate.setBounds(900, 100, 150, 30);
        jPanel1.add(code);
        code.setBounds(900, 150, 150, 30);
        jPanel1.add(award);
        award.setBounds(900, 190, 150, 30);
        jPanel1.add(contact);
        contact.setBounds(900, 230, 150, 30);

        rmrk.setColumns(20);
        rmrk.setRows(5);
        jScrollPane1.setViewportView(rmrk);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(900, 270, 150, 50);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 0, 102));
        jLabel16.setText("Date of First Registration(if Redeployed):");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(630, 20, 260, 15);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 0, 102));
        jLabel17.setText("Date of Registration:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(630, 60, 160, 15);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 0, 102));
        jLabel18.setText("Certificate No:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(630, 100, 150, 15);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 0, 102));
        jLabel19.setText("State Code:");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(630, 150, 110, 15);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 0, 102));
        jLabel20.setText("Award(if any):");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(630, 190, 120, 15);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 0, 102));
        jLabel21.setText("Post Service Contact Address:");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(630, 230, 200, 15);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 0, 102));
        jLabel22.setText("Remarks:");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(630, 280, 60, 15);

        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\NYSC CORPS_MEMBER REGISTRATION  SYSTEM\\pi.jpg")); // NOI18N
        jPanel1.add(jLabel23);
        jLabel23.setBounds(520, 0, 660, 330);

        sub.setForeground(new java.awt.Color(204, 0, 102));
        sub.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\NYSC CORPS_MEMBER REGISTRATION  SYSTEM\\my icons\\Submit Progress_50px.png")); // NOI18N
        sub.setText("Submit");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });
        jPanel1.add(sub);
        sub.setBounds(690, 530, 121, 50);

        rest.setForeground(new java.awt.Color(204, 0, 102));
        rest.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\NYSC CORPS_MEMBER REGISTRATION  SYSTEM\\my icons\\Reset_50px.png")); // NOI18N
        rest.setText("Reset");
        rest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restActionPerformed(evt);
            }
        });
        jPanel1.add(rest);
        rest.setBounds(840, 530, 117, 50);

        back.setForeground(new java.awt.Color(204, 0, 102));
        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\NYSC CORPS_MEMBER REGISTRATION  SYSTEM\\my icons\\Back Arrow_50px.png")); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(980, 530, 111, 50);

        jLabel24.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\NYSC CORPS_MEMBER REGISTRATION  SYSTEM\\pi.jpg")); // NOI18N
        jPanel1.add(jLabel24);
        jLabel24.setBounds(520, 0, 660, 330);

        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\NYSC CORPS_MEMBER REGISTRATION  SYSTEM\\pi.jpg")); // NOI18N
        jPanel1.add(jLabel25);
        jLabel25.setBounds(520, 0, 660, 330);

        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\NYSC CORPS_MEMBER REGISTRATION  SYSTEM\\pi.jpg")); // NOI18N
        jLabel26.setText("jLabel26");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(510, 330, 816, 290);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void localActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
                        if(name.getText().equals("")){
                           JOptionPane.showMessageDialog(null, "Please fill the field");    
                        }else{
                            try{
                                Nysc_Connect.getConnection();
                                con =DriverManager.getConnection("jdbc:mysql://localhost/nysc resgistration system","root","");
                                                                 String sql ="INSERT INTO registration(name,sex,age,marital_status,nysc_call_up_no,state_origin,institution_graduation,qualification_discipline,place_primary_assignment,town,local_government,nature_primary_assignment,yr_round_comm_dev_project,state_original_deployment,date_first_registration,date_registration,certificate_no,state_code,award,post_service_contact_address,remark)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                                pst= con.prepareStatement(sql);
                                                pst.setString(1,name.getText());
                                                pst.setString(2,sex.getText());
                                                pst.setString(3,age. getText());
                                                pst.setString(4,marital.getText());
                                                pst.setString(5,nysc.getText());
                                                pst.setString(6,origin.getText());
                                                pst.setString(7,institution.getText());
                                                pst.setString(8,discipline.getText());
                                                pst.setString(9,place.getText());
                                                pst.setString(10,town.getText());
                                                pst.setString(11,local.getText());
                                                pst.setString(12,nature.getText());
                                                pst.setString(13, project.getText());
                                                pst.setString(14,state.getText());
                                                pst.setString(15, first.getText());
                                                pst.setString(16, date.getText());
                                                pst.setString(17, certificate.getText());
                                                pst.setString(18, code.getText());
                                                pst.setString(19, award.getText());
                                                pst.setString(20, contact.getText());
                                                pst.setString(21,rmrk.getText());
                                                
                                                pst.executeUpdate();
                                                
                                                JOptionPane.showMessageDialog(null,"Corps member successfully added");
            
            
                                
                                
                                
                                
                                
                                
                            }catch(Exception e){
                                JOptionPane.showMessageDialog(null, e);
                            }
                          
                        }
    }//GEN-LAST:event_subActionPerformed

    private void restActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restActionPerformed
        // TODO add your handling code here:
        name.setText(null);
        sex.setText(null);
        age.setText(null);
        marital.setText(null);
        nysc.setText(null);
        origin.setText(null);
        institution.setText(null);
        discipline.setText(null);
        place.setText(null);
        town.setText(null);
        local.setText(null);
        nature.setText(null);
        project.setText(null);
        state.setText(null);
        first.setText(null);
        date.setText(null);
        certificate.setText(null);
        code.setText(null);
        award.setText(null);
        contact.setText(null);
        rmrk.setText(null);
    }//GEN-LAST:event_restActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Home info =new Home();
        info.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
     ImageIcon image = new ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\NYSC CORPS_MEMBER REGISTRATION  SYSTEM\\src\\py.jpg");
    this.setIconImage(image.getImage());
    this.setTitle("Registration");
    }//GEN-LAST:event_formWindowActivated

    

     
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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JTextField award;
    private javax.swing.JButton back;
    private javax.swing.JTextField certificate;
    private javax.swing.JTextField code;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField date;
    private javax.swing.JTextField discipline;
    private javax.swing.JTextField first;
    private javax.swing.JTextField institution;
    private javax.swing.JFileChooser jFileChooser1;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField local;
    private javax.swing.JTextField marital;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nature;
    private javax.swing.JTextField nysc;
    private javax.swing.JTextField origin;
    private javax.swing.JTextField place;
    private javax.swing.JTextField project;
    private javax.swing.JButton rest;
    private javax.swing.JTextArea rmrk;
    private javax.swing.JTextField sex;
    private javax.swing.JTextField state;
    private javax.swing.JButton sub;
    private javax.swing.JTextField town;
    // End of variables declaration//GEN-END:variables
}
