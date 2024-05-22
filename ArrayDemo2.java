class Student{
    String stdName = "";
    private float marks;
} // Student class ends

// set PATH=c:\jdk20\bin
// set CLASSPATH=C:\jsk20\lib;.

public class ArrayDemo2{

     ArrayDemo2(){
        Student students[] = new Student[3]; // Array of Type Student
        Student std1 = new Student();
        std1.stdName ="ram";
        std1.marks = 67.7F;

        Student std2 = new Student();

        Student std3 = new Student();

        students[0] = std1;
        students[1] = std2;
        students[2] = std3;
        //System.out.println(std1.stdName);
        // for(int i=0; i < students.length; i++){
        //     if(students[i].marks >= 70){
        //         System.out.println(students[i].stdName + "  "+ students[i].marks);
        //     }
        // }

    //for-each loop
        for(Student stdObj : students){
            String name = stdObj.stdName;
            boolean isStudent = name.equals("ram");
            //System.out.println(isStudent);
            if(!isStudent)
             System.out.println(stdObj.stdName + "  "+ stdObj.marks);
        }
    }
    public static void main(String x[]){
        ArrayDemo2 arrDemo2 = new ArrayDemo2();
    }


}