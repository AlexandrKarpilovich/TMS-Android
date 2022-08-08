package lesson_07_Java.Clinic;

/**
 * Class describing the entity Surgeon
 */
public class Surgeon extends Doctors{
    private String appointment; // Surgeon's appointment

    // Constructor
    public Surgeon() {
    }

    // Overridden cure method
    @Override
    public String treat() {
        return "Appointed surgeon. \nThe surgeon started treatment";
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
