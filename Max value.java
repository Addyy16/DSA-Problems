class Solution {
    // Function to find maximum value among the difference of element and index.
    public int maxVal(List<Integer> arr) {
        // code here
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) - i > max){
                max = arr.get(i) - i ;
            }
            if(arr.get(i) - i < min){
                min = arr.get(i) - i ;
            }
        }
        return max-min;
    }
}



// ## Question : 

// In a given array arr[], find the maximum value of (arr[i] – i) - (arr[j] – j) where i is not equal to j and n is the size of the array. i and j vary from 0 to n-1  arr[].

// Examples:

// Input: arr[] = [9, 15, 4, 12, 13]
// Output: 12
// Explanation: (a[1]-1) - (a[2]-2) = (15-1)-(4-2) = 12

// Input: arr[] = [3, 1, 2, 4]
// Output: 3
// Explanation: (a[0]-0) -(a[1]-1) = (3-0) - (1-1) = 3

// Constraints:
// 2 ≤ arr.size() ≤ 106
// 1 ≤ arr[i] ≤ 106
