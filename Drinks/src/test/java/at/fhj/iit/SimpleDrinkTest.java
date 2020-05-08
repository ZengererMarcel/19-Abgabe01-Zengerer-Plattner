package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Class which tests the methods of SimpleDrink
 */
@DisplayName("Testing SimpleDrink implementation")
public class SimpleDrinkTest {
    private SimpleDrink nonA, alcoholic;

    /**
     * inits an alcoholic and a nonalcoholic simple drink for EACH test
     */
    @BeforeEach
    void setup() {
        nonA = new SimpleDrink("Cola", new Liquid("Cola", 1,0));
        alcoholic = new SimpleDrink("Beer", new Liquid("Beer", 0.5,5.1));
    }

    @Test
    @DisplayName("Testing constructor non-alcoholic")
    public void testConstructorNonAlcoholic(){
       assertEquals(nonA.l.getName(), "Cola");
       assertEquals(nonA.getVolume(), 1);
       assertEquals(nonA.getAlcoholPercent(), 0);

    }
    @Test
    @DisplayName("Testing constructor alcoholic")
    public void testConstructorAlcoholic(){
        assertEquals(alcoholic.l.getName(), "Beer");
        assertEquals(alcoholic.getVolume(), 0.5);
        assertEquals(alcoholic.getAlcoholPercent(), 5.1);
    }

    @Test
    @DisplayName("Testing getVolume non alcoholic")
    public  void testGetVolumeNonAlcoholic(){
    assertEquals(nonA.getVolume(), 1);
    }

    @Test
    @DisplayName("Testing getVolume alcoholic")
    public void testGetVolumeAlcoholic(){
        assertEquals(alcoholic.getVolume(), 0.5);
    }

    @Test
    @DisplayName("Testing getAlcoholPercent non alcoholic")
    public void testGetAlcoholPercentNonAlcoholic(){
        assertEquals(nonA.getAlcoholPercent(), 0);
    }
    @Test
    @DisplayName("Testing getAlcoholPercent alcoholic")
    public void testGetAlcoholPercentAlcoholic(){
        assertEquals(alcoholic.getAlcoholPercent(), 5.1);
    }

    @Test
    @DisplayName("Testing isAlcoholic non alcoholic")
    public void testIsAlcoholicNonAlcoholic(){
        assertEquals(nonA.isAlcoholic(), false);
    }
    @Test
    @DisplayName("Testing isAlcoholic alcoholic")
    public void testIsAlcoholicAlcoholic(){
        assertEquals(alcoholic.isAlcoholic(), true);
    }

}
