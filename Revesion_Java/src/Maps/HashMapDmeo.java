package Maps;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDmeo 
{

	public static void main(String[] args) 
	 {
		HashMap<String, Integer> h1=new HashMap<String,Integer>();
		// Put method is used to add the keys and values in map
		h1.put("a",10);
		h1.put("b",11);
		h1.put("c",12);
		h1.put("d",13);
		h1.put("e",14);
		h1.put("f",15);
		h1.put("g",16);
		h1.put("h",17);
		h1.put("i",18);
		h1.put("j",19);
		h1.put("k",20);
		//print the keys & valus in the map
		System.out.println(h1);
		//print all the keys & valus separately
		for (Entry<String, Integer> hm1 : h1.entrySet()) 
		{
			//System.out.println(hm1.getKey());
			
			//System.out.println(hm1.getValue());
		}
		// print the Keys only
		for (String hm2 : h1.keySet())
		{
			//System.out.println(hm2);
		}
		//Print the valus only
		for (Integer hm3 : h1.values())
		{
			//System.out.println(hm3);
		}
		h1.forEach((key, value) -> {

		      // decrease value by 10%
		      value = value - value * 1/10;
		      System.out.print(key + "=" + value + " ");
		    });
		// map creation
		HashMap<String, Integer> h2=new HashMap<String, Integer>();
		// adding one map to another map
		h2.putAll(h1);
		System.out.println(h2);
	/* clear method use to clear the keys& values in the map
		h2.clear();
		System.out.println(h2);
	"putifAbsent() is used to add the key & value into map if not specified"
	   	h2.putIfAbsent("l", 21);
	"hashmap accepts the null vlaues"
		h2.put(null, null);
	"hashmap doesn't allow duplicate keys"
		h2.put("b", 13);
	"hashmap allow duplicates values"
		h2.put("k", 13);
		System.out.println(h2);
	"** Remove the Specific Key from the Map ** ";
		h2.remove("a");
	"** Remove the Specific Key & object from the Map ** ";
        h2.remove("c", 12);
		System.out.println(h2);
	"** Keyset method is used to retrieve the onlys keys from the Map"
		Set<String> t1 = h2.keySet();
		System.out.println(t1);
	"**Returns the all the Keys & values in a Setview "
		Set<Entry<String, Integer>> t2 = h2.entrySet();
		System.out.println(t2);*/
	//compute, computeifpresent,ifabsent methods
			//System.out.println(h2.compute("a",(key, value)-> value + value*1/1));
			//System.out.println(h2.computeIfPresent("b", (key, value)-> value+value*20/9));
			//System.out.println(h2.computeIfAbsent("x", value -> 55));
		//h2.computeIfAbsent("l", 67);
		//h2.computeIfPresent(null, null);
		System.out.println(h2);
		HashMap<Integer,Integer> h3=new HashMap<Integer,Integer>();
		h3.put(1, 99);
		h3.put(2, 98);
		h3.put(3, 97);
	//"It is used to compute a mapping for the specified key and its current mapped value "
	//To compute the mapped value to apply the condition
		int p2=h3.compute(2, (key, value) -> value + value * 100/10);
	// computeifpresent is used to available key and its value to apply condition
		int p1 = h3.computeIfPresent(1, (key, value) -> value + value * 10/100);
	//computeifabsent is used to not-available key and its value to apply condition
        int p3=h3.computeIfAbsent(4, key -> 300);
	    System.out.println(p1);
	    System.out.println(p2);
	    System.out.println(p3);
		System.out.println(h3);
	//contains key method is used to verify specific key is presented in the map or not
		System.out.println(h2.containsKey("a"));
		System.out.println(h3.containsKey(3));
	//contains value method is used to verify specific value is presented in the map or not
		System.out.println(h3.containsValue(300));
		System.out.println(h2.containsValue(20));
	//Equal method is used to compare the specific object with map
		System.out.println(h3.equals(h2));
		System.out.println(h1.equals(h2));
		System.out.println(h2.equals(h1));
	// 	It returns the value to which the specified key is mapped, or defaultValue if the map contains no mapping for the key.
        Integer t6 = h3.getOrDefault(5,78);
        System.out.println(t6);
        System.out.println(h2.getOrDefault(h1, 17));
     // hashcode() returns the hash code value for the Map
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		System.out.println(h3.hashCode());
	//	This method returns true if the map is empty; returns false if it contains at least one key
		System.out.println(h1.isEmpty());
		System.out.println(h2.isEmpty());
		System.out.println(h3.isEmpty());
	//	This method returns the number of entries in the map.
		System.out.println(h1.size());
		System.out.println(h2.size());
		System.out.println(h3.size());
	// Replace method is used to replace the specific value
        h1.replace("a", 66);
		System.out.println(h1);
		h2.replace("k", 46);
		System.out.println(h2); 
		h3.replace(3, 199);
		System.out.println(h3);
	// Merge method is used to 
		Integer merge1 = h1.merge("a", 99, (oldValue, newValue)-> oldValue+newValue);
		System.out.println(merge1);
		Integer m2 = h2.merge("j", 44, (oldValue, newValue)->oldValue+newValue);
		System.out.println(m2);
		int m3=h3.merge(5, 89, (oldValue, newValue)->oldValue+newValue);
		System.out.println(m3);
		int m4=h3.merge(5, 29, (oldValue,newValue)->oldValue-newValue);
		System.out.println(m4);
		System.out.println(h3);
	//Collection of values method is used to retrun all the values in the map
		System.out.println(h1.values());
		System.out.println(h2.values());
		System.out.println(h3.values());
	//set of Keyset method is used to retrun all the keys in the map
		System.out.println(h1.keySet());
		System.out.println(h2.keySet());
		System.out.println(h3.keySet());

        int h4=h1.compute("e",(key, value)-> value + value * 100/10);
		System.out.println(h4);
		
		
		
	}  
}
