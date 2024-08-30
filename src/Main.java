import java.util.Arrays;

//Step 3: Find the largest number in the array and print it to the console.
//
//Step 4: Create a second array with numbers from 11 to 20.
//
//Step 5: Perform element-wise addition of both arrays and store the result in a third array. Print the result array to the console.
//
//Please post the link to your GitHub repository here, where you have solved this task together.

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        task1(numbers);
        task2(numbers);
    }

    //Step 1: Create an array with numbers from 1 to 10 and print it to the console.
    private static void task1(int[] numbers) {
        System.out.println("Task 1");
        System.out.println(Arrays.toString(numbers));
    }

    //Step 2: Calculate the sum of all numbers in the array and print the result to the console.
    private static void task2(int[] numbers) {
        System.out.println("Task 2");
        int acc = 0;
        for (int element : numbers) {
            acc += element;
        }
        System.out.println(acc);
    }

    public static void task3(int[] numbers){
        System.out.println("Task 3");
        int largestNumber = numbers[0];
        for (int element : numbers) {
            if (element > largestNumber) {
                largestNumber = element;
            }
        }
        System.out.println(largestNumber);
    }
}