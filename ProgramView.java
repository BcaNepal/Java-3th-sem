// create the registration form for admission of students in JMC
// using swing package

import java.awt.event.*;
import javax.swing.*;
// JLabel, JTextField, JPasswordField, 
//JCheckBox, JRadioButton, JComboBox
//JPanel, JFrame

public class ProgramView {
    // declare all the components
    
    JList<String> lstProgram;
    // declare the Containers
    JPanel p;
    JFrame f;

    //Constructor
    public ProgramView(){       

        //initialize the containers. JPanel and JFrame are called container
        p = new JPanel();
        f = new JFrame("Registration Form");       

         // add the components into JPanel
        lstProgram = new JList<String>();
        p.add(lstProgram);
        
        lstProgram.setVisibleRowCount(4);
        JScrollPane scrollPane = new JScrollPane(lstProgram);
        p.add(scrollPane);

        // add the JPanel into JFrame
        f.add(p);

        f.setVisible(true);
        f.setSize(400, 300);
       
    }
    
    public void setView(String[] program){
        lstProgram.setListData(program);
    }
    /**
    public static void main(String[] args)
    {
        new ProgramView();
    }

    **/
          
} // Class close