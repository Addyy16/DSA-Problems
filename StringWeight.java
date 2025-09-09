public class StringWeight {

    public static int stringWeight(int[] input1, String input2){
        input2 = input2.toLowerCase();
        int product = 1;
        boolean hasValidWord = false;

        for(int i=0; i<input2.length(); i++){
            while(i<input2.length() && input2.charAt(i) == ' '){
                i++ ;
            }

            if(i >= input2.length()){
                break ;
            }

            boolean hasValidChar = false;
            int wordSum = 0;

            int firstVal = 0;
            int lastVal = 0;
            char firstChar = 0;
            char lastChar = 0;
            
            while(i<input2.length() && input2.charAt(i) != ' '){
                char ch = input2.charAt(i);
                if(ch >= 'a' && ch <= 'z'){
                    int val = input1[ch - 'a'] ;
                    wordSum += val;

                    if(!hasValidChar){
                        firstVal = val;
                        firstChar = ch;
                    }
                    lastVal = val ;
                    lastChar = ch ;
                    hasValidChar = true;
                }
                i++ ;
            }

            if(hasValidChar){
                if(firstVal < 0){
                    wordSum += (firstChar - 'a' + 1) ;
                }
                if(lastVal < 0){
                    wordSum += (lastChar - 'a' + 1) ;
                }

                product *= wordSum ;
                hasValidWord = true;
            }
            
        }
        return hasValidWord ? product : 0 ;
    }
    public static void main(String args[]){
        String str = "Wipro Limited";
        int[] arr = {15,16,1,-2,-13,61,11,4,3,19,-4,17,-3,90,-65,67,12,0,13,2,3,43,21,-17,2,42};
        System.out.println(stringWeight(arr, str));
    }
}



// ## Question :- 


// Find string weight [A-z]:

// You are provided with the individual weights of the 26 alphabetic characters.

// You are expected to find the weight of a given string as follows:

// Weight of the string = Product of weights of words in the string Weight of a word = Sum of weights of the alphabets in the word

// NOTE: While finding weight of a word, special consideration has to be given to the first and last characters of the word. If the first character or the last character of the word has a negative weight, we need to add the 'alphabetic position' of that character to the weight of that character. The 'alphabetic position' of a=A=1, 'alphabetic position' of b=B=2, and so on till z=Z=26.


// Let's illustrate this with couple of examples.

// Example 1:

// Array input1 specifying the individual weights of the 26 alphabetic characters = (15,16,1,-2,-13,61,11,4,3,19,-4,17,-3,90,-65,67,12,0,13,2,3,43,21,-17,2,42) String whose weight is to be found = "Wipro Limited"

// Weight of the string will be = (Weight of "Wipro") x (Weight of "Limited")

// Weight of "Wipro" = 21+3+67+0+(-65) = 21+3+67+0+(-65+15) = 41

// NOTE: Note here that the weight of the last character 'o' of the word "Wipro" is -65 which is negative, so we have to add the 'alphabetic position' of 'o' (which is 15).

// Weight of "Limited" = 17+3+(-3)+3+2+(-13)+(-2) = 17+3+(-3)+3+2+(-13)+2+4) = 11 NOTE: Note here that the weight of the last character 'd' of the word "Limited" is -2 which is negative, so we have to add the 'alphabetic position' of 'd' (which is 4).

// Therefore, Weight of the string will be = 41 x 11 = 451

// Example2: Array input 1[] specifying the individual weights of the 26 alphabetic characters = (12,11,6,1,-1,23,12,1,28,-43,6,98,11,2,7,88,9,-4,-54,25,19,-12,-32,65,3,-9) String whose weight is to be found = "Spring AND Hibernate"

// Weight of the string will be = (Weight of "Spring") x (Weight of "AND") x (Weight of "Hibernate")

// Weight of "Spring" = (-54+19)+88+(-4)+28+2+12 = 91

// NOTE: Note here that the weight of the first character 'S' of the word "Spring" is -54 which is negative, so we have to add the 'alphabetic position' of 'S' (which is 19).

// Weight of "AND" = 12+2+1 = 15

// Weight of "Hibernate" = 1+28+11+(-1)+(-4)+2+12+25+(-1+5)=78

// NOTE: Note here that the weight of the last character 'e' of the word "Spring" is -1 which is negative, so we have to add the 'alphabetic position' of 'e' (which is 5).

// Therefore, Weight of the string will be = 91 x 15 x 78 = 106470

// Notes:

// 1) input1 is an array of 26 integers representing the individual weights of the 26 alphabetic characters from A to Z.

// 2) input2 is the string (of one or more words) whose weight has to be found.

// 3) You can assume that the string will contain only alphabetic characters and every word will be separated by only one space character

// 4) The weights and alphabetic positions of the alphabets are not case-sensitive, i.e. these are the same for both upper and lower case letters.
