import java.util.HashSet;
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
    public void removeProduct(Product product){
        final Product examination;
                examination = set.stream().filter(product1 -> product.getName() == product1.getName()).findAny().orElse(null);
                set.remove(examination);
    }

    @Override
    public String toString() {
        return "Список покупок{" +
                set +
                '}';
    }
}

