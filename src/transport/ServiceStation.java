package transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> transports = new ArrayDeque<>();

    public ServiceStation() {

    }

    public Queue<Transport> getTransports() {
        return transports;
    }

    public void addTransportOnServiceStation(Transport transport) throws BussErrorServis {
        if (transport instanceof Bus){
            System.out.println("Автобусы вечные!!! Ремонт не нужен");
            return;
        }
        transports.add(transport);
    }

    public void service() {
        while (transports.isEmpty()) {
            Transport t = transports.poll();
            if (t.passDiagnostics()){
                t.fixTheTransport();
            } else {
                System.out.println("Автомобиль проверен, готов к гонкам");
            }
        }
    }
}
