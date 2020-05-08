package at.fhj.iit;

/**
 * Class represents a mixed drink liquid which can be used in drinks
 */
public class MixedDrink extends Drink{

    /**
     * mixed drinks contains more than one liquid
     */
    Liquid[] liquidArray;

    /**
     * Creates a MixedDrink Object with given name and Liquid Array
     *
     * @param name  name of drink
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
        int volume = 0;
        for(int i = 0; i < liquidArray.length; i++){
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
        //TODO
        return 1;
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        //TODO
        return true;
    }
}
