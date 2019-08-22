package _9_objectAdapter;

/**
 * Created by Alvin on 2019-08-22.
 */

public class StoreAdapter implements ModernService{

    private FutureStore futureStore;

    public StoreAdapter(FutureStore futureStore) {
        this.futureStore = futureStore;
    }

    @Override
    public void executeTakkyubinService() {
        futureStore.deliveryByMachine();
    }

    @Override
    public void executePrintService() {
        futureStore.print3D();
    }
}
