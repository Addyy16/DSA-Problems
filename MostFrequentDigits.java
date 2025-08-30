class MostFrequentDigits{
    public  int mostFrequentDigit(int[] input1, int input2){
        int[] freq = new int[10];

        for(int i=0; i<input1.length; i++){
            int n = input1[i];
            while(n>0){
                int rem = n%10;
                freq[rem]++ ;
                n = n/10 ;
            }
        }

        int max = 0; 
        int index = -1;
        for(int i=0; i<freq.length; i++){
            if(freq[i] > max){
                max = freq[i];
                index = i ;
            }
            if(max == freq[i]){
                index = Math.max(index, i);
            }
        }
        return index;
    }

    public static void main(String args[]){
        int[] arr = {1267, 202, 503, 56, 4, 86,402};
        int n = arr.length;
        MostFrequentDigits m = new MostFrequentDigits();
        System.out.println(m.mostFrequentDigit(arr, n));
    }
}


// Question :- 

// Find the Most Frequently Occurring Digit in a series of numbers.

// Kamal is a data analyst in a lottery management organization.

// One of the tasks assigned to Kamal is to find the Most Frequently Occurring Digit in a series of input numbers.

// Below are a couple of examples to illustrate how to find the Most Frequently Occurring Digit in a series of input numbers.

// Example1-

// If the series of input numbers are [1237, 262, 666, 140)

// We notice that,

// 0 occurs 1 time

// 1 occurs 2 times

// 2 occurs 3 times

// 3 occurs 1 time

// 4 occurs 1 time

// 5 occurs 0 times

// 6 occurs 4 times

// 7 occurs 1 time

// 8 occurs 0 times

// 9 occurs 0 times

// We observe that-

// 4 is the highest frequency in this series, and,

// 6 is the digit that occurs 4 times.

// Thus, the Most Frequently Occurring Digit in this series is 6.

// NOTE: If more than one digit occur the most frequent time, then the largest of the digits should be chosen as the answer. See below example for clarity on this point.

// NOTE: If more than one digit occur the most frequent time, then the largest of the digits should be chosen as the answer. See below example for clarity on this point.

// Example2-

// If the series of input numbers is [1237, 202, 666, 140]

// We notice that,

// 0 occurs 2 times

// 1 occurs 2 times

// 2 occurs 3 times

// 3 occurs 1 time

// 4 occurs 1 time

// 5 occurs 0 times

// 6 occurs 3 times

// 7 occurs 1 time

// 8 occurs 0 times

// 9 occurs 0 times

// We observe that-

// 3 is the highest frequency in this series, and,

// 2 and 6 are the digits that occur 3 times.

// The larger of the two digits (2 and 6) is 6. Thus, the Most Frequently Occurring Digit in this series is 6.