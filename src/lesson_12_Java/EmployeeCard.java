package lesson_12_Java;

import lesson_12_Java.util.GetInformation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Класс, описывающий годовую карточку работника
 */
public class EmployeeCard implements GetInformation {
    private Worker worker;
    private Report[] reports;
    private int cardID;
    private String cardCreationDate;
    private boolean isSigned;
    private int year;

    /**
     * @param cardID           - Номер (ID) карточки
     * @param cardCreationDate - Дата создания карточки (равна дате трудоустройства)
     * @param isSigned         - Факт простановки всех подписей сотрудником
     * @param year             - Год, за который вносится информация в карточку
     */
    public EmployeeCard(int cardID, String cardCreationDate, boolean isSigned, int year) {
        this.cardID = cardID;
        this.cardCreationDate = cardCreationDate;
        this.isSigned = isSigned;
        this.year = year;
        this.reports = new Report[12];
    }

    /*
        Переопределенный метод, который возвращает коллекцию, содержащую информацию о выполненной годовой работе
     */
    @Override
    public Map<String, String> getInformation() {
        Map<String, String> cardInfo = new LinkedHashMap<>(); // Создаем пустую коллекцию

        // Добавляем в коллекцию инфрмацию о работнике
        cardInfo.put("Номер карточки", String.valueOf(this.cardID));
        cardInfo.put("Дата создания карточки", this.cardCreationDate);
        cardInfo.put("За год", String.valueOf(this.year));
        cardInfo.put("Факт простановки всех подписей сотрудником", "Подписи проставлены");

        return cardInfo;
    }

    /*
            Геттеры и сеттеры
     */
    public Worker getWorker() {
        return worker;
    }

    public void setPerson(Worker worker) {
        this.worker = worker;
    }

    public Report[] getReport() {
        return reports;
    }

    public void setReport(Report[] reports) {
        this.reports = reports;
    }

    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }

    public String getCardCreationDate() {
        return cardCreationDate;
    }

    public void setCardCreationDate(String cardCreationDate) {
        this.cardCreationDate = cardCreationDate;
    }

    public boolean isSigned() {
        return isSigned;
    }

    public void setSigned(boolean signed) {
        isSigned = signed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeCard that = (EmployeeCard) o;
        return cardID == that.cardID && isSigned == that.isSigned && year == that.year && Objects.equals(worker, that.worker) && Objects.equals(reports, that.reports) && Objects.equals(cardCreationDate, that.cardCreationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(worker, reports, cardID, cardCreationDate, isSigned, year);
    }

    @Override
    public String toString() {
        return "EmployeeCard" +
                "worker: " + worker +
                ", report: " + reports +
                ", cardID: " + cardID +
                ", cardCreationDate: '" + cardCreationDate + '\'' +
                ", isSigned: " + isSigned +
                ", year: " + year;
    }
}
