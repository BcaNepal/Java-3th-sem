// set PATH=C:\jdk20\bin
// set CLASSPATH=C:\jdk20\lib;.

//D:\BCA_Java\WhileLoopDemo.java
public class LoopDemo{
    public void showForLoop(){
        System.out.println("For Loop:");
        int i = 0;
        for(i=0; i < 5; i++){
            if ( i == 3)
            {
                return;
            }
            System.out.println(i);
            
        } // For loop ends
         System.out.println("After For Loop: "+ i);
    } // method ends
    
    public void showWhileLoop(){
        System.out.println("While Loop:");
        int i = 0;
        while(i < 5){
            if ( i == 3)
            {
                i++;   
                continue;                             
            }
            System.out.println(i);
            i++;
        } // while loop ends
         System.out.println("After While Loop: "+ i);
    } // method ends

    public static void main(String[] args){
        WhileLoopDemo lpdemo = new WhileLoopDemo(); // object is created
        lpdemo.showWhileLoop(); // method is called
        lpdemo.showForLoop();
    } // main method ends
} // class ends