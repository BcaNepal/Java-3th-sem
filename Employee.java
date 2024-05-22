public class Employee extends Person implements IStaff {
	
	private int empId;
	
	public Employee(String nm, String gen, int id) {
		super(nm, gen);
		this.empId=id;
	}

	public int getId(){
		return this.empId;
	}

	@Override
	public void work() {
		if(empId == 0){
			System.out.println("Not working");
		}else{
			System.out.println("Working as employee!!");
		}
    }

    @Override
    public void display(){
        System.out.println("display is called");
    }
    public void show(){
        System.out.println("Show is called");
    }
	
    @Override
    public String getGender(){
        return "Male";
    }

	
    
	
	public static void main(String args[]){
		//coding in terms of abstract classes
		Person student = new Employee("Dove","Female",0);
        Employee employee = new Employee("Pankaj","Male",123);
		IStaff employee2 = new Employee("Pankaj","Male",123);
        employee2.display();
		student.work();
		employee.work();
		//using method implemented in abstract class - inheritance
        student.changeName("Dhiraj");
        employee.show();
        System.out.println(student.toString());
		employee.changeName("Pankaj Kumar");
		System.out.println(employee.toString());
	}
    }