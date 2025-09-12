class MaxProfit {
    public int maxProfit(int m, int[] arr) {
        // Your code goes here
        Arrays.sort(arr);
        int ans = 0;
        int i= 0;
        while(m>0){
            if(arr[i]<0){
                ans += -(arr[i]);
                i++ ;
                m--;
            }else{
                break;
            }
        }
        return ans;
    }

  public static void main(String args[]){
    int m = 2;
    int[] arr = {1, -2, -3, -4, 5};
    System.out.println(maxProfit(m, arr));
  }
}


// ## Question 

// Mr. Geek is a greedy seller. He has a stock of some laptops comprising both useful and useless laptops. Now, he wants to organize a sale to clear his stock of useless laptops.
// The prices of laptops are arri each consisting of positive and negative integers (-ve denoting useless laptops). In a day, he can sell almost m laptops. Mr. Geek, a greedy seller, 
// wants to earn maximum profit from this sale and sell useless laptops. So, help him maximize his profit by selling useless laptops.

// Examples:

// Input: m = 3, arr[] = [-6, 0, 35, 4]
// Output: 6
// Explanation: Geek sells the laptops with price -6 and earns Rs. 6 as profit.

// Input: m = 2, arr[] = [1, -2, -3, -4, 5]
// Output: 7
// Explanation: Geek sells the laptops with price -3 and -4 and earns Rs. 7 as profit as he can sell max 2 laptops.
  
// Constraints:
// 1 ≤ arr.size() ≤ 105
// 1 ≤ m ≤ 105
// -106 ≤ arri ≤ 106
