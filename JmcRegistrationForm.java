// create the registration form for admission of students in JMC
// using swing package

import java.awt.event.*;
import javax.swing.*;
// JLabel, JTextField, JPasswordField, 
//JCheckBox, JRadioButton, JComboBox
//JPanel, JFrame

public class JmcRegistrationForm {
    // declare all the components
    JLabel lblName, lblAddress, lblContactNo, lblDOB, lblFaculty, lblProgram, lblGender, lblHobbies, lblSemester;
    JTextField txtName, txtAddress, txtContactNo, txtDOB;
    JComboBox  cmbFaculty;
    JList lstProgram;
    JComboBox  cmbProgram;
    JList lstSemester;
    JRadioButton rbMale, rbFemale, rbOthers, rbHumanities, rbMgmt, rbEdu;
    JCheckBox chkSwimming, chkReading, chkTraveling;
    JButton btnSubmit, btnReset;
   

    // declare the Containers
    JPanel p;
    JFrame f;

    //Constructor
    public JmcRegistrationForm(){
        // initialize the components
        lblName = new JLabel("Name");
        lblAddress = new JLabel("Address");
        lblContactNo = new JLabel("Contact No");
        lblProgram = new JLabel("Program");
        lblGender = new JLabel("Gender");
        lblFaculty =  new JLabel("Faculty");
        lblSemester = new JLabel("Semester");

        txtName = new JTextField(10);
        txtContactNo = new JTextField(10);

        //String[] programs = {"BICT", "BCA", "BBS"};
        String[] programs = new String[]{"BICT", "BCA", "BBS", "BSW", "BBA"};
        //Integer[] months = new Integer[] {1, 2, 3, 4};
        //JComboBox();
        //JComboBox<T>()
        cmbProgram = new JComboBox<String>(programs);
        //String[] semester = {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th"};
       // lstSemester  = new JList<String>(new String[]{"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th"});
       lstSemester  = new JList<Integer>(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
        ButtonGroup btnGrpGender = new ButtonGroup();
        ButtonGroup btnGrpFaculty = new ButtonGroup();
        rbMale = new JRadioButton("Male", true);
        rbFemale = new JRadioButton("Female");

        rbHumanities = new JRadioButton("Humanities", true);
        rbMgmt = new JRadioButton("Management");
        rbEdu = new JRadioButton("Education");

        btnSubmit = new JButton("Submit Form");
        btnReset = new JButton("Clear");

        //register the source with event listener
       



        //initialize the containers. JPanel and JFrame are called container
        p = new JPanel();
        f = new JFrame("Registration Form");

        p.add(lblName);
        p.add(txtName);

        p.add(lblContactNo);
        p.add(txtContactNo);

        btnGrpGender.add(rbMale);
        btnGrpGender.add(rbFemale);

        btnGrpFaculty.add(rbHumanities);
        btnGrpFaculty.add(rbMgmt);
        btnGrpFaculty.add(rbEdu);

         // add the components into JPanel
        p.add(lblProgram);
        p.add(cmbProgram);

        p.add(lblSemester);
        //p.add(lstSemester);
        lstSemester.setVisibleRowCount(3);
        JScrollPane scrollPane = new JScrollPane(lstSemester);
        p.add(scrollPane);
       

        p.add(lblGender);
     
        p.add(rbMale);
        p.add(rbFemale);

        p.add(lblFaculty);
        p.add(rbHumanities);
        p.add(rbMgmt);;
        p.add(rbEdu);

        p.add(btnSubmit);
        p.add(btnReset);
       
        // add the JPanel into JFrame
        f.add(p);

        f.setVisible(true);
        f.setSize(400, 300);

        //btnReset.addActionListener(this); // using same class
        //btnReset.addActionListener(new ActionListenerImpl()); // using another class

        btnReset.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
            // System.out.println("Reset button is clicked");
    
            txtName.setText("");
            txtContactNo.setText("");
    
            //ie.getItem().toString();
            
            }

        }); // using anonymous class 
       
    }
        
    /**
    @Override
    public void itemStateChanged(ItemEvent ie){
        if(e.getSelected() == ItemEvent.SELECTED){
             //ie.getItem().toString();
            String faculty =(String)ie.getItem();
            if(faculty.equles("Humanities")){
                // JList (lstProgram)
                //	setListData(E[] listData)
                String[] programs = {"BA, BCA, BSW"};
                lstProgram.setListData(programs);
            }
          }     
     
    }**/
   
    // main method
    public static void main(String[] args)
    {
        new JmcRegistrationForm(); // object is created and constructor is called
    }

    // inner class
    /**
    class ActionListenerImpl implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent ae){
        // System.out.println("Reset button is clicked");

        txtName.setText("");
        txtContactNo.setText("");

        //ie.getItem().toString();
        
        }
    } // inner class close
    **/
       
} // Class close