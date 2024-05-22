//Thread

// Runnable (interface)



public class ThreadDemo2 implements Runnable{
    public void run(){
        System.out.println("thread running....");
    }

    public static void main(String[] args){
        //Thread t1 = new Thread("Th1");
        //Thread t2 = new Thread("Th2");
        //ThreadDemo t1 = new ThreadDemo();
        Thread t1 = new Thread(new ThreadDemo2());
        Thread t2 = new Thread( new ThreadDemo2());
        t1.start();
        t2.start();

    }
}