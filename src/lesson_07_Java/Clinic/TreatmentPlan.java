package lesson_07_Java.Clinic;

/**
 * Class describing the entity Treatment Plan
 */
public class TreatmentPlan {
    private int code;

    // Constructor
    public TreatmentPlan() {
    }

    // The method determines the treatment code from 1 to 3
    public int choseATreatmentPlanCode() {
        return (int) ((Math.random() * 3) + 1);
    }

    /*
        Getter and Setter
     */
    public int getCode() {
        return code;
    }

    public int setCode(int code) {
        return this.code = code;
    }
}
