package Treeset;

import java.util.Comparator;

public class cuscomparator implements Comparator<String> 
{
	public int compare(String o1, String o2) 
	{
        int value =  o1.compareTo(o2);
		 int i1 = value;
         if (value > 0) {
             return -1;
         }
         else if (value < 0) {
             return 1;
         }
         else {
             return 0;
         }
	}
	public int coo(String o1, String o2)
	{        
	int value =  o1.compareTo(o2);
         System.out.println(value);
		return value;
		
	}

	}


