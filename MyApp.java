//MDI

import javax.swing.*;
import java.awt.event.*;

// JDektopPane
//JInternalFrame

public class MyApp extends JFrame 
{
    JMenuBar menubar;
    JMenu menuFile, menuEdit;
    JMenuItem miLogin, miNewFile, miOpenFile, miSave, miReport;
    JDesktopPane dpane;
    
    JPanel p;

    // JDesktopPane, JInternalFrame

    public MyApp(){
        dpane = new JDesktopPane();
        add(dpane);
        menubar = new JMenuBar();
        setJMenuBar(menubar);

        //menu
        menuFile = new JMenu("File");
        menuEdit = new JMenu("Edit");
        
        menubar.add(menuFile);
        menubar.add(menuEdit);

        //menu item
        miLogin = new JMenuItem("Login");
        miNewFile = new JMenuItem("New File");
        miOpenFile = new JMenuItem("Open File");
        miReport = new JMenuItem("Report");

        //add menu item in menu
        menuFile.add(miLogin);
        menuFile.add(miNewFile);
        menuFile.add(miOpenFile);

        menuEdit.add(miReport);

        setVisible(true);
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        miLogin.addActionListener(new MyAction());
        miReport.addActionListener(new MyAction());

       /** miLogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                //LoginForm lf = new LoginForm();
                dpane.add(new MyLogin());
            }
        });

        miReport.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                dpane.add(new TableDemo());
            }
        }); **/

    } // contructor close

    public static void main(String[] args){
        new MyApp();
    }

    // inner classs
    class MyAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            JinternalFrame iframe = null;
            if(ae.getSource() == miLogin){
                //dpane.add(new LoginForm())
                iframe = new MyLogin();
            }
            else if( ae.getSource() == miReport){
                //dpane.add(new TableDemo())
                iframe = TableDemo();
            }
            dpane.add(iframe);
        }
    }
} // MyApp class close