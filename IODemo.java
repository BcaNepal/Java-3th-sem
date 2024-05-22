import java.io.*;
public class IODemo {
  
    public static void main(String args[])
        throws IOException
    {
  
        // InputStreamReader class to read input
        InputStreamReader inp = null;
  
        // Storing the input in inp
        inp = new InputStreamReader(System.in);
  
        System.out.println("Enter characters, "
                           + " and '0' to quit.");
        char c;
        String s="";
        do {
            c = (char)inp.read();
            if(c == '0')
                break;
           s = s + String.valueOf(c);
            //System.out.println(inp.available());
        } while (true);
        System.out.println(s);
    }
}