public class StringDemo{
    String msg; // atrribute or property

    public StringDemo(){
        this.msg = "hari";
        // Hari
        //Radha
    }
    public StringDemo(String msg){
        this.msg = msg;
        //this.msg = "hello" + msg;
    }
   
    public void showInTitleCase()
    {
        int len = msg.length();
        //int i = msg.indexOf('r');
        String firstLetter = msg.substring(0, 1);
        String remaingLetters = msg.substring(1, len);
        firstLetter = firstLetter.toUpperCase();
        remaingLetters = remaingLetters.toLowerCase();
        msg = firstLetter + remaingLetters;
        System.out.println("Message in Title Case: " + msg);
    }
    public String getMsg(){  // behavior
        return msg;
    }
/*
 public void showMsg(){  // behavior
        System.out.println(msg);
        //msg.toLowerCare();
        String subMsg = msg.substring(1, 4);
        System.out.println(subMsg);
    }
    */
    // main method
    public static void main(String args[])
    {
        StringDemo strDemo1 = new StringDemo();
       // strDemo1.showMsg();
        

        StringDemo strDemo2 = new StringDemo("radha");
        strDemo2.showInTitleCase();
        //strDemo2.showMsg();
        String msg = strDemo2.getMsg();
        System.out.println("returned value: " +msg);
        msg = msg.toUpperCase();
        System.out.println("returned value: " +msg);
        
        ElectricityBill bill = new ElectricityBill(15);
        System.out.println(bill.prevReading);
    }
}