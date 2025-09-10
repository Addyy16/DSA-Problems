import java.util.* ;
public class UserIdGeneration {
    public static String userIdGeneration(String input1, String input2, int input3, int input4){
        String smallerName ;
        String longerName;

        if(input1.length() > input2.length()){
            smallerName = input2;
            longerName = input1;
        }else if(input1.length() < input2.length()){
            smallerName = input1;
            longerName = input2;
        }else{
            if(input1.compareTo(input2) < 0){
                smallerName = input1;
                longerName = input2;
            } else if(input1.compareTo(input2) > 0){
                smallerName = input2;
                longerName = input1;
            } else{
                smallerName = input2;
                longerName = input1;
            }
        }

      //1st Approach 
        StringBuilder str = new StringBuilder();

        String pin = String.valueOf(input3);

        char lastChar = smallerName.charAt(smallerName.length()-1);
        char leftDigit = pin.charAt(input4 - 1);
        char rightDigit = pin.charAt(pin.length() - input4);

        str.append(lastChar);
        str.append(longerName);
        str.append(leftDigit);
        str.append(rightDigit);

        StringBuilder ans = new StringBuilder();
        

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                ans.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                ans.append(Character.toUpperCase(ch));
            } else {
                ans.append(ch); // keep digits as is
            }
        }

// 2nd Approach 
      
      // // Appending last letter of smallerName to string
        // int idx = smallerName.length() - 1 ;
        // char ch = smallerName.charAt(idx);
        // if(Character.isUpperCase(ch)){
        //     str.append(Character.toLowerCase(ch));
        // }else{
        //     str.append(Character.toUpperCase(ch));
        // }

        // // Appending longerName to string
        // for(int i=0; i<longerName.length(); i++){
        //     ch = longerName.charAt(i);
        //     if(Character.isUpperCase(ch)){
        //         str.append(Character.toLowerCase(ch));
        //     }else{
        //         str.append(Character.toUpperCase(ch));
        //     }
        // }

        // StringBuilder p = new StringBuilder();
        // p.append(input3);
        // StringBuilder revPin = p.reverse();
        // int n = 0;


        // int pin = Integer.parseInt(revPin.toString());

        // // Nth digit from left to right
        // while(pin > 0){
        //     n++ ;
        //     int rem = pin%10 ;
        //     if(n == input4){
        //         str.append(rem);
        //         break;
        //     }
        //     pin = pin/10 ;
        // }

        // // Nth digit from right to left
        // n = 0 ;
        // while(input3 >0){
        //     n++ ;
        //     int rem = input3%10 ;
        //     if(n == input4){
        //         str.append(rem);
        //         break;
        //     }
        //     input3 = input3/10 ;
        // }
        // return str.toString();

        return ans.toString();

        
    }

    public static void main(String args[]){
        String firstName = "Kumud";
        String lastName = "Kumar";
        int pin = 561327;
        int N = 2;
        System.out.println(userIdGeneration(firstName, lastName, pin, N));
    }
}



// ## Question :- 

// User ID Generation: Joseph's team has been assigned the task of creating user-ids for

// all participants of an online gaming competition. Joseph has designed a process for generating the user-id using the participant's First_Name, Last_Name, PIN code and a number N. The process defined by Joseph is as below -

// Step1 - Compare the lengths of First_Name and Last_Name of the participant. The one that is shorter will be called "Smaller Name" and the one that is longer will be called the "Longer Name". If both First_Name and Last_Name are of equal Length, then the name that appears earlier in alphabetical order will be called "Smaller Name" and the name that appears later in alphabetical order will be called the "Longer Name".

// Step2 - The user-id should be generated as below-、

// Last Letter of the smaller name + Entire word of the longer name + Digit at position N in the PIN when traversing the PIN from left to right + Digit at position N in the PIN when traversing the PIN from right to left

// Step3 - Toggle the alphabets of the user-id generated in step-2 i.e. upper-case alphabets should become lower-case and lower-case alphabets should become upper-case.

// Let us see a few examples.

// Example-1-If the participant's details are as below -

// First Name = Rajiv

// Last Name = Roy

// PIN = 560037

// N=6
// Step1 - Length of Last_Name is less than the Length of First_Name, so the Smaller Name is "Roy" and the Longer Name is "Rajiv"

// Step2 - The user-id will be = Last Letter of the smaller name + Entire word in the longer name + Digit at position N in the PIN when traversing the PIN from left to right + Digit at position N in the PIN when traversing the PIN from right to left = Last Letter of "Roy" + Entire word in "Rajiv" + 6th Digit of PIN from left + 6th Digit of PIN from right

// = y + Rajiv +7+5

// Therefore, user-id = yRajiv75

// Step3 - Toggle the alphabets in the user-id. So, user-id = YrAJIV75

// Example-2 - If the participant's details are as below

// First_Name = Manoj

// Last_Name = Kumar

// PIN = 561327

// N=2

// Step1 - Length of First_Name is equal to the Length of Last_Name. Alphabetically, "Kumar appears earlier than 'Manoj' (by comparing alphabetic positions of 'K' and 'M') so the Smaller Name is "Kumar" and the Longer Name is "Manoj"

// Step2 - The user-id will be = Last Letter of the smaller name + Entire word in the longer name + Digit at position N in the PIN when traversing the PIN from left to right + Digit at position N in the PIN when traversing the PIN from right to left = Last Letter of "Kumar" + Entire word in "Manoj" + 2nd Digit of PIN from left + 2nd Digit of PIN from right

// r+Manoj + 6+2

// Therefore, user-id = rManoj62
// Step3 Toggle the alphabets in the user-id. So, user-id = RmANOJ62

// Example-3- If the participant's details are as below -

// First Name Kumud

// Last_Name Kumar

// PIN = 561327

// N = 2

// Step1 Length of First_Name is equal to the Length of Last_Name. Alphabetically, "Kumar' appears earlier than 'Kumud' (by comparing alphabetic positions of 'Kuma' and 'Kumu') so the Smaller Name is "Kumar" and the Longer Name is "Kumud"

// Step2 - The user-id will be = Last Letter of the smaller name + Entire word in the longer name + Digit at position N in the PIN when traversing the PIN from left to right + Digit at position N in the PIN when traversing the PIN from right to left = Last Letter of "Kumar" + Entire word in "Kumud" + 2nd Digit of PIN from left + 2nd

// Digit of PIN from right

// = r + Kumud + 6 + 2

// Therefore, user-id=rKumud62

// Step3 - Toggle the alphabets in the user-id. So, user-id = RkUMUD62

// You are part of Joseph's team and he has asked you to write a program (method) to generate the participant's user-id using the above rules.

// You are expected to write the logic within the method

// (function) userldGeneration which provides 4 inputs as below -

// input1 is the First_Name,

// input2 is the Last_Name

// input3 is the PIN

// input4 is the number N

// The method (function) should do the processing as per rules explained above and should return the generated user-id.

// Assumption - For convenience of this assessment question, Let us assume that the value of N (input4) will always be less than or equal to the number of digits in the PIN.
