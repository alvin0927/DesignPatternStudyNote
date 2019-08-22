package _10_classAdapter;

import _9_objectAdapter.FutureStore;
import _9_objectAdapter.ModernService;

/**
 * Created by Alvin on 2019-08-22.
 */

class FutureStoreAdapter extends FutureStore implements ModernService {
    private String name;

    public FutureStoreAdapter(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void print3D() {
        System.out.println(getClass().getSimpleName() + " "
                + name + " also execute 3D Print from Future.");
    }

    @Override
    public void deliveryByMachine() {
        System.out.println(getClass().getSimpleName() + " "
                + name + " also execute delivery from Future.");
    }

    @Override
    public void executeTakkyubinService() {
        deliveryByMachine();
    }

    @Override
    public void executePrintService() {
        print3D();
    }
}
