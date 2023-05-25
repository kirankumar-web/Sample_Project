package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistClass2 
{
  public static void main(String[] args)
  {
    ArrayList<Integer>	a11=new ArrayList<>();
    
    a11.add(111);
    a11.add(121);
    a11.add(131);
    a11.add(141);
    a11.add(133);
    a11.add(113);
    a11.add(123);
    a11.add(143);
    a11.add(115);
    
    System.out.println(a11);
    
    ArrayList<Integer> a12=new ArrayList<>();
    a12.addAll(a11);
    System.out.println(a12);
    a12.clear();
    System.out.println(a12.isEmpty());
    
    ArrayList<Integer> a22=(ArrayList<Integer>) a11.clone();
    System.out.println(a22);
    a22.ensureCapacity(5);
    System.out.println(a22.containsAll(a11));
    System.out.println(a22.contains(133));
    
    System.out.println(a22.get(3));
    System.out.println(a22.indexOf(141));
    System.out.println(a22.size());
    a22.set(3, 151);
    a22.remove(2);
   // a22.remove(111);
    System.out.println(a22);
    Collections.sort(a22);
    System.out.println(a22);
    
    a11.removeAll(a22);
    System.out.println(a11);
    
    System.out.println(a22.subList(1, 4));
    a22.sort(Comparator.naturalOrder());
    
    System.out.println(a22);
    Object[] arr1 = a22.toArray();   
    //for (int i = 0; i < arr1.length; i++)
    for (Object arr2 : arr1) 
    {
    	//System.out.println(arr1[i]);
		System.out.println(arr2);
		
	}
    String as1 = a22.toString();
    System.out.println(as1);
    
    ArrayList<Integer>a33=(ArrayList<Integer>) a22.clone();
    System.out.println(a33);
    a33.add(161);
    a33.add(165);
    System.out.println(a33);

    a33.retainAll(a22);
    System.out.println(a33);
    a33.trimToSize();
    
    a33.removeIf((e->(e/10)==11));
    System.out.println(a33);
    
    Iterator<Integer> itr = a33.iterator();
    while (itr.hasNext()) {
    	
		Integer i1 = (Integer) itr.next();
		System.out.println(i1);
	}
    
    Iterator<Integer> itr1 = a11.iterator();
    while (itr1.hasNext()) {
		Integer i2 = (Integer) itr1.next();
		System.out.println(i2);
		
	}
    
    ArrayList<String> as=new ArrayList<>();
    as.add("xdcv");
    as.add("zscf");
    as.add("awsd");
    as.add("bngh");
    as.add("hujik");
    as.add("zsvb");
    as.add("ojkuk");
    as.add("ploj");
    
    System.out.println(as);
    
    //as.sort(Comparator.naturalOrder());
   // System.out.println(as);
    System.out.println(as.toString());
    Iterator<String> iter = as.iterator();
    while (iter.hasNext()) {
		String s1 = (String) iter.next();
		if (s1.contains("u")) 
		{
			System.out.println(s1);

		}
		else
		{
		System.out.println(s1);
		}
	}
    ListIterator<String> lt = as.listIterator();
    while (lt.hasNext()) {
		String s1 = (String) lt.next();
		System.out.println(s1);
	}
    
    ArrayList a121=new ArrayList<>();
    
   a121.add(12);
   a121.add("abc");
   a121.add("xdc");
   a121.add(10.123);
   a121.add(13);
   a121.add('a');
   
   System.out.println(a121);
   
   for (int i = 0; i < a121.size(); i++) 
   {
	   Object o1 = a121.get(i);
	   if (o1 instanceof Character) 
	   {
		System.out.println(o1);
	}
	
}
   ArrayList names=new ArrayList<>();
   names.add("hi");
   names.add("hello");
   names.add("welcome");
   names.add("to");
   names.add("new page");
    
   System.out.println(names);
   names.sort(Comparator.naturalOrder());
   System.out.println(names);
   
   ListIterator li1 = names.listIterator();
   while (li1.hasNext()) {
     System.out.println(li1.next()); 
   
	for (Object li3 : names)
	{
		if (li3.toString().contains("to"))
		{
			System.out.println(li3);

		}
	}
  
	
}
   

}
}
