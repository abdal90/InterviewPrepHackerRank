package bubbleSort;

import java.util.Scanner;

// Given an array of integers, sort the array in ascending order using the Bubble Sort algorithm above
public class Solution {
    private static int[] array;

    private static void bubbleSort() {
         // number of swaps for all array iterations
        int totalSwaps = 0;

        for (int i = 0; i < array.length; i++) {
            // number of swaps for current array iteration
            int numSwaps = 0;
            // bubblesort
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    numSwaps++;
                    totalSwaps++;
                }
            }

            if (numSwaps == 0) {
                System.out.printf("Array is sorted in %d swaps.\n", totalSwaps);
                System.out.printf("First Element: %d\n", array[0]);
                System.out.printf("Last Element: %d\n", array[array.length - 1]);

                break;
            }
        }
    }

    public static void main(String[] args){
        // declare scanner
        Scanner in = new Scanner(System.in);
        // declare number in array
        int n = in.nextInt();
        // create new array
        array = new int[n];
        // insert numbers into array
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        in.close();

        // call bubble sort
        bubbleSort();
    }
}
