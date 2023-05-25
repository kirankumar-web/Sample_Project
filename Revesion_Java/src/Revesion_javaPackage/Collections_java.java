package Revesion_javaPackage;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Collections_java
{
  public static void main(String[] args)
  {
     ArrayList<Object> a1 = new ArrayList<>();
     //Add the objects into collection
    a1.add(10);
    a1.add(12);
    a1.add('a');
    a1.add(22);
    a1.add(56);
    a1.add(73);
    a1.add("ABC");
    System.out.println(a1);
    ArrayList<Object> a2=new ArrayList<>();
    a2.add(15);
    a2.add('B');
    a2.add("BCD"); 
    System.out.println(a2);
    // add one collection to another collection
    a1.addAll(a2);
    System.out.println(a1);
    // to delete all the elements of invoking collection except the specified collection  
   // a1.retainAll(a2);
    //System.out.println(a1);
    
//    //Remove specific integer position from the collection
//    a1.remove(2);
//    a1.remove(4);
//    //Remove specific  object from the collection
//    a1.remove("ABC");
//   System.out.println(a1);
//   // Remove one collection objects into another collection
//   System.out.println(a1.removeAll(a2));
//   System.out.println(a1);
   // to get the size of the collection
    System.out.println(a1.size());
    System.out.println(a2.size());
    //to clear the elements from the collections
//    a1.clear();
//    a2.clear();
//    System.out.println(a1);
//    System.out.println(a2);
    // to search the element in the collection
     System.out.println(a1.contains(10));
     //to serach specified collection elements in the collection
     System.out.println(a1.containsAll(a2));
     
     System.out.println(a1.iterator());
     System.out.println(a1);
     
     System.out.println(a1.get(2));
     //System.out.println(a1.indexOf(5));
     System.out.println(a1.isEmpty());
     System.out.println(a1.toArray().length);
     
     
     
    
    
    
}
}
