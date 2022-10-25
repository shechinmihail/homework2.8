import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ManyRecipes {
    private Set<Recipe> recipes;

    public ManyRecipes() {
        recipes = new HashSet<>();
    }

    public void addRecipe(String name) throws IllegalArgumentException {
        final Recipe recipe = new Recipe(name);
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже есть");
        }
        recipes.add(recipe);
    }

    public Recipe getRecipe(String name) {
        return recipes.stream().filter(recipe -> recipe.getName().equals(name)).findAny().orElse(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ManyRecipes that = (ManyRecipes) o;
        return Objects.equals(recipes, that.recipes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipes);
    }
}
