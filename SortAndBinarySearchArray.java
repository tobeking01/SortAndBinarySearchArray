import java.util.Arrays;

/* @ Author Tobechi Onwenu
 * 
 * Using the java util tool to talk to arrays
 * We start with sorting an array in Ascending order then 
 * We move on to searching if a number exists in an array list
 * 
 */
public class SortAndBinarySearchArray {

	public static void main(String[] args) 
	{
		// declare a simple int array
		int[] arrayInt = {2, 3, 6,- 8, 23 , -9, -3, 2, -4};
		Arrays.sort(arrayInt);      // sort in ascending order
//		System.out.print("array sorted in ascending order is " + Arrays.toString(arrayInt));
		printArray("Using the Array.sort util we can rearrange an array in ascending order");
		printArray("Array sorted in ascending order out of ", arrayInt);
		int arrayAtIndex = Arrays.binarySearch(arrayInt, 3); // to find an intger in an array we use the binary util to specify arrayInt and search if 3 is in the index after sorting
		printArray("\n\nUsing the Array.binarySearch util we can search for a number like \"3\" in an array list ");
		printArray("The search result for the number 3 after sorting is " ,arrayAtIndex);

	}
	private static void printArray(String headerMessage) 
	{
		System.out.println(headerMessage);
	}
	private static void printArray(String message, int array)
	{
		System.out.println(message + array);
	}

	public static void printArray(String message, int array[] )
	{
		System.out.println(message + array.length + " cells is: ");	
		System.out.print("[");
		
		for(int i=0; i<array.length; i++) 
		{
			System.out.print( array[i ] + ", " );
		}
		System.out.print("]");
	}
}
