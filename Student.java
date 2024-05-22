public class Student{
    // Attributes
    //class scope
    String firstName, lastName;
    int age;

    // default constrtuctor
    public Student(){
        // initialize the attributes
        firstName = "Ram";
        lastName ="Thapa";
        age = 23;
    }

    public void displayDetails(){
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
    }

    // main method
    public static void main(String[] args){
       // Create object 
        Student stud = new Student(); // constructor is executed when object is created
        stud.displayDetails();
    }
}