package transport;

public enum CapacityType {
    ESPECIALLY_SMALL("до 10 мест"),

    SMALL("до 25"),

    MEDIUM("40–50"),

    BIG("60–80"),

    SUPER_BIG("100–120 мест");

    private final String description;

    CapacityType(String description) {
        if (description == null || description.isBlank()) {
            this.description = "Данных недостаточно";
        } else {
            this.description = description;
        }
    }

    public String getDescription() {
        return description;
    }
}
