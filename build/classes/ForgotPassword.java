
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AGAMUYI PRECIOUS
 */
public class ForgotPassword extends javax.swing.JFrame {
    Connection conn;
   ResultSet   rs;
   PreparedStatement pst;

    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword() {
        super("ForgotPassword");
        initComponents();
       
    }
    
    public void Search(){
        if(name.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please input your details\n the fields are empty");
        }else{
                                                  
                                                  try{
                                                      Nysc_Connect.getConnection();
                                                   conn= DriverManager.getConnection("jdbc:mysql://localhost/nysc resgistration system","root","");
                                                      
                                                      String rex = name.getText();
                                                     String sql ="select *from admin where user_name = '"+rex+"'";
                                                      pst =conn.prepareStatement(sql);
                                                      rs =pst.executeQuery();
                                                      if(rs.next()){
                                                          mail.setText(rs.getString(4));
                                                          question.setText(rs.getString(5));
                                                          
                                                          rs.close();
                                                          pst.close();
                                                          
                                                      }
                                                      else{
                                                          JOptionPane.showMessageDialog(null," incorrect username");
                                                      }
                                                      
                                                  }catch(Exception e){
                                                      JOptionPane.showMessageDialog(null, e);
                                                  }
        }
       
    }
    
    
    
                                                       public void Retrieve(){
                                                           
                                                           try{
                                                               Nysc_Connect.getConnection();
                                                        conn= DriverManager.getConnection("jdbc:mysql://localhost/nysc resgistration system","root","");
                                                        String rex = name.getText();
                                                        String rex1 =ans.getText();
                                                        String sql ="select *from admin where Answer = '"+rex1+"'";
                                                        pst =conn.prepareStatement(sql);
                                                        rs=pst.executeQuery();
                                                        if(rs.next()){
                                                            word.setText(rs.getString(3));
                                                            
                                                        }
                                                         }catch(Exception e){
                                                               JOptionPane.showMessageDialog(null, e);
                                                           }
                                                         
                                                       }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        word = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ans = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        question = new javax.swing.JTextField();
        src = new javax.swing.JButton();
        retry = new javax.swing.JButton();
        bak = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(204, 0, 102));
        jLabel1.setText("UserName:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 40, 70, 14);
        jPanel1.add(name);
        name.setBounds(150, 30, 160, 30);

        jLabel2.setForeground(new java.awt.Color(204, 0, 102));
        jLabel2.setText(" Your Password:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 250, 100, 14);
        jPanel1.add(word);
        word.setBounds(150, 240, 160, 30);

        jLabel3.setForeground(new java.awt.Color(204, 0, 102));
        jLabel3.setText("Answer:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 200, 50, 14);
        jPanel1.add(ans);
        ans.setBounds(150, 190, 160, 30);

        jLabel4.setForeground(new java.awt.Color(204, 0, 102));
        jLabel4.setText("E-mail:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 90, 40, 14);
        jPanel1.add(mail);
        mail.setBounds(150, 80, 160, 30);

        jLabel5.setForeground(new java.awt.Color(204, 0, 102));
        jLabel5.setText("Your Security Question:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 140, 130, 14);
        jPanel1.add(question);
        question.setBounds(150, 130, 160, 30);

        src.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        src.setForeground(new java.awt.Color(153, 0, 51));
        src.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\NYSC CORPS_MEMBER REGISTRATION  SYSTEM\\my icons\\Search_50px.png")); // NOI18N
        src.setText("Search");
        src.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srcActionPerformed(evt);
            }
        });
        jPanel1.add(src);
        src.setBounds(370, 20, 140, 50);

        retry.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        retry.setForeground(new java.awt.Color(153, 0, 102));
        retry.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\NYSC CORPS_MEMBER REGISTRATION  SYSTEM\\my icons\\Data Recovery_50px.png")); // NOI18N
        retry.setText("Retrieve");
        retry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retryActionPerformed(evt);
            }
        });
        jPanel1.add(retry);
        retry.setBounds(370, 120, 140, 50);

        bak.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bak.setForeground(new java.awt.Color(204, 0, 102));
        bak.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\NYSC CORPS_MEMBER REGISTRATION  SYSTEM\\my icons\\Back Arrow_50px.png")); // NOI18N
        bak.setText("Back");
        bak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bakActionPerformed(evt);
            }
        });
        jPanel1.add(bak);
        bak.setBounds(370, 220, 140, 50);

        jLabel6.setForeground(new java.awt.Color(204, 0, 102));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\AGAMUYI PRECIOUS\\Documents\\NetBeansProjects\\NYSC CORPS_MEMBER REGISTRATION  SYSTEM\\pit.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 520, 280);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bakActionPerformed
        // TODO add your handling code here:
                                                setVisible(false);
                                                AdminLogin info = new AdminLogin();
                                                info.setVisible(true);
                                                this.dispose();
    }//GEN-LAST:event_bakActionPerformed

    private void srcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srcActionPerformed
        // TODO add your handling code here:
                                                    Search();
    }//GEN-LAST:event_srcActionPerformed

    private void retryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retryActionPerformed
        // TODO add your handling code here:
                                                 Retrieve();
    }//GEN-LAST:event_retryActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ans;
    private javax.swing.JButton bak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField name;
    private javax.swing.JTextField question;
    private javax.swing.JButton retry;
    private javax.swing.JButton src;
    private javax.swing.JTextField word;
    // End of variables declaration//GEN-END:variables
}
