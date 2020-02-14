/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquiz;

/**
 *
 * @author hp
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class LogInForm extends JFrame implements ActionListener{
   JLabel lbluser,lblpass,lbltoken;
   JTextField txtuser,txttoken;
   JPasswordField txtpass;
   JButton btnlogin,btnsignup;
   ImageIcon img;
   
   public LogInForm(){
        setTitle("User Login");
        this.setLocationRelativeTo(null);
     
       lbluser=new JLabel("User Name");
       txtuser=new JTextField();
       
       lblpass=new JLabel("Password");
       txtpass= new JPasswordField();
       
       lbltoken=new JLabel("Token");
       txttoken=new JTextField();
               
       
     
       
       btnlogin=new JButton("Login");
       btnsignup=new JButton("Sign Up");
       
       lbluser.setBounds(10, 10, 150, 20);
       txtuser.setBounds(170,10,150,20);
       
       lblpass.setBounds(10, 40, 150, 20);
       txtpass.setBounds(170,40,150,20);
       
       lbltoken.setBounds(10,70,150,20);
       txttoken.setBounds(170,70,150,20);
       
    
       
       btnlogin.setBounds(110, 100, 75, 30);
       btnsignup.setBounds(110,200,80,30);
       
       DatabaseConnection db=new DatabaseConnection();
       String token=db.tokenNo();
       
       txttoken.setEditable(false);
       txttoken.setText(token);
      
       
       add(lbluser);add(txtuser);
       add(lblpass); add(txtpass);
       add(lbltoken); add(txttoken);
       
      
       add(btnlogin);
       add(btnsignup);
       
       btnsignup.addActionListener(this);
       btnlogin.addActionListener(this);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(500,300);
      
       setLayout(null);
      
       //Code for adding background image
       JLabel background;
       img =new ImageIcon("Architecture-Background-for-Desktop.jpg");
       background=new JLabel("",img,JLabel.CENTER);
       background.setBounds(0,0,900,500);
       add(background);
       
       //Setting font
       lbluser.setFont(new Font("serif",Font.BOLD,15));
       lblpass.setFont(new Font("serif",Font.BOLD,15));
       lbltoken.setFont(new Font("serif",Font.BOLD,15));
       btnsignup.setFont(new Font("serif",Font.BOLD,13));
       btnlogin.setFont(new Font("serif",Font.BOLD,15));
       
  
       
     
       
   }
   public static void main(String[]args)
   {
       new LogInForm().setVisible(true);
   }

    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource().equals(btnsignup))
        {
            
            SignUp sign=new SignUp();
            sign.setVisible(true);
            this.setVisible(false);
        }
        if(e.getSource().equals(btnlogin))
        {
            try
            {
                DatabaseConnection dc=new DatabaseConnection();
                int result=dc.login(txtuser.getText(),txtpass.getText());
                
                if(result>0)
                {
                    JOptionPane.showMessageDialog(null, "LoggedIn");
                    StepToQuiz aq=new StepToQuiz();
                    aq.setVisible(true);
                }
                
                else
                {
                    JOptionPane.showMessageDialog(null, "Not LoggedIn");
                }
            }
            catch(Exception ex)
            {
                System.out.println("Error"+ex);
            }
            
        }
    }
}
