package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo 
{
  public static void main(String[] args) {
	
	  ArrayList<Integer> a1=new ArrayList<>();
	  a1.add(12);
	  a1.add(14);
	  a1.add(16);
	  a1.add(18);
	  a1.add(17);
	  a1.add(15);
	  a1.add(13);
	  a1.add(11);
	  
	  a1.add(3, 21);
	  System.out.println(a1);

	  a1.remove(3);
	  //a1.remove(2);
	  System.out.println(a1.get(2));
	  a1.set(3, null);
	  a1.set(3, 11);
	  System.out.println(a1.size());
	  System.out.println(a1.isEmpty());
      //a1.clear();
	  System.out.println(a1.contains(12));
	  System.out.println(a1.hashCode());
	  System.out.println(a1.indexOf(16));
	  System.out.println(a1.lastIndexOf(13));
	  System.out.println(a1.toString());
	  System.out.println(a1.subList(1, 5).add(42));
	  List<Integer> a11 = a1.subList(4, 6);
	  System.out.println(a11);
	  System.out.println(a1);
	  
	  ArrayList<Integer> a2 = (ArrayList<Integer>) a1.clone();
	  
	  System.out.println(a2);

	  ArrayList<Integer> a22= new ArrayList<Integer>();
	  
	  a22.addAll(a2);
	  
	  System.out.println(a22);
      System.out.println(a22.containsAll(a2));
      //System.out.println(a22.removeAll(a2));
	  System.out.println(a22);

      System.out.println(a22.isEmpty());
      
      System.out.println(a22.retainAll(a2));
      
	 	 System.out.println(a22.equals(a2)); 
	 	 for (Integer i1 : a22) 
	 	 {
			System.out.println(i1.toString());
			  //System.out.println(i1.compareTo(i1));

		}
	 	 Collections.sort(a22);
	 	 System.out.println(a22);
	 	 
}
}
