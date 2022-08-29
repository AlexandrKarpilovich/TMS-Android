package lesson_12_Java;

import lesson_12_Java.util.GetInformation;
import lesson_12_Java.util.Month;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Класс, предоставляющий информацию о месечном отчете
 */
public class Report implements GetInformation {
    private int productionPlan; // План, который необходимо выполнить
    private int volumeOfCompletedProducts; // Объем продукции, выполненный по факту
    private boolean isPlanCompleted; // Выполнен ли план
    private int salary; // Заработная плата
    private double premiumFactor; // Коэффициент премирования
    private boolean isAcquainted = true; // Ознакомлен ли сотрудник с планом
    private Month month; // Месяц отчета
    private boolean isRewarded; // Премирован ли работник

    public Report(Month month, int productionPlan, int volumeOfCompletedProducts, int salary) {
        this.month = month;
        this.productionPlan = productionPlan;
        this.volumeOfCompletedProducts = volumeOfCompletedProducts;
        this.salary = salary;
    }

    /*
        Переопределенный метод, который возвращает коллекцию, содержащую информацию о выполненном месячном плане
     */
    @Override
    public Map<String, String> getInformation() {
        Map<String, String> reportInfo = new LinkedHashMap<>(); // Создаем пустую коллекцию

        // Добавляем в коллекцию инфрмацию об отчете
        reportInfo.put("Поставленный план по производству продукции", String.valueOf(getProductionPlan()));
        reportInfo.put("Объем выполненной продукции", String.valueOf(getVolumeOfCompletedProducts()));
        reportInfo.put("Факт выполнения плана", isCompletedPlan(this.volumeOfCompletedProducts));
        reportInfo.put("Зарплата работника", String.valueOf(sumSalary(this.productionPlan, this.volumeOfCompletedProducts)));
        reportInfo.put("Выдана премия", isPremium(this.volumeOfCompletedProducts));
        reportInfo.put("Размер премии", String.valueOf(sumPremium(this.productionPlan, this.volumeOfCompletedProducts)));
        reportInfo.put("Факт ознакомления сотрудника с отчетом", "Сотрудник ознакомлен");

        return reportInfo;
    }

    /*
        Метод возвращает информацию выполнен план или нет
     */
    private String isCompletedPlan(int volumeOfCompletedProducts) {
        // Если объем выполненной продукции больше или равен плану, то считается план выполненным
        if (volumeOfCompletedProducts >= this.productionPlan) {
            this.isPlanCompleted = true;
            return "План выполнен";
        } else {
            this.isPlanCompleted = false;
            return "План не выполнен";
        }
    }

    /*
        Метод рассчитывает сумму ЗП в зависимости от объема выполненной работы
     */
    private int sumSalary(int productionPlan, int volumeOfCompletedProducts) {
        if (this.isPlanCompleted) {
            return this.salary;
        } else {
            int salaryInPercent = volumeOfCompletedProducts * 100 / productionPlan;
            return this.salary * salaryInPercent / 100;
        }
    }

    /*
        Метод возвращает строку, которая говорит, будет ли выдаваться премия в этом месяце работнику
     */
    private String isPremium(int volumeOfCompletedProducts) {
        // Если план выполнен и выполнен больше, чем нужно, то премия выдаваться будет, иначе нет
        if (this.isPlanCompleted && volumeOfCompletedProducts > 100) {
            this.isRewarded = true;
            return "Премия выдается";
        } else {
            this.isRewarded = false;
            return "Премия не выдается";
        }
    }

    /*
        Метод для расчета суммы премии
     */
    private int sumPremium(int productionPlan, int volumeOfCompletedProducts) {
        // Если решено выдавать премию, то рассчитываем ее, иначе возврщаем 0
        if (this.isRewarded) {
            double premiumFactor = (double) (volumeOfCompletedProducts - productionPlan) / 100;
            return (int) (this.salary * premiumFactor);
        }
        return 0;
    }

    /*
        Геттеры и Сеттеры
     */
    public int getProductionPlan() {
        return productionPlan;
    }

    public void setProductionPlan(int productionPlan) {
        this.productionPlan = productionPlan;
    }

    public int getVolumeOfCompletedProducts() {
        return volumeOfCompletedProducts;
    }

    public void setVolumeOfCompletedProducts(int volumeOfCompletedProducts) {
        this.volumeOfCompletedProducts = volumeOfCompletedProducts;
    }

    public boolean isCompleted(boolean b) {
        return isPlanCompleted;
    }

    public void setPlanCompleted(boolean planCompleted) {
        isPlanCompleted = planCompleted;
    }

    public int sumSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getPremiumFactor() {
        return premiumFactor;
    }

    public void setPremiumFactor(double premiumFactor) {
        this.premiumFactor = premiumFactor;
    }

    public boolean isAcquainted() {
        return isAcquainted;
    }

    public void setAcquainted(boolean acquainted) {
        isAcquainted = acquainted;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public boolean isRewarded() {
        return isRewarded;
    }

    public void setRewarded(boolean rewarded) {
        isRewarded = rewarded;
    }

    /*
        Переопределенные методы hashCode, Equals, toString
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Report{" +
                "productionPlan: " + productionPlan +
                ", volumeOfCompletedProducts: " + volumeOfCompletedProducts +
                ", isPlanCompleted: " + isPlanCompleted +
                ", salary: " + salary +
                ", premiumFactor: " + premiumFactor +
                ", isAcquainted: " + isAcquainted +
                ", month: " + month +
                ", isRewarded: " + isRewarded +
                '}';
    }
}
