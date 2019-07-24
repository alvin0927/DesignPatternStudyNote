package _3_factoryMethod;

/**
 * Created by Alvin on 2019-07-24.
 */

public class Sample {
    public static void main(String[] args) {
        AbstractDBConnector dbConnector = new ExecutableDBConnector("SimulateMySQL");
        dbConnector.fetchData();
    }
}
