package lesson_07_Java.Clinic;

/**
 * Class describing the entity Clinic
 */
public class Clinic {
    private String surgeon; //
    private String dentist; //
    private String therapist; //

    // Default constructor
    public Clinic() {
    }

    // Appointed Surgeon
    public String appointedSurgeon() {
        return "Appointed doctor is a Surgeon.";
    }

    // Appointed Dentist
    public String appointedDentist() {
        return "Appointed doctor is a Dentist.";
    }

    // Appointed Therapist
    public String appointedTherapist() {
        return "Appointed doctor is a Therapist.";
    }

    public String getSurgeon() {
        return surgeon;
    }

    public void setSurgeon(String surgeon) {
        this.surgeon = surgeon;
    }

    public String getDentist() {
        return dentist;
    }

    public void setDentist(String dentist) {
        this.dentist = dentist;
    }

    public String getTherapist() {
        return therapist;
    }

    public void setTherapist(String therapist) {
        this.therapist = therapist;
    }
}
