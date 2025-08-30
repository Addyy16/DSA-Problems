class Result{
    int seqCount ;
    int longSeq;
    public Result(int input1 , int input2){
        this.seqCount = input1;
        this.longSeq = input2;
    }
}
public class DecreasingSequence {

    public static Result decreasingSeq(int[] arr, int n){
        if(n <= 1){
            return new Result(0,0);
        }

        int seqCount = 0;
        int longSeq = 0;
        int i= 0;

        while(i<n-1){
            if(arr[i] > arr[i+1]){
                seqCount++ ;
                int seq = 2;
                i++ ;
                while(i< n-1 && arr[i] > arr[i+1]){
                    seq++ ;
                    i++ ;
                }

                if(seq > longSeq){
                    longSeq = seq ;
                }
            }else{
                i++ ;
            }
        }
        return new Result(seqCount, longSeq);
    }

    public static void main(String args[]){
        int[] arr = {11,3,1,4,7,8,12,2,3,7};
        int n = arr.length;
        Result r = decreasingSeq(arr, n);
        System.out.println(r.seqCount);
        System.out.println(r.longSeq);
    }
}

// ## Question

// Given an integer array,write a function to find the total number of strictly decreasing sequences of length two or more, and return the length of the longest such sequence.  
// A strictly decreasing sequence is a contiguous subarray where each element is strictly less than its preceding element.

// Write a Java method: 
// java
// public Result decreasingSeq(int[] input1, int input2)
// 
// Where:
// - `input1` is the integer array,
// - `input2` is the size of the array,
// - Returns a `Result` object containing:
//   - The number of strictly decreasing sequences,
//   - The length of the longest strictly decreasing sequence.

// Example:
// - Input: `input1 = {10, 8, 7, 5, 5, 3, 4, 2}`, `input2 = 8`
// - Output: `Result(3, 4)`  
//   - There are 3 decreasing sequences: {10, 8, 7, 5}, {5, 3}, {4, 2}
//   - The longest has length 4.


// This question tests understanding of subarrays, sequence identification, and iteration logic in arrays.
