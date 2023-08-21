/*3. add one

You are given an array of integers digits representing the digits of a positive integer. For example, digits = [1, 2, 3] represents the integer 123.

It is guaranteed that digits does not have any leading zeros.

Assuming that digits represents the integer n, your task is to return an array that represents the integer n + 1.

Example

    For digits = [1, 2, 3], the output should be solution(digits) = [1, 2, 4];
    For digits = [1, 2, 9], the output should be solution(digits) = [1, 3, 0];
    For digits = [9, 9, 9], the output should be solution(digits) = [1, 0, 0, 0].

Input/Output

    [execution time limit] 0.5 seconds (cs)

    [memory limit] 1 GB

    [input] array.integer digits

    An array with integer digits from 0 to 9.

    Guaranteed constraints:
    1 ≤ digits.length ≤ 104,
    0 ≤ digits[i] ≤ 9.

    [output] array.integer

    Return an array that represents the digits of n + 1.*/


import java.lang.Math;
public class test2
{
    public static int Arr2Value(int[] arr)
    {
               int n = arr.length;
        int value = 0;
        int j = arr.length-1;

        //Finding Value of Array in integer

        for(int i = 0; i <n ; i++)
        {
           value = value + arr[i]*(int)Math.pow(10, j);

           j--;

        }
        // Adding 1 to value

        value = value + 1;

        return value;

    }

    public static int[] ReturnNewArray (int value)
    {
        int temp = 0;
        int x = 0;
        
        int newvalue = value;

        while(value > 0)
        {
            value = value/10;
         

            temp++;


        }

        int []arr2 = new int[temp];
        int index = arr2.length-1; 
        while(newvalue > 0)
        {
            arr2[index] = newvalue%10;
           newvalue =  newvalue/10;

            index--;

        }

        return arr2;


    }
     public static void PrintArray(int []arr)
        {

        for(int z = 0; z < arr.length; z++)
        {
            System.out.print(arr[z]+" ");
        }

        }

    
    public static void main(String[] args) {
        
        int arr[]={9,9,9};
        int value = Arr2Value(arr);

        int arr2[] = ReturnNewArray(value);
        
        PrintArray(arr2);

    }
}