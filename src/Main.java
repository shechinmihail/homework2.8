import java.util.*;

public class Main {
    public static void main(String[] args) throws InvalidInputException, IllegalArgumentException {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Помидоры", 220.50, 5));
        products.add(new Product("Бананы", 79.99, 4));
        products.add(new Product("Арбуз", 45.99, 1));
        products.add(new Product("Апельсины", 100.89, 1));

        System.out.println(Arrays.toString(products.toArray()));

        Set<String> set = new HashSet<>();
        set.add("Помидоры");
        set.add("Бананы");
        set.add("Бананы");
        set.add("Арбуз");
        set.add("Апельсины");
        set.add("Апельсины");

        System.out.println(Arrays.toString(set.toArray()));

        Set<Recipe> recipes = new HashSet<>();
        recipes.add(new Recipe(""));


        System.out.println(recipes);

    }
}