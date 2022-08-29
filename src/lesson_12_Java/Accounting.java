package lesson_12_Java;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Accounting {
    private EmployeeCard employeeCard;

    public Accounting() {
    }

    /*
        Получаем общую информацию
     */
    public Map<String, Map> getInformation(String str, Map map) {
        Map<String, Map> fullInfo = new LinkedHashMap<>(); // Создаем пустую коллекцию

        fullInfo.put(str, map);

        return fullInfo;
    }

    /*
        Геттеры и Сеттеры
     */
    public EmployeeCard getEmployeeCard() {
        return employeeCard;
    }

    public void setEmployeeCard(EmployeeCard employeeCard) {
        this.employeeCard = employeeCard;
    }

    /*
        Переопределенные методы hashCode, Equals, toString
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accounting that = (Accounting) o;
        return Objects.equals(employeeCard, that.employeeCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeCard);
    }

    @Override
    public String toString() {
        return "Accounting " +
                "employeeCard: " + employeeCard;
    }
}
