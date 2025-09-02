import java.util.* ;
class Result{
   String output1;
   String output2;
   String output3;
   public Result(String output1, String output2, String output3){
      this.output1 = output1;
      this.output2 = output2;
      this.output3 = output3;
   }
}
class EncodingThreeStrings{

   public static Result encodingThreeStrings(String input1, String input2, String input3){
      String[] first = divString(input1);
      String[] second = divString(input2);
      String[] third = divString(input3);

      String output1 = first[0] +second[0] + third[0];
      String output2 = first[1] +second[1] + third[1];
      String output = first[2] +second[2] + third[2];

      StringBuilder output3 = new StringBuilder();
      for(int i=0; i<output.length(); i++){
         if(Character.isLetter(output.charAt(i))){
            if(Character.isUpperCase(output.charAt(i))){
               output3.append(Character.toLowerCase(output.charAt(i))) ;
            }else{
               output3.append(Character.toUpperCase(output.charAt(i))) ;

            }
         }else{
            output3.append(output.charAt(i)) ;
         }
      }
      String o = output3.toString();
      return new Result(output1, output2, o);
   }

   public static String[] divString(String input){
      String[] str = new String[3];
      if(input.length()%3 == 0){
         str[0] = input.substring(0, input.length()/3);
         str[1] = input.substring(input.length()/3, (input.length()/3)*2 );
         str[2] = input.substring((input.length()/3)*2 );
      }else if(input.length()%3 == 1){
         str[0] = input.substring(0, input.length()/3 );
         str[1] = input.substring(input.length()/3, (input.length()/3)*2 +1 );
         str[2] = input.substring((input.length()/3)*2 +1);
      }else if(input.length()%3 == 2){
         str[0] = input.substring(0, input.length()/3 +1);
         str[1] = input.substring(input.length()/3 +1, (input.length()/3)*2 +1 );
         str[2] = input.substring((input.length()/3)*2 +1);
      }
      return str;
   }
   public static void main(String args[]){
      String input1 = "John";
      String input2 = "Johny";
      String input3 = "Janardhan";
      Result r = encodingThreeStrings(input1, input2, input3);
      System.out.println(r.output1);
      System.out.println(r.output2);
      System.out.println(r.output3);
   }
}


// ## Question :- 

// Encoding Three Strings: Anand was assigned the task of coming up with an encoding
// mechanism for any given three strings. He has come up with the below plan.
// STEP ONE: Given any three strings, break each string into 3 parts each.
// For example — If the three strings are as below -
// Inputl = "John"
// Input2= "Johny"
// Input3= "Janardhan"
// "John" should be split into "J", "oh", "n" as the FRONT, MIDDLE and END parts
// respectively.
// "Johny" should be split into "Jo", "h", "ny" as the FRONT, MIDDLE and END parts
// respectively.
// "Janardhan" should be split into "Jan", "ard", "han" as the FRONT, MIDDLE and END
// parts respectively.
// i.e. if the no. of characters in the string are in multiples of 3, then each split-part will
// contain equal no. of characters, as seen in the example of "Janardhan"
// If the no. of characters in the string are NOT in multiples of 3, and if there is one
// character more than multiple of 3, then the middle part will get the extra character, as
// seen in the example of "John"
// If the no. of characters in the string are NOT in multiples of 3, and if there are two
// characters more than multiple of 3, then the FRONT and END parts will get one extra
// character each, as seen in the example of "Johny"

// STEP TWO: Concatenate (join) the FRONT, MIDDLE and END parts of the strings as
// per the below specified concatenation-rule to form three Output strings.
// Outputl = FRONT part of Inputl + FRONT part of Input2 + FRONT part of Input3
// Output2 = MIDDLE part of Inputl + MIDDLE part of Input2 + MIDDLE part of Input3
// Output3 = END part of Inputl + END part of Input2 + END part of Input3
// For example, for the above specified example input strings,
// Outputl = "J" + "Jo" + "Jan" = "JJoJan"
// Output2 = "oh" + "h" + nard"
// "ohhard"
// Output3 = "n" + "ny" + "han" = "nnyhan"
// Step THREE: After the first two steps, we will have three output strings. Further
// processing is required only for the third output string as per below rule —
// "Joggle the case of each character in the string", i.e. in the third output string, all
// lower-case characters should be made upper-case and vice versa.
// For example, for the above example strings, Output3 is "nnyhan", so after applying the
// toggle rule, Output3 should become "NNYHAN".
// Final Result — The three output strings after applying the above three steps is the final
// result. i.e. for the above example,
// Outputl = "JJoJan"
// Output2 = "ohhard"
// Output3 = "NNYHAN"
// Anand approaches you to help him write a program that would do the above
// mentioned processing on any given three strings and generate the resulting three
// output strings
// Note that the three output strings should be returned as members of a "Result"
// object/struct.
