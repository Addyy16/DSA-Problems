import java.util.* ;
class PositiveAndNegativeElements {
    static ArrayList<Integer> arranged(ArrayList<Integer> arr) {
        // code here
        int n = arr.size();
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));
        int pos = 0;
        int neg = 1;
        
        for(int i=0; i<n; i++){
            if(arr.get(i) >0){
                ans.set(pos, arr.get(i));
                pos += 2;
            }else{
                ans.set(neg, arr.get(i));
                neg += 2;
            }
        }
        return ans;   
    }

    public static void main(String args[]){
      ArrayList<Integer> arr = new ArrayList<>();
      arr.add(-1);
      arr.add(2);
      arr.add(-3);
      arr.add(4);
      arr.add(-5);
      arr.add(6);
      System.out.println(arr);
    }
  
}


// ## Question :- 

// Given an array arr containing equal number of positive and negative elements, arrange the array such that every positive element is followed by a negative element.
// Note: The relative order of positive and negative numbers should be maintained.

// Examples:

// Input: arr[] = [-1, 2, -3, 4, -5, 6]
// Output: [2, -1, 4, -3, 6, -5]
// Explanation: Positive numbers in order are 2, 4 and 6. Negative numbers in order are -1, -3 and -5. So the arrangement we get is 2, -1, 4, -3, 6 and -5.
  
// Input: arr[] = [-3, 2, -4, 1]
// Output: [2, -3, 1, -4] 
// Explanation: The positive numbers are 2,1 and negative numbers are -3, -4  
  
// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(n)

// Constraints:
// 2 ≤ arr.size() ≤ 106
// -106 ≤ arr[i] ≤ 106
