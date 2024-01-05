package prac41;

// Абстрактный класс Транспортное средство
abstract class Transport {
    private String name;

    public Transport(String name) {
        this.name = name;
    }

    public abstract double calculatePassengerTransportCost(int passengers);
    public abstract double calculateCargoTransportCost(double cargoWeight);
    public abstract double calculateTravelTime(double distance);

    public String getName() {
        return name;
    }
}

// Подкласс Автомобиль
class Car extends Transport {
    private double fuelConsumption; // Расход топлива на 100 км

    public Car(String name, double fuelConsumption) {
        super(name);
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public double calculatePassengerTransportCost(int passengers) {
        // Предположим, что стоимость перевозки пассажиров зависит от количества пассажиров
        return passengers * 10; // Пример стоимости на одного пассажира
    }

    @Override
    public double calculateCargoTransportCost(double cargoWeight) {
        // Предположим, что стоимость перевозки груза зависит от веса груза
        return cargoWeight * 5; // Пример стоимости за килограмм груза
    }

    @Override
    public double calculateTravelTime(double distance) {
        // Предположим, что время в пути зависит от расстояния и скорости
        double speed = 100; // Пример скорости автомобиля в км/ч
        return distance / speed;
    }


}

// Подкласс Самолет
class Airplane extends Transport {
    private double fuelConsumption; // Расход топлива на 100 км

    public Airplane(String name, double fuelConsumption) {
        super(name);
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public double calculatePassengerTransportCost(int passengers) {
        // Предположим, что стоимость перевозки пассажиров зависит от количества пассажиров
        return passengers * 8; // Пример стоимости на одного пассажира
    }

    @Override
    public double calculateCargoTransportCost(double cargoWeight) {
        // Предположим, что стоимость перевозки груза зависит от веса груза
        return cargoWeight * 20; // Пример стоимости за килограмм груза
    }

    @Override
    public double calculateTravelTime(double distance) {
        // Предположим, что время в пути зависит от расстояния и скорости
        double speed = 700; // Пример скорости самолета в км/ч
        return distance / speed;
    }

    // Реализация методов подсчета стоимости и времени перевозки для самолета
    // ...
}

// Подкласс Поезд
class Train extends Transport {
    private double fuelConsumption; // Расход топлива на 100 км

    public Train(String name, double fuelConsumption) {
        super(name);
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public double calculatePassengerTransportCost(int passengers) {
        // Предположим, что стоимость перевозки пассажиров зависит от количества пассажиров
        return passengers * 20; // Пример стоимости на одного пассажира
    }

    @Override
    public double calculateCargoTransportCost(double cargoWeight) {
        // Предположим, что стоимость перевозки груза зависит от веса груза
        return cargoWeight * 12; // Пример стоимости за килограмм груза
    }

    @Override
    public double calculateTravelTime(double distance) {
        // Предположим, что время в пути зависит от расстояния и скорости
        double speed = 60; // Пример скорости автомобиля в км/ч
        return distance / speed;
    }
    // Реализация методов подсчета стоимости и времени перевозки для поезда
    // ...
}

// Подкласс Корабль
class Ship extends Transport {
    private double fuelConsumption; // Расход топлива на 100 км

    public Ship(String name, double fuelConsumption) {
        super(name);
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public double calculatePassengerTransportCost(int passengers) {
        // Предположим, что стоимость перевозки пассажиров зависит от количества пассажиров
        return passengers * 2; // Пример стоимости на одного пассажира
    }

    @Override
    public double calculateCargoTransportCost(double cargoWeight) {
        // Предположим, что стоимость перевозки груза зависит от веса груза
        return cargoWeight * 2; // Пример стоимости за килограмм груза
    }

    @Override
    public double calculateTravelTime(double distance) {
        // Предположим, что время в пути зависит от расстояния и скорости
        double speed = 20; // Пример скорости автомобиля в км/ч
        return distance / speed;
    }
    // Реализация методов подсчета стоимости и времени перевозки для корабля
    // ...
}
