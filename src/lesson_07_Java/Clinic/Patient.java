package lesson_07_Java.Clinic;

/**
 * Class describing the entity Patient
 */
public class Patient extends TreatmentPlan {
    private String patient; // Patient variable

    // Default constructor
    public Patient() {
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }
}
