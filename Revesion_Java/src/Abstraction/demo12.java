package Abstraction;

import java.util.HashMap;
import java.util.TreeMap;

public class demo12 
{
   

public static void main(String[] args)
   {
	HashMap<String, String> h1=new HashMap<>();
	h1.put("name","kiran");
	h1.put("gender", "male");
	h1.put("place", "banglore");
	
	System.out.println(h1);
	 for (String h1k : h1.keySet()) 
	 {
		System.out.println(h1k);
	}
	for (String h2v : h1.values()) {
		System.out.println(h2v);
	}
    TreeMap< String, String> t1=new TreeMap<>();
      t1.put("name","kiran");
      t1.put("gender", "male");
      t1.put("location","banglore");
      System.out.println(t1.firstEntry());
      System.out.println(t1);
     for (String T1k :t1.keySet())
     {
		System.out.println(T1k);
	}
 	HashMap<String, Integer> h12=new HashMap<>();
 	h12.put("swift",700000);
 	h12.put("benz",9000000);
 	h12.put("celereo",600000);
 	h12.put("tata",7500000);
 	h12.put("altoz",550000);

 	System.out.println(h12);
 	
 	h12.compute("swift",(key,value)-> value+200000);
 	h12.merge("altoz", 50000, (oldValue,newValue)-> oldValue+newValue);
 	System.out.println(h12);
 	

   }
   

     
}