import java.util.*;

class CustomSort {
    public ArrayList<Integer> customSort(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        int n = arr.length;

        Arrays.sort(arr, 0, n / 2);
        Arrays.sort(arr, n / 2, n);

        // reverse second half in-place
        int left = n / 2, right = n - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        for (int x : arr) {
            al.add(x);
        }

        return al;
    }
}



// ## Question :- 

// Given an array arr , sort the first half of the array in ascending order and the second half in descending order.

// Examples 1:

// Input: arr[] = [10, 20, 30, 40]
// Output: [10, 20, 40, 30]
// Explanation: The 10 and 20 will be sorted in ascending order and 30 and 40 will be sorted in descending order.

// Example 2:

// Input: arr[] = [5, 4, 6, 2, 3, 8, 9, 7]
// Output: [2, 4, 5, 6, 9, 8, 7, 3] 
// Explanation: The 5, 4, 6, 2 will be sorted in ascending order and 3, 8, 9, 7 will be sorted in descending order.

// Example 3:

// Input: arr = [5, 2, 9, 1, 7]
// Output: [2, 5, 9, 7, 1]
// Explanation: The 5,2 will be sorted in ascending order and 9, 1, 7 will be sorted in descending order.


// Expected Time Complexity: O(nlogn)
// Expected Auxiliary Space: O(1)

// Constraints: 
// 1 <= arr.size() <= 105
// 1 <= arr[i] <= 106
