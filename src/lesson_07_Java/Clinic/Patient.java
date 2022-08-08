package lesson_07_Java.Clinic;

/**
 * Class describing the entity Patient
 */
public class Patient {
    private String name; // Patient name
    private int code; // Treatment plan code

    // Constructor
    public Patient() {
    }

    // Output patient name
    public String patientName() {
        return getName();
    }

    // Treatment plan
    public String treatmentPlan() {
        return String.format("Treatment plan has code: " + getCode());
    }

    /*
        Getters and Setters
    */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
