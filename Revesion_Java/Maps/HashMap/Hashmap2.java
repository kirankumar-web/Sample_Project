package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import ArrayList.Arraylist_Demo;

public class Hashmap2 
{
   public static void main(String[] args) 
   {
	 HashMap<Integer, Integer> hm1=new HashMap<>();
	 hm1.put(1, 111);
	 hm1.put(2, 222);
	 hm1.put(3, 333);
	 hm1.put(4, 444);
	 hm1.put(5, 555);
	 hm1.put(6, 666);
	 hm1.put(7, 777);
	 
	 System.out.println(hm1);
	 hm1.put(3, 350);
	 System.out.println(hm1);
	 System.out.println(hm1.replace(3, 333));
	 System.out.println(hm1);
	 
	 hm1.compute(2, (key,value)-> value+value);
	 hm1.compute(3, (key,value)-> value-111);
	 hm1.computeIfAbsent(8, value->400);
	 System.out.println(hm1);
	 
	 String[] a1= {"abc","bcd","def"};
	 int[] a22= {12,14,16,18,22};
	 ArrayList a11=new ArrayList<>(Arrays.asList(a1));
	 for (int i = 0; i < a22.length; i++) 
	 {
	    a11.add(a22[i]);
	}
	 LinkedList l1=new LinkedList<>(Arrays.asList(a22));
	 System.out.println(l1.toArray());
	 System.out.println(a11);
	 
	 String s1="DEEEP";
	 String op="";

	 for(int i=0;i<s1.length();i++)
	 {
	 char c=s1.charAt(i);
     {
	 if(c=='D' || c=='P')
	 {
	    op +=c;
	 }
     }
	 }

	 System.out.println(op);
	 
	  
	 {
		
	}

	 HashMap<Integer, Integer> h1 = new HashMap<>();

	 h1.put(1, 101);
	 h1.put(2, 151);
	 h1.put(3, 131);
	 h1.put(5, 191);
	 h1.put(4, 1001);
	 h1.put(7, 251);
	 h1.put(8, 331);
	 h1.put(9, 1);

	 int maxKey = Integer.MIN_VALUE;
	 int maxValue = Integer.MIN_VALUE;

	 for (Map.Entry<Integer, Integer> entry : h1.entrySet()) {
	     int key = entry.getKey();
	     int value = entry.getValue();
	     
	     if (key > maxKey) {
	         maxKey = key;
	     }
	     
	     if (value > maxValue) {
	         maxValue = value;
	     }
	 }

	 System.out.println("The greatest key in the map is: " + maxKey);
	 System.out.println("The greatest value in the map is: " + maxValue);

}
}
