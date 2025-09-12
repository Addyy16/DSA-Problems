import java.util.* ;
class TripletFamily {
    public static boolean findTriplet(int[] arr) {
        Arrays.sort(arr);
        for(int k = arr.length-1; k>= 0; k--){
            int i = 0;
            int j = k-1;
            while(i<j){
                int sum = arr[i] + arr[j];
                if(sum == arr[k]){
                    return true;
                }else if(sum < arr[k]){
                    i++ ;
                }else{
                    j-- ;
                }
            }
        }
        return false;
    }

  public static void main(String args[]){
    System.out.println(findTriplet(arr));
  }
}

// ## Question :-

// Given an array arr of integers. First sort the array then find whether three numbers are such that the sum of two elements equals the third element.

// Example 1:

// Input: arr[] = [1, 2, 3, 4, 5]
// Output: true
// Explanation: The pair (1, 2) sums to 3.

// Example 2:

// Input: arr[] = [3, 4, 5]
// Output: false
// Explanation: No triplets satisfy the condition.
// Constraints:
// 1 <= arr.size() <= 103
// 0 <= arr[i] <= 105

