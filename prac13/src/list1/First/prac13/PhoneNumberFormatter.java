package list1.First.prac13;

import java.util.Scanner;

public class PhoneNumberFormatter {

    // Метод для преобразования строки с номером телефона
    public static String formatPhoneNumber(String phoneNumber) {
        // Удаляем все нецифровые символы из входной строки
        String numericOnly = phoneNumber.replaceAll("[^0-9]", "");

        // Если длина строки после удаления нецифровых символов не равна 11, то возвращаем исходную строку
        if (numericOnly.length() != 11) {
            return phoneNumber;
        }

        // Проверяем, в каком формате был введен номер
        if (numericOnly.startsWith("8")) {
            // Формат "8XXXXXXXXXX" для России
            // Преобразуем в "+7XXX-XXX-XXXX"
            return "+7" + numericOnly.substring(1, 4) + "-" +
                    numericOnly.substring(4, 7) + "-" + numericOnly.substring(7);
        } else if (numericOnly.startsWith("+")) {
            // Формат "+XXXXXXXXXXX"
            // Преобразуем в "+XXX-XXX-XXXX"
            return "+" + numericOnly.substring(1, 4) + "-" +
                    numericOnly.substring(4, 7) + "-" + numericOnly.substring(7);
        } else {
            // Неверный формат номера, возвращаем исходную строку
            return phoneNumber;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер телефона: ");
        String phoneNumber = scanner.nextLine();

        String formattedPhoneNumber = formatPhoneNumber(phoneNumber);

        System.out.println("Преобразованный номер: " + formattedPhoneNumber);

        scanner.close();
    }
}