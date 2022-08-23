package lesson_11_Java.list_comparison;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Compare the performance of 2 collections: ArrayList, LinkedList.
 * The program should compare the speed of all the main actions:
 * - Taking by index (from the beginning, from the end, from the middle)
 * - Search by element
 * - Adding (to the beginning, to the end, to the middle)
 * - Delete (to the beginning, to the end, to the middle)
 * Write the result to the result.txt file.
 * Attach this file to git (it should be displayed in the pull request) + code.
 * Each of the lists must contain 10,000,000 elements.
 */
public class MainListComparison {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        // Asking for a line
        System.out.print("Enter the line: ");
        String getElement = scanner.nextLine();

        // Create an empty ArrayList variable
        List<String> arrayList = new ArrayList<>();
        // Create an empty LinkedList variable
        List<String> linkedList = new LinkedList<>();

        // Create an empty variable that will store the result of the methods
        List<String> resultList = new ArrayList<>();

        // Create a class object that contains methods for comparing ArrayList and LinkedList
        WorkWithLists list = new WorkWithLists();

        /*
            Add the results of the methods to the resulting list.
            An ArrayList or a LinkedList and their names, respectively,
            will be passed to the input of each function call
         */
        // Passing parameters to the method of filling lists
        resultList.add(list.fillingTheList(arrayList, "ArrayList"));
        resultList.add(list.fillingTheList(linkedList, "LinkedList"));

        // Passing parameters to the method taking by the first index
        resultList.add(list.takeByFirstIndex(arrayList, "ArrayList"));
        resultList.add(list.takeByFirstIndex(linkedList, "LinkedList"));

        // Passing parameters to the method taking by the last index
        resultList.add(list.takeByLastIndex(arrayList, "ArrayList"));
        resultList.add(list.takeByLastIndex(linkedList, "LinkedList"));

        // Passing parameters to the method taking by the middle index
        resultList.add(list.takeByMiddleIndex(arrayList, "ArrayList"));
        resultList.add(list.takeByMiddleIndex(linkedList, "LinkedList"));

        // Passing parameters to the element search method
        // Also passing the value to be found to this method.
        // And since the list consists of empty strings, it will just enumerate the entire list
        resultList.add(list.searchByElement(arrayList, getElement, "ArrayList"));
        resultList.add(list.searchByElement(linkedList, getElement, "LinkedList"));

        // Passing parameters to the method that adds the element to the beginning of the string
        resultList.add(list.addingTheFirstElement(arrayList, getElement, "ArrayList"));
        resultList.add(list.addingTheFirstElement(linkedList, getElement, "LinkedList"));

        // Passing parameters to the method that adds the element to the end of the string
        resultList.add(list.addingTheLastElement(arrayList, getElement, "ArrayList"));
        resultList.add(list.addingTheLastElement(linkedList, getElement, "LinkedList"));

        // Passing parameters to the method that adds the element to the middle of the string
        resultList.add(list.addingTheMiddleElement(arrayList, getElement, "ArrayList"));
        resultList.add(list.addingTheMiddleElement(linkedList, getElement, "LinkedList"));

        // Passing parameters to the method that removes the element to the beginning of the string
        resultList.add(list.removeTheFirstElement(arrayList, "ArrayList"));
        resultList.add(list.removeTheFirstElement(linkedList, "LinkedList"));

        // Passing parameters to the method that removes the element to the end of the string
        resultList.add(list.removeTheLastElement(arrayList, "ArrayList"));
        resultList.add(list.removeTheLastElement(linkedList, "LinkedList"));

        // Passing parameters to the method that removes the element to the middle of the string
        resultList.add(list.removeTheMiddleElement(arrayList, "ArrayList"));
        resultList.add(list.removeTheMiddleElement(linkedList, "LinkedList"));

        // The variable stores the path to the file in which the results of the program will be written.
        String filePath = "D:/learning/TMS-Android-developer/src/lesson_11_Java/list_comparison/result.txt";

        // Write the results of the work to a file
        try {
            writeFile(filePath, resultList);
            System.out.println("File writing completed");
        } catch (IOException e) {
            throw new IOException("Writing to file failed");
        }
    }

    /*
        Method for creating a file and writing the result of work to it.
        It takes as parameters a string with the path to the file and the resulting list
     */
    public static void writeFile(String filePath, List<String> resultList) throws IOException {
        // Create a new file
        File file = new File(filePath);

        // Check if the file exists and if not, create a new one
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.err.println("Failed to write to file");
            throw new IOException("File creation error");
        }

        // Create a recording file
        try (FileWriter fw = new FileWriter(file)) {

            // Go through the elements of the resulting list and write the elements line by line to the file
            for (int i = 0; i < resultList.size(); i++) {
                fw.write(resultList.get(i) + "\n");

                // Add a separator every two lines
                if (i % 2 != 0) {
                    fw.write("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
