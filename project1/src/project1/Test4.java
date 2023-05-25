package project1;

public class Test4 
{
  public static void main(String[] args) 
  {
	 int n=98765432;
	 int rev=0;
	 while (n!=0)
	 {
		int d=n%10;
		rev=rev*10+d;
		n =n/10;
	}
     System.out.println(rev);	 
}
}
