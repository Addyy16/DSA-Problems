import java.util.* ;
class Solution {

    public static String Sandwiched_Vowel(String str) {
        // Complete function
        StringBuilder s = new StringBuilder();
        int n = str.length();
        s.append(str.charAt(0));
        for(int i=1; i<n-1; i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                char chim1 = str.charAt(i-1);
                char chip1 = str.charAt(i+1);
                if((chim1 == 'a' || chim1 == 'e' || chim1 == 'i' || chim1 == 'o' || chim1 == 'u')
                    || (chip1 == 'a' || chip1 == 'e' || chip1 == 'i' || chip1 == 'o' || chip1 == 'u'))
                    {
                        s.append(ch);
                    }
            }else{
                s.append(ch);
            }
        }
        
        s.append(str.charAt(n-1));
        
        return s.toString();
    }
}



// ## Question : 

// For a given string s comprising only lowercase English alphabets, eliminate the vowels from the string that occur between two consonants(sandwiched between two immediately adjacent consonants). Return the new string.

// Examples:

// Input : s = "bab"
// Output : bb
// Explanation: 'a' is a vowel occuring between two consonants i.e. b. Hence the updated string eliminates a.
// Input : s = "ceghij"
// Output : cghj
// Explanation: 'e' and 'i' are sandwitched vowels.
// Expected Time Complexity: O(n).
// Expected Auxiliary Space: O(1).

// Constraints:
// 1 ≤ s.size() ≤ 106
// 'a' ≤ s[i] ≤ 'z'
