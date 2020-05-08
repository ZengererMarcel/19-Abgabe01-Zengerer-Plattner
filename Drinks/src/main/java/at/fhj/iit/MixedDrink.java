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
        double alcohol = 0;

        for(Liquid l : liquidArray) {
            alcohol = l.getVolume() * l.getAlcoholPercent() / 100;
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
    public boolean isAlcoholic() {
        Cause c = new Cause();

        for(int i = 0; i < liquidArray.length; i++) {

            try {
                c.check(liquidArray[i].getAlcoholPercent());
                if (liquidArray[i].getAlcoholPercent() > 0) {
                    return true;
                }
            }catch(CustomException e){
                e.printStackTrace();
            }
        }
        return false;
    }
}



/**
 * class represents a custom exception
 */
class CustomException extends Exception {

    /**
     * Creates an Exception Object with a given message
     *
     * @param message represents the error message which will be shown
     */

    public CustomException(String message) {
        super(message);
    }
}


/**
 * class checks if a alcohol percentage is negative and throws an exception if this is the case
 */
class Cause {

    /**
     * Creates a Cause Object
     */
    public Cause(){}


    /**
     * checks if a alcohol percent is negative. if that is the case, it will throw an exception
     */
    public void check(double alcoholPercent) throws CustomException {

        if (alcoholPercent < 0) {
            throw new CustomException("Alcohol Percent is negative!");
        }
        }
    }



