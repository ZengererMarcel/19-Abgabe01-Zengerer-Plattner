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
        alcoholic = new MixedDrink("Rum-Cola", new Liquid[]{new Liquid("Cola", 0.5, 0), new Liquid("Rum", 0.05, 37.5)});
        negativeA = new MixedDrink("Rum-Cola", new Liquid[]{new Liquid("Cola", 0.5, 0), new Liquid("Rum", 0.05, -7)});
    }

    @Test
    @DisplayName("Testing constructor non alcoholic")
    public void testConstructorNonAlcoholic(){
            assertEquals(nonA.name, "Spezi");

            assertEquals(alcoholic.liquidArray[0].getName(), "Cola");
            assertEquals(alcoholic.liquidArray[0].getVolume(), 0.5);
            assertEquals(alcoholic.liquidArray[0].getAlcoholPercent(), 0.0);

            assertEquals(alcoholic.liquidArray[1].getName(), "Fanta");
            assertEquals(alcoholic.liquidArray[1].getVolume(), 0.5);
            assertEquals(alcoholic.liquidArray[1].getAlcoholPercent(), 0.0);
    }
    @Test
    @DisplayName("Testing constructor alcoholic")
    public void testConstructorAlcoholic(){
        assertEquals(alcoholic.name, "Rum-Cola");

        assertEquals(alcoholic.liquidArray[0].getName(), "Cola");
        assertEquals(alcoholic.liquidArray[0].getVolume(), 0.5);
        assertEquals(alcoholic.liquidArray[0].getAlcoholPercent(), 0.0);

        assertEquals(alcoholic.liquidArray[1].getName(), "Rum");
        assertEquals(alcoholic.liquidArray[1].getVolume(), 0.05);
        assertEquals(alcoholic.liquidArray[1].getAlcoholPercent(), 37.5);
    }
    @Test
    @DisplayName("Testing constructor negative alcoholic")
    public void testConstructorNegativeAlcoholic(){
        assertEquals(negativeA.name, "Rum-Cola");

        assertEquals(negativeA.liquidArray[0].getName(), "Cola");
        assertEquals(negativeA.liquidArray[0].getVolume(), 0.5);
        assertEquals(negativeA.liquidArray[0].getAlcoholPercent(), 0.0);

        assertEquals(negativeA.liquidArray[1].getName(), "Rum");
        assertEquals(negativeA.liquidArray[1].getVolume(), 0.05);
        assertEquals(negativeA.liquidArray[1].getAlcoholPercent(), -7);
    }
    @Test
    @DisplayName("Testing getVolume non alcoholic")
    public void testGetVolumeNonAlcoholic(){
        assertEquals(nonA.getVolume(), 1.0 , 0.001);
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

