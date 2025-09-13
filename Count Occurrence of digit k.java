class Solution {
    public int num(int k, int arr[]) {
        // code here
        int[] count = new int[10];
        
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            while(num >0){
                int rem = num%10 ;
                count[rem]++ ;
                num = num/10 ;
            }
        }
        
        return count[k];
    }
}


// ## Question :- 

// Given an array arr[]. Your task is to return an integer denoting the total number of times digit k appears in the array.

// Examples:

// Input: k=1, arr[] = [11, 12, 13, 14, 15]
// Output: 6 
// Explanation: Here, digit 1 appears in the whole array 6 times.
  
// Input: k=3, arr[] = [11, 121, 15]
// Output: 0 
// Explanation: Here, digit 3 appears in the whole array 0 times.
  
// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(1)

// Constraints:
// 1<=arr.size()<=20
// 1<=arr[i]<=1000
// 1<=k<=9
