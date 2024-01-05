package prac23;

abstract class Expression {
    abstract double evaluate(double x);
}

// Класс для представления констант
class Const extends Expression {
    private double value;

    public Const(double value) {
        this.value = value;
    }

    @Override
    double evaluate(double x) {
        return value;
    }
}

// Класс для представления переменных
class Variable extends Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    double evaluate(double x) {
        return x;
    }
}