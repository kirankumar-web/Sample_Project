package MethodsOfJava;

public class StaticMethodsWithinClass 
{
  public static void main(String[] args) 
  {
	  int a=22;
	  int b=55;
	  add(a,b);
	  sub(a,b);
	  div(a,b);
	  multi(a,b);
	  StaticMethodsOutofClass.Addition(a, b);
	  StaticMethodsOutofClass s1=new StaticMethodsOutofClass();
	  s1.multi(a, b);
	  int val1 = s1.div(a, b);
	  System.out.println(val1);
}

public static void multi(int a, int b)
{
	System.out.println(a*b);
}

public static void div(int a, int b) 
{
	System.out.println(a/b);

}

public static void sub(int a, int b) {
	System.out.println(a-b);

}

public static void add(int a, int b) {
	System.out.println(a+b);

}

}
