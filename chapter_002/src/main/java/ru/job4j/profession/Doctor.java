package ru.job4j.profession;

/**
 * Класс Doctor наследует класс Profession.
 */

public class Doctor extends Profession {
    /**
     * Метод возвращающий строку.
     * @return - строка.
     */
    public String treat() {
        Profession profession = new Profession("Ajbolit", "", "Kastorka", "");
        Children children = new Children("Ivan");
        return (profession.getName() + " treats " + children.getName() + " with " + profession.getPills());
    }
}

