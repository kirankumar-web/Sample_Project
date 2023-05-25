package Maps;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashmapdemo 
{
	//public static void main(String[] args)
	public LinkedHashMap<String, String> mapdemo()
  {
	 LinkedHashMap<String, String> lh1=new LinkedHashMap<>();
	lh1.put("ab", "ABCD");
	lh1.put("bc", "BCDE");
	lh1.put("cd", "CDEF");
	lh1.put("de", "DEFG");
	lh1.put("ef", "EFGH");
	lh1.put("fg", "FGHI");
	lh1.put("gh", "GHIJ");
	
	System.out.println(lh1);
//	System.out.println(lh1.keySet());
//	System.out.println(lh1.values());
//	System.out.println(lh1.entrySet());
//	for (Entry<String, String> lhm1 : lh1.entrySet()) 
//	{
//		
//		System.out.println(lhm1.getKey());
//		System.out.println(lhm1.getValue());
//	}
//	System.out.println(lh1.size());
//	System.out.println(lh1.putIfAbsent("hi", "HIJK"));
//	System.out.println(lh1);
//	System.out.println(lh1.isEmpty());
//	System.out.println(lh1.remove("hi"));
//	System.out.println(lh1);
//	lh1.remove("ab");
//	lh1.remove("bc", "BCDE");
//	
//	System.out.println(lh1);
//	
//	System.out.println();
	
	lh1.putIfAbsent("lk", "MNOP");
	System.out.println(lh1);
	lh1.remove("gh");
	lh1.remove("lk","MNOP");
	System.out.println(lh1);
	System.out.println(lh1.keySet());
	System.out.println(lh1.values());
	System.out.println(lh1.containsKey("ab"));
	System.out.println(lh1.containsValue("CDEF"));
	System.out.println(lh1.isEmpty());
	System.out.println(lh1.hashCode());
	System.out.println(lh1.size());
	System.out.println(lh1.get("ef"));
	System.out.println(lh1.entrySet());
	System.out.println(lh1.replace("bc", "CYTUG"));
	System.out.println(lh1.replace("cd", "CDEF", "JUKIJ"));
	String c1 = lh1.compute("de", (key, value)-> value+"de");
	System.out.println(c1);
	String c2 = lh1.computeIfPresent("ef",(key,value)-> value+"Eg");
	System.out.println(c2);
	String c3 = lh1.computeIfAbsent("gh",(value)-> "gthy");
	System.out.println(c3);
	String m1 = lh1.merge("fg", "ASW", (oldValue,newValue)-> oldValue+newValue);
	System.out.println(m1);
    String m2 = lh1.merge("gh", m1, (oldValue,newValue)-> oldValue+newValue);
	System.out.println(m2);

	System.out.println(lh1);
	
	LinkedHashMap<String, String> lh2=new LinkedHashMap<>();
	lh2.putAll(lh1);
	System.out.println(lh2);
	
	System.out.println(lh2.equals(lh1));
      lh2.replaceAll((key,value)-> value.toLowerCase());
      String g1 = lh2.getOrDefault("gh", "fvhfgvfghvbdfvgbf");
    	System.out.println(g1);
    	
    	lh2.remove("bc");
    	lh2.remove("de", "defgde");

  	System.out.println(lh2);
  	LinkedHashMap<String, String> lh3 = (LinkedHashMap<String, String>) lh2.clone();
  	System.out.println(lh3);
  	lh3.clear();
  	System.out.println(lh3);
  	System.out.println(lh3.isEmpty());


    return lh1;






}
}
