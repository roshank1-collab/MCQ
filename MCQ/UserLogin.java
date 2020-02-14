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


public class UserLogin extends JFrame implements ActionListener{
   JLabel lbluser,lblpass,lblnoac,lbltoken;
   JTextField txtuser,txttoken;
   JPasswordField txtpass;
   JButton btnlogin,btnsignup;
   ImageIcon img;
   
   public UserLogin(){
        setTitle("User Login");
       
       lbluser=new JLabel("User Name");
       txtuser=new JTextField();
       
       lblpass=new JLabel("Password");
       txtpass= new JPasswordField();
       
       lbltoken=new JLabel("Token");
       txttoken=new JTextField();
               
       
       lblnoac=new JLabel("Doesn't have an account?");
       
       btnlogin=new JButton("Login");
       btnsignup=new JButton("Sign Up");
       
       lbluser.setBounds(10, 10, 150, 20);
       txtuser.setBounds(170,10,150,20);
       
       lblpass.setBounds(10, 40, 150, 20);
       txtpass.setBounds(170,40,150,20);
       
       lbltoken.setBounds(10,70,150,20);
       txttoken.setBounds(170,70,150,20);
       
       lblnoac.setBounds(60,160,200,20);
       
       btnlogin.setBounds(110, 100, 75, 30);
       btnsignup.setBounds(110,200,80,30);
       
       DatabaseConnect db=new DatabaseConnect();
       String token=db.tokenNo();
       
       txttoken.setEditable(false);
       txttoken.setText(token);
      
       
       add(lbluser);add(txtuser);
       add(lblpass); add(txtpass);
       add(lbltoken); add(txttoken);
       
       add(lblnoac);
       add(btnlogin);
       add(btnsignup);
       
       btnsignup.addActionListener(this);
       btnlogin.addActionListener(this);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(500,500);
      
       setLayout(null);
      
       //Code for adding background image
       JLabel background;
       img =new ImageIcon("water.jpg");
       background=new JLabel("",img,JLabel.CENTER);
       background.setBounds(0,0,1366,768);
       add(background);
       
       //Setting font
       lbluser.setFont(new Font("Calibri",Font.BOLD,15));
       lblpass.setFont(new Font("Calibri",Font.BOLD,15));
       lbltoken.setFont(new Font("Calibri",Font.BOLD,15));
       btnsignup.setFont(new Font("Calibri",Font.BOLD,13));
       btnlogin.setFont(new Font("Calibri",Font.BOLD,15));
       
       //Setting color
       lblnoac.setFont(new Font("Calibri",Font.BOLD,18));
       lblnoac.setForeground(Color.BLUE);
       btnsignup.setBackground(Color.GREEN);
       
   }
   public static void main(String[]args)
   {
       new UserLogin().setVisible(true);
   }

    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource().equals(btnsignup))
        {
            
            UserSignUp sign=new UserSignUp();
            sign.setVisible(true);
            this.setVisible(false);
        }
        if(e.getSource().equals(btnlogin))
        {
            try
            {
                DatabaseConnect dc=new DatabaseConnect();
                int result=dc.login(txtuser.getText(),txtpass.getText());
                
                if(result>0)
                {
                    JOptionPane.showMessageDialog(null, "LoggedIn");
                    Attemptquiz aq=new Attemptquiz();
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
