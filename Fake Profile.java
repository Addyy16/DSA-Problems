class Solution {
    public String solve(String a) {
        // code here
        int[] freq = new int[26];
        
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) != 'a' && a.charAt(i) != 'e' && a.charAt(i) != 'i' 
            && a.charAt(i) != 'o' &&  a.charAt(i) != 'u'){
                freq[a.charAt(i) - 'a']++ ;
            }
        }
        int count = 0;
        
        for(int i=0; i<freq.length; i++){
            if(freq[i] >= 1){
                count++ ;
            }
        }
        
        if(count%2 == 0){
            return "SHE!";
        }else{
            return "HE!" ;
        }
    }
}



// ## Question :

// There is a hacker named "Vijay" who has developed a method to check whether an id at some social networking site is fake or real using its username.

// His method includes: if the number of distinct consonent characters in one's user name is odd, then the user is a male, otherwise a female. You are given the string that denotes the user name, please help Vijay to determine the gender of this user by his method. Ignore the vowels.
// Note: The input only contains lowercase English alphabets.

// Example 1 -

// Input
// a = "jpmztf"
// Output:
// SHE!
// Explanation:
// There are 6 distinct consonent characters in "jpmztf".
// These characters are: "j", "p", "m", "z", "t", "f".
// So jpmztf is a female and you should print "SHE!".

// Example 2 -

// Input :
// a = "plkaitw"
// Output:
// HE!
// Explanation : 
// There are 5 distinct consonent characters in "plkaitw".
// These characters are: "p"," l ","k","t"and"w" as others are vowels.
// So plkaitw is a male and you should print "HE!".
 

// Your Task :
// Complete the function solve() that receives the string a and returns the answer.

 

// Expected Time Complexity :O(|a|)
// Expected Space Complexity :O(1)

 

// Constraints:
// 1<=Length of string<=1000
