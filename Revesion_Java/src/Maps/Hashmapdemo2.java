package Maps;

import java.util.HashMap;
public class Hashmapdemo2 
{
  public static void main(String[] args)
  {
	HashMap<String, Integer> h1=new HashMap<>();
	h1.put("abc", 123);
	h1.put("bcd", 234);
	h1.put("cde", 345);
	h1.put("def", 456);
	h1.put("efg", 567);
	h1.put("fgh", 678);
	h1.put("ghi", 789);
	System.out.println(h1);
	h1.putIfAbsent("hij",890);
	System.out.println(h1);
	System.out.println(h1.size());
	System.out.println(h1.hashCode());
	h1.remove("hij");
	h1.remove("ghi", 789);
	h1.replace("efg", 5678);
	h1.replace("abc", 123, 1234);
	System.out.println(h1.containsKey("def"));
	System.out.println(h1.containsValue(1234));
	System.out.println(h1.get("efg"));
	h1.getOrDefault("abc", 123);
	System.out.println(h1.keySet());
	System.out.println(h1.values());
	System.out.println(h1.entrySet());
	System.out.println(h1);
	//h1.clear();
	System.out.println(h1.isEmpty());
	h1.compute("abc", (key,value)-> value+1234);
	h1.computeIfPresent("def",(key,value)-> value+123);
	h1.computeIfAbsent("ghi", (value)->789);
	h1.merge("cde", 123, (oldValue,newValue)-> oldValue+newValue);
	
	System.out.println(h1);
	
	HashMap<String, Integer> h2 = (HashMap<String, Integer>) h1.clone();
	System.out.println(h2);
	h2.replaceAll((key,value)-> value+12);
	System.out.println(h2);
	System.out.println(h2.equals(h1));
	
	h2.clear();
	System.out.println(h2);
	h1.entrySet();
	System.out.println(h1);


	

}
}
