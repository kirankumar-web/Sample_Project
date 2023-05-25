package TreeMapsDemo;

import java.util.Comparator;

public class Customcomparator implements Comparator<String>
{
	  
		public int compare(String n1, String n2)
		{
			int v1 = n1.compareTo(n2);
			if (v1>1) {
				return -1;

			}
			return 1;
		}

		
		  
	  }
	
