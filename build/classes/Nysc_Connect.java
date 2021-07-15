                  import java. sql.Connection;
                  import javax.swing.JOptionPane;
                  import  java.sql.DriverManager;
                  
          
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AGAMUYI PRECIOUS
 */
     public class Nysc_Connect {
    
    
    
          public static Connection getConnection(){
              
                 Connection  con = null;
              
                  try{
                  
                  
                  try{
                      
                      
                                            Class.forName("com.mysql.jdbc.Driver");
                                           con = DriverManager.getConnection("jdbc:mysql://localhost/nysc resgistration System","root","");
                      
                      
                      
                      
                      
                      
                      
                      
                      
                  }catch ( Exception e){
                      
                      JOptionPane.showMessageDialog(null, e);
                  }
                  
                  
                  
                  
                 } catch(Exception e){
                     JOptionPane.showMessageDialog(null ,e);
                 }
                  return con;
                  
                  
                  
                  
                  
                         
              }
              
      
          }             
      
      
      
      
      
  
    



