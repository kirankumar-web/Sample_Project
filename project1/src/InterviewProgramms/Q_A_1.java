package InterviewProgramms;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Q_A_1 
{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter the number :");
	  int n=sc.nextInt();
	  System.out.print("Enter 1 for sum and 2 for Product :");
	  int q=sc.nextInt();
	  int result=1;
	  
	  if (q==1)
	  {
		result= n *(n+1)/2;
	}
	  else if (q==2)
	  {
		for (int i =1; i <=n; i++) 
		{
			result *=i;
		}
	} 
	  else 
	  {
        System.out.println("invalid input");
        return;
	}
		System.out.println("Result is "+result);
	}
	  
          
}

