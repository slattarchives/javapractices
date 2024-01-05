package prac21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListConverter {
    public static List<String> convertStringArrayToList(String[] stringArray) {
        List<String> stringList = new ArrayList<>(Arrays.asList(stringArray));
        return stringList;
    }

    public static List<Integer> convertIntArrayToList(int[] intArray) {
        List<Integer> intList = new ArrayList<>();
        for (int value : intArray) {
            intList.add(value);
        }
        return intList;
    }

    public static void main(String[] args) {
        // Пример конвертации массива строк в список
        String[] stringArray = {"apple", "banana", "cherry", "date"};
        List<String> stringList = convertStringArrayToList(stringArray);
        System.out.println("String List: " + stringList);

        // Пример конвертации массива чисел в список
        int[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = convertIntArrayToList(intArray);
        System.out.println("Integer List: " + intList);
    }
}