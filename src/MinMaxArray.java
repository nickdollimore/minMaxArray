import java.util.Random;
public class MinMaxArray {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10) + 1;
            System.out.println(numbers[i] + " ");
        }
        int maxValue = numbers[0];
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        System.out.println("The maximum value is " +maxValue);

        int minValue = numbers[0];
        for (int j=0; j<numbers.length; j++) {
            if (numbers[j] < minValue) {
                minValue = numbers[j];
            }
        }
        System.out.println("The minimum value is " +minValue);
    }
}



// create array of size 10

// create random object, import random function

// generate random integers between 1-10 and store it in the array
// print the array

// find the biggest value
// initiate variable maxValue, assign array index 0
// use for loops to find the maxValue and print

// find the smallest value
// initiate variable minValue, assign array index 0
// use for loops to find the minValue and print