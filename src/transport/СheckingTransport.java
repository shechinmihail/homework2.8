package transport;

import java.util.HashSet;
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

}
