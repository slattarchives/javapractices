package prac18.ex6;

public class ThrowsDemo {
    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.printMessage("validKey");
        demo.printMessage("");
    }
}
/* В шаге 1, мы представили измененный класс ThrowsDemo.
Теперь метод printMessage вызывает метод getDetails и обрабатывает исключение, если ключ
 равен пустой строке.

При выполнении программы с правильным значением ключа, программа выполнится успешно и выведет сообщение.
Однако, если ключ равен пустой строке, будет сгенерировано исключение Exception.*/