package project1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class test {

	public static void main(String[] args) {
     int a=1;
     int b=2;
     System.out.println(a+b);
     
     int[]a1= {11,15,33,45,17,19,24,25,66};
     System.out.println(a1);
     System.out.println(Arrays.toString(a1));
     
     for (int i =a1.length-1; i>=0; i--) 
     {
		System.out.print(a1[i]+",");
	}
     System.out.println();
     //printing the given string in a reversal of words
     String s1="yeddula venkata kirankumar yadav";
     String rev="";
     String[] a12 = s1.split(" ");
     System.out.println(a12.length);
     for (int i =a12.length-1; i>=0; --i) 
     
		rev = rev+" "+a12[i];
	
     System.out.println(rev);
     
       setofword("bread butter and bread");
     
    	
     }

	private static void setofword( String inputString)
	{
		String[] words = inputString.split(" "); 
		System.out.println(Arrays.toString(words));
        HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
        System.out.println(wordCount);
        for (String word : words)
        { 
            if(wordCount.containsKey(word.toLowerCase()))
            { 
                wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase())+1);
            }
            else
            {
                wordCount.put(word.toLowerCase(), 1);
            }
        }
        System.out.println(wordCount);
        Set<String> wordsInString = wordCount.keySet(); 
        for (String word : wordsInString)
        { 
            if(wordCount.get(word) > 1)
            { 
                System.out.println(word+" : "+wordCount.get(word));
            }
        }   
	}
}
