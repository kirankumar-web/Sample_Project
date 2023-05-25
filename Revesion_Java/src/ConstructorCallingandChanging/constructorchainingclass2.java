package ConstructorCallingandChanging;

public class constructorchainingclass2 extends constructorchainingclass1 
{
	public constructorchainingclass2() 
	{
		super(12);
		System.out.println("non parameter constructor");
	}
	int x=12;
	int y=15;
	public void m1()
	{
		System.out.println(x/y);
	}
}
