package prac21;
import java.util.Arrays;
public class ArrayElementRetriever {

    public static <T> T getElementByIndex(T[] array, int index) {
        // Проверяем, что индекс находится в пределах допустимых значений
        if (index >= 0 && index < array.length) {
            return array[index]; // Возвращаем элемент по указанному индексу
        } else {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы массива");
        }
    }

36    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        int index = 2;

        // Выводим исходный массив
        System.out.println("Исходный массив: " + Arrays.toString(intArray));

        try {
            // Пытаемся получить элемент по индексу и выводим его
            Integer element = getElementByIndex(intArray, index);
            System.out.println("Элемент по индексу " + index + ": " + element);
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage()); // Выводим сообщение об ошибке, если индекс недопустим
        }
    }
}
