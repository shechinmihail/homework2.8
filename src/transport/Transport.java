package transport;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    private final List<Driver<?>> drivers = new ArrayList<>();

    private final List<Mechanic<?>> mechanics = new ArrayList<>();

    private final List<Sponsor> sponsors = new ArrayList<>();

    public Transport(String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null) {
            this.brand =
                    "default";
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void addDriver(Driver<?> driver) {
        drivers.add(driver);
    }

    public void addMechanic(Mechanic<?> mechanic) {
        mechanics.add(mechanic);
    }

    public void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    }

    public abstract void startMoving();

    public abstract void finishTheMove();

    public abstract void printType();

    public abstract boolean passDiagnostics();

    public abstract void fixTheTransport();

    @Override
    public String toString() {
        return "марки " + brand +
                ", модели " + model +
                ", с двигателем " + engineVolume;
    }
}



