package Treeset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import TreeMapsDemo.Customcomparator;

public class TreesetDemo 
{
  public static void main(String[] args) 
  {
	TreeSet<Integer> ts=new TreeSet<>();
	ts.add(11);
	ts.add(15);
	ts.add(87);
	ts.add(54);
	ts.add(69);
	ts.add(24);
	ts.add(73);
	ts.add(37);
	
	System.out.println(ts);
	System.out.println(ts.size());
	System.out.println(ts.isEmpty());
	System.out.println(ts.hashCode());
	
	System.out.println(ts.contains(69));
	System.out.println(ts.first());
	System.out.println(ts.last());
	//retrieve and remove the first element
	System.out.println(ts.pollFirst());
	//retrieve and remove the last element
	System.out.println(ts.pollLast());
	ts.remove(37);
	System.out.println(ts);
	
	TreeSet<Integer> ts2=new TreeSet<>();
	ts2.addAll(ts);
	ts2.add(64);

	System.out.println(ts2);
	//to check the given set elements contain specific set elements
	System.out.println(ts2.containsAll(ts));
	
	Iterator<Integer> itr = ts2.iterator();
	while (itr.hasNext()) 
	{
		Integer i1 = (Integer) itr.next();
		System.out.print(i1);
		System.out.print(",");
		
	}
	System.out.println();
    //remove all the elements in the specific set to given set
	ts2.removeAll(ts);
	System.out.println("" + ts2);
	// clear the set
	ts2.clear();
	System.out.println(ts2);
	
	TreeSet<Integer> ts3 = (TreeSet<Integer>) ts.clone();
	System.out.println(ts3);
	//retrieve the first element
	System.out.println(ts3.first());
	//retrieve the last element
	System.out.println(ts3.last());
    //To return the next highest element than specified element	
	System.out.println(ts3.higher(24));
    //To return the next lowest element than specified element	
	System.out.println(ts3.lower(73));
	//Returns the lowest element among those elements that are greater than the specified element
	System.out.println(ts3.ceiling(13));
	//Returns the greatest element among those elements that are less than the specified element
	System.out.println(ts3.floor(27));
	
	//The headSet() method returns all the elements of a tree set before the specified element
	System.out.println(ts3.headSet(69));
	//The tailSet() method returns all the elements of a tree set after the specified element
	System.out.println(ts3.tailSet(54));
	TreeSet<String> animals = new TreeSet<>(new cuscomparator());

    animals.add("Dog");
    animals.add("Zebra");
    animals.add("Cat");
    animals.add("Horse");
    System.out.println("TreeSet: " + animals);
    cuscomparator co=new cuscomparator();
    co.coo("Dog", "Cat");
    
  }
 
}
