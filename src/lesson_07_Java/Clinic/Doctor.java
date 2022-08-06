package lesson_07_Java.Clinic;

/**
 * Class describing the entity Doctors
 */
public class Doctor extends Clinic {

    // Constructor
    public Doctor(String doctor) {
        super(doctor);
    }

    @Override
    public String getMainInformation(String doctor) {
        return "You have a " + doctor + " assigned to you";
    }

    // Method to treat
    public String treat() {
        return getDoctor() + " started treatment plan";
    }
}
