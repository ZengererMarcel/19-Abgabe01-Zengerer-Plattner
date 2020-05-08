package at.fhj.iit;

/**
 * Class represents a mixed drink liquid which can be used in drinks
 */
public class MixedDrink extends Drink {

    /**
     * mixed drinks contains more than one liquid
     */
    protected Liquid[] liquidArray;

    /**
     * Creates a MixedDrink Object with given name and Liquid Array
     *
     * @param name        name of drink
     * @param liquidArray contains the diffrent liquids for the mixed drink
     */
    public MixedDrink(String name, Liquid[] liquidArray) {
        super(name);
        this.liquidArray = liquidArray;
    }

    /**
     * Returns volume of the mixed drink
     *
     * @return the volume of drink in litre
     */
    @Override
    public double getVolume() {
        double volume = 0;
        for (int i = 0; i < liquidArray.length; i++) {
            volume += liquidArray[i].getVolume();
        }
        return volume;
    }

    /**
     * Returns alcohol volume percent of mixed drink
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        double alcohol = 0;

        for (Liquid l : liquidArray) {
            alcohol += l.getVolume() * (l.getAlcoholPercent() / 100);
        }

        return alcohol * 100 / getVolume();
    }

    /**
     * Gives information if drink is alcoholic or not and throws an exception
     * if the acohol percentage of a liquid is negative
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() throws NegativeAlcoholValue {

        for (int i = 0; i < liquidArray.length; i++) {


            if (liquidArray[i].getAlcoholPercent() > 0)
                return true;
            else if (liquidArray[i].getAlcoholPercent() < 0)
                throw new NegativeAlcoholValue("Alcohol percent is negative");

        }
        return false;
    }
}


/**
 * class represents a custom exception
 */
class NegativeAlcoholValue extends Exception {

    /**
     * Creates an Exception Object with a given message
     *
     * @param message represents the error message which will be shown
     */

    public NegativeAlcoholValue(String message) {
        super(message);
    }
}
