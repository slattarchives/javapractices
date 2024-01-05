package prac4;

// Перечисление для марок компьютера
enum ComputerBrand {
    ACER,
    HP,
    DELL,
    ASUS,
    LENOVO
}

// Класс для процессора
class Processor {
    private String brand;
    private String model;
    private double clockSpeed;

    public Processor(String brand, String model, double clockSpeed) {
        this.brand = brand;
        this.model = model;
        this.clockSpeed = clockSpeed;
    }

    @Override
    public String toString() {
        return brand + " " + model + " (" + clockSpeed + " GHz)";
    }
}

// Класс для памяти
class Memory {
    private int capacity;
    private String memoryType;

    public Memory(int capacity, String memoryType) {
        this.capacity = capacity;
        this.memoryType = memoryType;
    }

    @Override
    public String toString() {
        return capacity + " GB " + memoryType + " RAM";
    }
}

// Класс для монитора
class Monitor {
    private String brand;
    private double size;

    public Monitor(String brand, double size) {
        this.brand = brand;
        this.size = size;
    }

    @Override
    public String toString() {
        return brand + " " + size + " inch monitor";
    }
}

// Класс для компьютера
class Computer {
    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computer: " + brand + "\nProcessor: " + processor + "\nMemory: " + memory + "\nMonitor: " + monitor;
    }
}



