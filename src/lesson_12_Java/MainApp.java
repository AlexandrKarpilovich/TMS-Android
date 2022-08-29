package lesson_12_Java;

import lesson_12_Java.util.Month;
import java.util.Map;

/**
 * 1st Part
 * Program "Accounting"
 * Write a program that will enter information into an employee's personal card.
 * Map content:
 * - Information about the employee
 * - Report for each month (for 2-3 years). Report content:
 * - Delivered production plan
 * - Fact of execution
 * - salary amount
 * - The amount of the bonus (from the size: bonus = salary, if the fact of implementation = 2 * production plan;
 * if the actual implementation is 1.5 * plan - bonus 0.5
 * salary, etc.)
 * - The employee is familiar
 * - Card number
 * - Date of creation of the card = date of employment of the employee
 * - The fact of affixing all signatures by the employee
 * The accounting department, after updating the employee's card (initial filling + filling for the current month),
 * sends the card to the employee for signature (familiarization). The employee is ALWAYS required to sign the document.
 * Use interface Map. Provide information on the screen (document history)
 *
 * 2nd Part (additionally)
 * Continuation of the required task.
 * Each worker is a separate directory.
 * Each report is a separate file inside the worker's directory.
 * Ensure that the data of employees' cards is updated.
 *
 * 3rd Part (additionally)
 * Continuation of an optional task.
 * Provide organization analytics in a separate file.
 * The analytics report should contain:
 * - Number of employees who completed the plan (for the completed year)
 * - Ranked list of employees (1st - maximum performance in kind, last - minimum performance)
 * - Ranked list of employees (1st - maximum performance in relative terms, last - minimum performance)
 * - Salary costs for workers
 * - The cost of bonuses to workers
 * - Ranked list of employees (1st - maximum bonus, last - minimum bonus)
 * - List of employees who have not met the annual plan for the last 3 years in a row.
 * Each output of information to sign. The file must be readable. Execution in Russian.
 */
public class MainApp {
    public static void main(String[] args) {

        // Создание работника
        Worker worker = new Worker("Иван",
                "Иванов",
                33,
                "М",
                "10.10.1989",
                "Инженер второй категории",
                "01.08.2010");

        // Создание отчетов
        Report reportAugust2010 = new Report(Month.Август, 100, 100, 10000);
        Report reportSeptember2010 = new Report(Month.Сентябрь, 100, 200, 10000);
        Report reportOctober2010 = new Report(Month.Ноябрь, 100, 50, 10000);
        Report reportNovember2010 = new Report(Month.Октябрь, 100, 150, 10000);
        Report reportDecember2010 = new Report(Month.Декабрь, 100, 0, 10000);

        // Создание карточки
        EmployeeCard card = new EmployeeCard(1, worker.getEmploymentDate(), true, 2010);

        // Создание бухгалтерии
        Accounting accounting = new Accounting();

        // Вывод информации
        printInfo(accounting.getInformation("Карточка", card.getInformation()));
        printInfo(accounting.getInformation("Работник", worker.getInformation()));
        printInfo(accounting.getInformation("Отчет за август", reportAugust2010.getInformation()));
        printInfo(accounting.getInformation("Отчет за сентябрь", reportSeptember2010.getInformation()));
        printInfo(accounting.getInformation("Отчет за октябрь", reportOctober2010.getInformation()));
        printInfo(accounting.getInformation("Отчет за ноябрь", reportNovember2010.getInformation()));
        printInfo(accounting.getInformation("Отчет за декабрь", reportDecember2010.getInformation()));
    }

    /*
        Метод для вывода информации на экран
     */
    public static <K, V> void printInfo(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }
}
