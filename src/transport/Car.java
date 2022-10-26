package transport;

public final class Car extends Transport implements Competing {
    public static final String GREAT_SPEED = "Хорошая скорость";
    public static final String BAD_SPEED = "Нужно ускоряться";
    public static final String[] PIT_STOP = {"Количество Пит-Стопов", "Время Пит-Стопа"};
    public static final String[] LAP_TIME = {"Количество кругов", "Время"};
    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void startMoving() {
        System.out.println("Вставить ключ в замок зажигания и запустить двигатель");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Заглушить двигатель и выйти из машины");
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных недостаточно");
        } else {
            System.out.println("Тип кузова авто: " + bodyType);
        }
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
                break;
        }
    }

    public boolean passDiagnostics() {
        return Math.random() > 0.5;
    }

    @Override
    public void fixTheTransport() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " починен.");
    }

}





