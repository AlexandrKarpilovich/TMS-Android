package lesson_07_Java.Clinic;

/**
 * Class describing the entity Clinic
 */
public class Clinic {
    private String doctor;

    // Constructor
    public Clinic(String doctor) {
        this.doctor = doctor;
    }

    // Output main information
    public String getMainInformation(String doctor) {
        return "Greetings. Choose a " + doctor;
    }

    public String getDoctor() {
        return doctor;
    }

    public String setDoctor(String doctor) {
        this.doctor = doctor;
        return doctor;
    }
}
