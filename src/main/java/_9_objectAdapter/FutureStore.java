package _9_objectAdapter;

/**
 * Created by Alvin on 2019-08-22.
 */

public class FutureStore {

    private String name;

    public FutureStore(String name) {
        this.name = name;
    }

    public void print3D(){
        System.out.println(getClass().getSimpleName() + " "
                + name + " execute 3D Print from Future.");
    }

    public void deliveryByMachine(){
        System.out.println(getClass().getSimpleName() + " "
                + name + " execute delivery from Future.");
    }
}
