package lesson_07_Java.Clinic;

/**
 * Class describing the entity Dentist
 */
public class Dentist extends Doctors{
    private String appointment; // Surgeon's appointment

    // Constructor
    public Dentist() {
    }

    // Overridden cure method
    @Override
    public String treat() {
        return "Appointed dentist. \nThe dentist started treatment";
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