package ru.job4j.profession;

/**
 * Класс Engineer наследует класс Profession.
 */

public class Engineer extends Profession {
    Profession profession = new Profession("Ilya", "", "", "Plotter HP");
    Project project = new Project("BuildingPlan");
    /**
     * Метод возвращающий строку.
     * @return - строка.
     */
    public String print(Project project) {
        return (profession.getName() + " print " + project.getName() + " with " + profession.getPlotter());
    }
}
