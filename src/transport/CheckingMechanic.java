package transport;

import java.util.HashSet;
import java.util.Set;

public class CheckingMechanic {

    private Set<Mechanic> mechanics;

    public CheckingMechanic() {
        mechanics = new HashSet<>();
    }

    public void addMechanic(Mechanic mechanic) {
        if (mechanics.contains(mechanic)) {
            throw new RuntimeException("Давайте, без повторений!");
        }
        mechanics.add(mechanic);
    }

    @Override
    public String toString() {
        return "CheckingMechanic{" +
                "mechanics=" + mechanics +
                '}';
    }
}
