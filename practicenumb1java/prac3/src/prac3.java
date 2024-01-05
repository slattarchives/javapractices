// сгенерируем рандомно числа
import java.util.Arrays;
import java.util.Random;
public class prac3{
    public static void main(String[] args){
// создаем случ. целые числа в диапазоне 0 to 999
        int length = 10; // длина массива
        int[] nums = new int[length];

        Random random = new Random(); // создаем объект класса Random

        for (int i = 0; i < length; i++) {
            // заполняем каждый элемент случайным числом от 0 до 99
            nums[i] = random.nextInt(100);
        }
        //Выводим неотсортированный массив nums
        System.out.println("Неотсортированный массив:");
        System.out.println(Arrays.toString(nums));
        //Сортируем массив nums
        Arrays.sort(nums);
        // выводим массив на экран
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(nums));
    }
}