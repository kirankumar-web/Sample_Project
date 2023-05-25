package HashSet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo
{
 public static void main(String[] args)
 {
	 HashSet<Integer> hs1=new HashSet<>();
	 
	 hs1.add(76);
	 hs1.add(17);
	 hs1.add(23);
	 hs1.add(89);
	 hs1.add(52);
	 hs1.add(14);
	 hs1.add(36);
	 hs1.add(11);
	 
	 System.out.println(hs1);
	 
	 Iterator<Integer> itr1 = hs1.iterator();
	 while (itr1.hasNext()) 
	 {
		Integer i1 = (Integer) itr1.next();
		if (i1>=20) {
		System.out.println(i1);
		}
		
	}
	 
	 HashSet<Integer> hs2=new HashSet<>();
	 
	 hs2.addAll(hs1);
	 System.out.println(hs2);
	 hs2.add(44);
	 hs2.remove(14);
	 System.out.println(hs2);
	 
	 hs2.retainAll(hs1);
	 System.out.println(hs2);
	 
	 System.out.println(hs2.size());
	 System.out.println(hs2.toArray());
	 System.out.println(hs2.toString());
	 System.out.println(hs2.contains(17));
	 
	 System.out.println(hs2.containsAll(hs1));
	 System.out.println(hs2.hashCode());
	 HashSet<Integer> hs3 = (HashSet<Integer>) hs2.clone();
	 System.out.println(hs3);
	 
	 hs3.removeAll(hs1);
	 hs3.clear();
	 System.out.println(hs3.isEmpty());
     System.out.println(hs3);
     
     for (Integer ii1 : hs2) 
     {
		System.out.println(ii1);
	}
     
     ArrayList<Integer> a1=new ArrayList<>(hs2);
     System.out.println(a1);
     System.out.println(a1.get(3));
     a1.sort(Comparator.naturalOrder());
     System.out.println(a1);
     
     
     HashSet<Integer> hs4=new HashSet<>();
     hs4.add(143);
     hs4.add(257);
     hs4.add(975);
     hs4.add(469);
     hs4.add(732);
     hs4.add(375);
     hs4.add(548);
     
     System.out.println(hs4);
     
     hs4.addAll(hs1);
     System.out.println(hs4);
     
     Iterator<Integer> itr = hs4.iterator();
     while (itr.hasNext())
     {
		Integer int1 = (Integer) itr.next();
		System.out.print(int1);
		System.out.print(",");
	}
     System.out.println();
     hs4.remove(143);
     hs4.retainAll(hs1);
     System.out.println(hs4);
     hs4.removeAll(hs1);
    System.out.println(hs4);
     
     hs4.add(548);
     hs4.add(469);
     hs4.add(null);
     
    System.out.println(hs4);
     
     //hs4.retainAll(hs1);
     //System.out.println(hs4);
     
     System.out.println(hs4);
     
     
     
     
     
     
     
	 
	 
	 
	 
	 
	 
	 

	 
	 
	 
	 
	
}
}
