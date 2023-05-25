package StringClass;

public class Democlass 
{
  public static void main(String[] args) 
  {
	// creation of string 
	String str="abcde";
	String str1="zyxwvu";
	System.out.println(str);
	System.out.println(str1);
	// to get the string contains char at the position
	System.out.println(str.charAt(2));
	System.out.println(str1.charAt(4));
	//to add the string into string
	String str2 = str.concat(str1);
	System.out.println(str2);
	String str11 = str1.concat("ts");
	System.out.println(str11);
	//to check the specific char present in the string or not
	System.out.println(str2.contains(str1));
	System.out.println(str1.contains("zyx"));
	
	// to check the string equals to the giiven string
	System.out.println(str.contentEquals("abcde"));
	System.out.println(str1.contentEquals("zyx"));
	System.out.println(str2.contentEquals("abcd"));
	System.out.println(str11.contentEquals("ts"));


	// to get the length of the string
	System.out.println(str.length());
	System.out.println(str1.length());
	System.out.println(str2.length());
	System.out.println(str11.length());

	System.out.println(str.length());
	
	String s1 = str.replace('e', 'f');
	//str.replaceAll("", "");
	//System.out.println(str.compareTo(str2));
	//System.out.println(str.chars().toString());
	
	System.out.println(s1);
	
	System.out.println(str);
	
	

	
}
}
