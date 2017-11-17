package ru.job4j.profession;

/**
 * Класс Engineer наследует класс Profession.
 */

public class Engineer extends Profession {
    /**
     * Метод возвращающий строку.
     * @return - строка.
     */
    public String print() {
        Profession profession = new Profession("Ilya", "", "", "Plotter HP");
        Project project = new Project("BuildingPlan");
        return (profession.getName() + " print " + project.getName() + " with " + profession.getPlotter());
    }
}
