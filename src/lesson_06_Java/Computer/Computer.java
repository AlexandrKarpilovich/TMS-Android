package lesson_06_Java.Computer;

public class Computer {
    public int computerPrice;
    public String computerModel;
    public RandomAccessMemoryInformation memory;
    public HardDiskDriveInformation disk;

    // First constructor with first two parameters
    public Computer(int computerPrice, String computerModel) {
        this.computerPrice = computerPrice;
        this.computerModel = computerModel;
    }

    // Second constructor with all parameters
    public Computer(int computerPrice, String computerModel,
                    RandomAccessMemoryInformation memory, HardDiskDriveInformation disk) {
        this.computerPrice = computerPrice;
        this.computerModel = computerModel;
        this.memory = memory;
        this.disk = disk;
    }

    // Method for displaying information on the screen
    public void displayingComputerInformation() {
        System.out.println("Computer price: " + this.computerPrice +
                ". " + "Computer model: " + this.computerModel +
                ". " + "Memory information: " + this.memory +
                ". " + "Disk information: " + this.disk);
    }
}
