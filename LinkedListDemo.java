import java.util.*;

public class LinkedListDemo {
    LinkedList<Employee> list;
    LinkedListDemo(){
        list = new LinkedList<Employee>();
        list.add(new Employee("Ram", "Male", 34));
        list.add(new Employee("Hari", "Male", 23));
        list.add(new Employee("Radha", "Female", 21));
    }
    public void display(){
         list.forEach(x-> System.out.println(x.getName()));
        Collections.sort(list, new NameComparator());
        list.forEach(x-> {            
            System.out.println(x.getName());
        });
    }

    public void displayId(){
         list.forEach(x-> System.out.println(x.getId()));
        Collections.sort(list, new IdComparator());
        list.forEach(x-> {            
            System.out.println(x.getId());
        });
    }
    public static void main(String[] args) {
        new LinkedListDemo().displayId();
    }
} // class close

class NameComparator implements Comparator<Employee>{  
    public int compare(Employee s1, Employee s2){  
        return s2.getName().compareTo(s1.getName());  
    }  
}  

class IdComparator implements Comparator<Employee>{  
 
    // Method
    // Sorting in ascending order of roll number
    public int compare(Employee a, Employee b)
    {
 
       // return a.getId() - b.getId();
        
        if(a.getId()== b.getId())  
            return 0;  
        else if(a.getId() > b.getId())  
            return 1;  
        else  
            return -1;  
        
}
