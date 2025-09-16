class Solution {
    public ArrayList<Integer> getDigitDiff1AndLessK(int[] arr, int k) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            boolean valid = true;
            if(arr[i] < k && arr[i] >= 10){
                int num = arr[i];
                int r = num%10 ;
                num = num/10;
                while(num > 0){
                    int rem = num%10;
                    num = num/10 ;
                    if(r-rem != 1 && r-rem != -1){
                        valid = false;
                        break;
                    }
                    r= rem;
                }
                
                if(valid){
                    al.add(arr[i]);
                }
            }
        }
        return al;
    }
}



## Question :- 

Given an array arr. Return all the numbers less than k and the number which have at least two digits and the absolute difference between every adjacent digit of that number should be 1 in the array.

Note: Return an empty list if no such number is present.

Examples:

Input: arr[] = [7, 98, 56, 43, 45, 23, 12, 8], k = 54
Output: [43, 45, 23, 12]
Explanation: 43 45 23 12 all these numbers have adjacent digits diff as 1 and they areless than 54.
  
Input: arr[] = [87, 89, 45, 235, 465, 765, 123, 987, 499, 655], k = 1000
Output: [87, 89, 45, 765, 123, 987]
Explanation: 87 89 45 765 123 987 all these numbers have adjacent digits diff as 1 and they areless than 1000.
  
Constraints:
1 <= arr.size() <= 106
1 <= k, arr[i] <= 106
