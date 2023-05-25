package Revesion_javaPackage;

public class ControlStatements_Loops 
{
  public static void main(String[] args) 
  {
	int a=1;
	//for loop
	for (int i = 0; i <10; i++) 
	{
		System.out.println(i);
		a=a+i;
		System.out.println(a);
	}
	for (int i = 0; i <5; i++) 
	{
		for (int j = 0; j <=i; j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for (int i = 0; i <=3; i++) 
	{
		for (int j = 0; j <=3; j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	//while loop
	int b=0;
	while(b<=8)
	{
		System.out.println(b);
		b=b+2;
	}
	//Do-While loop
	int c=6;
	do {
		System.out.println("do- task execute first"); 
		c++;
	}
	while(c<=5);
			 {
		System.out.println(c);
		c=c+2;
	}
	// Jump Statements
   // break Statement
			 for (int i = 0; i <=5; i++) 
			 {
				System.out.println(i);
				if (i==4)
				{
					break;
				}
			}
			 
  }
}
