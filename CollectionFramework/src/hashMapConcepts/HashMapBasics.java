package hashMapConcepts;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics 
{

	public static void main(String[] args) 
	{
		//no order - no indexing
		//stores values - key-value <k, v>
		//key cannot be duplicate
		//can store n number of null values but only one null key
		//HashMap is not synchronized or thread safe
		
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "Delhi");
		capitalMap.put("USA", "Washington dc");
		capitalMap.put("UK", "London");
		capitalMap.put(null, "Berlin");
		capitalMap.put("Russia", null);
		capitalMap.put("France", null);
		capitalMap.remove("France");
		
		System.out.println(capitalMap.get("USA"));
		System.out.println(capitalMap.get("Germony")); //null
		System.out.println(capitalMap.get(null));
		System.out.println(capitalMap.get("Russia"));
		
		//iterator over the keys: by using keySet()
	    Iterator<String> it	= capitalMap.keySet().iterator();
		System.out.println(" by using keySet()---------");
	    while(it.hasNext())
	    {
	    	String key = it.next();
	    	String value = capitalMap.get(key);
	    	System.out.println("key =" + key + "  value = " + value);
	    }
	    
	    //iterator over the set or pair: by using entrySet()
	    Iterator<Entry<String, String>> it1	= capitalMap.entrySet().iterator();
	    System.out.println(" by using entrySet()---------");
	    while(it1.hasNext())
	    {
	    	Entry<String, String> entry = it1.next();
	    	System.out.println("key = " + entry.getKey() + "  and value = " + entry.getValue());
	    }
	}

}
