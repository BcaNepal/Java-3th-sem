
//import necessary packages
import javax.swing.*;
import java.awt.event.*;

public class MyLoginForm implements ActionListener{
    JLabel lblUsername, lblPassword, lblResult;
    JTextField txtUsername;
    JPasswordField txtPassword;
    JButton btnLogin, btnReset;
    JPanel p;
    JFrame f;   

    MyLoginForm(){
       
        // initialize componenets and container
        lblUsername = new JLabel("User Name");
        lblPassword = new JLabel("Password");
        lblResult = new JLabel();

        txtUsername =  new JTextField(15);
        txtPassword = new JPasswordField(15);

        btnLogin = new JButton("Login");
        btnReset = new JButton("Reset");

        // register the buttons for click-event
        btnLogin.addActionListener(this);
        btnReset.addActionListener(this);
        
        f = new JFrame("My Login Form....");
        p = new JPanel();

        // add the components into container.
        p.add(lblUsername);
        p.add(txtUsername);

        p.add(lblPassword);
        p.add(txtPassword);      

        p.add(btnLogin);
        p.add(btnReset);

        p.add(lblResult);
        
        f.add(p);

        //setTitle("Jmc Login Form");
        f.setSize(300, 400);
        f.setVisible(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        new LoginForm();
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