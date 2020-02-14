/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquiz;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class JavaAssignment extends JFrame implements ActionListener
{

    /**
     * @param args the command line arguments
     */
    JButton btnuser,btnadmin;
    ;
    ImageIcon img;
    public JavaAssignment(){
        setTitle("Choose An User");
        this.setLocationRelativeTo(null);
     
        
        btnuser=new JButton("User Login");
        btnadmin=new JButton("Admin Login");
        
        
        btnuser.setBounds(70,100,120,30);
        btnadmin.setBounds(200,100,120,30);
        
        add(btnuser);
        add(btnadmin);
       
        btnuser.addActionListener(this);
        btnadmin.addActionListener(this);
        setSize(400,300);
        
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
       JLabel background;
       img =new ImageIcon("photo-1430760903787-4d91bbf15384.jpg");
       background=new JLabel("",img,JLabel.CENTER);
       background.setBounds(0,0,1366,768);
       add(background);
       
       //Setting font and color
       btnuser.setFont(new Font("Calibri",Font.BOLD,15));
       btnadmin.setFont(new Font("Calibri",Font.BOLD,15));
       
       
    }
    public static void main(String[] args) {
        // TODO code application logic here
       
        JavaAssignment jq=new JavaAssignment();
        jq.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.\
        //Code for access of user
        if (e.getSource().equals(btnuser))
        {

            LogInForm u=new LogInForm();
            u.setVisible(true);
            this.setVisible(false);
          
        }
        //Code for access of admin
        if(e.getSource().equals(btnadmin))
        {

            AdminPanel al=new AdminPanel();
            al.setVisible(true);
            this.setVisible(false);
        }
      
    }
    
}
