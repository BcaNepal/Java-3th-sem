// Inter-thread communication in Java is a mechanism in which 
// a thread is paused running in its critical section 
// and another thread is allowed to enter (or lock) in the same critical section to be executed.
//Inter-thread communication is also known as Cooperation in Java.

// wait() and notify() must be in synchornized method or block only
class Customer{    
    double balance = 10000.0;    
        
    synchronized void withdraw(double amount){    
        
            System.out.println("going to withdraw..." + amount +"\n Now the Balance: " + this.balance);    
            try{
                    if( balance < amount){
                    wait();
                }
            }
            catch(InterruptedException ex){
                ex.printStackTrace();
            }
        
        this.balance -= amount;    
        //balance = balance - amount;
        System.out.println("Withdraw completed...\n Now the Balance: " + this.balance);

    }    
        
    synchronized void deposit(double amount){    
        System.out.println("going to deposit..." + amount);    
        this.balance+=amount;    
        System.out.println("deposit completed...\n Now the Balance: " + this.balance);    
        notifyAll();
    }    
}    
    
class ThreadLock{    
    public static void main(String args[]){    
        final Customer c= new Customer();    
        Thread t1 = new Thread(){         
            public void run(){
                try{
                    c.withdraw(12000);
                    Thread.sleep(1000);
                }
               catch(InterruptedException ex){
                   System.out.println(ex);
               }
            }
        };            
    
        t1.start();    

        Thread t2 = new Thread(){               
            public void run(){
            try{ 
                c.deposit(10000);
                Thread.sleep(2000);
            }            
             catch(InterruptedException ex){
                 ex.printStackTrace();
             }
            }
        }; 
        t2.start();  
    
    }
}    