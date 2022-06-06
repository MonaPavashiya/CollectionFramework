package setConcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcepts {

	public static void main(String[] args) 
	{
		Set<String> hs = new HashSet<String>();

		hs.add("alpha");
		hs.add("beta");
		hs.add("testing");
		hs.add("alpha"); //cannot have duplicate value
		hs.add(null);

		System.out.println(hs);
		System.out.println(hs.contains("testing")); //true

		for(String e : hs)
		{
			System.out.println(e);
		}
		
		Iterator<String> it = hs.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
	
		hs.remove("beta");
		System.out.println(hs);
		
		Set<Integer> first =new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9}));
		
		Set<Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer[] {1,2,3,4,9}));
	
		//get the union
		Set<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);
	}

}
