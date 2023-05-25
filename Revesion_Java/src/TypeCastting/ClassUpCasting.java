package TypeCastting;

public class ClassUpCasting 
{
  public static void main(String[] args)
  {
	  Upcastingclasstwo uc2=new Upcastingclasstwo();
	  uc2.m1();
	  uc2.m2();
	  UpcastingClassone uc1=new UpcastingClassone();
	  uc1.m1();
	  //implicite upcasting
	  UpcastingClassone uc=new Upcastingclasstwo();
	  uc.m1();
	  //explicite up-scasting
	  UpcastingClassone u1=(UpcastingClassone)new Upcastingclasstwo();
	  //Explicite down-casting
	  Upcastingclasstwo u2=(Upcastingclasstwo) uc;
	  Upcastingclasstwo u3=(Upcastingclasstwo) u1;
	  u2.m1();
	  u2.m2();
	  u3.m1();
	  u3.m2();
	  
	
}
}
