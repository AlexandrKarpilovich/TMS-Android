# TeachMeSkills - Android-developer

#### This repository was created as part of training at the "TeachMeSkills" school at the "Android developer" course.
___

### Student: ___Aleksandr Karpilovich___
### Course: ___Android developer___
### Group: ___AN10-onl___
___

<a id="anchor"></a>
## Table of contents
1. [Chapter №1: Java](#chapter01)
   1. [Lesson 01 - Introduction to java](#lesson01)
   2. [Lesson 02 - Repositories](#lesson02)
   3. [Lesson 03 - Variables, expressions, operators](#lesson03)
   4. [Lesson 04 - One-Dimensional arrays](#lesson04)
   4. [Lesson 05 - Multidimensional arrays](#lesson05)
___

<a id="chapter01"></a>
## Chapter №1: Java

<a id="lesson01"></a>
### ___Lesson 01 - Introduction to java___
**This lesson talked about:**
* what Java is,
* the main components of the Java language,
* how this language is tripled,
* the advantages and disadvantages of the Java language,
* the main IDEs for development.
* how create the first simple Java program.

**Homework required:**
- [x] study the lecture material
- [x] install JDK 
- [x] install IDE - Intellij Idea
- [x] write the first program

**Difficulty doing homework:**
* There were no problems with homework.

[Table of contents](#anchor)
___

<a id="lesson02"></a>
### ___Lesson 02 - Repositories___
**This lesson talked about:**
* what repositories are,
* what GIT is and why it is needed,
* the difference between GitHub, GitLabs and BitBucket,
* how to register in GitHub,
* the basic Git commands and how to use them in the terminal and via GitHub,
* how to work with Git through an IDE.

**Homework required:**
- [x] create a repository on GitHub,
- [x] there must be a README.md file in the master/main branch,
- [x] The README.md file must contain:
  - [x] first and last name,
  - [x] name of the course and module, 
  - [x] theme of each lesson, 
  - [x] a description of what was done in each homework,
  - [x] difficulties encountered in each lesson or homework,
- [x] add the email address of the teacher as a project participant ,
- [x] add teachers to assignees and reviewers in all pull requests,
- [x] add files from the first and second lessons to branches other than main and make a pull request.

**Difficulty doing homework:**
* There were difficulties with creating branches in order to correctly create a pull request. And also need more practice in working with GIT with the terminal.

[Table of contents](#anchor)
___

<a id="lesson03"></a>
### ___Lesson 03 - Variables, expressions, operators___
**This lesson talked about:**
* Literals 
* Data types
* Type casting
* Java statements
* Priority of operations

**Homework required. Part №1:**
- [x] Write a program to display the time of year by month number.
- [x] Should be two options: switch-case and if-else-if.
- [x] Write a program that will take a number than input (can be set explicitly in the code) and will display a message about the parity of the number.
- [x] For the number (outdoor temperature) it turns out:
    - if t > 15, then output "Heat"
    - if t <= 15 and t > -5, then it turns out "Normal"
    - if t <= 5, then it will be "Cold".
- [x] By the entered (can be set explicitly) number, determine the color of the rainbow.

**Homework required. Part №2:**
- [x] Use a for loop to display odd numbers from 1 to 99. (use increment).
- [x] Use a for loop to display numbers from 15 to 1. (use decrement).
- [x] Write a program where the user enters any positive integer - N. Program sums all numbers from 1 to N. To enter a number, use the Scanner class.
- [x] Write a program that will display the following sequence on the screen: 7 14 21 28 35 42 49 56 63 70 77 84 91 98. Use the while loop in the solution.
- [x] Output the first 10 numbers of the sequence 0, -5, -10, -15...
- [x] Write a program that displays the squares of numbers from 10 to 20 inclusive.

**HoHomework. Optional part:**
- [x] Display the first 11 terms of the Fibonacci sequence.
- [x] For each month, the bank accrues 7% of the amount to the deposit amount. Write a program that the user enters the deposit amount and the number of months. And the bank calculates the final amount of the deposit taking into account the accrual of interest in each month. To calculate an amount including interest use a for loop.
- [x] Write a program that prints the multiplication table to the console.

**Difficulty doing homework:**
* There were no problems with homework. Material learned and understood.

[Table of contents](#anchor)

<a id="lesson04"></a>
### ___Lesson 04 - One-Dimensional arrays___
**This lesson talked about:**
* What are arrays
* One-dimensional arrays
* Methods for working with arrays
* Array sorting algorithms

**Homework required. Part №1:**
- [x] Create an array of integers. Write a program that displays a message saying whether the given number is in the array or not. Let the search number be specified from the console (Scanner class).
- [x] Create an array of integers. Remove all occurrences of the given number from the array. Let the number is set from the console (Scanner class). If there is no such number, print a message about it.
- [x] Create and fill an array with random numbers and output the minimum, maximum and average value. To generate a random number, use the method Math.random(). Let it be possible to create an array of arbitrary size. Let the size of the array is entered from the console.
- [x] Create 2 arrays of 5 numbers. Print the arrays to the console on two separate lines. Calculate the arithmetic mean of the elements of each array and tell for which from the arrays, this value turned out to be greater (or report that their averages arithmetic are equal).

**Homework. Optional part:**
- [x] Create an array of N-random integers and print it to the screen. Let the size of the array is set from the console and the size of the array can be greater than 5 and less than or equal to 10. If N is not satisfies the conditions - display a message. If the user entered the wrong N, then the program should ask the user to repeat the input. Create a second array of only even ones elements of the first array, if any, and display it on the screen.
- [x] Create an array and populate it. Print the array to the screen as a string. Will replace each element with odd index to 0. Again, display the array on a separate line.
- [x] Create an array of strings. Fill it in with arbitrary people's names. Sort the array. Output the result to the console.
- [x] Implement the bubble sort algorithm by commenting on each step.

**Difficulty doing homework:**
* The problems were from the second task of the first part of the homework. I did not understand how to correctly add all elements to the new array, except for unnecessary ones.

[Table of contents](#anchor)

<a id="lesson05"></a>
### ___Lesson 05 - Multidimensional arrays___
**This lesson talked about:**
* Two-dimensional, three-dimensional and n-dimensional arrays 
* Array operations

**Homework required. Part №1:**
- [x] Create a three-dimensional array of integers. With the help of cycles "pass" throughout array and increment each element by the given number. Let the number that will be increase each element, is set from the console.
- [x] Chess board. Create a checkerboard coloring program with cycle. Use a two-dimensional 8x8 String array.
  Use cycles to set elements of value B (Black) or W (White). The result of the program:  
W B W B W B W B  
B W B W B W B W  
W B W B W B W B  
B W B W B W B W  
W B W B W B W B  
B W B W B W B W  
W B W B W B W B  
B W B W B W B W

**Homework. Optional part:**
- [x] Multiplication of two matrices. Construction of two arrays of 3x3 sizes (two matrices). Write program for multiplying two matrices. Test data:
  * first array {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}}
  * second array {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}}
  * result: {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}}
- [x] Create a two-dimensional array of integers. Print the sum of all elements to the console.
- [x] Create a two-dimensional array. Print the diagonals of the array to the console.
- [x] Create a two-dimensional array of integers. Sort the elements in the rows of a two-dimensional array by ascending.

**Difficulty doing homework:**
* There were minor difficulties with the first and third tasks from the additional homework. 
  * In the first task, it is not the most obvious how to correctly multiply a matrix row by a column. 
  * In the third task, I did not immediately come to how to correctly derive the side diagonal.

[Table of contents](#anchor)