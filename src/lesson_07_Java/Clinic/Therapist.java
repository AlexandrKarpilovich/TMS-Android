package lesson_07_Java.Clinic;

/**
 * Class describing the entity Therapist
 */
public class Therapist extends Doctors {
    private String appointment; // Surgeon's appointment

    // Constructor
    public Therapist() {
    }

    // Overridden cure method
    @Override
    public String treat() {
        return "Appointed therapist. \nThe therapist started treatment";
    }

    /*
        Getter and Setter
     */
    public String getAppointment() {
        return appointment;
    }

    public String setAppointment(String appointment) {
        return this.appointment = appointment;
    }
}
