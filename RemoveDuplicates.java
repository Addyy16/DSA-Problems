import java.util.* ;
class  RemoveDuplicates {
    static ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        for(int i: arr){
                if(!seen.contains(i)){
                    ans.add(i);
                    seen.add(i);
                }
            }
        return ans;
    }

    public static void main(String args[]){
        int[] arr = {1,5,0,8,1,3,2};
        System.out.println(removeDuplicates(arr));
    }
}


// ## Question :- 

// You are given a array arr[] containing positive integers. Your task is to remove all duplicate elements from this array such that each element appears only once. Return an array containing these distinct elements in the same order as they appeared.
// Examples :

// Input: arr[] = [2, 2, 2, 2, 2]
// Output: [2]
// Explanation: After removing all the duplicates only one instance of 2 will remain i.e. [2] so modified array will contains 2 at first position and you should return array containing [2] after modifying the array.
  
// Input: arr[] = [1, 2, 4]
// Output: [1, 2, 4]
// Explation:  As the array does not contain any duplicates so you should return [1, 2, 4].

// Input: arr[] = [2, 1, 4, 3]
// Output: [2,1,4,3]
// Explation:  As the array does not contain any duplicates so you should return [1, 2, 4].
  
// Constraints:
// 1 ≤ arr.size() ≤ 105
// 1 ≤ arr[i] ≤ 106
