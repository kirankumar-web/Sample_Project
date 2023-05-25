package project1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringProgramms 
{
 public static void main(String[] args) 
 {
	String s1="abcdefghijklmno";
	String rev="";
	char[] a1 = s1.toCharArray();
	for (int i =a1.length-1; i>=0; i--) 
	{
		rev= rev+a1[i];
		
	}
	System.out.println(rev);
    String s2="Kiran kumar yadav";
    String rW=" ";
    String[] spli1 = s2.split(" ");
    for (int i=spli1.length-1;i>=0; i--)
    {
		rW= rW+" "+spli1[i];
	}
    System.out.println(rW);
    
    int[] ar1= {2,4,6,5,7,12,11,9};
    int max = 0;
    int min = ar1[0];
    for (int i = 0; i < ar1.length; i++) 
    
		if (ar1[i]>max)
		{
			max=ar1[i];
		}
    for (int i = 0; i < ar1.length; i++) 

        if (ar1[i]<min) 
        {
			min=ar1[i];
		}
		System.out.println(max);
		System.out.println(min);
       String str="abcd afedfghb";
       int count;
       char[] arr = str.toCharArray();
       for (int i = 0; i < arr.length; i++) 
       {
		count=1;
		for (int j = i+1; j < arr.length; j++) 
		{
            if(arr[i] == arr[j] && arr[i]!=' ') 
            {  
				count++;
				arr[j]='0';
			}
		}
		if (count>1 && arr[i]!='0')
		{
			System.out.println(arr[i]);
		}
	}
       String str1="big pen black pen green pen";
       String[] sp1 = str1.split(" ");
       int count1;
       for (int i = 0; i < sp1.length; i++)
       {
		count1=1;
		for (int j = i+1; j < sp1.length; j++) 
		{
			if (sp1[i].equals(sp1[j]))
			{
				count1++;
				sp1[j]="0";
				
			}
		}
		if (count1>1 && sp1[i]!="0") 
		{
			System.out.print(sp1[i]+" "+count1+" ");
		}
	}
       String input = "Java is great and Java is fun";
       String[] words = input.split(" ");
       Map<String, Integer> wordCount = new HashMap<>();

       for (String word : words) {
           if (wordCount.containsKey(word)) {
               wordCount.put(word, wordCount.get(word) + 1);
           } else {
               wordCount.put(word, 1);
           }
       }

       System.out.println("Duplicate words:");
       for (String word : wordCount.keySet()) {
           if (wordCount.get(word) > 1) {
               System.out.println(word);
           }
       }
       int n1=12;
       int re=0;
       
         while(n1>0) 
       {
		int b1=n1%10;
		re=re* 10 +b1;
		n1 /=10;
	}
      System.out.println(re); 
      
      String ss="abcd";
      String ss2=ss;
}
}
