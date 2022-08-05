package lesson_07_Java;

import lesson_07_Java.Phone.Phone;
import lesson_07_Java.Clinic.*;

/**
 * 1. Create a Phone class that contains the number, model, and weight variables.
 * Create three instances of this class. Print the values of their variables to the console.
 * Add methods to the Phone class: receiveCall, has one parameter - the name of the caller.
 * Prints the message “{name} is ringing” to the console. getNumber - returns the phone number.
 * Call these methods for each of the objects.
 * Add a constructor to the Phone class that takes three parameters as input for initialization of class variables -
 * number, model and weight.
 * Add a constructor that takes two parameters as input for initialization class variables - number, model.
 * Add constructor without parameters.
 * Call a constructor with two parameters from a constructor with three parameters.
 * Add an overloaded receiveCall method that takes two parameters - the name of the caller and the phone number
 * of the caller.
 * Call this method.
 * Create a sendMessage method with variable length arguments. This method takes as input phone numbers to which
 * the message will be sent. The method displays the numbers of these phones.
 * <p>
 * 2. Create a program to simulate the work of the clinic.
 * Let there be three doctors in surgery: a surgeon, a general practitioner and a dentist.
 * Every doctor has a method to "treat", but every doctor heals in his own way.
 * Also provide for the class "Patient" and the class "Treatment plan".
 * Create an object of class "Patient" and add a treatment plan to the patient.
 * Also create a method that will be prescribed by the doctor to the patient according to the treatment plan.
 * If the treatment plan has code 1, a surgeon is appointed and a treatment method is prescribed.
 * If the treatment plan has code 2, a dentist is appointed and a treatment method is prescribed.
 * If the treatment plan has any other code, appoint a therapist and prescribe a treatment method.
 */

public class Main {
    public static void main(String[] args) {

        /*
            1. Phone class
        */
        // First class instance
        Phone phone1 = new Phone(); // Create new object Phone
        phone1.setNumber(generatePhoneNumber());
        phone1.setModel("Huawei");
        phone1.setWeight(200);
        outputMainPhoneInformation(phone1);

        long getNumber1 = phone1.getNumber(); // Create a first variable with method getNumber()
        String callerName1 = "Ivanov Ivan Ivanovich"; // Create the first named variable

        phone1.receiveCall(callerName1); // Calling the first method receiveCall
        phone1.receiveCall(callerName1, getNumber1); // Calling the overloading method receiveCall
        System.out.println("----------");

        // Second class instance
        Phone phone2 = new Phone(); // Create new object Phone
        phone2.setNumber(generatePhoneNumber());
        phone2.setModel("Samsung");
        phone2.setWeight(250);
        outputMainPhoneInformation(phone2);

        long getNumber2 = phone2.getNumber(); // Create a second variable with method getNumber()
        String callerName2 = "Petrov Petr Petrovich"; // Create the second named variable

        phone2.receiveCall(callerName2); // Calling the first method receiveCall
        phone2.receiveCall(callerName2, getNumber2); // Calling the overloading method receiveCall
        System.out.println("----------");

        // Third class instance
        Phone phone3 = new Phone(); // Create new object Phone
        phone3.setNumber(generatePhoneNumber());
        phone3.setModel("Xiaomi");
        phone3.setWeight(150);
        outputMainPhoneInformation(phone3);

        long getNumber3 = phone3.getNumber(); // Create a third variable with method getNumber()
        String callerName3 = "Sidorov Sergey Sergeevich"; // Create the third named variable

        phone3.receiveCall(callerName3); // Calling the first method receiveCall
        phone3.receiveCall(callerName3, getNumber3); // Calling the overloading method receiveCall
        System.out.println("----------");

        // Method sendMessage() test
        Phone phone = new Phone(); // Create new object Phone
        phone.sendMessage(generatePhoneNumber(), generatePhoneNumber(), generatePhoneNumber());

        System.out.println("------------------------------------------------------------\n");

        /*
            2. Clinic class
        */
        // Test check
        Patient patient = new Patient(); // Create new object Patient
        patient.setPatient("Ivanov Ivan"); // Set the name of the patient
        int treatmentCode = treatmentCodeGeneration(); // Remember the treatment plan code

        // Output main information about patient and treatment plan
        outputGeneralTreatmentInformation(treatmentCode, patient);
    }

    /*
        1. Methods for Phone class
     */
    // Random number phone generation
    static long generatePhoneNumber() {
        return Long.parseLong("37525" + ((long) (1_000_000 + Math.random() * 9_999_999)));
    }

    // Output main information about the phone
    static void outputMainPhoneInformation(Phone phone) {
        System.out.println("Phone number: " + generatePhoneNumber() +
                ". Phone model: " + phone.getModel() +
                ". Phone weight: " + phone.getWeight());
    }

    /*
        2. Methods for Clinic class
     */
    // Treatment plan generation by code from 1 to 3
    static int treatmentCodeGeneration() {
        return (int) ((Math.random() * 3) + 1);
    }

    // Choose the right doctor according to the treatment code
    static String choosingADoctor(int code, Patient patient) {
        if (code == 1) {
            return patient.appointedSurgeon();
        } else if (code == 2) {
            return patient.appointedDentist();
        }
        return patient.appointedTherapist();
    }

    // Choose the right treatment plan according to the treatment code
    static String choosingATreatmentPlan(int code, Patient patient) {
        if (code == 1) {
            return patient.surgeonTreatmentPlan();
        } else if (code == 2) {
            return patient.dentistTreatmentPlan();
        }
        return patient.therapistTreatmentPlan();
    }

    // Output general information about the treatment
    static void outputGeneralTreatmentInformation(int code, Patient patient) {
        System.out.println("The patient " + patient.getPatient() +
                " has treatment code: " + code + ". " +
                "\n" + choosingADoctor(code, new Patient()) +
                "\n" + choosingATreatmentPlan(code, new Patient()));
    }
}
