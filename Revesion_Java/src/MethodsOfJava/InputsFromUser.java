package MethodsOfJava;

import java.util.Scanner;

public class InputsFromUser 
{
	public static void main(String[] args) {
	// taken inputs from the user	
   Scanner sc=new Scanner(System.in);
   int i1 = sc.nextInt();
   int i2=sc.nextInt();
   double d1 = sc.nextDouble();
   float f1 = sc.nextFloat();
   char c1 = sc.next().charAt(0);
  String s1 = sc.nextLine();
  String s2 = sc.nextLine();
  StaticMethodsWithinClass.add(i1, i2);
  StaticMethodsWithinClass.multi(i1, i2);
  StaticMethodsWithinClass.div(i1, i2);
  StaticMethodsWithinClass.sub(i1, i2);
	delement(d1);
	Felement(f1);
	cElement(c1);
	sname(s1);
	s2name(s2);
	


  }

	private static void s2name(String s2) {
		System.out.println("The String2 element is " +s2);
	}

	private static void sname(String s1) {
		System.out.println("The String element is " +s1);

	}

	private static void cElement(Character c1) {
		System.out.println("The char element is "  + c1);

	}

	private static void Felement(Float f1) {
		System.out.println("The float element is " +f1);

	}

	private static void delement(Double d1) {
		System.out.println("The double element is " +d1);

	}

}
