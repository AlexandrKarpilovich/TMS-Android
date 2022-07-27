package lesson_05_Java;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArrayHomeworkClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        1. Create a three-dimensional array of integers. With the help of cycles "pass" throughout array and
           increment each element by the given number. Let the number that will be increase each element,
           is set from the console.
        */

        int[][][] array = new int[2][3][4]; // Create a three-dimensional empty array

        // Fill the array with integers from 0 to 9
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }

        System.out.println("Source array: " + Arrays.deepToString(array));

        // Ask the user for a number
        System.out.print("Please enter the number by which you want to increase each element of the array: ");
        int inputNumber = sc.nextInt();

        // Increment array by user-specified number
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += inputNumber;
                }
            }
        }

        System.out.println("Modified array: " + Arrays.deepToString(array));

        // Line to separate tasks
        System.out.println("---------------------------------------------------------------\n");

        /*
        2. Chess board. Create a checkerboard coloring program with cycle. Use a two-dimensional 8x8 String array.
           Use cycles to set elements of value B (Black) or W (White). The result of the program: W B W B W B W B
                                                                                                  B W B W B W B W
                                                                                                  W B W B W B W B
                                                                                                  B W B W B W B W
                                                                                                  W B W B W B W B
                                                                                                  B W B W B W B W
                                                                                                  W B W B W B W B
                                                                                                  B W B W B W B W
        */

        String[][] chessBoardArray = new String[8][8]; // Create a two-dimensional empty array

        // Fill the array with letter W (white) and B (black)
        for (int i = 0; i < chessBoardArray.length; i++) {
            for (int j = 0; j < chessBoardArray[i].length; j++) {
                // If the index of the element is even, then write to it "W", else write to it "B"
                if ((i + j) % 2 == 0) {
                    chessBoardArray[i][j] = "W";
                } else {
                    chessBoardArray[i][j] = "B";
                }
            }
        }

        // Output chess board
        for (String[] outerArray : chessBoardArray) {
            for (String innerArrayElement : outerArray) {
                System.out.printf(innerArrayElement + "  ");
            }
            System.out.println();
        }

    }
}

