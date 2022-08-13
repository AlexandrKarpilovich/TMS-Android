package lesson_08_Java.DocumentAccountingSystem;

import java.util.Date;

/**
 * An abstract class Documents that has the same fields for all documents
 */
abstract class Document implements ActionOnTheDocument{
    private int documentNumber; // Document number
    private Date documentDate; // Document date

    // Constructor without all parameters
    public Document() {
    }

    // Constructor with all parameters
    public Document(int documentNumber, Date documentDate) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }

    // Overridden method for displaying information about a document
    @Override
    public String informationAboutTheDocument() {
        return "Information about the document";
    }

    /*
        Getters and Setters
     */
    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Date getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Date documentDate) {
        this.documentDate = documentDate;
    }
}
