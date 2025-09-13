import java.util.* ;
class Max_Diff_Pairs {
    public static long countPairs(int arr[]) {
        if (arr.length <= 1) {
            return 0;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        
        for (int i : arr) {
            if (i > max) max = i;
            if (i < min) min = i;
        }

        int c1 = 0; 
        int c2 = 0; 

        for (int i : arr) {
            if (i == min) c1++;
            if (i == max) c2++;
        }

       
        if (min == max) {
            int n = arr.length;
            return n * (n - 1) / 2;  
        }

        return  c1 * c2;
    }
}




// ## Question :-

// Given an array arr[] of integers, the task is to find the number of ways to choose pairs {arr[i], arr[j]} such that their absolute difference is maximum.

// Examples:

// Input: arr[] = [3, 2, 1, 1, 3]
// Output: 4
// Explanation:
// The maximum difference you can find is 2
// which is from 3 - 1 = 2.
// Number of ways of choosing it:
// 1) Choosing the first and third element
// 2) Choosing the first and fourth element
// 3) Choosing the third and fifth element
// 4) Choosing the fourth and fifth element
// Hence, the answer is 4.
  
// Input: arr[] = [1,2]
// Output: 1
// Expected Time Complexity: O(n).
// Expected Auxiliary Space: O(1).

// Constraints:
// 1 ≤ arr.size() ≤ 106
// 1 ≤ arr[i] ≤ 106
