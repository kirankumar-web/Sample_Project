package Revesion_javaPackage;

public class ControlStatement_Switch 
{
  public static void main(String[] args) 
  {
	int a=10;
	int b=20;
	int c=30;
	int num=2;
	switch (num)
	{
	case 1:
		System.out.println("sum="+(a+b+c));
		break;
	case 2:
		System.out.println("sub="+(a-b-c));
		break;
	case 3:
		System.out.println("multiple="+(a*b*c));
		break;
	case 4:
		System.out.println("percentage="+(a%b%c));
		break;
	

	default:
		System.out.println("invalid choice");
		break;
	}
	
}
}

//if (a>b && a>c) 
//{
//	System.out.println("integer a is greater the value is "+a);
//}
//else if (b>a && b>c) 
//{
//	System.out.println("integer b is greater the value is "+b);
//}
//else if (c>a && c>b)
//{
//	System.out.println("integer c is greater the value is "+c);
//
//}
//else 
//{
//	System.out.println("All are equal");
//
//}
