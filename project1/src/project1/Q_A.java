package project1;

import java.util.LinkedList;
import java.util.Scanner;

public class Q_A 
{
 public static void main(String[] args) 
 {
	 
//	String[] a11= {"Kiran","Vicky","Kumar","Kiran","Vicky"};
//	//System.out.println(a11.length);
//	
//	for (int i = 0; i < a11.length-1; i++) 
//	{
//		for (int j = 0; j < a11.length; j++)
//		{
//			if ((a11[i].equals(a11[j])) && (i!=j))
//			{
//				System.out.println(a11[j]);
//			}
//		}
//	}
	/*Scanner sc=new Scanner(System.in);
	int[] a2=new int[7];

	for (int i = 0; i <a2.length; i++) 
	{
		a2[i]=sc.nextInt();
	}
	System.out.println(a2.length);
	for (int i = 0; i < a2.length-1; i++)
	{
	for (int j = i+1; j < a2.length; j++) 
	{
		if (a2[i]==a2[j])
		{
		  System.out.println(a2[i]);	
		}
	}	
	}*/
	
//	LinkedList<Integer> l1=new LinkedList<>();
//	l1.add(3);
//	l1.add(5);
//	l1.add(7);
//	l1.add(-3);
//	System.out.println(l1);
//
//	LinkedList<Integer> l2=new LinkedList<>();
//	l2.add(2);
//	l2.add(7);
//	l2.add(-3);
//	System.out.println(l2);
//	LinkedList<Integer> l3=new LinkedList<>();
//	l3.add(7);
//	l3.add(-3);
//	System.out.println(l3);
//	
//	 {
		
//	}


 }
 class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) {
	        val = x;
	        next = null;
	    }
	}

	public class MergePointLinkedLists {
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        // find the length of both lists
	        int lenA = length(headA);
	        int lenB = length(headB);
	        
	        // move the pointer of the longer list ahead by the difference in length
	        if (lenA > lenB) {
	            headA = moveAhead(headA, lenA - lenB);
	        } else {
	            headB = moveAhead(headB, lenB - lenA);
	        }
	        
	        // move both pointers together until they meet at the merge point
	        while (headA != null && headB != null && headA != headB) {
	            headA = headA.next;
	            headB = headB.next;
	        }
	        
	        // return the merge point, or -1 if there is none
	        return (headA == headB) ? headA : null;
	    }
	    
	    // utility function to find the length of a linked list
	    private int length(ListNode head) {
	        int len = 0;
	        while (head != null) {
	            head = head.next;
	            len++;
	        }
	        return len;
	    }
	    
	    // utility function to move a pointer ahead by a certain number of steps
	    private ListNode moveAhead(ListNode head, int steps) {
	        while (steps > 0) {
	            head = head.next;
	            steps--;
	        }
	        return head;
	    }
	}

}
