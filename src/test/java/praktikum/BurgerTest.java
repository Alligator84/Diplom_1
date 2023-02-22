package praktikum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {

    @Mock
    private Bun bun;

    @Mock
    private Ingredient ingredient;

    private Burger burger;
    private String expectedReceipt;

    @Before
    public void setUp() {
        expectedReceipt = String.format("(==== %s ====)%n", "black bun") + String.format("= %s %s =%n", "sauce", "sour cream") +
                String.format("(==== %s ====)%n", "black bun") +
                String.format("%nPrice: %f%n", 25.000000F);
        burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        Mockito.when(bun.getPrice()).thenReturn(10F);
        Mockito.when(ingredient.getPrice()).thenReturn(5F);
    }

    @Test
    public void checkSetBuns() {
        assertEquals(25F, burger.getPrice(), 0);
    }

    @Test
    public void checkRemoveIngredient() {
        assertEquals(25, burger.getPrice(), 0);
        burger.removeIngredient(0);
        assertEquals(20, burger.getPrice(), 0);
    }

    @Test
    public void checkMoveIngredient() {
        burger.addIngredient(ingredient);
        assertEquals(30, burger.getPrice(), 0);
        burger.moveIngredient(1, 0);
        assertEquals(30, burger.getPrice(), 0);
    }

    @Test
    public void checkGetReceipt() {
        Mockito.when(bun.getName()).thenReturn("black bun");
        Mockito.when(ingredient.getType()).thenReturn(IngredientType.valueOf("SAUCE"));
        Mockito.when(ingredient.getName()).thenReturn("sour cream");
        System.out.println(expectedReceipt);
        System.out.println(burger.getReceipt());
        assertEquals(expectedReceipt, burger.getReceipt());
    }
}