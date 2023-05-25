package project1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class JavaProgrammings 
{
	public static void main(String[] args) 
	{
		//Reverse a string
		String s="abcdefghijkl";
		char[] arr = s.toCharArray();
		for (int i =arr.length-1; i>=0; i--)
		{
		  System.out.print(arr[i]);	
		}
		System.out.println();
		StringBuilder sb=new StringBuilder(s);
		System.out.println(sb.reverse());
		StringBuffer sbf=new StringBuffer(sb);
		System.out.println(sbf.reverse());
		
		// swap two numbers without third variable
		int a=17;
		int b=26;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a value is "+ a);
		System.out.println("b value is "+ b);
		
		//To check if string contains vowels
		String ss="kirankumar";
		String ss2=" sdcfvghj";
		
		if (ss.matches(".*[aeiou]*."))
		{
		 System.out.println("true");	
		}
		System.out.println(ss2.matches(".*[aeiou]"));
		
		//To check if the given number is prime number
		//JavaProgrammings.prime(49);
		System.out.println(prime(19));
		System.out.println(prime(16));
		
		//fibonacci series
		int n1=0;
		int n2=1;
		int x=0;
		int count=15;
		while (x<count) 
		{
			System.out.print(n1 + " ");
			
			int n3 = n2+n1;
			n1=n2;
			n2=n3;
			x=x+1;
			
		}
		System.out.println();

		// To check list contains only odd number
		ArrayList<Integer> l1=new ArrayList<>();
		l1.add(2);
		l1.add(4);
		l1.add(6);
		l1.add(8);
		l1.add(3);
		l1.add(5);
		l1.add(7);
		System.out.println(l1);
		for (Integer ll1 : l1) 
		{
			if (ll1%2==1)
			{
				System.out.println(ll1);
			}
		}
       
		//Palindrome string
		String s3="abccba";
		System.out.println(s3);
		char[] a11 = s3.toCharArray();
		for (int i=a11.length-1;i>=0; i--) 
		{
		  System.out.print(a11[i]);	
		}
		String s4 = Arrays.toString(a11);
		System.out.println(s4);
		System.out.println(s3.equals(s4));
		StringBuffer ssb=new StringBuffer(s3);
		StringBuffer ssb1 = ssb.reverse();
		System.out.println(ssb.equals(ssb1));
		
		//to remove spaces from string
		String x1="  dfjhgeryf   ";
		System.out.println(x1.trim());
		
		//To sorting an array
		int[] array1= {1,3,2,-5,-7, -1};
		System.out.println(Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println(Arrays.toString(array1));
		
		//factorial of integer
		int n=5;
		int f1=1;
		for (int i = 1; i <=n; i++)
		{
			f1 = f1*i;
		}
		System.out.println(f1);
		//reverse a linked list
		LinkedList<Integer> l2=new LinkedList<>();
		l2.add(22);
		l2.add(33);
		l2.add(44);
		System.out.println(l2);
		
		LinkedList<Integer> l3 = new LinkedList<>();
		l2.descendingIterator().forEachRemaining(l3::add);
		
		System.out.println(l3);

		//To check if two arrys contains same elements
		String[] y1= {"ab","bc","cd","de"};
		String[] y2= {"ab","bc","cd","de"};
		String[] y3= {"abc","bcd","cdf","deg"};
		
		HashSet<String> h1=new HashSet<>(Arrays.asList(y1));
		HashSet<String> h2=new HashSet<>(Arrays.asList(y2));
		HashSet<String> h3=new HashSet<>(Arrays.asList(y3));
		
		for (String e1 : h2)
		{
		  System.out.print(h1.contains(e1));	
		  
		}
	    for (String e2 : h3)
	    {
		  System.out.println(h2.contains(e2));	
		}
	    
	    int[] b1= {1,2,3,5,4,7};
	    int[] b2= {11,22,33,44,77,66};
	    int[] b3= {11,22,33,44,77,66};
	    
	    ArrayList<Integer> g1=new ArrayList<>(Arrays.stream(b1).boxed().toList());
	    ArrayList<Integer> g2=new ArrayList<>(Arrays.stream(b2).boxed().toList());
	    ArrayList<Integer> g3=new ArrayList<>(Arrays.stream(b3).boxed().toList());
	    
	    for (Integer ii1 : g1)
	    {
			System.out.print(g2.contains(ii1));
		}
	    System.out.println();
        for (Integer ii2 : g3)
        {
		  System.out.println(g2.contains(ii2));	
		}	
        
        
		 //array creation
//		String[]xx= {"asc","sdf","sdc"};
//		//System.out.println(xx);
//		for (int i = 0; i < xx.length; i++)
//		{
//		  //System.out.println(xx[i]);	
//		}
       // get the sum of all elements in an integer array in Java?
		int[] z1= {23,35,45,99,88};
		int sum=0;
		for (int i : z1) 
		{
			sum +=i;
			System.out.println(i);
		}
		// to find the first,second & third largest numbers in array
		int[] q1= {12,14,16,25,33,99,66,88};
		int size = q1.length;
		Arrays.sort(q1);
		System.out.println(Arrays.toString(q1));
		int r3=q1[size-3];
		int r2=q1[size-2];
		int r1=q1[size-1];
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);

		//shuffle an array
		String[] sg= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p"};
		System.out.println(Arrays.toString(sg));
		ArrayList<String> al1=new ArrayList<>(Arrays.asList(sg));
		int len = al1.size();
		for (int i = 0; i < sg.length; i++) 
		{
			int index =new Random().nextInt(len);
			String sh1 = al1.get(index);
			System.out.println(sh1);
		}
		
		
       
	}

	private static boolean prime(int n) 
	{
      if (n==0 || n==1)
      {
		return false;
	}
      if (n==2) 
      {
	    return true;	
	}
      for (int i = 2; i <=n/2; i++) 
      {
		if (n%i==0) 
		{
			return false;
		}
	}
	return true;	
      
	}

}
