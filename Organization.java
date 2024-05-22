public abstract class Organization{
    String name, address, emailId, regNo, chief;
    public Organization(String name, String address, String emailId, String chief){
    final float LONG;
    final float LAT;
    }   

    public abstract void show();

    public  void display(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Email: " + emailId);
        //System.out.println("Program: " + program);
        System.out.println("Head: " + chief);
    }

     /*
    public Organization(name, address, emailId, chief){
        this.name = name;
        this.address = address;
        this.emailId = emailId;
        this.chief = chief;
    }
    */ 
}