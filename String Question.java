public static int alice(String S){
      int count = 0;
   
      for(int i=0; i<S.length()-2; i++){
         int sum = 0;
         int j= i;
         while(j< i+3){
            sum += S.charAt(j) - '0';
            j++ ;
         }
         if(sum %3 == 0){
            count++ ;
         }
      }

      return count ;
   }



// ## Question : 

// Alice has always been fascinated bu=y the number 3. She has given a string of digits S and while examining the sequence she decided to look for patterns involving her favourite number . She wants to count how many groups of three consecutive digits have a sum divisible by 3. Your task is to find and return the integer value representing the count of the substrings of length 3 which are divisible by 3.

// Examples : 

// Input:
// S = "303"

// There’s only one substring of length 3: "303".

// Sum = 3 + 0 + 3 = 6, which is divisible by 3.

// So the answer here would be 1.

// Example 2

// Input:

// S = "1234"


// Possible substrings of length 3 are:

// "123" → Sum = 1 + 2 + 3 = 6 → divisible by 3 

// "234" → Sum = 2 + 3 + 4 = 9 → divisible by 3 

// So there are 2 substrings that meet the condition.


// Example 3

// Input:

// S = "98765"


// Substrings of length 3 are:

// "987" → Sum = 24 → divisible by 3 

// "876" → Sum = 21 → divisible by 3 

// "765" → Sum = 18 → divisible by 3 

// All 3 substrings work, so the result would be 3.
