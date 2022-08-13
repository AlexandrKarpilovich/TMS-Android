package lesson_08_Java.DocumentAccountingSystem;

import java.util.Date;

/**
 * Class Financial Invoice contains information about the document
 */
public class FinancialInvoice extends Document {
    private int totalPerMonth; // Total amount per month
    private int departmentCode; // Department code

    // Constructor without parameters of this class
    public FinancialInvoice() {
    }

    // Constructor with parameters of this class
    public FinancialInvoice(int documentNumber, Date documentDate, int totalPerMonth, int departmentCode) {
        super(documentNumber, documentDate);
        this.totalPerMonth = totalPerMonth;
        this.departmentCode = departmentCode;
    }

    // Overridden method for displaying information about a document
    @Override
    public String informationAboutTheDocument() {
        return "Financial invoice: " +
                "\n\tTotal amount per month: " + getTotalPerMonth() +
                "\n\tDocument date: " + getDocumentDate() +
                "\n\tDocument number: " + getDocumentNumber() +
                "\n\tDepartment code: " + getDepartmentCode();
    }

    /*
        Getters and Setters
     */
    public int getTotalPerMonth() {
        return totalPerMonth;
    }

    public void setTotalPerMonth(int totalPerMonth) {
        this.totalPerMonth = totalPerMonth;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }

    // Overridden method toString()
    @Override
    public String toString() {
        return informationAboutTheDocument();
    }
}
