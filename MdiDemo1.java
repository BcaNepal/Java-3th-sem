import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

//import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;




public class MdiDemo1 extends JFrame{
    JDesktopPane dpane;
    JPanel p;
    JMenu menu, submenu;
    JMenuItem i1, i2, i3, i4, i5;

    public static void main(String[] args){
        new MdiDemo1();
    }

    public MdiDemo1(){
        super("Mdi Demo");       
        JMenuBar mb = new JMenuBar();  
        menu = new JMenu("Menu"); 
        submenu = new JMenu("Sub Menu");  

        i1=new JMenuItem("Login");  
        i2=new JMenuItem("Item 2");  
        i3=new JMenuItem("Item 3");  
        i4=new JMenuItem("Item 4");  
        i5=new JMenuItem("Item 5");  

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);  
        submenu.add(i4);
        submenu.add(i5); 
        menu.add(submenu);  
        mb.add(menu);  
        setJMenuBar(mb);  
        //p = new JPanel();
        JDesktopPane dp = new JDesktopPane();  
        add(dp);
        
        i1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){                      
                LoginForm jframe = new LoginForm();      
                dp.add(jframe ); 
            }
        });     
       
        setSize(400, 600);
        setVisible(true);   
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //p.setBorder(new CompoundBorder(new LineBorder(Color.DARK_GRAY),new EmptyBorder(4, 4, 4, 4)));
    }
}

class LoginForm extends JInternalFrame{
    JLabel lblUsername ;
    JTextArea taComment;
    JPanel p;

    public LoginForm(){
        super("Login Form",  true, true, true, true);
        p = new JPanel();
        lblUsername = new JLabel("Username");
        taComment = new JTextArea(3, 7);        
        p.add(lblUsername);
        p.add(taComment);

        add(p);
        setSize(290, 190);
        setVisible(true);

    }
}