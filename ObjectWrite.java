import java.io.*;

class Student implements Serializable{
    //int rollNo;
    String rollNo, name, email;
    float age;

    public Student(String rollNo, String name, String email, float age){
        this.rollNo = rollNo;
        // write others
    }
}

public class ObjectWrite{
    public void writeObj() throws IOException
    {
        FileOutputStream fos = new FileOutputStream("D:\\jmc-obj.txt");
        ObjectOutputStream ostream = new ObjectOutputStream(fos);
        Student studObj = new Student("S-101", "Ram", "ram@yahoo.com", 23.75f);
        ostream.writeObject(studObj); // object is serialized
        ostream.flush();
        ostream.close();
    } 

    public void readObj() throws IOException{
        FileInputStream fis = new FileInputStream("D:\\jmc-obj.txt");
        ObjectInputStream istream = new ObjectInputStream(fis);        
        Object obj = istream.readObject(); // object is deserialized
        Student studObj = (Student)obj; // type cast
        System.out.println("Name: "+ studObj.name);
        istream.close();
    } 

}