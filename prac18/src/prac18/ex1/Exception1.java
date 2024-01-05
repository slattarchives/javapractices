package prac18.ex1;

public class Exception1 {
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        Exception1 demo = new Exception1();
        demo.exceptionDemo();
    }
}
/* При выполнении этой программы мы получили исключение java.lang.ArithmeticException, и
        программа завершится с ошибкой, указывая на строку и место, где произошла ошибка.
        Это происходит потому, что деление на ноль является недопустимой операцией в математике.*/

/* В шаге 2 мы заменили деление на 2,0 / 0,0, что также приводит к делению на
ноль, и программа также вызовет ArithmeticException */

/* В шаге 3, мы добавили блок try-catch, чтобы перехватывать исключение ArithmeticException.
В этом случае, вместо завершения программы с ошибкой, она будет продолжать выполнение и выводить
сообщение "Attempted division by zero". Это происходит благодаря блоку try, который позволяет
перехватывать исключения, и блоку catch, который определяет,
как обрабатывать перехваченное исключение. */