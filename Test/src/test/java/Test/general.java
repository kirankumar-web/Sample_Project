package Test;

import java.util.Arrays;
import java.util.Iterator;

public class general 
{
	    public static void main(String[] args) {
	        int[] a1 = {0, 0, 0, 1, 1, 0, 1, 1, 0, 0};
	        segregateArray(a1);
	        System.out.println(Arrays.toString(a1));
	    }

	    public static void segregateArray(int[] arr) {
	        int left = 0; // Pointer for 0s
	        int right = arr.length - 1; // Pointer for 1s

	        while (left < right) {
	            while (arr[left] == 0 && left < right) {
	                left++;
	            }
	            while (arr[right] == 1 && left < right) {
	                right--;
	            }

	            if (left < right) {
	                arr[left] = 0;
	                arr[right] = 1;
	                left++;
	                right--;
	            }
	        }
	    }
	}
