package ConstructorCallingandChanging;

public class ThisKeywordmain 
{
  public static void main(String[] args) 
  {
	  ThisKEYWORD k1=new ThisKEYWORD(12, 13);
	  System.out.println(k1.x);
	  System.out.println(k1.y);
	  ThisKEYWORD k2=new  ThisKEYWORD(15, 22);
	  System.out.println(k2.y);
	  System.out.println(k2.x);

}
}
