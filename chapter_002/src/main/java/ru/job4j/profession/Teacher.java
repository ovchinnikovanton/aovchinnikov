package ru.job4j.profession;

/**
 * Класс Teacher наследует класс Profession.
 */

public class Teacher extends Profession {
    /**
     * Метод возвращающий строку.
     * @return - строка.
     */
    public String teach() {
        Profession profession = new Profession("GalinaIvanovna", "Algebra", "", "");
        Children children = new Children("Boris");
        return (profession.getName() + " teach " + children.getName() + " with " + profession.getBook());
    }
}
