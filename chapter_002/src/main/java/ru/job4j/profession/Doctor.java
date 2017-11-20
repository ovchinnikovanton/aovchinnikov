package ru.job4j.profession;

/**
 * Класс Doctor наследует класс Profession.
 */

public class Doctor extends Profession {
    Children children = new Children("Ivan");
    Profession profession = new Profession("Ajbolit", "", "Kastorka", "");
    /**
     * Метод возвращающий строку.
     * @return - строка.
     */
    public String treat(Children children) {
        return (profession.getName() + " treats " + children.getName() + " with " + profession.getPills());
    }
}

