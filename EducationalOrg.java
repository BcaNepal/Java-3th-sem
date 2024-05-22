public class EducationalOrg extends Organization{
    String program;
    int totalStudent; // primitive datatype

//overridden method

    public EducationalOrg(){
        //default constructor
    }

    //POLUMORPHISM
    //CONSTRUCTOR OVERLOADING
    public EducationalOrg(String name, String address, String program, String campusChief, String emailId, int totalStudent){
        super(name, Address, campusChief,......)
        this.program = program;
        this.totalStudent = totalStudent;

    }


    public EducationalOrg(String program, int totalStudent){
        this.program = program;
        this.totalStudent = totalStudent;
    }


    public EducationalOrg(int totalStudent, String program){
        this.program = program;
        this.totalStudent = totalStudent;
    }

    @Override
    public void show(){
        StringBuffer sb = new StringBuffer();
        sb.append(name);
        sb.append(" ");
        sb.append(address);
        sb.append(" ");
        sb.append(program);
        sb.append(" ");
        sb.append(totalStudent);
        sb.append(" ");

        String orgInfo = sb.toString();
        System.out.println(orgInfo);
        

    }
    public void display(){
       
        System.out.println("Program: " + program);
        System.out.println("Total Student: " + totalStudent);
    }
}