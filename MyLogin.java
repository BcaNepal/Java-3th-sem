import javax.swing.*;

public class MyLogin extends JInternalFrame //implements ActionListener, KeyListener{
{
    JLabel lblUsername, lblPassword, lblResult;
    JTextField txtUsername;
    JPasswordField txtPassword;
    JButton btnLogin, btnReset;
   // JCheckBox chkSaved;
    //JComboBox cmbZone;
    //JList lstDistrict;
    //JFrame f;
    JPanel p;
    // String pwd = "";
    // StringBuffer pwdBuffer;
    // StringBuilder pwdBuilder = new StringBuilder();

    public MyLogin(){
        super("Jmc Login Form");
        //pwdBuffer = new StringBuffer();
        // initialize componenets and container
        lblUsername = new JLabel("User Name");
        lblPassword = new JLabel("Password");
        txtUsername =  new JTextField(15);
        txtPassword = new JPasswordField(15);
        btnLogin = new JButton("Login");

        p = new JPanel();

        p.add(lblUsername);
        p.add(txtUsername);

        p.add(lblPassword);
        p.add(txtPassword);
        p.add(btnLogin);

        add(p);

        //setTitle("Jmc Login Form");
        setSize(300, 400);
        setVisible(true);
    }
}