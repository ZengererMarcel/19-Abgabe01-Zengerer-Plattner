package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Class which tests the methods of MixedDrink
 */
@DisplayName("Testing MixedDrink implementation")
public class MixedDrinkTest {
    private MixedDrink nonA, alcoholic, negativeA;

    /**
     * inits an alcoholic, a nonalcoholic and a negative alcoholic mixed drink for EACH test
     */
    @BeforeEach
    void setup() {
        nonA = new MixedDrink("Spezi", new Liquid[]{new Liquid("Cola", 0.5, 0), new Liquid("Fanta", 0.5, 0)});
        alcoholic = new MixedDrink("Rum-Cola", new Liquid[]{new Liquid("Cola", 0.5, 0), new Liquid("Rum", 0.1, 37.5)});
        nonA = new MixedDrink("Spezi", new Liquid[]{new Liquid("Cola", 0.5, 0), new Liquid("Rum", 0.1, -7)});
    }

    @Test
    @DisplayName("Testing constructor non alcoholic")
    public void testConstructorNonAlcoholic(){

    }
    @Test
    @DisplayName("Testing constructor alcoholic")
    public void testConstructorAlcoholic(){

    }
    @Test
    @DisplayName("Testing constructor negative alcoholic")
    public void testConstructorNegativeAlcoholic(){

    }
    @Test
    @DisplayName("Testing getVolume non alcoholic")
    public void testGetVolumeNonAlcoholic(){

    }
    @Test
    @DisplayName("Testing getVolume alcoholic")
    public void testGetVolumeAlcoholic(){

    }
    @Test
    @DisplayName("Testing getVolume negative alcoholic")
    public void testGetVolumeNegativeAlcoholic(){

    }
    @Test
    @DisplayName("Testing getAlcoholPercent non alcoholic")
    public void testGetAlcoholPercentNonAlcoholic(){

    }
    @Test
    @DisplayName("Testing getAlcoholPercent alcoholic")
    public void testGetAlcoholPercentAlcoholic(){

    }
    @Test
    @DisplayName("Testing getAlcoholPercent negative alcoholic")
    public void testGetAlcoholPercentNegativeAlcoholic(){

    }
    @Test
    @DisplayName("Testing isAlcoholic non alcoholic")
    public void testIsAlcoholicNonAlcoholic(){

    }
    @Test
    @DisplayName("Testing isAlcoholic alcoholic")
    public void testIsAlcoholicAlcoholic(){

    }
    @Test
    @DisplayName("Testing isAlcoholic negative alcoholic")
    public void testIsAlcoholicNegativeAlcoholic(){

    }



}

