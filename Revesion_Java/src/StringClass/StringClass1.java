package StringClass;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;

public class StringClass1 
{
  public static void main(String[] args) 
  {
    //String Creation & implementation 
	String s1="asdfghjkl";
	String s2=new String("zxcvbnm");
	
	System.out.println(s1);
	System.out.println(s2);
	
	//to get the length of the string
	System.out.println(s1.length());
	System.out.println(s2.length());
	
	//to join or add two strings
	String joint = s1.concat(s2);
	System.out.println(joint);
	
	//to compare the two strings
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(joint));
	
	//to create the string using escape
	String ex= "This is the \"String\" class.";
	System.out.println(ex);
	
	//to check the Given characters present in the string or not
	System.out.println(s1.contains("as"));
	System.out.println(s2.contains("nm"));
	
	//to substring the given String 
	System.out.println(s1.substring(4));
	System.out.println(s2.substring(5));
	System.out.println(joint.substring(2, 7));
	
	// joining the Strings
	String joinedstr = String.join("", s1,s2,joint);
	System.out.println(joinedstr);
	
	//to replace the Specific character 
	System.out.println(s1.replace('a', 'b'));
	System.out.println(s2.replace('z', 'a'));
	//to replace all the substring in to String
	System.out.println(joinedstr.replaceAll(s1, "123"));
	System.out.println(joinedstr.replaceAll(s2, "999"));
	//to replace first matching substring the Specific String in to String
	System.out.println(joint.replaceFirst(s1, "zzzzzz"));
	
	// To returns charcter present in the Specific location
	System.out.println(s1.charAt(3));
	System.out.println(s2.charAt(5));
	System.out.println(joint.charAt(7));
	System.out.println(joinedstr.charAt(9));
	
	//getBytes() is used to convert string into array of byte 
	byte[] byte1 = s1.getBytes();
	System.out.println(Arrays.toString(byte1));
	
	//getByte() with CharSet parameter
	byte[] byte2 = s2.getBytes(Charset.forName("UTF-8"));
	byte[] byte3 = s2.getBytes(Charset.forName("US-ASCII"));
	byte[] byte4=s2.getBytes(Charset.forName("UTF-16"));
	System.out.println(Arrays.toString(byte4));
	System.out.println(Arrays.toString(byte2));
	System.out.println(Arrays.toString(byte3));
	
	// getBytes() With to send String Parameter
	try
	{
	byte[] b1 = joint.getBytes("UTF-8");
    byte[] b2 = joinedstr.getBytes("UTF-16");
	
    System.out.println(Arrays.toString(b1));
    System.out.println(Arrays.toString(b2));
	
	}
	catch (Exception e) 
	{
		System.out.println(e.getMessage());
	}
	
	// to returns the position of the specified character in the string
	System.out.println(s1.indexOf('s'));
	System.out.println(s2.indexOf('v'));
	System.out.println(joint.indexOf('l'));
	System.out.println(joinedstr.indexOf('m'));
	//to return the specific string position
	System.out.println(joinedstr.indexOf("zxcvbnm"));
	//to return the specific char position in the given location
	System.out.println(joinedstr.indexOf('c', 3));
	System.out.println(joinedstr.indexOf(s1, 2));
	
	//To compare the given string into specific string
	System.out.println(s1.compareTo(s2));
	System.out.println(s2.compareTo(joint));
	System.out.println(joint.compareTo(joinedstr));
	System.out.println(joinedstr.compareTo(s2));
	System.out.println(joint.compareTo(joint));
	
	if (s1.compareTo(s2)==0)
	{
		System.out.println("both are equal");
	}
	else
	{
		System.out.println("both are not equal");
	}
	// to compareignore of given string into specific string
	System.out.println(s1.compareToIgnoreCase(s2));
	System.out.println(s2.compareToIgnoreCase(joinedstr));
	System.out.println(s2.compareToIgnoreCase(joint));
	System.out.println(joinedstr.compareToIgnoreCase(joint));
	
	if (s2.compareToIgnoreCase(joinedstr)==0)
	{
		System.out.println("both are same");
	}
	else
	{
		System.out.println("both are not same");
	}
	
	
	//trim() is used remove starting and Ending space of string
	System.out.println(s1.trim());
	System.out.println(s2.trim());
    
	//The format() is used returns a formated string based on the argument passed
	String forstr = String.format("language: %s", s1);
	System.out.println(forstr);
		
	//Reversal of the string
	String str1="Kiran kumar Yadav";
	char[] a1 = str1.toCharArray();
	
	//System.out.println(a1);
	for (int i = a1.length-1; i>=0; i--) 
	{
		System.out.print(a1[i]);
	}
	System.out.println();

	 StringBuffer sb1=new StringBuffer();
	 sb1.append(str1);
	 sb1.reverse();
	 System.out.print(sb1);
	 System.out.println();
	
	//Split() is used to break the string into an array of string
    String[] split1 = str1.split(" ");
    
    for (String splitS : split1) {
		System.out.print(splitS + ",");
	}
	System.out.println();
	//toUppercase() is used to convert string into uppercase
    System.out.println(str1.toUpperCase());
	//toLowercase() is used to convert string into lowercase
    System.out.println(str1.toLowerCase());
    
    //returns the string representation of the specified argument
    int a=12;
    double d=12.134d;
    float f=24.5f;
    char c='a';
    //valueof() converts the specific arguement into representation of string 
    System.out.println(String.valueOf(a));
    System.out.println(String.valueOf(d));
    System.out.println(String.valueOf(f));
    System.out.println(String.valueOf(c));
    
	System.out.println(s1);
	
	//toCharArray() converts the string into a char array
	char[] ar2 = str1.toCharArray();
	for (int i = 0; i < ar2.length; i++) 
	{
		System.out.print(ar2[i]+" ");
	}
	System.out.println();
	
	//matches() is used to checks whether the string matches the given expression or not
	String r1="^k...n$";
	System.out.println("kiran".matches(r1));
	System.out.println("karan".matches(r1));
	
	//isEmpty() to checks whether a string is empty of Not
	System.out.println(s1.isEmpty());
	System.out.println(s2.isEmpty());
	System.out.println(joint.isEmpty());
	System.out.println(joinedstr.isEmpty());
	System.out.println(str1.isEmpty());
	
	//The startsWith() method checks whether the string begins with the specified string or not.
	System.out.println(s1.startsWith("asd"));
	System.out.println(s1.startsWith("zxcv"));
	System.out.println(joint.startsWith("asd"));
	System.out.println(joinedstr.startsWith("zxcv"));
	System.out.println(str1.startsWith("Kiran"));
	System.out.println(str1.startsWith("kum", 6));
	
	//The endswith() method checks whether the string ends with the specific string or not
	System.out.println(s1.endsWith("kl"));
	System.out.println(s2.endsWith("nm"));
	System.out.println(joint.endsWith("nm"));
	System.out.println(str1.endsWith("Yadav"));
	System.out.println(joinedstr.endsWith("abcdsef"));
	
	s1.intern();
	s2.intern();
	



	System.out.println();
	
	int[] arr1= {12,13,15,17,19,12,15,17};
	
	//System.out.println(arr1);
	
	for (int i = 0; i < arr1.length; i++) 
	{
		//System.out.print(arr1[i]+" ");

	}
	for (int i = 0; i < arr1.length-1; i++)
	{
		for (int j = i+1; j <arr1.length; j++) 
		{
			if (arr1[i]==arr1[j])
			{
				System.out.println(arr1[i]);
			}
		}
	}
	
	
	
	
	
	
	
	

}
}
