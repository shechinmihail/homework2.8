import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private Set<Product> products;
    private double theTotalCostOfAllProducts;
    private String name;

    public Recipe(String name) {
        setName(name);
        theTotalCostOfAllProducts = 0;
        products = new HashSet<>();
    }

    public Set<Product> getProducts() {
        return products;
    }

    public double getTheTotalCostOfAllProducts() {
        return theTotalCostOfAllProducts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "Рецепт указан неверно!";
        } else {
            this.name = name;
        }
    }

    public void addProduct(Product product) throws IllegalArgumentException {
        if (products.contains(product)) {
            throw new IllegalArgumentException("В сумке уже есть этот продукт");
        }
        products.add(product);
        theTotalCostOfAllProducts += product.getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        if (Double.compare(recipe.theTotalCostOfAllProducts, theTotalCostOfAllProducts) != 0) return false;
        if (Objects.equals(name, recipe.name)) return false;
        return Objects.equals(products, recipe.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, theTotalCostOfAllProducts, name);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "products=" + products +
                ", theTotalCostOfAllProducts=" + theTotalCostOfAllProducts +
                ", name='" + name + '\'' + '}';
    }
}
