package prac24;

// Интерфейс для всех классов стульев
interface Chair {
    void sit();
}

// Викторианский стул
class VictorianChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Сидим на викторианском стуле");
    }
}

// Многофункциональный стул
class MultifunctionalChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Сидим на многофункциональном стуле");
    }
}

// Магический стул
class MagicChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Сидим на магическом стуле");
    }
}

// Абстрактная фабрика для создания стульев
interface ChairFactory {
    Chair createChair();
}

// Фабрика для викторианских стульев
class VictorianChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}

// Фабрика для многофункциональных стульев
class MultifunctionalChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new MultifunctionalChair();
    }
}

// Фабрика для магических стульев
class MagicChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new MagicChair();
    }
}

// Клиент, который использует интерфейс стула
class Client {
    public void sit(Chair chair) {
        chair.sit();
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание фабрик для различных типов стульев
        ChairFactory victorianFactory = new VictorianChairFactory();
        ChairFactory multifunctionalFactory = new MultifunctionalChairFactory();
        ChairFactory magicFactory = new MagicChairFactory();

        // Создание клиента
        Client client = new Client();

        // Клиент сидит на разных стульях, созданных разными фабриками
        Chair victorianChair = victorianFactory.createChair();
        Chair multifunctionalChair = multifunctionalFactory.createChair();
        Chair magicChair = magicFactory.createChair();

        client.sit(victorianChair);
        client.sit(multifunctionalChair);
        client.sit(magicChair);
    }
}