import java.util.*;

public class Recipe {
    private Map<Product, Integer> products = new HashMap<>();
    private double theTotalCostOfAllProducts;
    private String name;

    public Recipe(String name) {
        setName(name);
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

    public void addProduct(Product product, Integer v) {
        if (v <= 0) {
            v = 1;
            products.put(product,v);
        } else {
            products.put(product,v);
        }
        theTotalCostOfAllProducts += product.getPrice() * v;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        if (Double.compare(recipe.theTotalCostOfAllProducts, theTotalCostOfAllProducts) != 0) return false;
        if (Objects.equals(name, recipe.name)) return false;
        return equals(recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Рецепт{" +
                " продукты " + products +
                ", общая стоимость всех продуктов " + theTotalCostOfAllProducts +
                ", наименование " + name + '\'' + '}';
    }
}
