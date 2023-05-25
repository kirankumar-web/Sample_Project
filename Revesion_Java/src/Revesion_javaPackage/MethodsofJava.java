package Revesion_javaPackage;


public class MethodsofJava 
{
  public static void main(String[] args) 
  {
	int a=15;
	int b=30;
	add(a, b);
	sub(a, b);
	multi(a, b);
	divide(a, b);
	MethodsofJava m1=new MethodsofJava();
	m1.perc(a, b);
}
  //Static methods in a class calling directly by method name
  public static void add(int a, int b)
  {
	  System.out.println(a+b);
  }
  public static void sub(int b, int a)
  {
	  System.out.println(a-b);

  }
  public static void multi(int b, int a)
  {
	  System.out.println(a*b);

  }
  public static void divide(int a, int b)
  {
	  System.out.println(b/a);

  }
  // non-static method calling in class by using object instance
  public void perc(int a, int b)
  {
	  System.out.println(a%b);

  }
}
