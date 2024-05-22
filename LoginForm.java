//import java.awt.*;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import java.awt.event.MouseMotionListener;

import java.awt.event.MouseAdapter;


import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
//import javax.swing.*;

//import java.awt.Graphics;

import javax.swing.*;
import java.awt.event.*;

public class StudentForm //implements ActionListener{ //}, KeyListener{
{
    JLabel lblUsername, lblPassword, lblResult;
    JTextField txtUsername;

    JRadioButton rbMale, rbFemale;
    ButtonGroup groupGender;

    JPasswordField txtPassword;
    JButton btnLogin, btnReset;
    JPanel p;
    JFrame f;
    //JCheckBox chkSaved;
    JComboBox cmbProgram;
    JList lstSemester;
    //JFrame f;
    /**JPanel p;
    JKFrame f;
    String pwd = "";
    StringBuffer pwdBuffer;
    StringBuilder pwdBuilder = new StringBuilder();
    **/

    public StudentForm(){
        //super("Jmc Login Form");
        //pwdBuffer = new StringBuffer();
        // initialize componenets and container
        lblUsername = new JLabel("User Name");
        lblPassword = new JLabel("Password");
        lblResult = new JLabel();
        lblResult.setText("clicking...");
        

        txtUsername =  new JTextField(15);
        txtPassword = new JPasswordField(15);

        rbMale = new JRadioButton("Male");
        rbFemale = new JRadioButton("Female");
        groupGender = new ButtonGroup();  // in java.awt package
        groupGender.add(rbMale);
        groupGender.add(rbFemale);

        String[] program = {"BCA", "BICT", "BBM"};
        cmbProgram = new JComboBox(program);

        String[] semester = {"1st", "2nd", "3rd"};
        lstSemester = new JList(semester);

        btnLogin = new JButton("Login");
        btnReset = new JButton("Reset");

        //chkSaved = new JCheckBox("Is Saved in Computer?");
        
        //String[] zone = {"Bagmati", "Koshi", "Mechi"};
        //cmbZone = new JComboBox(zone);


        //lstDistrict =  new JList();

        

        // add****Listener(****Listener)

        //txtPassword.addKeyListener(this);

        btnLogin.addActionListener(this);
        btnReset.addActionListener(this);
        //addWindowListener(this);
        //addWindowListener(new MyWindowListener());

        //addMouseListener(new MyMouseListener());
        addMouseListener(new MyMouseAdapter());
        // addMouseMotionListener(new ItemListener(){
        //     @Override
        //     public void itemStateChanged(ItemEvent evt){
        //         //write code here
        //     }
        // } );
        

        //f = new JFrame("JMC Login Form");
        p = new JPanel();

        // add the components into container.

        p.add(lblUsername);
        p.add(txtUsername);

        p.add(lblPassword);
        p.add(txtPassword);
        
        p.add(rbMale);
        p.add(rbFemale);

        p.add(chkSaved);
        p.add(cmbProgram);
        p.add(lstSemester);

        p.add(btnLogin);
        p.add(btnReset);
        p.add(lblResult);
        add(p);
        f.add(p);

        //setTitle("Jmc Login Form");
        f.setSize(300, 400);
        f.setVisible(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //for keyevent
    @Override
    public void keyPressed(KeyEvent evt){

    }

    @Override
    public void keyReleased(KeyEvent evt){

    }

    @Override
    public void keyTyped(KeyEvent evt){
        try{
            char c = evt.getKeyChar();
            // pwd = pwd.concat(String.valueOf(c));
            //pwdBuffer.append(c);
            pwdBuilder.append(c);
            //pwd =pwd + String.valueOf(c);
            //lblResult.setText(pwd);
            //lblResult.setText(pwdBuffer.toString());
            lblResult.setText(pwdBuilder.toString());
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }

    // this callback method is called when button is clicked
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == btnLogin){
        //System.out.println("button is cliked");
            String username = txtUsername.getText();
            //String password= txtPassword.getText();
           // char[] pwd = txtPassword.getPassword();
            String password = String.valueOf( txtPassword.getPassword()); //new String(pwd);
            if( username.toLowerCase().equals("jmc") && password.equals("bca3rd"))
                    System.out.println("verified");        
            else
                System.out.println("not verified");
            
            System.out.println(username + " " + password);
        }
        else if(ae.getSource()  == btnReset){
            txtUsername.setText("");
            txtPassword.setText("");
        }
    }

    public static void main(String[] args){
        StudentForm form = new StudentForm();
    }

    //inner class

    //Mouse Listener
    /**
    class MyMouseListener implements MouseListener{
        @Override
        public void mouseClicked(MouseEvent e){
            System.out.println("mouse clicked");
        } 
        @Override
        public void mouseEntered(MouseEvent e){
            lblResult.setText(String.valueOf(e.getX()) + ", " + String.valueOf(e.getY()));
        }
        @Override
        public void mouseExited(MouseEvent e){

        }

        @Override
        public void mousePressed(MouseEvent e){
           //lblResult.setText(String.valueOf(e.getX()) + ", " + String.valueOf(e.getY()));

        }  
        @Override
        public void mouseReleased(MouseEvent e){
            Graphics g = getGraphics();
            g.fillOval(e.getX(), e.getY(), 10, 50);
        } 

    } // class MyMouseListener ends
    **/

    /**
    class MyItemListener implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent evt){
            if(evt.getStateChange() == ItemEvent.SELECTED){
                //cmbZone.clear();
                if(evt.getItem() == "Bagmati"){
                   // for(int i=0; i<cmbZone.cout)
                  //cmbZone.getModel().clear();

                    String[] districts = {"Kathmandu", "Lalitpur", "Bhaktapur"};                   
                    lstDistrict.setListData(districts);
                   // lstDistrict.setListData(new String[]{"kk", "lp"});
                }
                else if (evt.getItem() == "Mechi"){
                    lstDistrict.setListData(new String[]{"kk", "lp"});
                }
            }
        }
    } **/

    class MyMouseAdapter extends MouseAdapter{
        @Override
        public void mouseReleased(MouseEvent e){
            Graphics g = getGraphics();
            g.fillOval(e.getX(), e.getY(), 10, 50);
        } 
    }

    class MyMouseMotionListener implements MouseMotionListener{
        @Override
        public void mouseDragged(MouseEvent e) {
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            lblResult.setText(String.valueOf(e.getX()) + ", " + String.valueOf(e.getY()));
        }
        
    } //MyMouseMotionLister ends

    class MyWindowListener implements WindowListener{

        @Override
        public void windowDeactivated(WindowEvent evt){

        }

        @Override
        public void windowActivated(WindowEvent evt){
            
        }

        @Override
        public void windowDeiconified(WindowEvent evt){
            
        }

        @Override
        public void windowIconified(WindowEvent evt){
            
        }

        @Override
        public void windowClosed(WindowEvent evt){
            
        }
        @Override
        public void windowClosing(WindowEvent evt){
            JOptionPane.showMessageDialog(null, "Login Form is closing.....");
        }

        @Override
        public void windowOpened(WindowEvent evt){
            
        }


    }//inner class

} // class close