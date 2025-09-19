class Solution {
    // Returns the sum of the longest increasing subarray.
    public int largestSum(int[] arr) {
        // code here
        int sum = arr[0];
        int prevSum = arr[0];
        int n = arr.length;
        
        for(int i= 0; i<n-1; i++){
            if(arr[i+1] > arr[i]){
                prevSum += arr[i+1];
            }else if(prevSum == sum){
                prevSum = arr[i+1];
            }else{
                if(prevSum > sum){
                    sum = prevSum;
                    prevSum = arr[i+1];
                }else{
                    prevSum = arr[i+1];
                }
            }
        }
        
        if(prevSum > sum){
            sum = prevSum;
        }
        
        return sum;
    }
}



// ## Question : 

// You are given an array of integers arr, where arr[i] represents the denomination of the ith coin placed on a road. The fox wants to collect coins in a specific pattern: it can only collect a contiguous subarray of coins that are in strictly increasing order of their denominations. Determine the maximum sum of coins that the fox can collect following this pattern.

// Examples:

// Input: arr[] = [2, 1, 4, 7, 3, 6] 
// Output: 12
// Explanation: Contiguous Increasing subarray [1, 4, 7] = 12.
  
// Input: arr[] = [38, 7, 8, 10, 12] 
// Output: 38
// Explanation: The best is to collect the first coin alone, as no larger contiguous increasing subarray exists.
  
// Expected Time Complexity: O(n).
// Expected Auxiliary Space: O(1).

// Constraints:
// 1 ≤ arr.size() ≤ 106
// 1 ≤ arr[i] ≤ 104
