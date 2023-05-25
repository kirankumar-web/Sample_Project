package Linkedlist;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlistclass1
{
	public static void main(String[] args) {
		  LinkedList<Integer> l1=new LinkedList<>();
		  l1.add(123);
		  l1.add(321);
		  l1.add(564);
		  l1.add(159);
		  l1.add(296);
		  l1.add(479);
		  l1.add(645);
		  l1.add(379);
		  l1.add(969);
		  l1.add(505);
		  
		  l1.add(3, 766);
		  //l1.add(null);
		  l1.add(766);
		  System.out.println(l1);
		  System.out.println(l1.size());
		  System.out.println(l1.isEmpty());
		  System.out.println(l1.hashCode());
		  System.out.println(l1);

		  l1.remove(7);
          System.out.println(l1.contains(505));
          System.out.println(l1.get(4));
          System.out.println(l1.getFirst());
          System.out.println(l1.getLast());
          l1.set(3, 267);
          System.out.println(l1.indexOf(379));
          System.out.println(l1.lastIndexOf(564));
          
          l1.addFirst(699);
          l1.addLast(999);
		  System.out.println(l1);

          l1.removeFirst();
          l1.removeLast();
          
          
		 System.out.println(l1);
		  
		  
		  
		  
		  
		  
		  
		  
		  
		 /* for (Integer i1 : l1) 
		  {
			System.out.println(i1);
		}
		  Iterator<Integer> it1 = l1.iterator();
		  while (it1.hasNext()) 
		  {
			Integer int1 = (Integer) it1.next();
			System.out.println(int1);
		}*/
		  
		  l1.sort(Comparator.naturalOrder());
		  System.out.println(l1);
		  
		  ListIterator<Integer> litr1 = l1.listIterator();
		  while (litr1.hasNext()) 
		  {
			Integer integer = (Integer) litr1.next();
//			for (Integer integer2 : l1) 
//			{
//				System.out.println(integer2);
//
//			}
			System.out.println(integer);
		}
		  System.out.println(l1.peek());
	         System.out.println(l1.poll());
	          System.out.println(l1.offer(597));
	          System.out.println(l1);
	          
	          LinkedList<Integer>l2=(LinkedList<Integer>) l1.clone();
	          System.out.println(l2);
	          l2.clear();
	          System.out.println(l2);
	          System.out.println(l2.isEmpty());
	          
	          LinkedList<Integer>l3=new LinkedList<>();
	          l3.addAll(l1);
	          //l3.addAll(2, l1);
	          System.out.println(l3.size());
	          
	          System.out.println(l3);
	          
	          l3.sort(Comparator.naturalOrder());
	          System.out.println(l3);
	          l3.remove(4);
	          l3.removeFirst();
	          l3.removeLast();
	          
	          System.out.println(l3);
	          ListIterator<Integer> li1 = l3.listIterator();
	          while (li1.hasNext()) {
				Integer ii1 = (Integer) li1.next();
					System.out.println(ii1);

								
			}
	         System.out.println(l3.getFirst());
	          System.out.println(l3.getLast());
	          System.out.println(l3.peek());
	          System.out.println(l3.peekFirst());
	          System.out.println(l3.peekLast());
	          System.out.println(l3.poll());
	          System.out.println(l3.pollFirst());
	          System.out.println(l3.pollLast());
	          System.out.println(l3.offer(889));
	          System.out.println(l3.offerFirst(115));
	          System.out.println(l3.offerLast(421));
	          System.out.println(l3.pop());
	          System.out.println(l3);
	          
	          int n=345678;
	          int r=0;
	          while (n!=0)
	          {
			    int d=n%10;
			    r= r*10+d;
			    n= n/10;
			}
	          
	          System.out.println(r);
	          
	          }
  
}
