package transport;

public class СarАreight extends Transport implements Competing {

    public static final String GREAT_SPEED = "Хорошая скорость";
    public static final String BAD_SPEED = "Нужно ускоряться";
    public static final String[] PIT_STOP = {"Количество Пит-Стопов", "Время Пит-Стопа"};
    public static final String[] LAP_TIME = {"Количество кругов", "Время"};

    public LoadType loadType;

    public СarАreight(String brand, String model, double engineVolume, LoadType loadType) {
        super(brand, model, engineVolume);
        this.loadType = loadType;
    }

    public LoadType getLoadType() {
        return loadType;
    }

    public void setLoadType(LoadType loadType) {
        this.loadType = loadType;
    }

    @Override
    public void startMoving() {
        System.out.println("Взять кривой ключ и с 10-й попытки запустить двигатель");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Доехать до финиша");
    }

    @Override
    public void printType() {
        if (loadType == null) {
            System.out.println("Данных недостаточно");
        } else {
            System.out.println("Грузоподъемность авто: " + loadType.getDescription());
        }
    }

    @Override
    public boolean passDiagnostics() {
        return Math.random() > 0.75;
    }

    @Override
    public void fixTheTransport() {
        System.out.println("Грузовик" + getBrand() + " " + getModel() + " отремонтирован.");
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
