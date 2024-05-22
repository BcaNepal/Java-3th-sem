import java.util.*;

class SetDemo{ 

    public static void main(String args[]){  
        List<Integer> list = new ArrayList<Integer>();
        list.add(34);  
        list.add(32);  
        list.add(21);
        list.add(57);
        list.forEach(x-> System.out.println(x));

        //HashSet<String> set = new HashSet<String>(list);

        Collections.sort(list);
        System.out.println("Traversing element in ascending order");
        list.forEach(x-> {
            System.out.print(x+ "\t");
            //System.out.println(Math.sqrt(x));
            //float y = x*100/60.0f;
            System.out.println(x*100/60.0f);
        });   
        //System.out.println("\n") ;
        
        System.out.println("Traversing element in descending order");
        Collections.sort(list, Collections.reverseOrder());
        list.forEach(x-> System.out.println(x));

        // TreeSet<String> set=new TreeSet<String>(list);           

        // System.out.println("Traversing element of TreeSet in ascending order");        
        // set.forEach(x-> System.out.println(x));

        // // for(String x : set){
        // //     System.out.println(x);
        // // }

        // System.out.println("Traversing element of TreeSet through Iterator in descending order");  
        // Iterator i2=set.descendingIterator();  
        // while(i2.hasNext()){  
        //     System.out.println(i2.next());  
        // }              
    }  
}  