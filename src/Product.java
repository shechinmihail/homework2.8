
import java.util.Objects;


public class Product {
    private String name;
    private double price;
    private double requiredAmount;

    public Product(String name, double price, double requiredAmount) throws InvalidInputException, IllegalArgumentException {
        setName(name);
        setPrice(price);
        setRequiredAmount(requiredAmount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "Заполните карточку товара полностью";
        } else {
            this.name = name;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws InvalidInputException {
        if (price <= 0) {
            throw new InvalidInputException("Сумма указана неверно");
        }
        this.price = price;
    }

    public double getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(double requiredAmount) throws InvalidInputException {
        if (price <= 0) {
            throw new InvalidInputException("Вес продукта указан неверно");
        }
        this.requiredAmount = requiredAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && requiredAmount == product.requiredAmount && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, requiredAmount);
    }

    @Override
    public String toString() {
        return "Продукт " + name +
                ", цена " + price + " руб." +
                ", количество " + requiredAmount + " кг.";
    }
}
