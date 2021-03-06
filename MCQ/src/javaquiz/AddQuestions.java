/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaquiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author hp
 */
public class AddQuestions extends JFrame implements ActionListener{
    public JLabel lblsub,lblque,lblopt1,lblopt2,lblopt3,lblopt4,lblcorrect;
    public JComboBox cmbsub;
    public JTextField txtque,txtopt1,txtopt2,txtopt3,txtopt4,txtcorrect;
    public JButton btninsert,btnreset,btnlogout;
    ImageIcon image;
    public AddQuestions(){
        setTitle("AdminPanel");
        lblsub=new JLabel("Subject");
        cmbsub=new JComboBox();
        cmbsub.addItem("Java");
        cmbsub.addItem("WebDesign");
        cmbsub.addItem("Comminication");
        cmbsub.addItem("Ethics");
        
        lblque=new JLabel("Question");
        txtque=new JTextField();
        
        lblopt1=new JLabel("Option 1");
        txtopt1=new JTextField();
        
        lblopt2=new JLabel("Option 2");
        txtopt2=new JTextField();
        
        lblopt3=new JLabel("Option 3");
        txtopt3=new JTextField();
        
        lblopt4=new JLabel("Option 4");
        txtopt4=new JTextField();
        
        lblcorrect=new JLabel("Correct Answer");
        txtcorrect=new JTextField();
        
          
        btninsert=new JButton("Insert");
        btnreset=new JButton("Reset");
        
        btnlogout=new JButton("Logout");
        
         
        lblsub.setBounds(10,10,150,20);
        cmbsub.setBounds(170,10,150,20);
        
        lblque.setBounds(10,40,150,20);
        txtque.setBounds(170,40,150,20);
        
        lblopt1.setBounds(10,70,150,20);
        txtopt1.setBounds(170,70,150,20);
        
        lblopt2.setBounds(10,100,150,20);
        txtopt2.setBounds(170,100,150,20);
        
        lblopt3.setBounds(10,130,150,20);
        txtopt3.setBounds(170,130,150,20);
        
        lblopt4.setBounds(10,160,150,20);
        txtopt4.setBounds(170,160,150,20);
        
        lblcorrect.setBounds(10,190,150,20);
        txtcorrect.setBounds(170,190,150,20);
        
      
        
        
        btninsert.setBounds(100,240,90,30);
        btnreset.setBounds(200,240,90,30);
        btnlogout.setBounds(100,300,90,30);
        
        btninsert.addActionListener(this);
        btnreset.addActionListener(this);
        btnlogout.addActionListener(this);
     
        add(lblsub);add(cmbsub);
        add(lblque);add(txtque);
        add(lblopt1);add(txtopt1);
        add(lblopt2);add(txtopt2);
        add(lblopt3);add(txtopt3);
        add(lblopt4);add(txtopt4);
        add(lblcorrect);add(txtcorrect);
        add(btninsert);
        add(btnreset);
        add(btnlogout);
        
        setSize(500,500);
        
        setLayout(null);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
       
        //Adding background image
       JLabel background;
       image =new ImageIcon("abstract-technology-particle-background_52683-25766.jpg");
       background=new JLabel("",image,JLabel.CENTER);
       background.setBounds(0,0,1000,800);
       add(background);
       
       //Setting font
       lblsub.setFont(new Font("sans-serif",Font.BOLD,15));
       lblque.setFont(new Font("sans-serif",Font.BOLD,15));
       lblopt1.setFont(new Font("sans-serif",Font.BOLD,15));
       lblopt2.setFont(new Font("sans-serif",Font.BOLD,15));
       lblopt3.setFont(new Font("sans-serif",Font.BOLD,15));
       lblopt4.setFont(new Font("sans-serif",Font.BOLD,15));
       lblcorrect.setFont(new Font("sans-serif",Font.BOLD,15));
       btninsert.setFont(new Font("sans-serif",Font.BOLD,15));
       btnreset.setFont(new Font("sans-serif",Font.BOLD,15));
       btnlogout.setFont(new Font("sans-serif",Font.BOLD,15));
       
       lblsub.setForeground(Color.WHITE);
       lblque.setForeground(Color.WHITE);
       lblopt1.setForeground(Color.WHITE);
       lblopt2.setForeground(Color.WHITE);
       lblopt3.setForeground(Color.WHITE);
       lblopt4.setForeground(Color.WHITE);
       lblcorrect.setForeground(Color.WHITE);
       
}
     public static void main(String[] args) {
        new AddQuestions().setVisible(true);
    }
  

    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
            //Inserting question into database
            if(e.getSource().equals(btninsert))
            {
                try{
                DatabaseConnection db=new DatabaseConnection(); //Database connect
                //Passing arguments to DatabaseConnection
                int result=db.insert(cmbsub.getSelectedItem().toString(),txtque.getText(),txtopt1.getText(),txtopt2.getText(),txtopt3.getText(),txtopt4.getText(),txtcorrect.getText());
                
                if(result>0)
                {
                    JOptionPane.showMessageDialog(null, "Question inserted Successfully");
                    
                }
                
                else
                {
                    JOptionPane.showMessageDialog(null, "Not inserted");
                }
                }
            
            catch(Exception ex)
            {
                System.out.println("Error"+ex);
            }
            }
            
       
            //Clearing text element from textfield
            if(e.getSource().equals(btnreset))
            {
                txtque.setText("");
                txtopt1.setText("");
                txtopt2.setText("");
                txtopt3.setText("");
                txtopt4.setText("");
                txtcorrect.setText("");
                
                
            }
            
         
            if(e.getSource().equals(btnlogout))
            {
                JavaAssignment jq=new JavaAssignment();
                jq.setVisible(true);
                this.setVisible(false);
            }
    }
}