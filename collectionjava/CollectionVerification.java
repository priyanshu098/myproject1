package collectionjava;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public interface CollectionVerification {
	public static void main(String[] args) {
	
	
	System.out.println("ArrayList Demonstration:");
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("Apple");
    arrayList.add("Banana");
    arrayList.add("Cherry");
    System.out.println("ArrayList: " + arrayList);

   
    System.out.println("\nHashSet Demonstration:");
    HashSet<Integer> hashSet = new HashSet<>();
    hashSet.add(1);
    hashSet.add(2);
    hashSet.add(3);
    System.out.println("HashSet: " + hashSet);

    
    System.out.println("\nHashMap Demonstration:");
    HashMap<String, Integer> hashMap = new HashMap<>();
    hashMap.put("One", 1);
    hashMap.put("Two", 2);
    hashMap.put("Three", 3);
    System.out.println("HashMap: " + hashMap);

    System.out.println("\nIterating Through a Collection:");
    System.out.print("ArrayList: ");
    for (String fruit : arrayList) {
        System.out.print(fruit + " ");
    }
    System.out.println();

    System.out.println("\nRemoving Elements from a Collection:");
    hashSet.remove(2);
    System.out.println("Updated HashSet after removing 2: " + hashSet);

    
    System.out.println("\nChecking If an Element Exists in a Collection:");
    System.out.println("Does HashMap contain key 'Two'? " + hashMap.containsKey("Two"));

  
    System.out.println("\nSize of a Collection:");
    System.out.println("Size of ArrayList: " + arrayList.size());
    System.out.println("Size of HashMap: " + hashMap.size());

    System.out.println("\nClearing a Collection:");
    arrayList.clear();
    System.out.println("ArrayList after clearing: " + arrayList);
}

}
