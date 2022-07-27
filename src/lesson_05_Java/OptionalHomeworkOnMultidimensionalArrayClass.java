package lesson_05_Java;

import java.util.Arrays;
import java.util.Scanner;

public class OptionalHomeworkOnMultidimensionalArrayClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        1. Multiplication of two matrices. Construction of two arrays of 3x3 sizes (two matrices). Write
           program for multiplying two matrices.
           Test data:
               first array {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}}
               second array {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}}
               result: {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}}
         */

        /*
        To multiply matrices, it is necessary that the number of ROWS of the SECOND matrix must be equal to the number
        of COLUMNS of the FIRST matrix, or the number of COLUMNS of the SECOND matrix must be equal to the number
        of ROWS of the FIRST matrix
        */

        int[][] array11 = new int[3][3]; // Create a first empty array
        int[][] array12 = new int[3][3]; // Create a second empty array
        int[][] resultArray = new int[3][3]; // Create a result empty array99

        // Fill both arrays with numbers from 0 to 9
        for (int i = 0; i < array11.length; i++) {
            for (int j = 0; j < array11[i].length; j++) {
                array11[i][j] = (int) (Math.random() * 9);
                array12[i][j] = (int) (Math.random() * 9);
            }
        }

        System.out.println("First array: " + Arrays.deepToString(array11));
        System.out.println("Second array: " + Arrays.deepToString(array12));

        // Pass through the indices of the rows of the first matrix
        for (int i = 0; i < array11.length; i++) {
            // Pass through the indices of the common side of two matrices:
            // along the columns of the first matrix and along the rows of the second matrix
            for (int j = 0; j < array12.length; j++) {
                // Pass through the indices of the columns of the second matrix
                for (int k = 0; k < resultArray.length; k++) {
                    resultArray[i][j] += array11[i][k] * array12[k][j];
                }
            }
        }

        System.out.println("Result array: " + Arrays.deepToString(resultArray));

        // Line to separate tasks
        System.out.println("---------------------------------------------------------------\n");

        /*
        2. Create a two-dimensional array of integers. Print the sum of all elements to the console.
         */

        int sumOfArray2Elements = 0; // Create sum variable equal to zero

        // Ask the user for the number of rows and the number of columns of the matrix
        System.out.print("Please enter the number of array rows: ");
        int numberOfRows2 = sc.nextInt();
        System.out.print("Please enter the number of array columns: ");
        int numberOfColumns2 = sc.nextInt();

        // Create an empty array with the number of rows and columns specified by the user
        int[][] array2 = new int[numberOfRows2][numberOfColumns2];

        // Fill the array with integers from 0 to 9
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = (int) (Math.random() * 9);
                sumOfArray2Elements += array2[i][j];
            }
        }

        System.out.println("Source array: " + Arrays.deepToString(array2));
        System.out.println("Sum of array elements: " + sumOfArray2Elements);

        // Line to separate tasks
        System.out.println("---------------------------------------------------------------\n");

        /*
        3. Create a two-dimensional array. Print the diagonals of the array to the console.
         */

        // Ask the user for the number of rows and the number of columns of the matrix
        System.out.print("Please enter the number of array rows: ");
        int numberOfRows3 = sc.nextInt();
        System.out.print("Please enter the number of array columns: ");
        int numberOfColumns3 = sc.nextInt();

        // Create an empty array with the number of rows and columns specified by the user
        int[][] array3 = new int[numberOfRows3][numberOfColumns3];

        System.out.println("Source array: ");
        // Fill the array with integers from 0 to 9
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                array3[i][j] = (int) (Math.random() * 9);
            }
            System.out.println(Arrays.toString(array3[i]));
        }

        String mainDiagonal = ""; // Create a string variable to add and display information
        // Output main diagonal of the array
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                if (i == j) {
                    mainDiagonal += array3[i][j] + " ";
                }
            }
        }
        System.out.println("Main diagonal: " + mainDiagonal);

        String sideDiagonal = ""; // Create a string variable to add and display information
        // Output side diagonal of the array
        // The first loop "reverses the array" from the last to the first component and then iterates as usual
        for (int i = array3.length - 1; i >= 0; i--) {
            for (int j = 0; j < array3[i].length; j++) {
                if ((i + j) == (array3.length) - 1) {
                    sideDiagonal += array3[i][j] + " ";
                }
            }
        }
        System.out.println("Side diagonal: " + sideDiagonal);

        // Line to separate tasks
        System.out.println("---------------------------------------------------------------\n");

        /*
        4. Create a two-dimensional array of integers. Sort the elements in the rows of a two-dimensional array by
           ascending.
         */

        // Ask the user for the number of rows and the number of columns of the matrix
        System.out.print("Please enter the number of array rows: ");
        int numberOfRows4 = sc.nextInt();
        System.out.print("Please enter the number of array columns: ");
        int numberOfColumns4 = sc.nextInt();

        // Create an empty array with the number of rows and columns specified by the user
        int[][] array4 = new int[numberOfRows4][numberOfColumns4];

        System.out.println("Source array: ");
        // Fill the array with integers from 0 to 9
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                array4[i][j] = (int) (Math.random() * 9);
            }
            System.out.println(Arrays.toString(array4[i]));
        }

        System.out.println("\nSorted array: ");
        // Pass through the elements of the external array and sort the internal one through the sort method
        for (int[] outerArray : array4) {
            Arrays.sort(outerArray);
            System.out.println(Arrays.toString(outerArray));
        }

    }
}
