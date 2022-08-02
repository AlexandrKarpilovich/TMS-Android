package lesson_06_Java.Computer;

public class HardDiskDriveInformation {
    public String diskName;
    public int diskSpace;
    public String diskType;

    // First empty constructor (default constructor)
    public HardDiskDriveInformation() {

    }

    // Second constructor with all parameters
    public HardDiskDriveInformation(String diskName, int diskSpace, String diskType) {
        this.diskName = diskName;
        this.diskSpace = diskSpace;
        this.diskType = diskType;
    }

    // Method for displaying information on the screen
    public void displayingDiskInformation() {
        System.out.println("HDD name: " + this.diskName +
                ". " + "HDD space: " + this.diskSpace +
                ". " + "HDD type: " + this.diskType);
    }

    @Override
    public String toString() {
        return "{" +
                "HDD name: '" + diskName + '\'' +
                ", HDD space: " + diskSpace +
                ", HDD type: '" + diskType + '\'' +
                '}';
    }
}
