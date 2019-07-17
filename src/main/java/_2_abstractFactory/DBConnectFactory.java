package _2_abstractFactory;

public interface DBConnectFactory {
    DBConnector getDBConnector();
    DBServiceProvider getDBServiceProvider();
}
