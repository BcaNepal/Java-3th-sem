public class ThreadDemo extends Thread 
{
   @Override
   public void run(){  
        while(true){
            try{
                System.out.println( Thread.currentThread().getName() +" running");
                //System.out.println("thread is running..."); 
                Thread.sleep(1000);
                System.out.println("******");
                }catch(Exception ex){
                System.out.println(ex); 
            }

        } 
    }
    
    public static void main(String args[]){  
        //ThreadDemo t1=new ThreadDemo(); 
       // Thread t1 = new Thread(new ThreadDemo(), "T1");
        ThreadDemo t1 = new ThreadDemo();
       // t1.start();
        ThreadDemo t2 = new ThreadDemo(); 
        //t2.start();
        ThreadDemo t3 = new ThreadDemo(); 
        //t3.start();
        //t2.setPriority(8);
        //t1.setPriority(10);
        t1.start();
        t2.start();
        t3.start();
        //System.out.println( Thread.currentThread().getName() +" running"); //Thread.getCurrentThread().getName())
     }  
}   

