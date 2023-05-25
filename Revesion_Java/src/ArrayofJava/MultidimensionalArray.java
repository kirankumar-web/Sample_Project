package ArrayofJava;

import java.util.Arrays;
import java.util.Iterator;

public class MultidimensionalArray 
{
  public static void main(String[] args) 
  {
	  //multidimmenisional array declaration
     int[][] ar1 = new int[4][4];
     // multidimensional array initialisation
     ar1[0][0]=12;
     ar1[0][1]=14;
     ar1[0][2]=16;
     ar1[0][3]=18;
     ar1[1][0]=12;
     ar1[1][1]=15;
     ar1[1][2]=22;
     ar1[1][3]=24;
     ar1[2][0]=42;
     ar1[2][1]=56;
     ar1[2][2]=47;
     ar1[2][3]=75;
     ar1[3][0]=46;
     ar1[3][1]=26;
     ar1[3][2]=67;
     ar1[3][3]=54;
     
     for (int i = 0; i < ar1.length; i++)
     {
    	for (int j = 0; j < ar1.length; j++) {
    		System.out.println(ar1[i][j]);

		}
	}
     int[][][] ar2=new int[2][2][2];
     ar2[0][0][0]=12 ;
     ar2[0][0][1]= 22;
     ar2[0][1][0]= 34;
     ar2[0][1][1]= 45;
     ar2[1][0][0]= 54;
     ar2[1][0][1]= 65;
     ar2[1][1][0]= 73;
     ar2[1][1][1]= 47;
     System.out.println(ar2.length);
     for (int i = 0; i < ar2.length; i++) 
     {
		for (int j = 0; j < ar2.length; j++) {
			for (int j2 = 0; j2 < ar2.length; j2++) {
				System.out.println(ar2[i][j][j2]);
			}
		}
	}
     //multi dimensional array declaration, initialization.
     int ar3[][]= {{1,3,5},{5,7,9},{11,13,15}};
     for (int i = 0; i < ar3.length; i++) 
     {
		for (int j = 0; j < ar3.length; j++) {
			System.out.println(ar3[i][j]);
		}
	}
     int i1[][]= {{1,2,3},{2,3,1},{3,2,1}};
     int j1[][]= {{3,2,1},{2,1,3},{1,3,2}};
     int x1[][]=new int[3][3];
     for (int i = 0; i <3; i++) 
     {
	  for (int j = 0; j <3; j++) 
	  {
		x1[i][j]=0;
		for (int k = 0; k <3; k++) 
		{
			x1[i][j]=i1[i][k]*j1[i][j];
		}
		
	}	
	}
     // array passing argumented method callng
     multiDimOfArrofMethod(ar3);  
}
// multi dimensional array passing through an method
public static void multiDimOfArrofMethod(int[][] ar3) 
{
   for (int i = 0; i < ar3.length; i++) {
	for (int j = 0; j < ar3.length; j++) {
		System.out.println(ar3[i][j]);
	}
	int[] arr= {33,45,21,36,46};
	for (int j : arr)
	{
		System.out.println(j);
	}
	int[] arr1=arr.clone();
	for (int j : arr1)
	{
		System.out.println(j);
	} 
	
		System.out.println("both are equal");
	    System.out.println(arr==arr1);
}
}
}
