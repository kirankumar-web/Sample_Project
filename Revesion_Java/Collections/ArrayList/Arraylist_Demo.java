package ArrayList;

import java.util.ArrayList;

public class Arraylist_Demo
{
  public static void main(String[] args) 
  {
    ArrayList a1= new ArrayList<>();
    
    a1.add(12);
    a1.add(15);
    a1.add("abc");
    a1.add("cgh");
    a1.add('a');
    
    System.out.println(a1);
    
    System.out.println(a1.get(3));
    System.out.println(a1.set(1, 'c'));
    
    System.out.println(a1);
    //a1.clear();
    System.out.println(a1);
    System.out.println(a1.isEmpty());
    
    ArrayList a2 = (ArrayList) a1.clone();
    System.out.println(a2);
    
    System.out.println(a2.contains(12));
    System.out.println(a2.contains(15));
    
    System.out.println(a2.containsAll(a1));
    
    System.out.println(a2.equals(a1));
    
    System.out.println(a2.hashCode());
    
    System.out.println(a2.size());
    System.out.println(a2.indexOf("abc"));
    
    System.out.println(a2.lastIndexOf("cgh"));
    
    System.out.println(a2.remove(1));
    System.out.println(a2.remove(a1));
    System.out.println(a2);

    
}
}
