package ru.job4j.profession;

/**
 * Создаем класс профессий.
 */

public class Profession {
    public String name;
    public String book;
    public String pills;
    public String plotter;

    /**
     * создаем пустой коструктор для класса.
     */

    public  Profession() {

    }

    /**
     * Создаем конструктор с параметрами.
     * @param name - имя.
     * @param book - книга.
     * @param pills - таблетки.
     * @param plotter - плоттер.
     */

    public Profession(String name, String book, String pills, String plotter) {
        this.name = name;
        this.book = book;
        this.pills = pills;
        this.plotter = plotter;
    }

    /**
     * Метод возвращает имя.
     * @return - имя.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Метод возвращает книгу.
     * @return - книга.
     */
    public String getBook() {
        return this.book;
    }

    /**
     * Метод возвращает название лекарства.
     * @return - лекарство.
     */
    public String getPills() {
        return this.pills;
    }

    /**
     * Метод возвращает название плоттера.
     * @return - название плоттера.
     */
    public String getPlotter() {
        return this.plotter;
    }

    /**
     * Вложенный класс.
     */
    class Children extends Profession {
        public String pupil;
        public Children(String pupil) {
            this.pupil = name;
        }
    }

    /**
     * Вложенныый класс.
     */
    class Project extends Profession {
        public String project;
        public Project(String project) {
            this.project = name;
        }

    }

}
