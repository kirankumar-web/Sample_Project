package ArrayofJava;

public class Singledimensionalarray 
{
  public static void main(String[] args)
  {
	  //array declaration
	int[] a1 = new int[5];
	//array initialization
	a1[0]=12;
	a1[1]=13;
	a1[2]=14;
	a1[3]=15;
	a1[4]=16;
	//a1[5]=17;
	System.out.println(a1.length);
	for (int x : a1) {
		System.out.println(x);

	}
	for (int i = 0; i < a1.length; i++) 
	{
		System.out.println(a1[i]);
	}
	//array delaration, instantiation & initialization
	int a[]= {12,34,46,55,77,88};
	for (int i = 0; i < a.length; i++) 
	{
		//System.out.println(a[i]);
	}
	
	arrayofmethod(a);
	printarray(new int[] {1,2,3,4,5});
	
}
private static void printarray(int arr[]) 
{
  for (int i = 0; i < arr.length; i++)
  {
	System.out.println(arr[i]);
}	
}
// passing array as a argument in the method
public static void arrayofmethod(int a[])
{
	int min = a[3];
	System.out.println(min);
    	for (int i=1; i<a.length;i++) {
    		if (min<a[i]) {
				
			System.out.println(a[i]);
    		}
		}
    	
    	String s1="abccba";
    	String reverse = "";
    	
    	int length=s1.length();
    	
    	for (int i =length-1; i>=0; i--) 
    	
			reverse=reverse+s1.charAt(i);
			if (s1.equals(reverse))
			{
			  System.out.println("its a palindrome");	
			}
			else
			{
				System.out.println("its not a palindrome");
			}
		
    	
    	
}
}
