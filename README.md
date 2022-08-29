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
   5. [Lesson 05 - Multidimensional arrays](#lesson05)
   6. [Lesson 06 - Classes and Objects](#lesson06)
   7. [Lesson 07 - OOP principles](#lesson07)
   8. [Lesson 08 - Interfaces and abstract classes](#lesson08)
   9. [Lesson 09 - Exceptions](#lesson09)
   10. [Lesson 10 - String processing](#lesson10)
   11. [Lesson 11 - Collections. Part №1](#lesson11)
   12. [Lesson 12 - Collections. Part №2](#lesson12)
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

<a id="lesson06"></a>
### ___Lesson 06 - Classes and Objects___
**This lesson talked about:**
* Concept of class, object, constructor
* Methods
* Object
* equals and hashCode

**Homework required. Part №1:**
- [x] Create a class CreditCard with fields account number, current amount on the account.   
      Add a method that allows you to charge an amount to a credit card.   
      Add a method that allows you to withdraw some amount from the card.   
      Add a method that displays the current information about the card.   
      Write a program that creates three objects of class CreditCard given an account number and an initial amount.   
      Test script to check: put money on the first two cards and withdraw from the third.

**Homework. Optional part №1:**
- [x] Create a class to describe the computer, this class should contain fields: cost, model (string type), RAM and HDD.   
      You should create your own classes for the RAM and HDD fields. Classes for RAM and HDD must have a default constructor and a constructor with all parameters.   
      The RAM class has "name" and "capacity" fields.   
      The HDD class has the fields "name", "capacity" and "type" (external or internal).   
      The Computer class must have two constructors:   
       - the first one - with cost and model parameters,   
       - the second - with all fields.   
      When creating a computer object using the first constructor, the RAM and HDD fields must be created using the default constructors.    
      In each of the classes, provide methods for displaying complete information (displaying all fields and all values).

**Homework. Optional part №2:**
- [x] Create a class that describes the ATM.   
      The set of banknotes in the ATM must be specified by three properties: the number of banknotes of 20, 50 and 100 denominations.   
      Make a method for adding money to an ATM.   
      Make a function that withdraws money, which takes the amount of money, and returns a boolean value - the success of the operation.   
      When withdrawing money, the function should print how many bills of what denomination the amount is issued.   
      Create a constructor with three parameters - the number of banknotes of each denomination.   

**Difficulty doing homework:**
* Correctness of working with classes when there are several classes that depend on each other
* Overriding Methods

[Table of contents](#anchor)

<a id="lesson07"></a>
### ___Lesson 07 - OOP principles___
**This lesson talked about:**
* Inheritance 
* Encapsulation 
* Polymorphism

**Homework required. Part №1:**
- [x] Create a Phone class that contains the number, model, and weight variables.   
Create three instances of this class. Print the values of their variables to the console.   
Add methods to the Phone class: receiveCall, has one parameter - the name of the caller.   
Prints the message “{name} is ringing” to the console. getNumber - returns the phone number.  
Call these methods for each of the objects.  
Add a constructor to the Phone class that takes three parameters as input for initialization of class variables - number, model and weight.  
Add a constructor that takes two parameters as input for initialization class variables - number, model.  
Add constructor without parameters.  
Call a constructor with two parameters from a constructor with three parameters.  
Add an overloaded receiveCall method that takes two parameters - the name of the caller and the phone number of the caller.  
Call this method.  
Create a sendMessage method with variable length arguments. This method takes as input phone numbers to which the message will be sent. The method displays the numbers of these phones.

**Homework. Optional part №1:**
- [x] Create a program to simulate the work of the clinic.  
Let there be three doctors in surgery: a surgeon, a general practitioner and a dentist.  
Every doctor has a method to "treat", but every doctor heals in his own way.  
Also provide for the class "Patient" and the class "Treatment plan".  
Create an object of class "Patient" and add a treatment plan to the patient.  
Also create a method that will be prescribed by the doctor to the patient according to the treatment plan.  
If the treatment plan has code 1, a surgeon is appointed and a treatment method is prescribed.  
If the treatment plan has code 2, a dentist is appointed and a treatment method is prescribed.  
If the treatment plan has any other code, appoint a therapist and prescribe a treatment method.

**Difficulty doing homework:**
* The difficulties were in the homework of the optional part. According to the condition, as I understand it, a treatment plan is already known and a doctor is appointed from this treatment plan. But usually, first, an examination is carried out, a doctor is prescribed, and then a treatment plan and methods of treatment. After all, the patient does not come to the clinic with a treatment plan. Because of this, my solution to the task may not be entirely accurate as necessary by condition.

[Table of contents](#anchor)

<a id="lesson08"></a>
### ___Lesson 08 - Interfaces and abstract classes___
**This lesson talked about:**
* Interface concept 
* Abstract class concept 
* Abstract Methods

**Homework required. Part №1:**
- [x] Write a hierarchy of classes "Shapes".   
  Shape -> Triangle -> Rectangle -> Circle.   
  Implement area calculation function for each shape type and perimeter calculation.   
  Create an array of 5 shapes.   
  Display the sum of the perimeters of all the shapes in the array.     

**Homework required. Part №2:**
- [x] Create classes "Director", "Worker", "Accountant".   
  Implement an interface with a method that prints the job title and implement this method in the generated classes.

**Homework. Optional part №1:**
- [x] Create a system for accounting documents.
  Create a Register class that will have methods:
  - saving the document in the register
  - providing information about the document
    The system can work with three types of documents:
1) Contract for the supply of goods
   Contains fields:
   - Document Number
   - Type of goods
   - Number of goods
   - Document date
2) Contract with an employee
   Contains fields:
   - Document Number
   - Document date
   - Document date
   - Contract end date
   - Employee name
3) Financial invoice
     Contains fields:
   - Monthly total
   - Document date
   - Document Number
   - Department code
- The register class must contain an array inside itself, and when a document is added to the register, this added document must be added to the array;
- The array for the register class must be of size 10;
- For "Document Date" fields, the Date data type should be used;
- In the method of providing information about the document, you should display information about the document passed by the input parameter;
- Each class for describing documents must contain a constructor with and without parameters;
- To simulate the operation of the system, create a Main class that will contain only one public static void main method
  In this method, write code to create each of the document types, add them to the register, and display information about the document;
- Place all classes in packages;
- When performing a task, use the concepts of interfaces and abstract classes

**Difficulty doing homework:**
* It's not entirely clear when to use an abstract class and when to use an interface

[Table of contents](#anchor)

<a id="lesson09"></a>
### ___Lesson 09 - Exceptions___
**This lesson talked about:**
* Hierarchy of exceptions and errors 
* try-catch-finally 
* Custom exceptions 
* Keywords throw, throws

**Homework:**
- [x] Homework merged with tenth lesson

**Difficulty doing homework:**
* Need more practice with overriding methods

[Table of contents](#anchor)

<a id="lesson10"></a>
### ___Lesson 10 - String processing___
**This lesson talked about:**
* String 
* StringBuilder and StringBuffer

**Homework required. Part №1:**
- [x] Write a program with the following functionality:   
Pass a string to the input (we will assume that this is the document number).   
The document number has the format xxxx-yyy-xxxx-yyy-xyxy, where x is a number and y is a letter.   
Display the first two blocks of 4 digits on the screen in one line.    
Display the document number on the screen, but replace blocks of three letters with ***(each letter will be replaced with *).   
Display only one letter from the document number in the format yyy/yyy/y/y in lower case.   
Display letters from the document number in the format "Letters: yyy/yyy/y/y" in uppercase (implemented using the StringBuilder class).    
Check whether the document number contains the sequence abc and display a message whether it contains it or not (moreover, abc and ABC are considered the same sequence).   
Check if the document number starts with the sequence 555.   
Check if the document number ends with the sequence 1a2b.   
All these methods should be implemented in a separate class in static methods, which will take as input (input parameter) a string entered as input to the program.   
You also need to create your own exception classes for each situation:   
Check if the document number contains the sequence abc.   
Check if the document number starts with the sequence 555.   
Check if the document number ends with the sequence 1a2b.   
If the document number does not satisfy the condition, then "throw" an exception.   
In the class method in which these methods will be called to demonstrate operation, catch the exception with the try-catch construct and display a message in the catch block for user (message to the console).

**Homework required. Part №2:**
- [x] 1. Given a string of arbitrary length with arbitrary words.    
Find the shortest word in the string and display it on the screen.   
Find the longest word in the string and display it on the screen.   
If there are several such words, then output the last one.
- [x] 2. Given a string of arbitrary length with arbitrary words.   
Find a word in which the number of different characters is minimal.   
The word can contain letters and numbers. If there are several such words, find the first one.   
For example, in the string "fffff ab f 1234 jkjk" the found word should be "fffff".
- [x] 3. Given a string of arbitrary length with arbitrary words.  
Write a program to check if any given word in a string is a palindrome.   
For example, there is a string, the number 3 is entered, so it is necessary to check whether the 3rd word in this string is a palindrome.
Provide warning messages in case of erroneous situations: for example, there are 5 words in a line, and the number 500 was passed to the input of the program, etc. situations.
- [x] 4. An arbitrary string is given. Output to the console a new line that duplicates each letter from the initial line. For example, "Hello" -> "HHeellloo".

**Homework required. Part №3:**
- [x] Create a class that will have a static method. This method takes three parameters as input: Login, Password, confirmPassword.   
All fields are of data type String.   
Login must be less than 20 characters long and must not contain spaces.   
If login does not meet these requirements, a WrongLoginException must be thrown.   
Password must be less than 20 characters long, must not contain spaces, and must contain at least one number.   
Also, password and confirmPassword must be equal.   
If password does not meet these requirements, a WrongPasswordException must be thrown.   
WrongPasswordException and WrongLoginException are custom exception classes with two constructors - one default, the other accepts the exception message and passes it to the constructor of the Exception class.   
The method returns true if the values are true or false otherwise.

**Difficulty doing homework:**
* There were no global difficulties. Need more practice on using string methods

[Table of contents](#anchor)

<a id="lesson11"></a>
### ___Lesson 11 - Collections. Part №1___
**This lesson talked about:**
* Introduction to the Collection interface 
* Collections of type: ArrayList, LinkedList, Stack, Array Deque

**Homework required. Part №1:**
- [x] The program should compare the speed of all the main actions:   
   * Taking by index (from the beginning, from the end, from the middle)   
   * Search by element   
   * Adding (to the beginning, to the end, to the middle)   
   * Delete (to the beginning, to the end, to the middle)   

Write the result to the result.txt file.   
Attach this file to git (it should be displayed in the pull request) + code.   
Each of the lists must contain 10,000,000 elements. 

**Homework required. Part №2:**
- [x] Imagine that Java does not have a collection of type ArrayList.   
Create your own class that simulates the work of a dynamic collection class - i.e. create your custom collection.   
The collection will be based on an array.   
A custom collection must store elements of different classes (i.e. it is generic).   
Provide operations for adding an element, removing an element, getting an element by index, checking whether an element is in the collection, a method for clearing the entire collection.   
Provide constructor with no parameters - creates an array with a default size.   
Provide a constructor with a given size of the internal array.   
Provide the ability to automatically expand the collection when adding an element in the case when the collection is already full. 

**Difficulty doing homework:**
* There were no global difficulties.

[Table of contents](#anchor)

<a id="lesson12"></a>
### ___Lesson 12 - Collections. Part №2___
**This lesson talked about:**
* Set interface and HashSet class 
* The concept of hash tables 
* Map interface and HashMap class

**Homework required. Part №1:**
- Program "Accounting"   
- Write a program that will enter information into an employee's personal card. 
- Map content:
  - Information about the employee
  - Report for each month (for 2-3 years). Report content:
    - Delivered production plan
    - Fact of execution
    - salary amount
    - The amount of the bonus (from the size: bonus = salary, if the fact of implementation = 2 * production plan; if the actual implementation is 1.5 * plan - bonus 0.5 salary, etc.)
    - The employee is familiar
  - Card number
  - Date of creation of the card = date of employment of the employee
  - The fact of affixing all signatures by the employee   
- The accounting department, after updating the employee's card (initial filling + filling for the current month), sends the card to the employee for signature (familiarization). The employee is ALWAYS required to sign the document.
* Use interface Map. Provide information on the screen (document history)

**Homework. Optional part №1:**
- Continuation of the required task. 
- Each worker is a separate directory. 
- Each report is a separate file inside the worker's directory. 
- Ensure that the data of employees' cards is updated.

**Homework. Optional part №2:**
- Continuation of an optional task. 
- Provide organization analytics in a separate file. 
- The analytics report should contain:
  - Number of employees who completed the plan (for the completed year)
  - Ranked list of employees (1st - maximum performance in kind, last - minimum performance)
  - Ranked list of employees (1st - maximum performance in relative terms, last - minimum performance)
  - Salary costs for workers
  - The cost of bonuses to workers
  - Ranked list of employees (1st - maximum bonus, last - minimum bonus)
  - List of employees who have not met the annual plan for the last 3 years in a row. 
- Each output of information to sign. The file must be readable. Execution in Russian.

**Difficulty doing homework:**
* I lacked a general understanding of the material, as well as time, as I was in the hospital

[Table of contents](#anchor)