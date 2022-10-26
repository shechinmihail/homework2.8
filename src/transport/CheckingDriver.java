package transport;

import java.util.HashSet;
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
    public String toString() {
        return "CheckingDriver{" +
                "drivers=" + drivers +
                '}';
    }
}
