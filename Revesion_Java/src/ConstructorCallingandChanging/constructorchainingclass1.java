package ConstructorCallingandChanging;


public class constructorchainingclass1 
{

	constructorchainingclass1(int x)
	{
		this(10.123);
		System.out.println(x);
	}
	constructorchainingclass1(double d)
	{
		this(22,134.344);
		System.out.println(d);
		
	}
	constructorchainingclass1(int x, double d)
	{
		System.out.println(x);
		System.out.println(d);
	}
}
