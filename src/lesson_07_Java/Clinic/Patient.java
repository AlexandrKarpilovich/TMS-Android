package lesson_07_Java.Clinic;

/**
 * Class describing the entity Patient
 */
public class Patient {
    private final String name;

    // Constructor
    public Patient(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
