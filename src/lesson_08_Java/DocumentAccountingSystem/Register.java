package lesson_08_Java.DocumentAccountingSystem;

/**
 * Register class
 */
class Register {
    private Document[] documents;

    // Constructor
    Register() {
        this.documents = new Document[10];
    }

    // Method for saving the document to an array
    String savingDocument(Document document) {
        // Variable that shows the index of free space in the array
        int freeSpaceIndex = checkFreeSpace();

        // If there is free space in the array, then add the document, otherwise print message
        if (freeSpaceIndex > -1) {
            this.documents[freeSpaceIndex] = document;
            return "Document added";
        }
        return "Register is full!";
    }

    // Displaying information
    void outputInformationAboutTheDocument() {
        for (Document document : this.documents) {
            if (document == null) {
                break;
            } else {
                System.out.println(document);
            }
        }
    }

    // Checking for free space in the array and if it is, then add a new document to the array
    private int checkFreeSpace() {
        for (int i = 0; i < this.documents.length; i++) {
            if (this.documents[i] == null) {
                return i;
            }
        }
        return -1;
    }

    /*
        Getter and Setter
     */
    public Document[] getDocuments() {
        return documents;
    }

    public void setDocuments(Document[] documents) {
        this.documents = documents;
    }
}
