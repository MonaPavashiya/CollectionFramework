package hashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapToArrayList {

	public static void main(String[] args) 
	{
		HashMap<String, Integer> compMap = new HashMap<String, Integer>();
		
		compMap.put("Google", 10000);
		compMap.put("Walmart", 20000);
		compMap.put("Amazon", 30000);
		compMap.put("Facebook", 5000);
		compMap.put("Cisco", 15000);
		
		System.out.println("company map size: "+ compMap.size());
		
		Iterator it = compMap.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry pairs = (Map.Entry)it.next();
			System.out.println(pairs.getKey()+ " = " + pairs.getValue());	
		}
		
		//covert hashmap keys into arraylist
		List<String> compNamesList = new ArrayList<String>(compMap.keySet());
		System.out.println("Total company count = " + compNamesList.size());
		for(String s : compNamesList)
		{
			System.out.println(s);
		}
 
		//covert hashmap values into arraylist
		List<Integer> empValuesList = new ArrayList<Integer>(compMap.values());
		System.out.println("Total emp values count = " + empValuesList.size());
		for(Integer e : empValuesList)
		{
			System.out.println(e);
		}
	
	
	}

}
