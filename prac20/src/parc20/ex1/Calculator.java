package parc20.ex1;

// Класс Калькулятор с обобщенными статическими методами
public class Calculator {
    // Обобщенный статический метод для сложения двух чисел разного типа
    public static <T extends Number> T sum(T a, T b) {
        // Определение типа результата на основе типов входных чисел
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() + b.floatValue());
        } else if (a instanceof Long || b instanceof Long) {
            return (T) Long.valueOf(a.longValue() + b.longValue());
        } else {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        }
    }

    // Обобщенный статический метод для умножения двух чисел разного типа
    public static <T extends Number> T multiply(T a, T b) {
        // Аналогично, определение типа результата
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() * b.floatValue());
        } else if (a instanceof Long || b instanceof Long) {
            return (T) Long.valueOf(a.longValue() * b.longValue());
        } else {
            return (T) Integer.valueOf(a.intValue() * b.intValue());
        }
    }

    // Обобщенный статический метод для деления двух чисел разного типа
    public static <T extends Number> T divide(T a, T b) {
        if (b.doubleValue() == 0.0) {
            throw new ArithmeticException("Деление на ноль");
        }
        // Аналогично, определение типа результата
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() / b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() / b.floatValue());
        } else if (a instanceof Long || b instanceof Long) {
            return (T) Long.valueOf(a.longValue() / b.longValue());
        } else {
            return (T) Integer.valueOf(a.intValue() / b.intValue());
        }
    }

    // Обобщенный статический метод для вычитания двух чисел разного типа
    public static <T extends Number> T subtract(T a, T b) {
        // Аналогично, определение типа результата
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() - b.floatValue());
        } else if (a instanceof Long || b instanceof Long) {
            return (T) Long.valueOf(a.longValue() - b.longValue());
        } else {
            return (T) Integer.valueOf(a.intValue() - b.intValue());
        }
    }

    public static void main(String[] args) {
        // Пример использования Calculator
        System.out.println("Сумма: " + Calculator.sum(5, 3));
        System.out.println("Умножение: " + Calculator.multiply(4.0, 2.5));
        System.out.println("Деление: " + Calculator.divide(10, 2));
        System.out.println("Вычитание: " + Calculator.subtract(7.5, 3.2));
    }
}