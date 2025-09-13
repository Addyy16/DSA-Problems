import java.util.* ;
class Lift_Capacity_Problem {
    public static int maxPersons(int input1, int input2, int[] arr){
        
        Arrays.sort(arr);
        int sum = 0;
        int count = 0;
        
        for(int i=0; i<arr.length; i++){
            if(sum + arr[i] < input2){
                sum += arr[i];
                count++ ;
            }else{
                break;
            }
        }
        return count ;
    }

    public static void main(String args[]){
        int[] arr = {15,1,5,34,45,10};
        System.out.println(maxPersons(6, 65, arr));
    }
}


// ## Question :- 

// There is a lift in your society that can accommodate a maximum weight of X units.
// The weights of the people planning to use the lift are given in an integer array A of size N.
// Your task is to find and return an integer value representing the maximum number of people that can use the lift together without exceeding its weight capacity.

// Input Specification

// input1: An integer value N, representing the number of people planning to use the lift.

// input2: An integer value X, representing the maximum weight capacity of the lift.

// input3: An integer array A, containing the weights of the people planning to use the lift.

// Output Specification

// Return an integer value representing the maximum number of people that can use the lift together without exceeding its weight capacity.

// Examples : 
  
// Example 1

// Input:

// input1: 3
// input2: 9
// input3: (5, 1, 5)

// Output:

// 2
// Explanation:
// Sorted weights = (1, 5, 5).
// Take 1 → total = 1.
// Take 5 → total = 6.
// Next 5 would exceed 9, so stop.
// Maximum people = 2.

// Example 2

// Input:

// input1: 5
// input2: 15
// input3: (3, 8, 4, 2, 6)


// Output:

// 4
// Explanation:
// Sorted weights = (2, 3, 4, 6, 8).
// Take 2 → total = 2.
// Take 3 → total = 5.
// Take 4 → total = 9.
// Take 6 → total = 15 (exact).
// Next person (8) would exceed limit.
// Maximum people = 4.

// Example 3 (Edge Case)

// Input:

// input1: 4
// input2: 5
// input3: (6, 7, 8, 9)

// Output:

// 0
// Explanation:
// All people are heavier than the lift capacity.
//  Maximum people = 0.

// Example 4

// Input:

// input1: 6
// input2: 20
// input3: (2, 2, 2, 2, 2, 2)

// Output:

// 6
// Explanation:
// All six people can fit since 2 × 6 = 12 ≤ 20.
//  Maximum people = 6.
