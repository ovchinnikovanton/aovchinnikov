package ru.job4j.profession;

/**
 * Класс Teacher наследует класс Profession.
 */

public class Teacher extends Profession {
    Profession profession = new Profession("GalinaIvanovna", "Algebra", "", "");
    Children children = new Children("Boris");
    /**
     * Метод возвращающий строку.
     * @return - строка.
     */
    public String teach(Children children) {
         return (profession.getName() + " teach " + children.getName() + " with " + profession.getBook());
    }
}
