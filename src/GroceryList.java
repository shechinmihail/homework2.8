import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class GroceryList {

    private Set<Product> set;

    public GroceryList() {
        set = new HashSet<>();
    }

    public void addProduct(String name, double price, double requiredAmount) throws IllegalArgumentException, InvalidInputException {
        final Product product = new Product(name, price, requiredAmount);
        if (set.contains(product)) {
            throw new IllegalArgumentException("В сумке уже есть этот продукт");
        }
        set.add(product);
    }

    public void removeProduct(Product product) {
        set.remove(product);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroceryList that = (GroceryList) o;
        return Objects.equals(set, that.set);
    }

    @Override
    public int hashCode() {
        return Objects.hash(set);
    }

    @Override
    public String toString() {
        return "Список покупок{" +
                set +
                '}';
    }
}

