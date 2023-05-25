package project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Array_intervieProgramms 
{
  public static void main(String[] args) 
  {
	int[] arr1= {1, 2, 3, 8,7,6,3,2,8,6};
	System.out.println(arr1.length);
	for (int i = 0; i < arr1.length-1; i++) 
	{
		for(int j=i+1;j<arr1.length;j++)
		{
			if(arr1[i]==arr1[j])
				System.out.println(arr1[j]);
				
		}
	}
	String[] ar2 = {"kiran","vicky","yadav","kiran","vicky"};
	System.out.println(ar2.length);
	
	for (int i = 0; i < ar2.length-1; i++) 
	{
		for (int j =i+1; j < ar2.length; j++) 
		{
			if (ar2[i]==ar2[j])
			{
				System.out.println(ar2[i]);
			}
		}
	}
	String[] ar3 = {"kiran","vicky","yadav","kiran","vicky","yadav"};
	System.out.println(ar3.length);
    for (int i = 0; i < ar3.length-1; i++)
    {
		for (int j =i+1; j < ar3.length; j++) 
		{
			if (ar3[i]==ar3[j]) 
			{
				System.out.println(ar3[i]);
				
			}
		}
	}
    
    ArrayList<Integer> a1=new ArrayList<Integer>();
    a1.add(23);
    a1.add(78);
    System.out.println(a1);
    
    //Find Length of Array in Java
    int[] arr= {11,77,33,66,99,4,56,32};
    System.out.println(arr.length);
    
    //Get Array Input in Java
    System.out.println(Arrays.toString(arr));
    for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
    for (int i : arr) 
    {
		System.out.print(i+" ");
	}
    System.out.println();
    
    //find the sum of array elements in Java.
    int n=0;
    for (int i = 0; i < arr.length; i++) 
    {
		n= n+arr[i];
	}
     System.out.println(n);
     //Find the average of an Array
     int a=0;
     for (int i = 0; i < arr.length; i++) 
     {
		a= a+arr[i];
	}
		System.out.println(a/arr.length);
		
	//Count Even and Odd numbers in an Array
		int Ecount=0;
		int Ocount=0;
     for (int i = 0; i < arr.length; i++) 
     {
		if (i%2==0)
		{
			System.out.print(arr[i]+" ");
			Ecount++;
		}
		else {
			System.out.print(arr[i]+" ");
			Ocount++;
		}
	}
     System.out.println("Even num count is "+Ecount);
     System.out.println("odd num count is "+Ocount);
	
     //Put Even and Odd Elements in 2 Separate Arrays
     int[] ar= {11,12,15,14,13,16,17,18};
     int[] EvenNum=new int[ar.length];
     int[] OddNum=new int[ar.length];
     for (int i = 0; i < ar.length; i++)
     {
		if (i%2==0)
		{
			EvenNum[Ecount]=ar[i];
			Ecount++;
		} else 
		{
			OddNum[Ocount]=ar[i];
            Ocount++;
		}
	}
     for (int i = 0; i < EvenNum.length; i++) 
     {
		System.out.print(EvenNum[i]+" ");
	}
     for (int i = 0; i < OddNum.length; i++) 
     {
		System.out.print(OddNum[i]+" ");
	}
     
     //Display Even and Odd numbers in an Array
     for (int i = 0; i < ar.length; i++) 
     {
		if (ar[i]%2==0)
		{
			System.out.println("Even numbers "+ar[i]);	
		}
     }
     for (int i = 0; i < ar.length; i++) 
     {
	   if (ar[i]%2!=0)
	   {
        System.out.println("odd numbers "+ar[i]);
	    }	
	  }
     //Sum of Even numbers and Sum of odd numbers
     int Esum=0;
     int Osum=0;
     for (int i = 0; i < ar.length; i++) 
     {
		if (ar[i]%2==0)
		{
			Esum= Esum+ar[i];
			System.out.println("Even numbers "+ar[i]);
			
		}
     }
     for (int i = 0; i < ar.length; i++) 
     {
	   if (ar[i]%2!=0)
	   {
			Osum= Osum+ar[i];

			System.out.println("odd numbers "+ar[i]);

	    }	
	  }
     System.out.println("sum of even numbers "+Esum);
     System.out.println("sum of odd numbers "+Osum);
    
     //Remove odd numbers from an array Java
     
     int[] num= {22,44,55,77,66,12,15};
     int[] Enum = new int[num.length];
     ArrayList<Integer> al1=new ArrayList<>();
     for (int i = 0; i < num.length; i++) 
     {
		if (num[i]%2==0)
		{
			al1.add(num[i]);
			Enum[i]= num[i];
		}
	}
     Object[] n1 = al1.toArray();
     System.out.println(Arrays.toString(n1));
     System.out.println(Arrays.toString(Enum));
     //System.out.println(Arrays.toString(num));

  }

}
