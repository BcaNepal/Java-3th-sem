import java.util.*;

public class VectorDemo{
    List lst;

    void mapDemo(){
        //Map<K,V>
        //ArrayList<E>, ArrayList<E>
        //Map<String, Float>
        Map<String, Float> mp = new HashMap<String,Float>();
        mp.put("Ram", 45.6F);
        mp.put("Shyam", 78.0F);
        //mp.put("Ram", 45.0F);

        System.out.println(mp.get("Shyam"));
        Set<String> set = mp.keySet();
        // System.out.println(set);
        // Collection<Float> c = mp.values();
        // System.out.println(c);

        Set<Map.Entry<String, Float>> mpset = mp.entrySet();
        mpset.forEach(x-> System.out.println(x.getKey()+ " "+ x.getValue()));
    }
    void setArrayListValue(){
        lst = new ArrayList<String>();
        lst.add("HAri");
        lst.add("Radha");

        lst.forEach(y-> System.out.println(y));
    }

    void setVectorValue(){
        lst = new Vector<Integer>();
        lst.add(23);
        lst.add(45);
        lst.forEach(y-> {
            //y = Integer.parseInt(y.toString())*100/60;
            y = (Integer)y*100/60;
            System.out.println(y);
        });
    }
    void display(){
        Iterator itr = lst.iterator();
        while(itr.hasNext()){
             Object item = itr.next();
             System.out.println(item);
        }
    }

    public static void main(String[] args){
        VectorDemo vdemo = new VectorDemo();
        // vdemo.setArrayListValue();
        // vdemo.display();

        // vdemo.setVectorValue();
        // vdemo.display();
        vdemo.mapDemo();
        vdemo.setArrayListValue();
        vdemo.setVectorValue();
       
      
        //arr.remove(2);        

      

        // for(int i=0; i<arr.size();i++){
        //     System.out.println(arr.get(i));
        // }
    }
}