import java.awt.*;  
import java.awt.event.*;  
public class MouseListenerEg2 extends Frame implements MouseListener{  
    Label l;  
    MouseListenerEg2(){  
        addMouseListener(this);  
          
        l=new Label();  
        l.setBounds(20,50,100,20);  
        add(l);  
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
    } 

    // public void mouseClicked(MouseEvent e) {  
    //     l.setText("Mouse Clicked");  
    // }
    String str;
    int x, y;
    public void paint(Graphics g)
{
g.drawString(str,x,y);
}
public void mouseClicked(MouseEvent m)
{
  x = m.getX();
  y = m.getY();
  str = "x =" +x+",y = "+y;
repaint(); // we have made this
//call because repaint() will
//call paint() method for us.
//If we comment out this line,
//then we will see output
//only when focus is on the applet
//i.e on maximising the applet window
//because paint() method is called
//when applet screen gets the focus.
//repaint() is a method of Component
//class and prototype for this method is:
//public void repaint()
 
}
    public void mouseEntered(MouseEvent e) {  
        l.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        l.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        l.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        l.setText("Mouse Released");  
    }  
public static void main(String[] args) {  
    new MouseListenerEg2();  
}  
}  
