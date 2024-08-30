import java.util.Arrays;
import java.util.Scanner;


//Step 5: Perform element-wise addition of both arrays and store the result in a third array. Print the result array to the console.
//
//Please post the link to your GitHub repository here, where you have solved this task together.

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numbers2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        task1(numbers);
        task2(numbers);
        task3(numbers);
        task5(numbers, numbers2);
        readText();
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

    public static void task3(int[] numbers) {
        System.out.println("Task 3");
        int largestNumber = numbers[0];
        for (int element : numbers) {
            if (element > largestNumber) {
                largestNumber = element;
            }
        }
        System.out.println(largestNumber);
    }

    public static void task5(int[] numbers, int[] numbers2) {
        int minLength = Math.min(numbers.length, numbers2.length);
        int[] sumArray = new int[minLength];

        for (int i = 0; i < minLength; i++) {
            sumArray[i] = numbers[i] + numbers2[i];
        }

        System.out.println("Task 5");
        System.out.println(Arrays.toString(sumArray));
    }

    //  Bonus Task:  Implement a program that reads a text from the console and then outputs the letters individually. Tip: Learn about the Scanner class.
    public static void readText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a text to read: ");

        String enteredText = scanner.nextLine();
        System.out.println("Bonus Task");


//        with for each loop
        for (char c : enteredText.toCharArray()) {
            System.out.println(c);
        }


//        with for loop
        for (int i = 0; i < enteredText.length(); i++) {
            System.out.println(enteredText.charAt(i));

        }

        System.out.println("The text is: " + enteredText);
    }
}