class Calculation{
    public static synchronized void calculate(int x){
        //synchronized(this)
        //{
            try{
                for(int i=1; i<= 5; i++){
                    System.out.println(i * x);
                    Thread.sleep(500);
                }
            }
            catch(InterruptedException ex){
                System.out.println(ex);
            }
       // }
        // many lines code 1000 lines
    }
    
}
// ##############################

class T1 extends Thread
{
    Calculation c;
    int x;
    public T1(Calculation c, int x)
    {
        this.c = c;
        this.x = x; // 12
    }
   @Override
    public void run(){
        Calculation.calculate(x);
    }
}

// #############################

class T2 extends Thread
{
    Calculation c;
    int x;
    public T2(Calculation c, int x)
    {
        this.c = c;
        this.x = x; // 12
    }
   @Override
    public void run(){
        //c.calculate(x);
        Calculation.calculate(x);
    }
}

// ###############################

public class ThreadDemo3{
    public static void main(String[] args){
        Calculation calc = new Calculation();
        T1 t1Obj = new T1(calc, 5);
        T1 t2Obj = new T1(calc, 8);
        t1Obj.start();
        System.out.println("***********");
        t2Obj.start();
    }
}