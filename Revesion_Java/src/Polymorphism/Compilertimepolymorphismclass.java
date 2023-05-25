package Polymorphism;

public class Compilertimepolymorphismclass
{
  public void m1(int x,int y)
  {
	  System.out.println("m1 results is"+(x+y));
  }
  public void m1(int x, int y,int z)
  {
	  System.out.println("m1 results is"+(x*y*z));

  }
  public void m1(int x, double d)
  {
	  System.out.println("m1 results is"+(x+d));

  }
}
