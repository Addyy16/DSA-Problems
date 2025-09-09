public class SumOfPrimeNumbers {

    public static int sumPrimeExceptLargest(int[] input1, int input2){
        if (input1 == null || input1.length == 0) {
            return 0; 
        }

        int sumPrime = 0;
        int sumAll = 0;
        int maxPrime = -1;
        int max = Integer.MIN_VALUE;
        int primeCount = 0;

        for(int i=0; i<input1.length; i++){
            sumAll += input1[i];
            if(max < input1[i]){
                max = input1[i];
            }
            if(isPrime(input1[i])){
                primeCount++ ;
                sumPrime += input1[i];
                if(maxPrime < input1[i]){
                    maxPrime = input1[i];
                }
            }
        }
        if(primeCount > 0){
            if(primeCount == 1){
                return maxPrime;
            }
            return sumPrime - maxPrime ;
        }
        return sumAll - max;
    }

    public static boolean isPrime(int num){
        if(num == 1){
            return false;
        }

        if(num == 2){
            return true;
        }
        if(num %2 == 0){
            return false;
        }

        for(int i=3; i*i<= num; i+= 2){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int[] arr = {10,41,18,50,43,31,29,25,59,96,67};
        System.out.println(sumPrimeExceptLargest(arr));
    }
}



// ## Question :-

// Find sum of all prime numbers in the array, except the largest prime number:
// Madhav has been assigned the task of finding the sum of all prime numbers in a given array, except the largest prime number in the array. Madhav approaches you to help him do this by writing a program.
// Given an array of numbers, you are expected to find the sum of all prime numbers in the given array. You must however exclude the largest prime number while performing this addition.

// For Example -
// If input1={10,41,18,50,43,31,29,25,59,96,67) representing the given array, and, input2 = 11 representing the number of elements in the array, then the expected output is 203, which is the sum of all prime numbers in this array except the largest prime number 67.
// Explanation: The prime numbers in this array are 41, 43, 31, 29, 59 and 67.
// The largest prime number in this array is 67. So, let us leave out 67 and add all the other prime numbers to get the output.

// Therefore, output = 41+43+31+29+59 = 203

// Special conditions to be taken care:

// Note: If the array does NOT contain any prime number, the output should be the sum of all numbers in the array except the largest number.

// For example, If input1={10,20,30,40} and input2 = 4 representing the number of elements in the array, then the expected output = 10+20+30= 60.
