class Solution {
    public static int maxProduct(int[] arr) {
        // code here
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }else if(arr[i] > max2){
                max2 = arr[i];
            }
        }
        
        return max1*max2;
    }
}



// ## Question : 

// Given an array arr of non-negative integers, return the maximum product of two numbers possible.

// Example:

// Input: arr[] = [1, 4, 3, 6, 7, 0] 
// Output: 42
// Explanation: 6 and 7 have the maximum product.

// Input: arr[] = [1, 100, 42, 4, 23]
// Output: 4200
// Explanation:  42 and 100 have the maximum product.

// Constraints:
// 2 ≤ arr.size ≤ 107
// 0 ≤ arr[i] ≤ 109
