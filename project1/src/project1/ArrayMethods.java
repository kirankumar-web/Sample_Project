package project1;

import java.util.Arrays;
import java.util.List;

public class ArrayMethods 
{
  public static void main(String[] args)
  {
    int[] arr= {11,15,17,18,20,21,22,99};
    int[] arr1 = arr.clone();
    System.out.println(arr);
    System.out.println(Arrays.toString(arr));
    
    //asList() Returns a fixed-size list backed by the specified Arrays
    List<int[]> l1 = Arrays.asList(arr);
    System.out.println(l1);
    
    //binary search() is used to search the specific element in Array
    System.out.println(Arrays.binarySearch(arr, 22));
    System.out.println(Arrays.binarySearch(arr, 11));
    System.out.println(Arrays.binarySearch(arr, 19));
    //binarySearch(array, fromIndex, toIndex, key, Comparator) Method 
    //This method searches a range of the specified array for the specified object.
    System.out.println(Arrays.binarySearch(arr, 2, 5, 20));
    System.out.println(Arrays.binarySearch(arr, 0, 7, 18));
    // compare() is used to compare the two arrays
    int[] arr2= {12,15,16,22,34,55,66};
    System.out.println(Arrays.compare(arr, arr1));
    System.out.println(Arrays.compare(arr, arr2));
    System.out.println(Arrays.compare(arr2, arr));
    //compareunassigned() is used to compareunassigned two arrays
    System.out.println(Arrays.compareUnsigned(arr, arr1));
    System.out.println(Arrays.compareUnsigned(arr, arr2));
    System.out.println(Arrays.compareUnsigned(arr2, arr));
    //Copyof(original Array, new length) is used to copy of the array into specific length
    int[] ar1 = Arrays.copyOf(arr, 3);
    System.out.println(Arrays.toString(ar1));
    System.out.println(Arrays.toString(Arrays.copyOf(arr1, 12)));
    
    //CopyofRange(originalarray,fromindex,endindex)is used to copy of array elements in Specific range
    System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 2, 7)));
    System.out.println(Arrays.toString(Arrays.copyOfRange(arr1, 5, 12)));
    
    //DeepEqual() is used to specified two arrays are deeply equal to eachother or not
    int[][] da1= {{12,13,15,16}};
    int[][] da2= {{12,13,15,16}};
    int[][] da3= {{12,13,15,16,19}};
    System.out.println(Arrays.deepEquals(da1, da2));
    System.out.println(Arrays.deepEquals(da2, da3));
    //Deephashcode() return an integer hashcode of an array instance
    System.out.println(Arrays.deepHashCode(da3));
    System.out.println(Arrays.deepHashCode(da1));
    
    System.out.println(Arrays.mismatch(arr, arr1));
    System.out.println(Arrays.mismatch(arr, arr2));
    
  }
}
