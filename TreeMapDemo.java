
import java.util.*;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> treeMap = new TreeMap<String, Integer>();

		// Adding elements to the tree map
		treeMap.put("A", 1);
		treeMap.put("C", 3);
		treeMap.put("B", 2);
		treeMap.put("For", 45);
		treeMap.put("egg", 25);

		// Getting values from the tree map
		int valueA = treeMap.get("A");
		System.out.println(treeMap);

		// Removing elements from the tree map
		//treeMap.remove("B");

		// Iterating over the elements of the tree map
		for (String key : treeMap.keySet()) {
			System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
		}

        //NavigableSet<String> map2 = ((TreeMap<String, Integer>) treeMap).navigableKeySet();
        

	}
}
