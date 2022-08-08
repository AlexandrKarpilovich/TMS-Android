package lesson_07_Java.Clinic;

/**
 * Class describing the entity Clinic
 */
public class Clinic {
    private Doctors doctors;

    // Constructor
    public Clinic() {
    }

    // Output main information
    public String getMainInformation() {
        return "Greetings. Choose a doctor";
    }

    /*
        Getter and Setter
    */
    public Doctors getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctors doctors) {
        this.doctors = doctors;
    }
}
