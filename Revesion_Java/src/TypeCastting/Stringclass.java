package TypeCastting;

import java.util.Iterator;
import java.util.Scanner;

public class Stringclass 
{
  public static void main(String[] args) {
	String s1=new String("hello");
	
	System.out.println(s1);
	
	System.out.println(s1.toString());
	System.out.println(s1.hashCode());
	String s2="world";
	System.out.println(s1.equals(s2));
	System.out.println(s1.length());
	System.out.println(s1.charAt(2));
	System.out.println(s1.lastIndexOf("l"));
	System.out.println(s1.indexOf("o"));
	System.out.println(s1.toUpperCase());
	System.out.println(s1.toLowerCase());
	System.out.println(s1.toCharArray());
	System.out.println(s1.concat("new"));
	System.out.println(s1.replace("o", "i"));
	System.out.println(s1.contains("h"));
	
	
	Scanner sc=new Scanner(System.in);
	sc.nextInt(12);
        int[] arr = { 1, 5, 7, -1, 5 };
        int sum = 6;
        getPairsCount(arr, sum);
    }
 
    // Prints number of pairs in arr[0..n-1] with sum equal
    // to 'sum'
    public static void getPairsCount(int[] arr, int sum)
    {
 
        int count = 0; // Initialize result
 
        // Consider all possible pairs and check their sums
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum)
                    count++;
 
        System.out.printf("Count of pairs is %d", count);
  
	
	
	
}
}
