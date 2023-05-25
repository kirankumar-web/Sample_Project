package ConstructorCallingandChanging;

public class ConstructorCallingClass 
{
	//calling one constructor from another constructor with in same class by using this()
	ConstructorCallingClass()
	{
		
		System.out.println("non parmeterised constructor");
	}
	ConstructorCallingClass(int x)
	{
		this(10.123);
	  System.out.println(x);	
	}
	ConstructorCallingClass(double d)
	{
		this(10, 23.345);
		System.out.println(d);
		
	}
	ConstructorCallingClass(int x, double d)
	{
		this('a');
		System.out.println(x);
		System.out.println(d);
	}
	ConstructorCallingClass(char c)
	{
		this();
		System.out.println(c);
	}
}
