import java.util.* ;
class MaxStudents {
    public static int maxStudents(int input1, int[] arr){
        int odd = 0;
        int even = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                even++ ;
            }else{
                odd++ ;
            }
        }

        return Math.min(odd, even);
        
    }

    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6};
        System.out.println(maxPersons(1,arr));
    }
}


## Question :- 

You are a teacher organizing a field trip for your students. You have a class of N students, and you want to divide them into two groups for the trip. However, you have a special requirement:

One group should only consist of students with even-numbered IDs.

The other group should only consist of students with odd-numbered IDs.

Both groups must be of the same size.

Your task is to find and return an integer value representing the maximum number of students that can be included in both groups.

Input Specification

input1: An integer value N, representing the total number of students.

input2: An integer array containing the IDs of the students.

Output Specification

Return an integer value representing the maximum number of students that can be included in both groups.
  

Example 1

Input:

input1: 4
input2: (1, 2, 3, 4)


Output:

4
  
Explanation:
We have 2 odd IDs (1, 3) and 2 even IDs (2, 4).
Both groups can have 2 students each.
So total students included = 4.

Example 2
input1: 6
input2: (11, 12, 13, 14, 15, 16)


Output:

3

Example 3
input1: 5
input2: (2, 4, 6, 8, 10)


Output:

0

Example 4
input1: 7
input2: (1, 3, 5, 7, 2, 4, 6)


Output:

3

Example 5 (Edge Case)
input1: 1
input2: (7)


Output:

0
