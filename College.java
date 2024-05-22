public class College extends EducationalOrg implements ICourse {
    //String campusChief; 
    String affiliation;

    public void College(String name, String address, String program, String campusChief, String affiliation, String emailId, int totalStudent){
        super(program, totalStudent);
        // this.name = name;
        // this.address = address;
        // this.program = program;
        // this.emailId = emailId;
        this.affiliation = affiliation;
        // this.campusChief = chief;       
        // this.totalStudent = totalStudent;      
    }
    // public void setDescription(String name, String address, String program, String campusChief, String affiliation, String emailId, int totalStudent){
    //     this.name = name;
    //     this.address = address;
    //     this.program = program;
    //     this.emailId = emailId;
    //     this.affiliation = affiliation;
    //     this.campusChief = chief;       
    //     this.totalStudent = totalStudent;      
    // }

    @Override
    public void displayDetails(){
        //definition
    }

    @Override
    public void setDetails();

    @Override

    //overriding method
    public void display(){
        super.display();
        //System.out.println("Campus Chief: " + chief);
        System.out.println("Affilitaion to University: " + affiliation);
    }

    public static void main(String args[]){
        College jmc = new College();
        //jmc.setDescription("JMC", "Kuleshwar", "BCA", "Mr T.", "jmcinfo@jmc.edu.np", 500);

          //wraper class
        // int -> Integer, float -> Float, double -> Double
        //Integer totStd = new Integer(args[5]) ;
        // Integer totStd = Integer.getInteger(args[5]);
        // int totStudent = totStd.intValue();

        int totStudent = Integer.parseInt(args[5]);  // parseInt is a static method of Integer class

        jmc.setDescription(args[0], args[1], args[2],  args[3], args[4], totStudent);
        // "Mr T.", "jmcinfo@jmc.edu.np",totStudent);
        jmc.display();
    }
}