package transport;

import java.sql.DriverAction;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws BussErrorServis {

        Car lada = new Car("Lada", "Grande", 1.7, BodyType.SEDAN);
        Car audi = new Car("Audi", "A8 50L TDI quattro", 3.0, BodyType.SEDAN);
        Car bmw = new Car("BMW", "Z8", 3.0, BodyType.COUP);
        Car hyundai = new Car("Hyundai", "i30 4x4", 2.0, BodyType.HATCHBACK);

        СarАreight zil = new СarАreight("Зил", "131", 6.0, LoadType.N2);
        СarАreight kamaz = new СarАreight("Камаз", "4326", 13.0, LoadType.N2);
        СarАreight tatra = new СarАreight("Tatra", "Phoenix", 12.5, LoadType.N3);
        СarАreight iveco = new СarАreight("IVECO", "Powerstar", 12.0, LoadType.N2);

        Bus liaz = new Bus("Лиаз", "Т-1000", 2.4, CapacityType.SMALL);
        Bus solaris = new Bus("Соларис", "Super 300", 2.7, CapacityType.MEDIUM);
        Bus maz = new Bus("Маз", "GP 3", 4.0, CapacityType.SMALL);
        Bus mercedes = new Bus("Mercedes-Benz", "Super 500", 3.5, CapacityType.BIG);

        Driver<Car> ivan = new Driver<Car>("Петров Иван Васильевич", "В", 15, bmw);
        Driver<Bus> petr = new Driver<Bus>("Иванов Петр Николаевич", "D", 20, maz);
        Driver<СarАreight> nikolay = new Driver<СarАreight>("Фоменко Николай Иванович", "B", 16, zil);
        Driver<СarАreight> michael = new Driver<СarАreight>("Михаэль Шумахер", "С", 25, iveco);

        CheckingDriver checkingDriver = new CheckingDriver();

        //checkingDriver.addDriver(nikolay);


        bmw.addDriver(ivan);
        bmw.addDriver(nikolay);
        maz.addDriver(petr);
        zil.addDriver(michael);

        Sponsor sponsor1 = new Sponsor("Газпром", 10000000);
        Sponsor sponsor2 = new Sponsor("Роснефть", 100);
        Sponsor sponsor3 = new Sponsor("Транснефть", 50000);

        bmw.addSponsor(sponsor1);
        iveco.addSponsor(sponsor2);
        zil.addSponsor(sponsor3);

        Mechanic<Car> zyzy = new Mechanic<>("Зузу", "Зурабович", "Роснефть");
        Mechanic<Bus> sasha = new Mechanic<>("Александр", "Абрамович", "Газпром");
        Mechanic<СarАreight> dizel = new Mechanic<>("Винт", "Дизель", "Транснефть");

        audi.addMechanic(sasha);
        bmw.addMechanic(sasha);
        iveco.addMechanic(zyzy);
        zil.addMechanic(dizel);

        Set<Driver<?>> drivers = bmw.getDrivers();
        for (int i = 0; i < drivers.size(); i++) {
            System.out.println(drivers.toString());
        }
        var mechanics = bmw.getMechanics();
        for (int i = 0; i < mechanics.size(); i++) {
            System.out.println(mechanics.toString());
        }
        var sponsors = bmw.getSponsors();
        for (int i = 0; i < sponsors.size(); i++) {
            System.out.println(sponsors.toString());
        }

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addTransportOnServiceStation(kamaz);
        serviceStation.addTransportOnServiceStation(liaz);
        serviceStation.service();

        Queue<String> queue1 = new ArrayDeque<>(5);
        Queue<String> queue2 = new ArrayDeque<>(5);
        for (int i = 0; i < Math.floor(Math.random() * 5); i++) {
            queue1.offer("Василий" + i);
        }
        for (int i = 0; i < Math.floor(Math.random() * 5); i++) {
            queue2.offer("Михаил" + i);
        }

        System.out.println(queue1);
        System.out.println(queue2);

        addStringQueue("Проверка", queue1, queue2);


//        nikolay.drive(zil);
//        printInfo(lada);
//        printInfo(audi);
//        printInfo(bmw);
//        printInfo(hyundai);
//        printInfo(zil);
//        printInfo(kamaz);
//        printInfo(tatra);
//        printInfo(iveco);
//        printInfo(liaz);
//        printInfo(solaris);
//        printInfo(maz);
//        printInfo(mercedes);
//
//        bmw.printType();
//        maz.printType();
//        zil.printType();
//
//        diagnostics(
//                lada, audi, bmw, hyundai,
//                zil, kamaz, tatra, iveco,
//                liaz, solaris, maz, mercedes);


    }

    static void addStringQueue(String name, Queue<String> queue1, Queue<String> queue2) {
        if (queue1.size() == queue2.size() && queue1.size() == 5) {
            System.out.println("Кто нибудь, позовите Галю!!!");
            return;
        }
        if (queue1.size() < queue2.size()) {
            queue2.add(name);
        }
        if (queue1.size() > queue2.size()) {
            queue1.add(name);
        }
    }

    static void personIsRemovedFromTheRandomQueue(Queue<String> queue1, Queue<String> queue2) {
        if (Math.random() > 0.5) {
            queue1.poll();
        } else {
            queue2.poll();
        }
    }

    public static void diagnostics(Transport... transports) {
        for (Transport transport : transports) {
            passDiagnostics(transport);
        }
    }

    public static void passDiagnostics(Transport transport) {
        try {
            if (!transport.passDiagnostics())
                throw new RuntimeException("Транспортное средство " + transport.getBrand() + " " + transport.getModel()
                        + " не прошел диагностику! Выезжать ОПАСНО!!!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printInfo(Car car) {
        System.out.println(
                "Легковой автомобиль " +
                        "Марка " + car.getBrand() + '\'' +
                        ", Модель " + car.getModel() + '\'' +
                        ", Объем двигателя в литрах " + car.getEngineVolume());
    }

    private static void printInfo(СarАreight carAreight) {
        System.out.println(
                "Грузовой автомобиль, Марка " + carAreight.getBrand() + '\'' +
                        ", Модель " + carAreight.getModel() + '\'' +
                        ", Объем двигателя в литрах " + carAreight.getEngineVolume());
    }

    private static void printInfo(Bus bus) {
        System.out.println("Автобус Марка " + bus.getBrand() + '\'' + ", Модель " + bus.getModel() + '\'' +
                ", Объем двигателя в литрах " + bus.getEngineVolume());
    }


}