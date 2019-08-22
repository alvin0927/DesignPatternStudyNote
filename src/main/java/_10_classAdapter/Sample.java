package _10_classAdapter;

import _9_objectAdapter.Stores;

/**
 * Created by Alvin on 2019-08-22.
 */

public class Sample {

    public static void main(String[] args) {
        Stores stores = Stores.getInstance();
        stores.addModernService(new TraditionalStoreAdapter("行動餐車"));
        stores.addModernService(new FutureStoreAdapter("無人商店"));
        stores.listAllModernService();
    }
}
