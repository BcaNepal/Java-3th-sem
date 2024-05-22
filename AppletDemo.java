import java.applet.Applet;
import java.awt.*;
//import javax.swing.JApplet;

public class AppletDemo extends Applet{
    Label lblUsername, lblPassword;
    TextField txtUsername, txtPassword;
    Button btnLogin, btnReset;   
    Panel p;

    public void init(){
        // initialize componenets and container
        lblUsername = new Label("User Name");
        lblPassword = new Label("Password");

        txtUsername =  new TextField(15);
        txtPassword = new TextField(15);

        btnLogin = new Button("Login");
        btnReset = new Button("Reset");

        
        int i =0;
        for(i=0; i<5; i++);
        SOP i;

        //f = new Frame("My Login Frame");
        p = new Panel();

        // add the components into container.

        p.add(lblUsername);
        p.add(txtUsername);

        p.add(lblPassword);
        p.add(txtPassword);

        p.add(btnLogin);
        p.add(btnReset);
        add(p);

        setSize(300, 500);
        setVisible(true);
    }

}