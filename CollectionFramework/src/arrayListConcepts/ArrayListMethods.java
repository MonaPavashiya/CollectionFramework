package arrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

	public static void main(String[] args) 
	{
		
		ArrayList<String> ar1 = new ArrayList<String>();
		
		ar1.add("java");
		ar1.add("python");
		ar1.add("ruby");
		ar1.add("javaScript");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Testing");
		ar2.add("dev ops");
		
		ar1.addAll(ar2);
		System.out.println(ar1);
		
		ar1.addAll(2, ar2);
		System.out.println(ar1); 
		
		System.out.println(ar1.contains("java")); //true
		System.out.println(ar1.contains("c"));   //false
		System.out.println(ar1.indexOf("ruby")>0);  //true
		
		ar1.clear(); //will clear all data
		System.out.println(ar1);
		
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("naveen", "tom", "naveen", "steve", "naveen"));
		System.out.println(list1);
		
		int i = list1.lastIndexOf("naveen");
		System.out.println(i);
		
		list1.remove(1);
		System.out.println(list1);
		
		list1.remove("tom");
		System.out.println(list1);
		
		
		
		ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("naveen", "tom", "mona", "steve", "reena"));
	    Object arr[] = namesList.toArray();
	    System.out.println(Arrays.toString(arr));
	   
	    for (Object o :arr)
	    {
	    	System.out.println(o);
	    }
	    
	}

}
