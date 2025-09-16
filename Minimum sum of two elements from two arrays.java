class Solution {
    public int minSum(int[] arr1, int[] arr2) {
        int n = arr1.length;

        int min1 = Integer.MAX_VALUE;
        int prevMin1 = Integer.MAX_VALUE;
        int idx1 = -1;

        int min2 = Integer.MAX_VALUE;
        int prevMin2 = Integer.MAX_VALUE;
        int idx2 = -1;

        for (int i = 0; i < n; i++) {
            if (arr1[i] < min1) {
                prevMin1 = min1;
                min1 = arr1[i];
                idx1 = i;
            } else if (arr1[i] < prevMin1) {
                prevMin1 = arr1[i];
            }

            if (arr2[i] < min2) {
                prevMin2 = min2;
                min2 = arr2[i];
                idx2 = i;
            } else if (arr2[i] < prevMin2) {
                prevMin2 = arr2[i];
            }
        }

        if (idx1 != idx2) {
            return min1 + min2;
        }

        return Math.min(min1 + prevMin2, min2 + prevMin1);
    }
}




// ## Question :- 

// Given two arrays arr1[] and arr2[] of the same size, find the minimum sum of two elements such that one element is from arr1[] and the other is from arr2[], and they are not at the same index in their respective arrays.

// Examples:

// Input: arr1[] = [5, 4, 13, 2, 1], arr2[] = [2, 3, 4, 6, 5]
// Output: 3
// Explanation: The minimum sum is obtained by taking 1 from arr1[] and 2 from arr2[]. The sum is 1 + 2 = 3.

// Input: arr1[] = [5, 4, 13, 1], arr2[] = [3, 2, 6, 1]
// Output: 3
// Explanation: The minimum sum is obtained by taking 1 from arr1[] and 2 from arr2[]. We can't take 1 from arr2[] as it is at the same index.

// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(1)

// Constraints:
// 2 ≤ arr1.size() = arr2.size() ≤ 106
// 1 ≤ arr1[i], arr2[i] ≤ 105
