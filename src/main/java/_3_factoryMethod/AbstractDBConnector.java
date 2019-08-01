package _3_factoryMethod;

import _2_abstractFactory.DBConnector;
import _2_abstractFactory.DBServiceProvider;

/**
 * Created by Alvin on 2019-07-24.
 */

public abstract class AbstractDBConnector implements DBConnector {
    private String connectionDBName;

    public AbstractDBConnector(String connectionDBName) {
        this.connectionDBName = connectionDBName;
    }

    abstract DBServiceProvider createDBServiceProviderInstance();

    public void fetchData() {
        connect();
        DBServiceProvider dbServiceProvider = createDBServiceProviderInstance();
        dbServiceProvider.fetchCustomersFromDB();
        close();
    }

    protected void logCurrentDBName() {
        System.out.println("Current DB Name is " + connectionDBName);
    }
}
