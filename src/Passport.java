public class Passport {
    private final int numberPassport;
    private String surname;
    private String name;
    private String middlename;
    private int dateOfBirth;

    public Passport(int numberPassport, String surname, String name, String middlename, int dateOfBirth) {
        this.numberPassport = numberPassport;
        setSurname(surname);
        setName(name);
        this.middlename = middlename;
        this.dateOfBirth = dateOfBirth;
    }

    public int getNumberPassport() {
        return numberPassport;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null) {
            this.surname = "Фамилия не указана!";
        } else {
            this.surname = surname;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            this.name = "Имя не указано!";
        } else {
            this.name = name;
        }
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "numberPassport=" + numberPassport +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middlename='" + middlename + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
