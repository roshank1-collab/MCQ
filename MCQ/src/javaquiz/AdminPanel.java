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
public class AdminPanel extends JFrame implements ActionListener{
   

    /**
     * @return the username
     */
   JLabel lbluser,lblpass;
   JTextField txtuser;
   JPasswordField pass;
   JButton btnlogin;
   ImageIcon img;
   public AdminPanel(){
       this.setLocationRelativeTo(null);
        setTitle("Admin Login");
       lbluser=new JLabel("Admin Name");
       txtuser=new JTextField();
       
       lblpass=new JLabel("Password");
       pass= new JPasswordField();
       
       btnlogin=new JButton("Login");
       
       Container c = getContentPane();
       
       lbluser.setBounds(50, 10, 150, 30);
       txtuser.setBounds(200,10,150,30);
       
       lblpass.setBounds(50, 40, 150, 30);
       pass.setBounds(200,40,150,30);
       
       btnlogin.setBounds(130, 70, 75, 35);
       
       c.add(lbluser);
       c.add(txtuser);
       c.add(lblpass);
       c.add(pass);
       c.add(btnlogin);
       btnlogin.addActionListener(this);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(500,200);
      
       c.setLayout(null);
       
       JLabel background;
       img =new ImageIcon("fire-dragon-abstract-illustration-on-black-background-for-design-vector-caids-ados.jpg");
       background=new JLabel("",img,JLabel.CENTER);
       background.setBounds(0,0,500,500);
       add(background);
       
       lbluser.setFont(new Font("Calibri",Font.BOLD,15));
       lblpass.setFont(new Font("Calibri",Font.BOLD,15));
       btnlogin.setFont(new Font("Calibri",Font.BOLD,15));
       
       //Color set
       lbluser.setForeground(Color.WHITE);
       lblpass.setForeground(Color.WHITE);
       btnlogin.setBackground(Color.green);
       btnlogin.setForeground(Color.WHITE);
   } 
   public static void main(String[] args)
   {
       AdminPanel adminlog = new AdminPanel();
       adminlog.setVisible(true);
   }
   
   
    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
        //Retrieving username and password from textfield
        String user=txtuser.getText();
        String pw=pass.getText();
        
        //Setting username and password for admin
        AdminPass newadmin = new AdminPass();
        newadmin.setUsername("roshan");
        newadmin.setPassword("koirala");
        
        if(e.getSource().equals(btnlogin))
        {
            //Verifying username and password to login
            if(user.equals(newadmin.getUsername()) && pw.equals(newadmin.getPassword()))
            {
            JOptionPane.showMessageDialog(null, "Congratulations!","Success",JOptionPane.INFORMATION_MESSAGE);
            AddQuestions ad=new AddQuestions();
            ad.setVisible(true);
            this.setVisible(false);

            }
            else
            {
                 JOptionPane.showMessageDialog(null, "Invalid!","Failed",JOptionPane.INFORMATION_MESSAGE);
            }
               
        }
    }
    
    
}
