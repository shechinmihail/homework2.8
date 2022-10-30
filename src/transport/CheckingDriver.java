package transport;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CheckingDriver {
    private Set<Driver> drivers;

    public CheckingDriver(){
        drivers = new HashSet<>();
    }
    public void addDriver(Driver driver){
        if (drivers.contains(driver)){
            throw new RuntimeException("Давайте, без повторений!");
        }
        drivers.add(driver);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckingDriver that = (CheckingDriver) o;
        return Objects.equals(drivers, that.drivers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drivers);
    }

    @Override
    public String toString() {
        return "CheckingDriver{" +
                "drivers=" + drivers +
                '}';
    }
}
