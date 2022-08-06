package lesson_07_Java.Clinic;

/**
 * Class describing the entity PatientMedicalCard
 */
public class PatientMedicalCard extends Doctor {

    // Constructor
    public PatientMedicalCard(String doctor) {
        super(doctor);
    }

    // Method displays information that you need to choose a treatment plan
    public String treatmentPlan(String doctor) {
        return doctor + " prescribed a treatment plan";
    }

    // The method determines the treatment code from 1 to 3
    public int choseATreatmentPlanCode() {
        return (int) ((Math.random() * 3) + 1);
    }
}
