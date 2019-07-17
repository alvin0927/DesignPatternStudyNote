package _2_abstractFactory;

public class DBActionManager {

    public static void fetchDataFromDB(DBConnectFactory dbConnectFactory) {
        dbConnectFactory.getDBConnector().connect();
        dbConnectFactory.getDBServiceProvider().fetchCustomersFromDB();
        dbConnectFactory.getDBConnector().close();
    }
}
