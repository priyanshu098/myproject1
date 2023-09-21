package CollectionsDemo;

import java.util.LinkedList;

public class LinkedkListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> cities = new LinkedList<>();
		
		cities.add("London");
		cities.add("paris");
		cities.add(2, "New Delhi");
		cities.add("Mumbai");
		
		System.out.println(cities.size());
		
		java.util.Iterator<String> itr= cities.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		System.out.println(cities.get(1));
		
		System.out.println(cities.contains("Hyderabad"));

	}

}
