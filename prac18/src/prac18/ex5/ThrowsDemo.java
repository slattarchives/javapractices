package prac18.ex5;

public class ThrowsDemo {
    public void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        // do something with the key
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        try {
            demo.getDetails(null);
        } catch (NullPointerException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
/*  В этом задании представлен пример генерации собственного исключения с использованием
ключевого слова throw. Программа бросает исключение NullPointerException с сообщением "null key in
getDetails", если передается null в качестве ключа.

В шаге 1, при выполнении программы с null в качестве ключа, будет сгенерировано исключение java.lang.
NullPointerException, и программа завершится с ошибкой.

В шаге 2, вы добавили блоки try-catch, чтобы перехватить это исключение и обработать его.
Теперь программа выводит сообщение об ошибке вместо завершения с ошибкой.*/