import java.awt.*;

public class JmcLoginForm{
    //declare the components
    Frame f;
    Panel p;
    Label lblUsername, lblPassword;
    TextField txtUername, txtPassword;
    Button btnLogin, btnClear;

    //Constructor (special method)
    public JmcLoginForm(){
        try{
        // initialize (create object) all the components
            f = new Frame();
            p = new Panel();
            
            lblUsername = new Label("Username"); 
            lblPassword = new Label("Password");

            txtUername = new TextField(10);
            txtPassword = new TextField(10);
            txtPassword.setEchoChar('%');

            btnLogin = new Button("Login");
            btnClear = new Button("Clear");

            f.add(p); // panel is added into frame

            p.add(lblUsername);
            p.add(txtUername);

            p.add(lblPassword);
            p.add(txtPassword);

            p.add(btnLogin);
            p.add(btnClear);

            f.setSize(300, 200);            
            f.setVisible(true);


        }
        catch(Exception ex){
            System.err.println("error: " + ex.getMessage());
        }

    } // construtor close

    public static void main(String[] args){
        //JmcLoginForm loginForm = new JmcLoginForm();
        new JmcLoginForm();
    }
} // class close