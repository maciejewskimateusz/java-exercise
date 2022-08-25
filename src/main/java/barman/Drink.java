package barman;

public class Drink {

    private Ingredient[] ingredients;

    public Drink(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }
}
