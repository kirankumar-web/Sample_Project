package StringClass;

public class String_demo {

	public static void main(String[] args) 
	{
      String s1="Hello world";
      //reverse string
      String rev="";
      char[] c1 = s1.toCharArray();
      for (int i =c1.length-1; i>=0; i--) 
      {
    	  System.out.print(c1[i]);

		rev= rev+c1[i];
	}
      System.out.println();
      System.out.println(rev);
      
      StringBuilder s2= new StringBuilder(s1);
      String re = s2.reverse().toString();
	  System.out.println(re);
   	  StringBuffer s3=new StringBuffer(s1);
      String rs1 = s3.reverse().toString();
      System.out.println(rs1);
    		  
     //reversal word of string
      String sr="Kiran kumar yadav";
      String[] sp1 = sr.split(" ");
      String sw1="";
      for (int i =sp1.length-1; i>=0; i--)
      {
    	  sw1=sw1+" "+sp1[i];
		}
    	System.out.println(sw1);
    	
    	// string palindrome
    	checkinpalindrome("abc");
    	checkinpalindrome("abccba");
    	checkinpalindrome("abcdeedcba");
    	//How to prove String is immutable programatically?
    	String a1="java";
    	String a2=a1;
    	System.out.println(a1==a2);
    	a1="python";
    	System.out.println(a1==a2);
    	//maximum occurring character in a given String
    	String i1="abcdba";
    	char[] ar1 = i1.toCharArray();
    	for (int i = 0; i < ar1.length; i++) 
    	{
			{
				
			}
		}
	}
	public static void checkinpalindrome(String input)
	{
		boolean result = true;
		int l1 = input.length();
		for (int i = 0; i <l1/2; i++) 
		{
		  if (input.charAt(i)!=input.charAt(l1-i-1)) 
		  {
			result=false;
			break;
		}	
		}
		System.out.println(input+" is palindrome "+result);
	}

}
