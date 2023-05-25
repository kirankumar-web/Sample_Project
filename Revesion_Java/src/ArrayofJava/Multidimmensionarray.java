package ArrayofJava;

public class Multidimmensionarray 
{
public static void main(String[] args) 
{
	int a1[][]= {{1,2,3},{3,2,1},{2,1,3}};
	int b1[][]= {{2,3,1},{3,1,2},{2,1,3}};

	int c1[][]= new int [3][3];
	
	for (int i = 0; i <3; i++) 
	{
		for (int j = 0; j <3; j++) 
		{
			c1[i][j]=0;
			for (int j2 = 0; j2 <3; j2++)
			{
				c1[i][j]=a1[i][j2]*b1[j][j2];
			}
			System.out.print(c1[i][j]+" ");

		}
		System.out.println();
	}

}
}
