package lesson_07_Java.Clinic;

/**
 * Class describing the entity PatientMedicalCard
 */
public class PatientMedicalCard extends Clinic {
    private String surgeonInfo; // Information about the surgeon's treatment
    private String dentistInfo; // Information about the dentist's treatment
    private String therapistInfo; // Information about the therapist's treatment
    private int code; // Treatment plan code

    // Constructor
    public PatientMedicalCard() {
    }

    // Choice of doctor depending on the treatment code
    public String choiceOfDoctor() {
        if (getCode() == 1) {
            return getSurgeonInfo();
        } else if (getCode() == 2) {
            return getDentistInfo();
        }
        return getTherapistInfo();
    }

    /*
        Getters and Setters
     */
    public String getSurgeonInfo() {
        return surgeonInfo;
    }

    public void setSurgeonInfo(String surgeonInfo) {
        this.surgeonInfo = surgeonInfo;
    }

    public String getDentistInfo() {
        return dentistInfo;
    }

    public void setDentistInfo(String dentistInfo) {
        this.dentistInfo = dentistInfo;
    }

    public String getTherapistInfo() {
        return therapistInfo;
    }

    public void setTherapistInfo(String therapistInfo) {
        this.therapistInfo = therapistInfo;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
