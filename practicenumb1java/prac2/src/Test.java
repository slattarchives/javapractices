
import java.util.Scanner;
public class Test {

    public static void main(String[] args){

        String[] a = { "Конь "," бежит "," по "," полю "," ветер "," сильный "};
        //Выводим изначальный массив в консоль
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();

        int n = a.length;
        //Переменная, которая будет использоваться при обмене элементов
        String temp;

        for (int i = 0; i < n/2; i++) {
            temp = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = temp;
        }
        //Выводим конечный массив в консоль
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }

        //Задание10
        Scanner proposition = new Scanner(System.in);
        //Вводим предложение в консоль
        System.out.println("Введите слова одной строкой через пробел");
        String input = proposition.nextLine();
        //Начальное количество слов равно 0
        int count = 0;

        //Если ввели хотя бы одно слово, тогда считать, иначе конец программы
        if(input.length() != 0){
            count++;
            //Проверяем каждый символ, не пробел ли это
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' '){
                    //Если пробел - увеличиваем количество слов на 1
                    count++;
                }
            }
        }

        System.out.println("Вы ввели "+count+" слов");
    }
}