package ru.job4j.max;
/**
 * Ищем Maximun тернальным оператором.
 * @author Anton Ovchinnikov.
 * @since 20.10.2017.
 * @version 2.0.
 */
public class Max {
	/**
	 * метод для определения максимального значения.
	 * @param first число.
	 * @param second число.
	 * @return возвращает максимальное заначение.
	 */
	public int max(int first, int second) {
		return first < second ? second : first;
	}

	/**
	 * метод для определения максимального значения.
	 * @param first - число.
	 * @param second - число.
	 * @param third - число.
	 * @return возвращает максимальное заначение.
	 */
	public int max(int first, int second, int third) {
		return this.max(this.max(first, second), third);
	}

}