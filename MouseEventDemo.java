import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import javax.swing.*;

public class MouseEventDemo extends JFrame{
    JLabel lblResult;
    JPanel p;
    //JFrame;

    public static void main(String[] args){
        new MouseEventDemo();
    }

    public MouseEventDemo(){
        //super("Mouse Event DEMO Form");
        setTitle("Mouse Event DEMO Form");

        lblResult = new JLabel();
        p = new JPanel();
        //f = new JFrame("Mouse Event Demo");
        add(p);

        p.add(lblResult);

        // register the event
        addMouseListener(new MouseEventHandler());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    //inner class
    class MouseEventHandler extends MouseAdapter{
    //class MouseEventHandler implements MouseListener{
     
        @Override
        public void mouseClicked(MouseEvent e){
            //lblResult.setText("mouse is clicked");
            int x1 = e.getX();
            int y1 = e.getY();
            String x  = String.valueOf(x1);
            String y = String.valueOf(y1);
            String position = x + "," + y;
            //lblResult.setText(position); 
            JOptionPane.showMessageDialog(null, position); // "Co-ordinate",  ,JOptionPane.INFORMATION_MESSAGE);
           // String x = = String.valueOf(e.getX());
            // String y = String.valueOf(e.getY());          
            //lblResult.setText(x + "," + y);             
              //lblResult.setText(String.valueOf(e.getX()) + "," + String.valueOf(e.getY()))
        }  
        /*
        @Override
        public void mouseEntered(MouseEvent e){
        }
        
        @Override
        public void mouseExited(MouseEvent e){
        } 

        @Override
        public void mousePressed(MouseEvent e){
        }  

        @Override
        public void mouseReleased(MouseEvent e){
        }
        */
     // mouse event handler class is closed
    }
    

} // outer class close

//D:\BCA_Java\MouseEventDemo.java