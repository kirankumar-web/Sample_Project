package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayListclass1
{
	public static void main(String[] args) 
	{
		//Arraylist creation
		ArrayList<String>a1=new ArrayList<>(5);
		//Add elements to the arraylist
		a1.add("abc");
		a1.add("cde");
		a1.add("xcv");
		a1.add("fgh");
		a1.add("faz");
		a1.add("lmn");
		//add elemnets to the specific location in array list
        a1.add(2, "tvb");
        a1.add(5,"mfc");
        //add null values
        //a1.add(null);
        //add duplicate elements
        a1.add("abc");
        //to get the size of arraylist
		System.out.println(a1.size());
        //to check the arraylist is empty or not
		System.out.println(a1.isEmpty());
		//to get hashcode of the arraylist
		System.out.println(a1.hashCode());
		//to check the element is present in the arraylist or not
		System.out.println(a1.contains("tvb"));
		//to retrive the element in arraylist
		System.out.println(a1.get(3));
		//to change the element in arraylist
		a1.set(3, "xbn");
		System.out.println(a1);
		
        //to remove the element in specific location
		a1.remove(2);
		//to remove the element in arraylist
		a1.remove("mfc");
		//to get the indexof the element
		System.out.println(a1.indexOf("lmn"));
		//to get the last index of element
		System.out.println(a1.lastIndexOf("fgh"));
		
		System.out.println(a1);
		
		System.out.println();
		//to sort the elements in array list
		Collections.sort(a1);
		System.out.println(a1);
        //to copy or clone the array list
		ArrayList<String> a2 = (ArrayList<String>) a1.clone();
		System.out.println(a2);
		//to check the arraylist elements is present in the specific collection or not
		System.out.println(a2.containsAll(a1));
		//to replace all the elements
		a2.replaceAll(String -> "aws");
		System.out.println(a2);

		//to remove all the elements in the arraylist
		a2.removeAll(a1);
		System.out.println(a2);

		String l1 = a2.toString();
		System.out.println(l1);
		ArrayList<String> a4=new ArrayList<>();

		ArrayList<Integer> a3=new ArrayList<>();
		a3.add(12);
		a3.add(14);
		a3.add(16);
		a3.add(18);
		a3.add(11);
		a3.add(13);
		a3.add(15);
		
		System.out.println(a3);
		//to add the list of elements into another list
		a4.addAll(a1);
		System.out.println(a4);
		//to add the list of elements into specific location in another list
		System.out.println(a4.addAll(3, a2));
		System.out.println(a4);
		//to check the specific list of elements present in the given list or not
		System.out.println(a4.containsAll(a2));
		//to check the specific elements present in the list or not
		System.out.println(a4.contains("faz"));
		System.out.println(a3.contains(15));
		//to retrive element from the list in specific index
		System.out.println(a4.get(10));
		System.out.println(a3.get(6));
		//to change element in the specific index
		a4.set(4, "bnvb");
		System.out.println(a4);
		a3.set(3, 21);
		System.out.println(a3);
		
		//to get the index of the element
		System.out.println(a3.indexOf(11));
		System.out.println(a4.indexOf("aws"));
		//to get the last index of the element
		System.out.println(a3.lastIndexOf(13));
		System.out.println(a4.lastIndexOf("aws"));
        //to remove the specific index element from the list
		a3.remove(3);
		System.out.println(a3);
		a4.remove(11);
		System.out.println(a4);
        //to remove the all the listvof element from the given list
		a4.removeAll(a2);
		System.out.println(a4);
        //to get the size of the list
		System.out.println(a3.size());
		System.out.println(a4.size());
		
		//System.out.println(a3.indexOf(11));

        LinkedList<String> ll=new LinkedList<>();
        ll.addAll(a1);
        System.out.println(ll);
        System.out.println(ll.get(3));
        ll.set(5, "ergrtg");
        System.out.println(ll);
        
		
	}

}
