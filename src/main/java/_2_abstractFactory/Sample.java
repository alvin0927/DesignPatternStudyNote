package _2_abstractFactory;

public class Sample {

    public static void main(String[] args) {

        DBConnectFactory dbConnectFactory = new DBConnectFactory() {
            @Override
            public DBConnector getDBConnector() {
                return getDBConnectorInstance();
            }

            @Override
            public DBServiceProvider getDBServiceProvider() {
                return getDBServiceProviderInstance();
            }
        };

        DBActionManager.fetchDataFromDB(dbConnectFactory);

    }

    private static DBConnector getDBConnectorInstance() {
        return new DBConnector() {
            @Override
            public void connect() {
                System.out.println("DB is connected");
            }

            @Override
            public void close() {
                System.out.println("DB is closed");
            }
        };
    }

    private static DBServiceProvider getDBServiceProviderInstance() {
        return new DBServiceProvider() {
            @Override
            public void fetchCustomersFromDB() {
                System.out.println("This is data from DB");
            }
        };
    }
}
