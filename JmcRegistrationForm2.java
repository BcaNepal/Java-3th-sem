// create the registration form for admission of students in JMC
// using swing package

import java.awt.event.*;
import javax.swing.*;
// JLabel, JTextField, JPasswordField, 
//JCheckBox, JRadioButton, JComboBox
//JPanel, JFrame

public class JmcRegistrationForm2 {
    // declare all the components
    
    JList lstProgram;
    // declare the Containers
    JPanel p;
    JFrame f;

    //Constructor
    public JmcRegistrationForm2(){
        // initialize the components 
        String[] programs = new String[]{"BICT", "BCA", "BBS", "BSW", "BBA"};
        lstProgram = new JList<String>(programs);
     

        //initialize the containers. JPanel and JFrame are called container
        p = new JPanel();
        f = new JFrame("Registration Form");       

         // add the components into JPanel
        p.add(lstProgram);
        ;
        lstProgram.setVisibleRowCount(3);
        JScrollPane scrollPane = new JScrollPane(lstProgram);
        p.add(scrollPane);
       

       
        // add the JPanel into JFrame
        f.add(p);

        f.setVisible(true);
        f.setSize(400, 300);

       
    }
   
    // main method
    public static void main(String[] args)
    {
        new JmcRegistrationForm2(); // object is created and constructor is called
    }

       
} // Class close