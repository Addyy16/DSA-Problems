class Solution {
    // Function to check if the given array forms an arithmetic progression
    public boolean checkIsAP(int[] arr) {
        // Your code goes here
        Arrays.sort(arr);
        int diff = arr[1] - arr[0] ;
        
        for(int i=1; i<arr.length-1; i++){
            if(arr[i+1] - arr[i] != diff){
                return false;
            }
        }
        return true;
    }
}




// ## Question : 

// Given an array arr[] of integers. Write a program to check whether an arithmetic progression can be formed using all the given elements. 

// Examples:

// Input: arr[] = [0, 12, 4, 8]
// Output: true
// Explanation: Rearrange given array as [0, 4, 8, 12] which forms an arithmetic progression.

// Input: arr[] = [12, 40, 11, 20]
// Output: false
// Explanation: there is no rearrangment which can forms an arithmetic progression.

// Constraints:
// 1 ≤ arr.size() ≤ 106
// 0 ≤ arr[i] ≤ 106
