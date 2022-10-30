package transport;

public final class Bus extends Transport implements Competing {
    public static final String GREAT_SPEED = "Хорошая скорость";
    public static final String BAD_SPEED = "Нужно ускоряться";
    public static final String[] PIT_STOP = {"Количество Пит-Стопов", "Время Пит-Стопа"};
    public static final String[] LAP_TIME = {"Количество кругов", "Время"};

    public CapacityType capacityType;

    public Bus(String brand, String model, double engineVolume, CapacityType capacityType) {
        super(brand, model, engineVolume);
        this.capacityType = capacityType;
    }

    public CapacityType getCapacityType() {
        return capacityType;
    }

    public void setCapacityType(CapacityType capacityType) {
        this.capacityType = capacityType;
    }

    @Override
    public void startMoving() {
        System.out.println(" Запустить двигатель и начать движение к Старту");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Пересечь финишную черту и заехать в бокс");
    }

    @Override
    public void printType() {
        if (capacityType == null) {
            System.out.println("Данных недостаточно");
        } else {
            System.out.println("Вместительность автобуса: " + capacityType.getDescription());
        }
    }

    @Override
    public boolean passDiagnostics() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не требуется");
        return true;
    }

    @Override
    public void fixTheTransport() {
        System.out.println("Автобусу " + getBrand() + " " + getModel() + "ремонт не требуется, автобусы вечные!");
    }

    @Override
    public String[] pitStop() {
        return PIT_STOP;
    }

    @Override
    public String[] bestLapTime() {
        return LAP_TIME;
    }

    @Override
    public void maxSpeed(String speed) {
        switch (speed) {
            case GREAT_SPEED:
                System.out.println("Показал максимальную скорость круга");
                System.out.println("Гонщик выложился полностью");
                break;
            case BAD_SPEED:
                System.out.println("Не показал максимальную скорость круга");
                System.out.println("Гонщик не отработал хорошо");
        }

    }
}
