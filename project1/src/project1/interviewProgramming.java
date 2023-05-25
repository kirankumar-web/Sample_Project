package project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class interviewProgramming 
{
  public static void main(String[] args) 
  {
	//String reverse
	  String str="java programming";
	  System.out.println(str);
	  //using String builder
	  StringBuilder str1=new StringBuilder(str);
	  System.out.println(str1);
	  
	  str1.reverse();
	  System.out.println(str1);
	  //using String Buffer
	  StringBuffer str2=new StringBuffer(str);
	  str2.reverse();
	  System.out.println(str2);
	  // using Array
	   char[] arr1 = str.toCharArray();
	   for (int i = 0; i < arr1.length; i++)
	   {
		 System.out.print(arr1[i]);
	}
	   for (int i =arr1.length-1; i >=0; i--) 
	   {
		System.out.print(" "+arr1[i]);
	}
	   System.out.println();
	
	   
	   //Swap two number
	   int a=15;
	   int b=25;
	   System.out.println("a is "+ a +" b is "+b);
	   
	   a=a+b;//15+25=40
	   b=a-b;//40-25=15
	   a=a-b;//40-15=25
	   
	   System.out.println("a is "+ a +" b is "+b);

	   //to check if a vowel is present in a string
	   String s1="Kirankumar";
	   String s2="sdfghj";
	   
	   System.out.println(s1.toLowerCase());
	   System.out.println(s2.toUpperCase());
	   System.out.println(s1.toLowerCase().matches(".*[aeiou].*"));
	   System.out.println(s2.toLowerCase().matches(".*[aeiou].*"));
		
	   System.out.println();
		//to check if the given number is a prime number.
        int[] ar1= {23,29,31,37,16,15,14,17,19};
        
        int n=16;
        boolean f1 = false;
        for (int i = 2; i <=n/2; ++i)
        {
			if (n%i==0)
			{
				f1=true;
				break;
			}
			if (!f1) 
			{
				  System.out.println("prime number");

			}
			else
			{
				System.out.println("not an prime number");
				
			}
		}
        //check if a list of integers contains only odd numbers
        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(2);
        a1.add(4);
        a1.add(6);
        a1.add(3);
        a1.add(5);
        System.out.println(a1);
        
        for (Integer i : a1) 
        {
			if (i%2==0)
			{
				System.out.println("even");
			}
			else
			{
				System.out.println("odd");
			}
		}
        //check whether a string is a palindrome
       
        String str11 = "abccbaef", 
        rstr = "";
        
        int strLength = str11.length();

        for (int i = (strLength - 1); i >=0; --i) {
          rstr = rstr + str11.charAt(i);
        }

        if (str11.toLowerCase().equals(rstr.toLowerCase())) {
          System.out.println(str11 + " is a Palindrome String.");
        }
        else {
          System.out.println(str11 + " is not a Palindrome String.");
        }
        
        String ss="abcdeffedcba";//abcdeffedcba
        
        StringBuffer ss1=new StringBuffer(ss);
        StringBuffer ss2 = ss1.reverse();
        System.out.println(ss2);
        
        if (ss1.equals(ss2)) 
        {
			System.out.println("its a palindrome");
		}
        
        //How do you remove spaces from a string in Java
        String b1="  abcdef   ";
        System.out.println(b1);
        System.out.println(b1.replaceAll("\\s", ""));
        System.out.println(b1.trim());
        
        //remove leading and trailing spaces from a string in Java
        String s="  sbc def\t";
        System.out.println(s);
        System.out.println(s.strip());
        
        //How do you sort an array in Java
        int[] arr= {1,2,3,-3,-2,-1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
      String s11="kiran kumar yadav";
      String rev="";
      String[] s12 = s11.split(" ");
      for (int i= s12.length-1; i>=0; i--)
      {
		rev =rev+" "+s12[i];
	}
      System.out.println(rev);
      String rev1="";
      char[] ar11 = s11.toCharArray();
      for (int i =ar11.length-1;i>=0; i--) 
      {
		rev1=rev1+ar11[i];
	}
      System.out.println(rev1);
  }
  
       
}
  
