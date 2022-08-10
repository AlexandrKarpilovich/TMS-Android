package lesson_08_Java.DocumentAccountingSystem;

import java.util.Date;

/**
 * Class Contract With An Employee contains information about the document
 */
public class ContractWithAnEmployee extends Document {
    private Date contractStartDate; // Contract start day
    private Date contractEndDate; // Contract end day
    private String employeeName; // Employee name

    // Constructor without parameters of this class
    public ContractWithAnEmployee() {
    }

    // Constructor with parameters of this class
    public ContractWithAnEmployee(int documentNumber,
                                  Date documentDate,
                                  Date contractStartDate,
                                  Date contractEndDate,
                                  String employeeName) {
        super(documentNumber, documentDate);
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.employeeName = employeeName;
    }

    // Overridden method for displaying information about a document
    @Override
    public String informationAboutTheDocument() {
        return "Contract with an employee: " +
                "\n\tDocument number: " + getDocumentNumber() +
                "\n\tDocument date: " + getDocumentDate() +
                "\n\tContract start day: " + getContractStartDate() +
                "\n\tContract end day: " + getContractEndDate() +
                "\n\tEmployee name: " + getEmployeeName();
    }

    /*
        Getters and Setters
     */
    public Date getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public Date getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Overridden method toString()
    @Override
    public String toString() {
        return informationAboutTheDocument();
    }
}
