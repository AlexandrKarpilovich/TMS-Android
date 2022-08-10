package lesson_08_Java.DocumentAccountingSystem;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Main class
 */
public class Main {
    public static void main(String[] args) {
        // Creating a date in String format
        String date = "10.08.2022";
        String contractStart = "01.08.2022";
        String contractEnd = "01.08.2023";

        // Template for date formatting
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        // Creating empty variables with dates
        Date dateOne = null;
        Date dateContractStart = null;
        Date dateContractEnd = null;

        // Trying to convert date from String type to Date type
        try {
            dateOne = format.parse(date);
            dateContractStart = format.parse(contractStart);
            dateContractEnd = format.parse(contractEnd);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Create an object of class ContractForTheSupplyOfGoods and set parameters
        ContractForTheSupplyOfGoods contractOfGoods = new ContractForTheSupplyOfGoods();
        contractOfGoods.setDocumentNumber(1);
        contractOfGoods.setGoodsType("Technic");
        contractOfGoods.setNumberOfGoods(1000);
        contractOfGoods.setDocumentDate(dateOne);

        // Create an object of class ContractWithAnEmployee and set parameters
        ContractWithAnEmployee employeeContract = new ContractWithAnEmployee();
        employeeContract.setDocumentNumber(2);
        employeeContract.setDocumentDate(dateOne);
        employeeContract.setContractStartDate(dateContractStart);
        employeeContract.setContractEndDate(dateContractEnd);
        employeeContract.setEmployeeName("Ivan Ivanov");

        // Create an object of class FinancialInvoice and set parameters
        FinancialInvoice financialInvoice = new FinancialInvoice();
        financialInvoice.setTotalPerMonth(1_000_000);
        financialInvoice.setDocumentDate(dateOne);
        financialInvoice.setDocumentNumber(3);
        financialInvoice.setDepartmentCode(123_123);

        // Create an object of the AAA class and add the previously created documents to it
        Register register = new Register();
        register.savingDocument(contractOfGoods);
        register.savingDocument(employeeContract);
        register.savingDocument(financialInvoice);

        // Displaying information
        register.outputInformationAboutTheDocument();
    }
}
