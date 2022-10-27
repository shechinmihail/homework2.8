package transport;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class СheckingTransport {
    private Set<Transport> transports;

    public СheckingTransport() {
        transports = new HashSet<>();
    }

    public void addTransport(Transport transport) {
        if (transports.contains(transport)) {
            throw new RuntimeException("Давайте, без повторений!");
        }
        transports.add(transport);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        СheckingTransport that = (СheckingTransport) o;
        return Objects.equals(transports, that.transports);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transports);
    }

    @Override
    public String toString() {
        return "СheckingTransport{" +
                "transports=" + transports +
                '}';
    }
}
