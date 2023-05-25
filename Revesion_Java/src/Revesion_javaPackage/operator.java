package Revesion_javaPackage;

public class operator
{
 public static void main(String[] args)
 {
	 int a=11 ; int X=-10;
	 
	 int b=15;   int y=10;
	 boolean t=true;
	 boolean f=false;
	 //Unary Operator
	//pre increment
	int c=++a;
	//post increment
	int d=b++;
	//pre decrement
	int A=--a;
	//post decrement
	int B=--b;
//	System.out.println(++a);
//	System.out.println(++b);
//	System.out.println(a++);
//	System.out.println(b++);
//	System.out.println(c);
//	System.out.println(d);
//	System.out.println(A);
//	System.out.println(B);
//	System.out.println(~y);
//	System.out.println(~X);
//	System.out.println(!t);
//	System.out.println(!f);
	
	//Arthimetic Operators
	int xx=15;
	int yy=3;
//	System.out.println(xx+yy);
//	System.out.println(xx-yy);
//	System.out.println(xx*yy);
//	System.out.println(xx/yy);
//	System.out.println(xx%yy);
	
	//System.out.println(10*20/5+3-4*6/2);
	
	//Java Right shift operator
	
//	System.out.println(10>>2);
//	System.out.println(20>>2);
//	System.out.println(30>>3);
//	//Java Left shift operators
//	System.out.println(10<<2);
//	System.out.println(20<<3);
//	System.out.println(30<<4);
	
	//AND operator Logical && and Bitwise &
	int a1=15;
	int b1=10;
	int c1=20;
	System.out.println(a1<b1&&a1<c1);
	System.out.println(a1<b1&a1<c1);
	//AND operator Logical && vs Bitwise &
	System.out.println(a1<b1&&a1++<c1);
	System.out.println(a1<b1&a1<c1);
	// OR operator Logical || and Bitwise |
	System.out.println(a1>b1||a1<c1); 
	System.out.println(a1<b1||c1>a1); 
	System.out.println();
	System.out.println();
	
	//Java Ternary Operator
	System.out.println((a1<c1)?a1:c1);
	
    // Assignment Operator
	int x1=10;
	int y1=15;
	x1+=2;
	y1-=3;
	x1*=2;
	y1/=3;
	System.out.println(x1);
	System.out.println(y1);
	
}
}
