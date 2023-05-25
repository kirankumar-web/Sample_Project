package InterviewProgramms;

public class StringInterviewProgramms 
{
	public static void main(String[] args) 
	{
		String str="Kiran kumar yadav";
		String[] a1=str.split(" ");
		System.out.println(a1.length);
		String rev=" ";
		for(int i=a1.length-1;i>=0;i--)
		{
		  rev= rev+" "+a1[i];
		}
		System.out.println(rev);
		
		int x=123456;
	     int rev1=0;
          while (x!=0)
          {
			rev1= rev1*10+x%10;
			x=x/10;
		}			
		System.out.println(rev1);
		
		int n=345678;
		int r1=0;
		while (n!=0)
		{
			r1=r1*10+n%10;
			n=n/10;
		}
		System.out.println(r1);
	}
     
}
