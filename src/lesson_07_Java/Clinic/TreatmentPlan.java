package lesson_07_Java.Clinic;

/**
 * Class describing the entity Treatment Plan
 */
public class TreatmentPlan extends PatientMedicalCard {

    // Constructor
    public TreatmentPlan(String doctor) {
        super(doctor);
    }

    @Override
    public String treatmentPlan(String doctor) {
        return "The treatment plan was developed by the " + doctor;
    }
}
