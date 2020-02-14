/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquiz;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author hp
 */
public class AdminLogin extends JFrame implements ActionListener{
   

    /**
     * @return the username
     */
   JLabel lbluser,lblpass;
   JTextField txtuser;
   JPasswordField pass;
   JButton btnlogin;
   ImageIcon img;
   public AdminLogin(){
        
       lbluser=new JLabel("Admin Name");
       txtuser=new JTextField();
       
       lblpass=new JLabel("Password");
       pass= new JPasswordField();
       
       btnlogin=new JButton("Login");
       
       Container c = getContentPane();
       
       lbluser.setBounds(10, 10, 150, 20);
       txtuser.setBounds(170,10,150,20);
       
       lblpass.setBounds(10, 40, 150, 20);
       pass.setBounds(170,40,150,20);
       
       btnlogin.setBounds(110, 70, 75, 30);
       
       c.add(lbluser);
       c.add(txtuser);
       c.add(lblpass);
       c.add(pass);
       c.add(btnlogin);
       btnlogin.addActionListener(this);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(500,500);
      
       c.setLayout(null);
       
       JLabel background;
       img =new ImageIcon("laptop.jpg");
       background=new JLabel("",img,JLabel.CENTER);
       background.setBounds(0,0,1366,768);
       add(background);
       
       lbluser.setFont(new Font("Calibri",Font.BOLD,15));
       lblpass.setFont(new Font("Calibri",Font.BOLD,15));
       btnlogin.setFont(new Font("Calibri",Font.BOLD,15));
       
       //Color set
       lbluser.setForeground(Color.WHITE);
       lblpass.setForeground(Color.WHITE);
       btnlogin.setBackground(Color.BLUE);
       btnlogin.setForeground(Color.WHITE);
   } 
   public static void main(String[] args)
   {
       AdminLogin al = new AdminLogin();
       al.setVisible(true);
   }
   
   
    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
        //Retrieving username and password from textfield
        String user=txtuser.getText();
        String pw=pass.getText();
        
        //Setting username and password for admin
        Admin a = new Admin();
        a.setUsername("Rojan");
        a.setPassword("form123");
        
        if(e.getSource().equals(btnlogin))
        {
            //Verifying username and password to login
            if(user.equals(a.getUsername()) && pw.equals(a.getPassword()))
            {
            JOptionPane.showMessageDialog(null, "Welcome Admin","Success",JOptionPane.INFORMATION_MESSAGE);
            AdminDashboard ad=new AdminDashboard();
            ad.setVisible(true);
            this.setVisible(false);

            }
            else
            {
                 JOptionPane.showMessageDialog(null, "Incorrect Name or Password","Failed",JOptionPane.INFORMATION_MESSAGE);
            }
               
        }
    }
    
    
}
