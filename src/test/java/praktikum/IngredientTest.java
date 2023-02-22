package praktikum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IngredientTest {

    private Ingredient ingredient;
    private static final String INGREDIENT_SAUCE = "SAUCE";
    private static final String INGREDIENT_NAME = "name";
    private static final float INGREDIENT_PRICE = 10F;

    @Before
    public void setUp() {
        ingredient = new Ingredient(IngredientType.valueOf(INGREDIENT_SAUCE),
                INGREDIENT_NAME, INGREDIENT_PRICE);
    }

    @Test
    public void checkSuccessfulCreationIngredient() {
        assertEquals(INGREDIENT_SAUCE, ingredient.getType().name());
        assertEquals(INGREDIENT_NAME, ingredient.getName());
        assertEquals(INGREDIENT_PRICE, ingredient.getPrice(), 0);
    }
}