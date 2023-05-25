package project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class demo123 
{
   public static void main(String[] args) 
   {
	  HashSet<Integer> hs=new HashSet<Integer>();
	  
	  hs.add(123);
	  hs.add(345);
	  hs.add(456);
	  hs.add(567);
	  System.out.println(hs);
	  
	  hs.add(345);
	  hs.add(567);
	  
	  System.out.println(hs);
	  
	  hs.add(null);
	  hs.add(null);
	  System.out.println(hs);
	  
	  String s= "Kiran kumar yadav";
	  String rev="";
	  String[] arr = s.split(" ");
	  for (int i =arr.length-1; i>=0; i--) 
	  {
	    rev= rev+" "+arr[i];	
	}
	  System.out.println(rev);
	 
	  int[] a1= {11,22,33,44,55,66,88,99};
	  System.out.println(a1.length);
	  System.out.println(Arrays.toString(a1));
	  for (int i = 0; i < a1.length; i++)
	  {
	   System.out.print(a1[i]+" ");	
	}
	  System.out.println();
	  int sum=0;
	  for (int i = 0; i < a1.length; i++) 
	  {
		sum= sum+a1[i];
	}
	  System.out.println(sum);
	 int sum1=0;
	 int len=a1.length;
	 for (int i = 0; i <len; i++)
	 {
		sum1= sum1+a1[i];
	}
	 System.out.println(sum1/len);
	 
	 int Ecount = 0;
	 int Ocount = 0;
	 for (int i = 0; i < a1.length; i++)
	 {
		if (a1[i]%2==0)
		{
			Ecount++;
		}
		if (a1[i]%2!=0)
		{
		   Ocount++;	
		}
	}
	 System.out.println(Ecount);
	 System.out.println(Ocount);
	 int[] Enum=new int[a1.length];
	 int[] ONum=new int[a1.length];
	 for (int i = 0; i <a1.length; i++) 
	 {
		if (a1[i]%2==0)
		{
			Enum[Ecount]= a1[i];
			Ecount++;
		}
		else
		{
			ONum[Ocount]=a1[i];
			Ocount++;
		}
	}
	 System.out.println("Even Numbers are "+Arrays.toString(Enum));
	 System.out.println("qdd Numbers are "+Arrays.toString(ONum));
	 for (int i = 0; i < a1.length; i++)
	 {
		if (a1[i]%2==0) 
		{
			System.out.println("Even number "+a1[i]);
		} else 
		{
			System.out.println("odd number "+a1[i]);

		}
	}
	 //max & min of array
	 int max=0;
	 int min=a1[0];
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
	 int EvenSum = 0, OddSum = 0;
	 for (int i = 0; i < a1.length; i++)
	 {
		if (a1[i]%2==0)
		{
			EvenSum= EvenSum+a1[i];
		}
		if (a1[i]%2!=0) 
		{
			OddSum= OddSum+a1[i];

		}
	}
	 System.out.println(EvenSum);
	 System.out.println(OddSum);
	 int[] Eadd=new int[a1.length];
     ArrayList<Integer> al=new ArrayList<>();
     for (int i = 0; i < a1.length; i++) 
     {
		if (a1[i]%2==0)
		{
		  al.add(a1[i]);
		  Eadd[i]= a1[i];
		}
	}
     System.out.println(al);
     Object[] a12 = al.toArray();
    System.out.println(Arrays.toString(a12));
    
    //Count positive negative and zero from Array
    int[] a10= {-2,0,1,2,-5,-7,0,3};
    int Pcount=0;
    int Ncount=0;
    int zero=0;
    for (int i = 0; i < a10.length; i++) 
    {
		if (a10[i]>0)
		{
		 Pcount++;	
		}
		if (a10[i]<0)
		{
			Ncount++;
		}
		if (a10[i]==0)
		{
			zero++;
		}
	}
    System.out.println(Pcount);System.out.println(Ncount);
    System.out.println(zero);
    int[] a11=new int[a10.length];
    for (int i = 0; i < a11.length; i++) 
    {
		if (a10[i]<0)
		{
			a11[i]=a10[i];
		}
	}
    System.out.println(Arrays.toString(a11));
}
}
