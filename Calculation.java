public class Calculation{
    private float num1, num2; // class scope

    // public void setNum1(float num1){
    //     this.num1 = num1;
    // }

    // public float getNum1(){
    //     return this.num2;
    // }

    // default constructor
    public Calculation(){
        num1 = 45.6f;
        num2 = 34.6f;
    }

    //parameterized onstructor
    public Calculation(float num1, float num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float add(){
        
        return num1 + num2;
    }

    public float divide(){
        
        return num1 / num2;
    }

    // write code to add, subtract (-) , multiply(*) and division (/)   
    // Runtime error (Exception)
    //Exception should be handled
    // To handle Exception, we have try/catch block
    public static void main(String[] args){
        try{
            float number1 = Float.parseFloat(args[0]);
            float number2 = Float.parseFloat(args[1]);
            Calculation calc = new Calculation(number1, number2);
            
            float addition = calc.add();
            System.out.println("Addition: " + addition);
            float division = calc.divide();
            System.out.println("Division: " + division);
        } //try closed
       
        catch(ArrayIndexOutOfBoundsException ex){
            System.err.println("Error: "+ ex.getMessage());
        } // catch closed
        catch(NumberFormatException ex){
            System.err.println("Error: "+ ex.getMessage());
        } // catch closed
        catch(Exception ex){
            System.err.println("Error: "+ ex.getMessage());
   } 
    }
}