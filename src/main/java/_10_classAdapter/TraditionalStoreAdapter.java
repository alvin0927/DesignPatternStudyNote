package _10_classAdapter;

import _9_objectAdapter.TraditionalStore;

/**
 * Created by Alvin on 2019-08-22.
 */

public class TraditionalStoreAdapter extends TraditionalStore {

    private String name;

    public TraditionalStoreAdapter(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void executeTakkyubinService() {
        System.out.println(
                this.getClass().getSimpleName() +
                        "  " + name + " can also execute Takkyubin Service. ");
    }

    @Override
    public void executePrintService() {
        System.out.println(
                this.getClass().getSimpleName() +
                        "  " + name + " can also execute Print Service. ");
    }
}
