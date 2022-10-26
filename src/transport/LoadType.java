package transport;

public enum LoadType {
    N1("с полной массой до 3,5 тонн"),

    N2("с полной массой свыше 3,5 до 12 тонн"),

    N3("с полной массой свыше 12 тонн");

    private final String description;

    LoadType(String description) {
        if (description.isBlank()) {
            this.description = "Данных недостаточно";
        } else {
            this.description = description;
        }
    }

    public String getDescription() {
        return description;
    }
}
