package linkedListConcepts;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods
{

	public static void main(String[] args) 
	{
		//LL is a default class in java
		//it can be used as list, stack, queue.
		//it allows the  null entry
		//dynamic collection
		//hence insertion and deletion can be easily implemented
		//it an contain duplicate elements
		//it is not synchronized
		//in LL, manipulation is fast because we don't need any shifting
		
		
		LinkedList<String> names= new LinkedList<String>();
		System.out.println(names.size());  //0
		
		names.add("Mona"); //0
		names.add("Sandeep");  //1 
		names.add("Reena");  //2   
		names.add("Rishi");  //3
		
		System.out.println(names.size()); //2
		System.out.println(names);
		System.out.println(names.get(0)); // mona
		System.out.println(names.get(1));  //sandeep
		
		Iterator<String> it = names.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		names.add(4,"Steve");
		System.out.println(names);
		
		names.add(2, "Ram");
		System.out.println(names);
		
		LinkedList<String> users= new LinkedList<String>();
		 users.add("Peter");
		 users.add("Trump");
		 
		 names.addAll(users);
		 System.out.println(names);
		 
		 names.addFirst("kamala");
		 System.out.println(names);

		 names.addLast("Shivin");
		 System.out.println(names);
		 
		 names.remove(3);
		 System.out.println(names);
		 
		 names.removeAll(users);
		 System.out.println(names);
		 
		 names.removeLast();
		 System.out.println(names);
		 
		 names.removeFirst();
		 System.out.println(names);
		 
		 LinkedList<String> lang= new LinkedList<String>();
		 System.out.println(lang.size()); //0
		 lang.add("java");
		 lang.add("python");
		 lang.add("ruby");
		 lang.add("javascript");
		 
		 System.out.println(lang.size());//4
		 
		 //reverse linkedlist
		 Iterator<String>  itr = lang.descendingIterator();
		 
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		 
		 for (String e : lang)
		 {
			 System.out.println(e);
		 }
		 
		 //sort
		 Collections.sort(lang);
		 System.out.println(lang);
	}

}
