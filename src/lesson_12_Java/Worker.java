package lesson_12_Java;

import lesson_12_Java.util.GetInformation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Класс, который описывает работника
 */
public class Worker implements GetInformation {
    private String name;
    private String surname;
    private int age;
    private String sex;
    private String birthday;
    private String jobTitle;
    private String employmentDate;

    /**
     * @param name           - Имя работника
     * @param surname        - Фамилия работника
     * @param age            - Возраст
     * @param sex            - Пол работника
     * @param birthday       - День рождения
     * @param jobTitle       - Должность
     * @param employmentDate - Дата трудоустройства
     */
    public Worker(String name,
                  String surname,
                  int age,
                  String sex,
                  String birthday,
                  String jobTitle,
                  String employmentDate) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        this.birthday = birthday;
        this.jobTitle = jobTitle;
        this.employmentDate = employmentDate;
    }

    /*
        Переопределенный метод, который возвращает коллекцию, содержащую информацию о работнике
     */
    @Override
    public Map<String, String> getInformation() {
        Map<String, String> personInfo = new LinkedHashMap<>(); // Создаем пустую коллекцию

        // Добавляем в коллекцию инфрмацию о работнике
        personInfo.put("Имя", getName());
        personInfo.put("Фамилия", getSurname());
        personInfo.put("Возраст", String.valueOf(getAge()));
        personInfo.put("Пол", getSex());
        personInfo.put("дата рождения", getBirthday());
        personInfo.put("Занимаемая должность", getJobTitle());
        personInfo.put("Дата начала работы", getEmploymentDate());

        return personInfo;
    }

    /*
        Геттеры и сеттеры
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }

    /*
        Переопределенные методы hashCode, Equals, toString
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return age == worker.age && Objects.equals(name, worker.name) && Objects.equals(surname, worker.surname) && Objects.equals(sex, worker.sex) && Objects.equals(birthday, worker.birthday) && Objects.equals(jobTitle, worker.jobTitle) && Objects.equals(employmentDate, worker.employmentDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, sex, birthday, jobTitle, employmentDate);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name: '" + name + '\'' +
                ", surname: '" + surname + '\'' +
                ", age: " + age +
                ", sex: '" + sex + '\'' +
                ", birthday: '" + birthday + '\'' +
                ", jobTitle: '" + jobTitle + '\'' +
                ", employmentDate: '" + employmentDate + '\'' +
                '}';
    }
}
