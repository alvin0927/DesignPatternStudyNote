package _5_prototype;

/**
 * Created by Alvin on 2019-08-01.
 */

public class Sample {

    public static void main(String[] args) throws Exception {
        RestaurantPrototypes prototypes = RestaurantPrototypes.getInstance()
                .add("McDonalds" , new Restaurant("McDonalds" , "Big"))
                .add("BurgerKing" , new Restaurant("BurgerKing" , "Small"));

        Restaurant mcDonaldsPrototype =  prototypes.getPrototype("McDonalds");
        System.out.println(mcDonaldsPrototype.toString());
    }
}
