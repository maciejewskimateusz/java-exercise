package barman;

import java.util.Scanner;

public class Barman {

    private Scanner sc = new Scanner(System.in);

    Drink createDrink() {
        System.out.println("Podaj ilość składników");
        int ingredientsNumber = sc.nextInt();
        sc.nextLine();
        Ingredient[] ingredients = new Ingredient[ingredientsNumber];
        for (int i = 0; i < ingredientsNumber; i++) {
            System.out.println("Podaj nazwe składnika");
            String ingredientName = sc.nextLine();
            System.out.println("Podaj ilość składnika");
            int quantity = sc.nextInt();
            sc.nextLine();
            ingredients[i] = new Ingredient(ingredientName, quantity);
        }

        return new Drink(ingredients);
    }

    void printDrink(Drink drink) {
        Ingredient[] ingredients = drink.getIngredients();
        System.out.printf("Drink składa się z %d składników : \n", ingredients.length);
        for (Ingredient ingredient : ingredients) {
            System.out.printf("- %s (%d)\n", ingredient.getName(), ingredient.getQuantity());
        }
    }
}
