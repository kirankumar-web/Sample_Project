package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo 
{
 public static void main(String[] args) throws InterruptedException 
 {
	HashMap<String, Integer> hm1=new HashMap<>();
	
	hm1.put("abc", 123);
	hm1.put("bcd", 345);
	hm1.put("def", 567);
	hm1.put("efg", 897);
	hm1.put("ghi", 654);
	hm1.put("hij", 543);
	
	System.out.println(hm1);
	HashMap< String, Integer> hm2=new HashMap<>();
	hm2.putAll(hm1);
	System.out.println(hm2);
	System.out.println(hm1.equals(hm2));
	hm1.clear();
	System.out.println(hm1);
	System.out.println(hm1.isEmpty());
	System.out.println(hm1.size());
	System.out.println(hm2.size());
	Object hm3 = hm2.clone();
	System.out.println(hm3);
	
	hm1.putAll(hm2);
	System.out.println(hm1);
	hm1.compute("abc", (key, value)-> value+value*1);
	hm1.computeIfPresent("def", (key, value)-> value-value/2);
	hm1.computeIfAbsent("abcd", value-> 444);
	System.out.println(hm1);
	
	System.out.println(hm1.containsKey("abcd"));
	System.out.println(hm1.containsValue(444));
    
	System.out.println(hm1.entrySet());
	System.out.println(hm1.keySet());
	System.out.println(hm1.values());
	
     System.out.println(hm1.get("abcd"));
     System.out.println(hm1.get("def"));
     
     System.out.println(hm1.getOrDefault("abcd", 234));
     System.out.println(hm1.getOrDefault("abc", 212));
     
     System.out.println(hm1.hashCode());
     
     Set<Entry<String, Integer>> a1 = hm1.entrySet();
     for (Entry<String, Integer> entry : a1)
     {
		System.out.print(entry.getKey()+" ");
		System.out.print(entry.getValue()+" ");
	}
	System.out.println();
	
	hm1.merge("abcd", 123, (oldvalue,newvalue)-> oldvalue-newvalue);
	hm1.merge("bcd", 111, (oldvalue,newvalue)-> oldvalue+newvalue);
	System.out.println(hm1);
	
	hm1.remove("bcd");
	hm1.remove("abcd", 321);
	System.out.println(hm1);
	hm1.replace("def", 300);
	hm1.replace("hij", 543, 555);
	System.out.println(hm1);
	
	String s1 = hm1.toString();
	System.out.println(s1);
	
	Object[] arr = hm1.entrySet().toArray();
	for (int i = 0; i < arr.length; i++) 
	{
		if (hm1.containsValue(400))
		{
			System.out.println(arr[i]);
		}
	}
	
		

			
 }
}
