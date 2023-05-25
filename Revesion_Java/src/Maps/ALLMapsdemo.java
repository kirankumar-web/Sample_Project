package Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ALLMapsdemo {

	public static <E> void main(String[] args) 
	{
      HashMap<String,Integer> marks=new HashMap<>();
      marks.put("Flangs", 87);
      marks.put("slang", 77);
      marks.put("Maths", 70);
      marks.put("English",66);
      marks.put("Pscience", 45);
      marks.put("social", 53);
      marks.put("Escience",60);
      
      System.out.println(marks);
      marks.putIfAbsent("Nscience",40);
      marks.putIfAbsent("Zoology", 86);
      marks.putIfAbsent("Botony", 73);
      System.out.println(marks.get("Flangs"));
      System.out.println(marks.getOrDefault("social",53));
      System.out.println(marks.hashCode());
      System.out.println(marks.size());
      System.out.println(marks.isEmpty());
      System.out.println(marks.containsKey("Maths"));
      System.out.println(marks.containsValue(40));
      System.out.println(marks);
      System.out.println(marks.keySet());
      System.out.println(marks.values());
      System.out.println(marks.entrySet());
      marks.replace("Nscience", 45);
      marks.replace("social", 53, 55);
      marks.replaceAll((key,value)-> value+5);
      System.out.println(marks);

      Integer s1 = marks.compute("social", (key, value)-> value-7);
     Integer s2 = marks.computeIfPresent("Maths", (key,value)-> value-3);
      Integer s3 = marks.computeIfAbsent("commerces", (value)->82);
     Integer m1 = marks.merge("Pscience", 5, (oldValue,newValue)-> oldValue+newValue);
      marks.remove("Zoology");
      marks.remove("Botony", 78);
     System.out.println(m1);

      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);      
      System.out.println(marks);
      Set<Entry<String, Integer>> ms1 = marks.entrySet();
      Iterator<Entry<String, Integer>> itr= ms1.iterator();
       while (itr.hasNext()) 
       {
		Entry<String, Integer> i1 = itr.next();
		System.out.println(i1.getKey()+";"+i1.getValue());
		if (i1.getValue()>=90) 
		{
			System.out.println(i1.getKey()+";"+i1.getValue());

		}
	}
      LinkedHashMap<String, Integer> marks2=new LinkedHashMap<String, Integer>();
      marks2.putAll(marks);
      marks2.replaceAll((key,value)-> value-8);
      System.out.println(marks2);
      System.out.println(marks2.equals(marks));
      for (Entry<String, Integer> ss : marks.entrySet())
      {
    	 if (ss.getKey().contains("s")) {
    			System.out.println(ss.getKey());
        }
	}
      for (Entry<String, Integer> ss1 : marks2.entrySet()) 
      {
     	 if (ss1.getValue()>=40) 
     	 {
 			System.out.println(ss1.getValue());
 		}
 	} 
      marks2.forEach((key,value)-> {
    	  value=value-value*10/100;
    	  System.out.println(key +":"+value);
      });

      Hashtable<Integer,Democlass>ht1=new Hashtable<>();
      
      Democlass d1=new Democlass(12, "ab", "xy", "ppp", 5);
      
      Democlass d2=new Democlass(14, "cd", "uv", "ooo", 7);
      Democlass d3=new Democlass(16, "ef", "wx", "uuu", 9);
      Democlass d4=new Democlass(18, "gh", "yz", "kkk", 11);
      Democlass d5=new Democlass(10, "jk", "mn", "lll", 13);
      
      ht1.put(11, d1);
      ht1.put(22, d2);
      ht1.put(33, d3);
      ht1.put(44, d4);
   	  ht1.put(55, d5);
   	  System.out.println(ht1.keySet());
       for (Entry<Integer, Democlass> entry : ht1.entrySet())
       {
		 Integer k1 = entry.getKey();
		 Democlass b1 = entry.getValue();
		 System.out.println(k1);
		 System.out.println(b1.id+" "+b1.name+" "+b1.author+" "+b1.quantity);
	}  
       System.out.println(ht1.size());
       System.out.println(ht1.hashCode());
       System.out.println(ht1.isEmpty());
       System.out.println(ht1.get(11));  
       
     
       
      

      
      
      
      
      
	}

}
