package InterviewProgramms;

public class String_programmings
{
  public static void main(String[] args) 
  {
	  //Reversal of string
	String s="hello hi";
	String r="";
	char[] c = s.toCharArray();
	for (int i =c.length-1;i>=0; i--) 
	{
		System.out.print(c[i]);
	}
	System.out.println();
	StringBuffer s1=new StringBuffer(s);
	s1=s1.reverse();
	System.out.println(s1);
	StringBuilder s2=new StringBuilder(s);
	s2=s2.reverse();
	System.out.println(s2);
	
	//Reverse word of string
	String i1="Kiran kumar yadav";
	String rev="";
	String[] a1 = i1.split(" ");
	for (int i = a1.length-1;i>=0 ;i--)
	{
		rev=rev+" "+a1[i];
	}
	System.out.println(rev);
	
	//
}
}
