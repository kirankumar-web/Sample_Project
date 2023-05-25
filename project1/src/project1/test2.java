package project1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) 
	{
        HashMap<String,Integer>h11=new HashMap<>();
        h11.put("asc", 11);
        h11.put("kdn", 15);
        h11.put("dgh", 17);
        h11.put("fgf", 19);
        System.out.println(h11);
        h11.computeIfPresent("dgh",(key,value)-> value-7);
        h11.computeIfAbsent("rty", (value)->24);
        h11.replace("fgf", 19, 23);
        h11.replace("asc", 15);
        h11.replace("asc", 11, 13);
        System.out.println(h11);
        HashMap<Integer, String>h1=new HashMap<>();
        h1.put(1, "one");
        h1.put(2, "two");
        h1.put(3, "three");
        h1.put(4, "four");
        
        System.out.println(h1);
        System.out.println(h1.values());
        System.out.println(h1.keySet());

        String s1="i like java programm";
        System.out.println(s1);
        System.out.println(s1);
        
        char[] a1 = s1.toCharArray();
        
        for (int i =a1.length-1; i>=0; i--)
        {
			System.out.print(a1[i]);
		}
        System.out.println(s1.trim());
        
        System.out.println(s1.endsWith("programm"));
         int len = s1.length();
         
         String[] w1 = s1.split(" ");
         String reverse = "";
         for (int i =w1.length-1; i>=0; i--) 
         {
			reverse +=w1[i] +" ";
		}
      System.out.println(reverse.trim());
      
      String s2="kiran kumar yadav";
      String rs="";
      String[] ss = s2.split(" ");
      for (int i =ss.length-1; i>=0; i--)
      {
		 rs += ss[i]+" ";
	}
      System.out.println(rs);
      
      setofwords("java is java again java");
	}

	private static void setofwords(String instr)
	{
		String[] Splitwords = instr.split(" ");
		System.out.println(Arrays.toString(Splitwords));
		LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
		
		for (String spwords : Splitwords) 
		{
			if (lhm.containsKey(spwords.toLowerCase())) 
			{
			  lhm.put(spwords.toLowerCase(), lhm.get(spwords.toLowerCase()+1));	
			} 
			else 
			{
              lhm.put(spwords.toLowerCase(), 1);
			}
			
		}
		Set<String> Skeys = lhm.keySet();
		for (String intkeys : Skeys) 
		{
			System.out.println(intkeys);
			if (lhm.get(intkeys) >= 1) 
			{
				System.out.println(intkeys+" "+lhm.get(intkeys));
			}
		}
	}

	}


