import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        // Arrays in Java are fixed-size data structures that store elements of the same type.
        // They are stored in the heap memory as objects.

        // Declaration and Initialization of Arrays
        int[] a = new int[5]; // Array with default values (0s)
        int[] arr = {1, 2, 3, 4, 5}; // Direct initialization with values
        
        // Printing array reference (Incorrect way)
        System.out.println(arr); // Prints memory reference (not contents)
        
        // Correct way to print array contents
        System.out.println("Array elements: " + Arrays.toString(arr));
        
        // Inserting values into array 'a'
        for (int i = 0; i < a.length; i++) {
            a[i] = i; // Storing index values in the array
        }
        
        // Displaying elements of array 'a'
        System.out.println("Initial array 'a': " + Arrays.toString(a));
        
        // Modifying elements in array 'a'
        for (int i = 0; i < a.length; i++) {
            a[i] = i * 10; // Multiply index by 10
        }
        
        // Display modified array
        System.out.println("Modified array 'a': " + Arrays.toString(a));
        
        // Deletion in array (Removing a specific element by shifting elements left)
        int key = 30, j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != key) {
                a[j++] = a[i]; // Keep only non-matching elements
            }
        }
        
        // Fill remaining spaces with a default value (optional)
        while (j < a.length) {
            a[j++] = 0; // Setting remaining elements to 0
        }
        
        // Display array after deletion
        System.out.println("Array 'a' after deletion of " + key + ": " + Arrays.toString(a));
        
        // Searching in array using Linear Search
        // Linear search (or sequential search) is a simple searching algorithm
        // that checks each element in the array one by one until the desired
        // element is found or the end of the array is reached.
        // It is useful for small or unsorted arrays but is inefficient for large datasets.
        int val = 20;
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == val) {
                flag = true;
                System.out.println(val + " is found at index " + i);
                break; // Exit loop after finding the first occurrence
            }
        }
        
        if (!flag) {
            System.out.println(val + " not found in the array");
        }
        
        // Binary Search in a sorted array
        int[] bi = {1, 2, 3, 4, 5}; // Sorted array
        int left = 0, right = bi.length - 1, mid, valu = 4;
        boolean found = false;
        
        while (left <= right) {
            mid = left + (right - left) / 2; // Avoid overflow
            if (bi[mid] == valu) {
                System.out.println(valu + " found at index " + mid);
                found = true;
                break;
            }
            if (bi[mid] < valu) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        if (!found) {
            System.out.println(valu + " not found in the array");
        }
    }
}
