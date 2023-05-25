package project1;

import java.util.Arrays;
import java.util.Iterator;

public class Test3 {

	public static void main(String[] args)
	{
      int[] arr1= {12,13,15,17,19,22,35,66};
      int min=arr1[0];
      int max=0;
      for (int i = 0; i < arr1.length; i++) 
      {
		if (arr1[i]>max)
		{
		   max= arr1[i];	
		}
		if (arr1[i]<min)
		{
		   min= arr1[i];	
		}
		
	}
      System.out.println(max);
	  System.out.println(min);
	  
		String s1="abcde fgbsa efse";
        int count;
		char[] a1 = s1.toCharArray();
		for (int i = 0; i < a1.length; i++) 
		{
			count=1;
			for (int j = i+1; j < a1.length; j++) 
			{
			  if (a1[i]==a1[j] && a1[i]!=' ')
			  {
				count++;
				a1[j]='0';
			}	
			}
			if (count>1 && a1[i]!='0')
			{
				System.out.println(a1[i]);
			}
		}
	    String s2= "java is java and java";
	    String[] a2 = s2.split(" ");
	    int count1;
	    for (int i = 0; i < a2.length; i++) 
	    {
			count=1;
			for (int j = i+1; j < a2.length; j++) 
			{
				if (a2[i].equals(a2[j]))
				{
					count++;
				}
				a2[j]="0";
			}
			if (count>1 && a2[i]!="0")
		    {
				System.out.println(a2[i]);
			}
		
		}
	    
	    String input1="Race";
	    String input2="Care";
	   // String str2="sfedbac";
	    input1=input1.toLowerCase();
	    input2=input1.toLowerCase();
	    if (input1.length()==input2.length())
	    {
			char[] ca1 = input1.toCharArray();
			char[] ca2 = input2.toCharArray();
			
			boolean result = Arrays.equals(ca1, ca2);
			System.out.println(result);
			if (result) 
			{
				System.out.println(input1+" and "+input2+" are anagrams");
			}
			else
			{
				System.out.println(input1+"and"+input2+" are not anagrams");

			}

		}
	    
	}
	
	

}
