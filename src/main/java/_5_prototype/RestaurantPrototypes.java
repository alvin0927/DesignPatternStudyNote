package _5_prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alvin on 2019-08-01.
 */

public class RestaurantPrototypes {
    private Map<String , Restaurant> prototypes = new HashMap<>();

    private RestaurantPrototypes() {

    }

    public static RestaurantPrototypes getInstance() {
        return new RestaurantPrototypes();
    }

    public RestaurantPrototypes add(String tag , Restaurant restaurant) {
        prototypes.put(tag , restaurant);
        return this;
    }

    public Restaurant getPrototype(String tag) throws CloneNotSupportedException {
        return (Restaurant) prototypes.get(tag).clone();
    }
}
