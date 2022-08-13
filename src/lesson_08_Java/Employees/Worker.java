package lesson_08_Java.Employees;

/**
 * The class returns information about the job title
 */
class Worker implements PrintJobTitle{

    // Overridden show job title method
    @Override
    public String printJobTitle() {
        return "Worker";
    }
}
