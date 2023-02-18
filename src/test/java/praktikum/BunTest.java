package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BunTest {

    @Test
    public void checkCreatedBun() {

        String expectedName = "TestBun";
        float expectedPrice = 10.15F;
        Bun bun = new Bun(expectedName, expectedPrice);
        assertEquals(expectedName, bun.getName());
        assertEquals(expectedPrice, bun.getPrice(), 0);
    }
}