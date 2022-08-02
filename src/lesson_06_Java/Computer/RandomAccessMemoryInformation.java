package lesson_06_Java.Computer;

public class RandomAccessMemoryInformation {
    public String memoryName;
    public int memorySpace;

    // First empty constructor (default constructor)
    public RandomAccessMemoryInformation() {

    }

    // Second constructor with all parameters
    public RandomAccessMemoryInformation(String memoryName, int memorySpace) {
        this.memoryName = memoryName;
        this.memorySpace = memorySpace;
    }

    // Method for displaying information on the screen
    public void displayingMemoryInformation() {
        System.out.println("RAM name: " + this.memoryName +
                ". " + "RAM space: " + this.memorySpace);
    }

    @Override
    public String toString() {
        return "{" +
                "RAM name: '" + memoryName + '\'' +
                ", RAM space: " + memorySpace +
                '}';
    }
}
