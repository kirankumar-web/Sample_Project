package Maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.TreeMap;


public class TreeMapDemoClass extends LinkedHashmapdemo {

	public static  void main(String[] args) 
	{
		LinkedHashmapdemo ld=new LinkedHashmapdemo();
		//ld.mapdemo();
		HashMap<String, String> str=ld.mapdemo();
		System.out.println(str);
		System.out.println(str.isEmpty());
      TreeMap<String, Integer> t1=new TreeMap<>();
      t1.put("suresh", 77);
      t1.put("ramesh", 85);
      t1.put("jane", 91);
      t1.put("thomas", 56);
      t1.put("akhil", 62);
      t1.put("hari", 70);
      t1.put("suji", 47);
      t1.put("mani", 42);
      t1.put("giri", 35);
      
      System.out.println(t1);
      System.out.println(t1.size());
      System.out.println(t1.hashCode());
      t1.putIfAbsent("suri", 52);
      System.out.println(t1);
      System.out.println(t1.isEmpty());
      System.out.println(t1.containsKey("suji"));
      System.out.println(t1.containsValue(85));
      System.out.println(t1.keySet());
      System.out.println(t1.values());
      System.out.println(t1.entrySet());
      for (Entry<String, Integer> t12 : t1.entrySet()) 
      {
          System.out.println(t12.getKey());

          System.out.println(t12.getValue());

	}
      TreeMap<String, Integer> t2 = (TreeMap<String, Integer>) t1.clone();
      t1.remove("giri");
      t1.remove("suri", 52);
      t1.replace("akhil", 65);
      t1.replace("mani", 42, 45);
      //t1.replaceAll((key,value)-> key.);
      System.out.println(t1);
     System.out.println(t1.get("suresh"));
     System.out.println(t1.getOrDefault("akhil",62));
     System.out.println(t2);
     
     Integer j1m = t2.compute("jane", (key, value)-> value-10);
     System.out.println(j1m);
     Integer s2m = t2.computeIfPresent("suri",(key,value)-> value+7);
     Integer a2m = t2.computeIfAbsent("arvi", value-> 92);
     System.out.println(s2m);
     System.out.println(a2m);
     System.out.println(t2);
     Integer m1 = t2.merge("ramesh", 5,(oldValue,newValue)-> oldValue+newValue);
     Integer m2 = t2.merge("arvi", 2,(oldValue,newValue)-> oldValue+newValue);
     System.out.println(m1);
     System.out.println(m2);
     System.out.println(t2);
     for (Integer t2v : t2.values())
     {
    	 if (t2v>70 || t2v<50) {
        	 System.out.println(t2v);

		}
    	 
		
	}
     for (String t2s : t2.keySet())
	 {
		if (t2s.contains("sh") || t2s.contains("su"))
		{
			System.out.println(t2s);
		}
	}
     System.out.println(t1.equals(t2));
     t2.clear();
     System.out.println(t2.isEmpty());
    // t1.put(null, null);
     Hashtable<String, Integer> h1=new Hashtable<>();
     h1.putAll(t1);
     //h1.putAll(str);
     System.out.println(h1);
		System.out.println(str.isEmpty());
        Hashtable<String, String> ht1 = new Hashtable<String, String>();
        ht1.putAll(str);

        System.out.println(ht1);
     }

}
