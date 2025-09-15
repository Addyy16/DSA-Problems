class Solution {
    public int getIndexInSortedArray(int[] arr, int k) {
        // Write Code Here
        int n = arr.length;
        int[][] a = new int[n][2];
        
        for(int i=0; i<n; i++){
            a[i][0] = i;
            a[i][1] = arr[i];
        }
        
        Arrays.sort(a, Comparator.comparingInt(o -> o[1]));
        for(int i=0; i<n ; i++){
            if(a[i][0] == k){
                return i;
            }
        }
        return -1;
    }
}




// ## Question :- 

// Given an array arr integers that may contain duplicate elements, the index of an element of this array is given to us k (0-based indexing), the task is to find the final position of this element in the array after the stable sort is applied to the array. 

// Examples:

// Input: arr[]= [3, 4, 3, 5, 2, 3, 4, 3, 1, 5], k = 5
// Output: 4
// Explanation: Element initial index – 5 (3) After sorting array by stable sorting algorithm, we get array as shown [1(8), 2(4), 3(0), 3(2), 3(5), 3(7), 4(1), 4(6), 5(3), 5(9)] with their initial indices shown in parentheses next to them.

// Input: arr[]= [3, 4, 3, 5, 2, 3, 4, 3, 1, 5], k = 2
// Output: 3
// Explanation: Element initial index – 2 (3) After sorting array by stable sorting algorithm, we get array as shown [1(8), 2(4), 3(0), 3(2), 3(5), 3(7), 4(1), 4(6), 5(3), 5(9)] with their initial indices shown in parentheses next to them.

// Expected Time Complexity: O(n).
// Expected Auxiliary Space: O(1).

// Constraints:
// 1 ≤ arr.size() ≤ 106
// 1 ≤ arr[i] ≤ 105

