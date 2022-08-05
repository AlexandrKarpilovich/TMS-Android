package lesson_07_Java.Clinic;

/**
 * Class describing the entity Treatment Plan
 */
public class TreatmentPlan extends Clinic {
    private String plan; // Plan variable

    // Default constructor
    public TreatmentPlan() {
    }

    // Treatment plan from the Surgeon
    public String surgeonTreatmentPlan() {
        return "Treatment plan from the Surgeon.";
    }

    // Treatment plan from the Dentist
    public String dentistTreatmentPlan() {
        return "Treatment plan from the Dentist.";
    }

    // Treatment plan from the Therapist
    public String therapistTreatmentPlan() {
        return "Treatment plan from the Therapist.";
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }
}
