package LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedhastsetDemo 
{
  public static void main(String[] args) 
  {
	LinkedHashSet lhs=new LinkedHashSet<>();
	
	lhs.add("abc");
	lhs.add(123);
	lhs.add(10.234);
	lhs.add(24.4f);
	lhs.add('a');
	lhs.add(true);
	lhs.add(null);
	lhs.add("abc");
	
	System.out.println(lhs);
	
	lhs.remove(true);
	System.out.println(lhs);
    LinkedHashSet lhs1 = (LinkedHashSet) lhs.clone();
    System.out.println(lhs1);
    lhs1.clear();
    System.out.println(lhs1);
    lhs1.addAll(lhs);
    lhs1.add("cvbn");

    System.out.println(lhs1);
    
    
    System.out.println(lhs1.retainAll(lhs));
    System.out.println(lhs);
    System.out.println(lhs1);
   lhs1.removeAll(lhs);
   System.out.println(lhs1);
   
   System.out.println(lhs.contains("abc"));
   System.out.println(lhs1.containsAll(lhs));
   
   lhs1.addAll(lhs);
   System.out.println(lhs1);
   System.out.println(lhs);
   
   System.out.println(lhs.hashCode());
   System.out.println(lhs.size());
   System.out.println(lhs1.size());
   System.out.println(lhs.isEmpty());
   
   System.out.println(lhs.equals(lhs1));
   System.out.println(lhs1.equals(lhs));
   
   System.out.println(lhs.toString().charAt(2));
   System.out.println(lhs.toString().charAt(5));
   
   
   
   
   
    
    
    
	
}
}
