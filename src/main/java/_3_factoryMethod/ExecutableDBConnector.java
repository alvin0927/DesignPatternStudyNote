package _3_factoryMethod;

import _2_abstractFactory.DBServiceProvider;

/**
 * Created by Alvin on 2019-07-24.
 */

public class ExecutableDBConnector extends AbstractDBConnector {

    public ExecutableDBConnector(String connectionDBName) {
        super(connectionDBName);
    }

    @Override
    DBServiceProvider createDBServiceProviderInstance() {
        return new DBServiceProvider() {
            @Override
            public void fetchCustomersFromDB() {
                System.out.println("Fetch Customers from DB");
            }
        };
    }

    @Override
    public void connect() {
        System.out.println("DB is connected");
    }

    @Override
    public void close() {
        System.out.println("DB is Closed");
    }
}
