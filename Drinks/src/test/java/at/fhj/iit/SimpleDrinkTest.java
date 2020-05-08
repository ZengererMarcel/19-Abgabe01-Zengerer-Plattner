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

    }
    @Test
    @DisplayName("Testing constructor alcoholic")
    public void testConstructorAlcoholic(){

    }

    @Test
    @DisplayName("Testing getVolume() non-aloholic")
    public  void testGetVolumeNonAlcoholic(){

    }

    @Test
    @DisplayName("Testing getVolume() alcoholic")
    public void testGetVolumeAlcoholic(){

    }

    @Test
    @DisplayName("Testing getAlcoholPercent non-alcoholic")
    public void testGetAlcoholPercentNonAlcoholic(){

    }
    @Test
    @DisplayName("Testing getAlcoholPercent alcoholic")
    public void testGetAlcoholPercentAlcoholic(){

    }

    @Test
    @DisplayName("Testing isAlcoholic non-alcoholic")
    public void testIsAlcoholicNonAlcoholic(){

    }
    @Test
    @DisplayName("Testing isAlcoholic alcoholic")
    public void testIsAlcoholicAlcoholic(){

    }

}
