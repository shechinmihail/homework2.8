package transport;

import java.util.HashSet;
import java.util.Objects;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckingMechanic that = (CheckingMechanic) o;
        return Objects.equals(mechanics, that.mechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mechanics);
    }

    @Override
    public String toString() {
        return "CheckingMechanic{" +
                "mechanics=" + mechanics +
                '}';
    }
}
