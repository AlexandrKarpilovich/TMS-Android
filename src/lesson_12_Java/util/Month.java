package lesson_12_Java.util;

/**
 * Список месяцев
 */
public enum Month {
    Январь ("January"),
    Февраль ("February"),
    Март ("March"),
    Апрель ("April"),
    Май ("May"),
    Июнь ("June"),
    Июль ("July"),
    Август ("August"),
    Сентябрь ("September"),
    Октябрь ("October"),
    Ноябрь ("November"),
    Декабрь ("December");

    private String inEng;

    Month (String inEng) {
        this.inEng = inEng;
    }
}
