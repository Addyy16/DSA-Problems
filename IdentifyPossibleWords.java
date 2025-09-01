class IdentifyPossibleWords{

   public static String identifyPossibleWords(String input1, String input2){
      input1 = input1.toUpperCase();
      input2 = input2.toUpperCase();
      StringBuilder str = new StringBuilder();

      // Method-1 (without split method)

      for(int i=0; i<input2.length(); i++){
         StringBuilder words = new StringBuilder();
         int j=0;
         while(i<input2.length() && input2.charAt(i) != ':'){
            if(input1.charAt(j) == input2.charAt(i) || input1.charAt(j) == '_'){
               words.append(input2.charAt(i));
               j++ ;
               i++ ;
            }else{
               while(i<input2.length() && input2.charAt(i) != ':'){
                  i++ ;
               }
               break;
            }
         }

         if(words.length() == input1.length()){
            str.append(words).append(":");
         }
      }
      return str.substring(0, str.length()-1).toString();

      // Method -2 (with split method)

      // String[] words = input2.split(":");

      // for(String word : words){
      //    if(word.length() == input1.length()){
      //       boolean match = true;
      //       for(int j= 0; j<input1.length(); j++){
      //          if(word.charAt(j) != input1.charAt(j) && input1.charAt(j) != '_'){
      //             match = false;
      //             break;
      //          }
      //       }
      //       if(match){
      //          str.append(word).append(":");
      //       }
      //    }
      // }

      // if(str.length()> 0){
      //    str.deleteCharAt(str.length()-1);
      // }
      // return str.toString();
   }
   public static void main(String args[]){
      String input1 = "Fi_er";
      String input2 = "Fever:filer:Filter:Fixer:fiber:fibre:tailor:offer";
      System.out.println(identifyPossibleWords(input1, input2));
   }
}


// ## Question :- 

// Identify possible words: Detective Bakshi while solving a case stumbled upon a letter which had many words whose one character was missing i.e. one character in the word was replaced by an underscore.
// For e.g. "Fi_er". He also found thin strips of paper which had a group of words separated by colons, for e.g. "Fever.filer Filter:Fixer:fiber:fibre:tailor:offer". He could figure out that the word 
// whose one character was missing was one of the possible words from the thin strips of paper. Detective Bakshi has approached you (a computer programmer) asking for help in identifying the possible words
// for each incomplete word.

// You are expected to write a function to identify the set of possible words.

// The function identify Possible Words takes two strings as input

// where,

// input1 contains the incomplete word, and input2 is the string containing a set of words separated by colony

// The function is expected to find all the possible words from input2 that can replace the incomplete word input1, and return the result in the format suggested below.

// Example1-

// input1 = "Fi_er"

// input2 = "Fever:filer:Filter Fixer fiber fibre:tailor:offer"

// output string should be returned as "FILER:FIXER:FIBER"

// Note that -

// The output string should contain the set of all possible words that can replace the incomplete word in input1

// all words in the output string should be stored in UPPER-CASE

// Example1-

// input1 = "Fi_er"

// input2 "Fever.filer Filter Fixer fiber fibre:tailor:offer"

// output string should be returned as "FILER:FIXER FIBER"

// Note that -

// The output string should contain the set of all possible words that can replace the incomplete word in input1

// all words in the output string should be stored in UPPER-CASE

// all words in the output string should appear in the order in which they appeared in input2, i.e. in the above example we have FILER followed by FIXER followed by FIBER

// While searching for input1 in input2, the case of the letters are ignored, ie "Fi_er" matches with "filer" as well as "Fixer" as well as "fiber".

// IMPORTANT: If none of the words in input2 are possible andidates to replace input1, the output string should contain the string "ERROR-009"

// Assumption(s):

// Input1 will contain only a single word with only 1 character replaced by an underscore""

// Input2 will contain a series of words separated by colons and NO space character in between

// Input2 will NOT contain any other special character other than underscore and alphabetic characters.
