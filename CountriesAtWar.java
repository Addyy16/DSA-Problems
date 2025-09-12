class CountriesAtWar{
    public static String countryAtWar(int[] arr1, int[] arr2) {
        //  code here
        int countA = arr1.length-1;
        int countB = arr2.length-1;
        for(int i = 0; i<arr1.length; i++){
            if(arr1[i]>arr2[i]){
                countB-- ;
            }else if(arr1[i] < arr2[i]){
                countA-- ;
            }else{
                countA-- ;
                countB-- ;
            }
        }
        String ans;
        if(countA > countB){
            ans = "A";
        }else if(countA < countB){
            ans = "B";
        }else{
            ans = "DRAW";
        }
        return ans;
        
    }

  public static void main(String args[]){
    int[] arr1 = {2,2};
    int[] arr2 = {5,5};
    System.out.println(countryAtWar(arr1, arr2));
  }
}


// ## Question :- 

// The two countries of A and B are at war against each other. The power of these soldiers is given by arr1[i] of A and arr2[i] of B. 
// They can only attack their counterpart enemies like arr1[i] can attack only arr2[i] and not anyone else. Both countries have equal number of counterparts. 
// A soldier with a higher power can kill the enemy soldier. If both soldiers have the same power, they both die. You need to find the winning country.
// Note: If no one winning, then return "DRAW".

// Example 1:

// Input: arr1[] = [2, 2], arr2[] = [5, 5]
// Output: B
// Explanation: Both countries have 2 soldiers. arr2[0] kills arr1[0], arr2[1] kills arr1[1]. A has 0 soldiers alive at the end. B has both soldiers alive at the end.Return "B" as a winner.

// Example 2:

// Input: arr1[] = [9], arr2[] = [8]  
// Output: A
// Explanation: arr1[0] > arr2[0], So A is the winner.

// Expected Time Complexity: O(n).
// Expected Auxiliary Space: O(1).

// Constraints:
// 1 ≤ arr1.size() ≤ 106
// 0 ≤ arr1[i],arr2[i] ≤ 105
