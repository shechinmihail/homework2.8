package transport;

public class Mechanic<T extends Transport & Competing> {
    private String name;
    private String surname;
    private String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public boolean passDiagnostics(T t) {
        return t.passDiagnostics();
    }

    public void fixTheTransport(T t) {
        t.fixTheTransport();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Механик " + name +
                " " + surname +
                " из Компании " + company;
    }
}
