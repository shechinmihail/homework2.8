package transport;

import java.util.Objects;

public class Driver<T extends Transport & Competing> {
    private String fullName;
    private String driverLicense;
    private int experience;

    private T transport;

    public Driver(String fullName, String driverLicense, int experience, T transport) {
        setFullName(fullName);
        setDriverLicense(driverLicense);
        setExperience(experience);
        setTransport(transport);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            this.fullName = "Ф.И.О. водителя не указано";
        } else {
            this.fullName = fullName;
        }
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        if (driverLicense == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав!");
        } else {
            this.driverLicense = driverLicense;
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience < 0) {
            this.experience = 0;
        } else {
            this.experience = experience;
        }
    }

    public T getTransport() {
        return transport;
    }

    public void setTransport(T transport) {
        if (experience < 0) {
            this.experience = experience;
        }
        if (transport != null) {
            this.transport = transport;
        }
    }

    public void startMoving() {
        System.out.println(fullName + " Вставить ключ в замок зажигания и запустить двигатель " + transport.getBrand() + " " +
                transport.getModel());
    }

    public void stop() {
        System.out.println(fullName + " Остановиться и заглушить двигатель " + transport.getBrand() + " " + transport.getModel());
    }

    public void refuelTheCar() {
        System.out.println(fullName + " делает заправку автомобиля" + transport.getBrand() + " " + transport.getModel());
    }

    public void drive(T transport) {
        System.out.println("Водитель " + fullName + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }

    @Override
    public String toString() {
        return "Водитель " + fullName +
                ", водительское удостоверение " + driverLicense +
                ", водительский стаж " + experience +
                ", на автомобиле " + transport;
    }
}
