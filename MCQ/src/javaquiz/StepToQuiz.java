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
import javax.swing.*;



/**
 *
 * @author hp
 */
public class StepToQuiz extends JFrame implements ActionListener
{
    JLabel lbl;
    JComboBox jcb;
    JButton start;
    ImageIcon img;
    public StepToQuiz(){
           
           setTitle("Quiz");
           this.setLocationRelativeTo(null);
           lbl=new JLabel("ChooseSubject");
           jcb=new JComboBox();
           jcb.addItem("Java");
           jcb.addItem("Webdesign");
           jcb.addItem("Communication");
           jcb.addItem("Ethics");
           
           lbl.setBounds(150,10,200,30);
           jcb.setBounds(150,50,150,20);
           
           start=new JButton("Attemt Quiz");
           start.setBounds(150,300,180,30);
           
           start.addActionListener(this);
           
           add(jcb);
           add(lbl);
           add(start);
        
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
     
       
       //Setting font and color
       jcb.setFont(new Font("Calibri",Font.BOLD,17));
       start.setFont(new Font("Calibri",Font.BOLD,17));
       lbl.setFont(new Font("Calibri",Font.BOLD,29));
       lbl.setForeground(Color.black);
       
    }
    
    public static void main(String[] args) {
        new StepToQuiz().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //Starting quiz
        if(e.getSource().equals(start)){
                new StartQuiz(jcb.getSelectedItem().toString()).setVisible(true);
    }
    
    
    }
}
