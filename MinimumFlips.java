import java.util.* ;
class MinimumFlips {
    public static int countFlips(int[] arr) {
        // code here.
        int switchCount = 0;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if((arr[i] + switchCount)%2 == 0){
                switchCount++ ;
            }
        }
        return switchCount;
    }

    public static void main(String args[]){
        int[] arr = {1,0,0,1};
        System.out.println(countFlips(arr));
    }
}


// ## Question :-

// A wire connects light bulbs. Each bulb has a switch associated with it, however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb. Given the initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs. "0 represents the bulb is off and 1 represents the bulb is on."
 
// Examples:

// Input: arr[] = [0, 0, 0, 0]
// Output:  1
// Explanation: From the given set of bulbs change the state of the first bulb from off to on, which eventually turn the rest three bulbs on the right of it.
  
// Input: arr[] = [1, 0, 0, 1]
// Output: 2
// Explanation: First click the second bulb then click the third bulb.
  
// Expected Time Complexity: O(n).
// Expected Auxiliary Space: O(1).

// Constraints:
// 1 ≤ arr.size() ≤ 106
// 0≤ arr[i] ≤ 1
