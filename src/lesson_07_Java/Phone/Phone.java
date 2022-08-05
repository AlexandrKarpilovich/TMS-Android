package lesson_07_Java.Phone;

import java.util.Arrays;

/**
 * Class describing the entity Phone
 */
public class Phone {
    private long number; // Phone number
    private String model; // Phone model
    private int weight; // Phone weight

    // Empty constructor
    public Phone() {
    }

    // Constructor with all parameters
    public Phone(long number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Constructor with two parameters - number and model
    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

    // Constructor with two parameters called from the constructor with three parameters
    public Phone(String model, int weight) {
        this(0, model, weight);
    }

    //Displaying the name of the caller
    public void receiveCall(String callerName) {
        System.out.printf("%s calling.\n", callerName);
    }

    // Overloading method receiveCall and displaying the name of the caller and phone number
    public void receiveCall(String callerName, long phoneNumber) {
        System.out.println(callerName + " calling. Number: " + phoneNumber);
    }

    // The method accepts phone numbers to which messages will be sent
    public void sendMessage(long... phoneNumber) {
        System.out.println("The message will be send to numbers: " + Arrays.toString(phoneNumber));
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
