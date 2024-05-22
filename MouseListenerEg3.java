
    
//Co-ordinates should display
//at that point only wherever
//there is click on canvas

import java.awt.Graphics;
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;

public class MouseListenerEg3 extends JFrame implements MouseListener
{
    private int x,y;
    private String str = " ";
    public  MouseListenerEg3()
    {
        this.addMouseListener (this);
    //first "this" represent source
    //(in this case it is applet which
    // is current calling object) and
    // second "this" represent listener
    //(in this case it is GFG) 
        setSize(400,400);
        setVisible(true);
    }

//      public void update (Graphics g)
//   {
//     paint (g);
//   }
// public void paint(Graphics g)
// {
//     g.drawString(str,x,y);
// }
public void mouseClicked(MouseEvent m)
{
  x = m.getX();
  y = m.getY();
  str = "x =" +x+",y = "+y;
  
   getGraphics().drawString(str,x,y);
//repaint(); // we have made this
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
 
 public void mouseEntered(MouseEvent m)
//over-riding all the methods given by
// MouseListener
{
}
 public void mouseExited(MouseEvent m)
{
}
 public void mousePressed(MouseEvent m)
{
}
 public void mouseReleased(MouseEvent m)
{
}

public static void main(String[] args){
    new MouseListenerEg3();
}
}

