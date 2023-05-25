package TreeMapsDemo;


import java.util.TreeMap;

public class TreemapDemo
{
  public static void main(String[] args) 
  {
	  TreeMap<String, Integer> num=new TreeMap<>();
	  num.put("one", 2);
	  num.put("two", 4);
	  num.put("three", 6);
	  num.put("four", 8);
	  num.put("five", 10);
	  num.put("six", 12);
	  System.out.println(num);
	  
	  num.putIfAbsent("seven", 14);
	  System.out.println(num);
	  
	  System.out.println(num.containsKey("six"));
	  System.out.println(num.containsValue(12));
	  num.remove("two");
	  num.remove("one", 2);
	  System.out.println(num);
	  num.replace("five", 2);
	  num.replace("four", 8, 4);
	  System.out.println(num);
	  System.out.println(num.keySet());
	  System.out.println(num.values());
	  System.out.println(num.entrySet());
	  Integer c1 = num.compute("five", (key,value)-> value+value*2);
	  System.out.println(c1);
	  Integer c2 = num.computeIfPresent("four",(key,value)-> value+value*2);
	  System.out.println(c2);
	  num.computeIfAbsent("two", (value)-> 22);
	  System.out.println(num);
	  
      num.merge("two", 2, (oldValue, newValue)-> oldValue+newValue);
      System.out.println(num);
      System.out.println(num.get("two"));
      System.out.println(num.getOrDefault("four", 15));
      System.out.println(num.hashCode());
      System.out.println(num.size());
      
	  System.out.println(num.isEmpty());
	  TreeMap<String, Integer> num2 = (TreeMap<String, Integer>) num.clone();
	  num2.replaceAll((key,value)-> value+2);
	  //num2.clear();
	  System.out.println(num2);
	  
	  System.out.println(num.firstKey());
	  System.out.println(num.lastKey());
	  System.out.println(num.firstEntry());
	  System.out.println(num.lastEntry());
	  System.out.println(num);
	  System.out.println(num.higherKey("four"));
      System.out.println(num.lowerKey("seven"));
	  System.out.println(num.higherEntry("three"));
//	  System.out.println(num.firstKey());
//	  Systeem.out.println(num.firstKey());
//	  System.out.println(num.firstKey());
       System.out.println(num.subMap("four", "three"));
      
       
      
      
	  }
    
}