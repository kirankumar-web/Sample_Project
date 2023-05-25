package MethodsOfJava;

public class AcessingStaticMember_methods
{
  public static void main(String[] args) 
  {
	int x=10;
	int y=15;
	m1(x, y);
	m2(x,y);
  }

public static void m2(int x, int y) {
	System.out.println(x+y);
}

public static void m1(int x, int y) 
{
	System.out.println(x*y);
}
  
}
