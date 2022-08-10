package lesson_08_Java.Employees;

/**
 * Create classes "Director", "Worker", "Accountant".
 * Implement an interface with a method that prints the job title and implement this method in the generated classes
 */
class MainEmployees {
    public static void main(String[] args) {

        PrintJobTitle director = new Director(); // Create a director object
        PrintJobTitle worker = new Worker(); // Create a worker object
        PrintJobTitle accountant = new Accountant(); // Create an accountant object

        // Create an array of employees
        PrintJobTitle[] employees = new PrintJobTitle[]{director, worker, accountant};

        // Loop through the elements of the array and show job title
        for (PrintJobTitle employee : employees) {
            System.out.println(employee.printJobTitle());
        }
    }
}
