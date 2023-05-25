package Linkedlist;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

import org.apache.poi.hssf.record.Margin;

public class LinkedlistClass2 
{
  public static void main(String[] args) 
  {
     LinkedList ll1=new LinkedList<>();
     ll1.add("sun");
     ll1.add(1256);
     ll1.add("moon");
     ll1.add("jupiter");
     ll1.add(67586);
     ll1.add("mercury");
     ll1.add(9856);
     ll1.add("saturn");
     
     System.out.println(ll1);
     
     //ll1.sort(Comparator.naturalOrder());
     System.out.println(ll1);
     
     ListIterator li = ll1.listIterator();
     while (li.hasNext()) {
		Object lit = (Object) li.next();
		System.out.println(lit);
		
	}
        ll1.addFirst(12675);
   		ll1.addLast("earth");
   		System.out.println(ll1);
   		System.out.println(ll1.get(3));
   		System.out.println(ll1.getFirst());
   		System.out.println(ll1.getLast());
   		
   		System.out.println(ll1.set(4, 96586));
   		
   		System.out.println(ll1);
   		
   		System.out.println(ll1.remove(4));
       
   		Linkedlistdemo ld1=new Linkedlistdemo(12, 94,"suraj", "maths",'a');
   		
   		Linkedlistdemo ld2=new Linkedlistdemo(12, 82,"vicky", "telugu",'a');
   		Linkedlistdemo ld3=new Linkedlistdemo(12, 77,"abhi", "english",'b');
   		Linkedlistdemo ld4=new Linkedlistdemo(12, 69,"anuj", "hindi",'b');
   		Linkedlistdemo ld5=new Linkedlistdemo(12, 56,"bhanu", "science",'c');
   		
   		LinkedList l2=new LinkedList<>();
   		l2.add(ld1);
   		l2.add(ld2);
   		l2.add(ld3);
   		l2.add(ld4);
   		l2.add(ld5);
   		
   		System.out.println(l2);   		
   		l2.get(3);
   		System.out.println(l2.get(4));
   		
   		ListIterator LIT = l2.listIterator();
   		while (LIT.hasNext()) {
			Object ii1 = (Object) LIT.next();
			System.out.println(ii1);
			
		}
        for (int i = 0; i < l2.size(); i++) 
        {
			Object obj = l2.get(i);
			if (obj instanceof String ) 
			{
				Linkedlistdemo demo=(Linkedlistdemo) obj;
				if (demo.name=="") 
				{
					System.out.println(demo);
	
				}				
			}
			
		}
   		

   		
     
}
}
