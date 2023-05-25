package project1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Question_answers
{
  public static void main(String[] args) 
  {
	 //min & max of the array
	int[] a1= {11,22,33,44,55,66,99};
	int max=0;
	int min=a1[0];
	System.out.println(Arrays.toString(a1));
	for (int i = 0; i < a1.length; i++) 
	{
		if (a1[i]>max) 
		{
			max=a1[i];

		}
		if (a1[i]<min) 
		{
			min=a1[i];
		}
	  
	}
	System.out.println(max);
	
	System.out.println(min);
	// to print duplicate characters in a string
	String s1="abcd efghi abef cgh";
	int count;
	
	char[] c1 = s1.toCharArray();
	for (int i = 0; i < c1.length; i++) 
	{
		count=1;
		for (int j =i+1; j < c1.length; j++) 
		{
			if (c1[i]==c1[j]&& c1[i]!=' ') 
			{
				count++;
				c1[j]='0';
			}
		}
		if (count>1 && c1[i]!='0') 
		{
		  System.out.print(c1[i]+" ");	
		}
	}
	//to print the string into reverse of string words
	System.out.println();
	String s11="kiran kumar yadav";
	System.out.println(s11);
	String rev ="";
	String[] str1 = s11.split(" ");
	for (int i=str1.length-1;i>=0; i--) 
	{
		rev= rev+" "+str1[i];
	}
	System.out.println(rev);
	
	//To print the string into reversal of string characters
	String str="abcdefghijklmn";
	char[] sc = str.toCharArray();
	for (int i=sc.length-1;i>=0; i--) 
	{
		System.out.print(sc[i]);
	}
	System.out.println();
	StringBuffer sb=new StringBuffer(str);
	StringBuffer sb1 = sb.reverse();
	System.out.println(sb1);
	StringBuilder sb2=new StringBuilder(str);
	StringBuilder sbl = sb2.reverse();
	System.out.println(sbl);
	
	String input="";
}
}
