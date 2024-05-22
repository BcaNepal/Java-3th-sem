//Wrapper class

public class NumberAddition
{
    public static void main(String[] args)
    {
        // try-catch block is used to handle the exception (ie runtime error)
        try
        {
            // int x = Integer.parseInt(args[0]);
            // int y = Integer.parseInt(args[1]);
            double x = Double.parseDouble(args[0]);
            double y = Double.parseDouble(args[1]);
           // int z = x + y;
           double z = x + y;
            System.out.println("Addition: " + z);
            //System.out.println(args[0]+ args[1]);
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Array Index Error: "+ ex.getMessage());
        } 
        catch(Exception ex)
        {
            System.out.println("Error: "+ ex.getMessage());
        }
       // System.out.println(args[0]+ args[1]);
        System.out.println("Program ends");
    } // main method close
} // class close