package ArrayLeftRotation;

import java.util.Scanner;

public class Solution {

    public static int[] rotateArray(int[] arr, int shiftLeft){
        // Because the constraints state d < n, we need not concern ourselves with shifting > n units.
        int arrayLenght = arr.length;

        // Create new array for rotated elements:
        int[] rotated = new int[arrayLenght];

        // Copy segments of shifted elements to rotated array:
        System.arraycopy(arr, shiftLeft, rotated, 0, arrayLenght - shiftLeft);
        for(int i : rotated) {
            System.out.print(i + " ");
        }
        System.arraycopy(arr, 0, rotated, arrayLenght - shiftLeft, shiftLeft);

        return rotated;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("numbers in array");
        int arrayNumber = scanner.nextInt();
        System.out.println("how many times to loop?");
        int loopNumber = scanner.nextInt();
        int[] numbers = new int[arrayNumber];

        // Fill initial array:
        System.out.println("fill array");
        for(int i = 0; i < arrayNumber; i++){
            System.out.println(i);
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        // Rotate array by loopNumber elements:
        numbers = rotateArray(numbers, loopNumber);

        // Print array's elements as a single line of space-separated values:
        for(int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}



