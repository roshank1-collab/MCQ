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
public class JavaQuiz extends JFrame implements ActionListener
{

    /**
     * @param args the command line arguments
     */
    JButton btnuser,btnadmin;
    JLabel lbltop;
    ImageIcon img;
    public JavaQuiz(){
        setTitle("");
        lbltop=new JLabel("Choose Access");
        btnuser=new JButton("User");
        btnadmin=new JButton("Admin");
        
        lbltop.setBounds(60,50,300,30);
        btnuser.setBounds(80,100,75,30);
        btnadmin.setBounds(180,100,75,30);
        
        add(btnuser);
        add(btnadmin);
        add(lbltop);
        btnuser.addActionListener(this);
        btnadmin.addActionListener(this);
        setSize(500,500);
        
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
       JLabel background;
       img =new ImageIcon("moon.jpg");
       background=new JLabel("",img,JLabel.CENTER);
       background.setBounds(0,0,1366,768);
       add(background);
       
       //Setting font and color
       btnuser.setFont(new Font("Calibri",Font.BOLD,15));
       btnadmin.setFont(new Font("Calibri",Font.BOLD,15));
       lbltop.setFont(new Font("Monospaced",Font.BOLD,30));
       lbltop.setForeground(Color.WHITE);
       
    }
    public static void main(String[] args) {
        // TODO code application logic here
       
        JavaQuiz jq=new JavaQuiz();
        jq.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.\
        //Code for access of user
        if (e.getSource().equals(btnuser))
        {

            UserLogin u=new UserLogin();
            u.setVisible(true);
            this.setVisible(false);
          
        }
        //Code for access of admin
        if(e.getSource().equals(btnadmin))
        {

            AdminLogin al=new AdminLogin();
            al.setVisible(true);
            this.setVisible(false);
        }
      
    }
    
}
