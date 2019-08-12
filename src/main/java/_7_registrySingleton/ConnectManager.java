package _7_registrySingleton;

/**
 * Created by Alvin on 2019-08-12.
 */

public class ConnectManager {
    private static ConnectManager manager = new ConnectManager();

    private ConnectManager() {

    }

    public static ConnectManager getInstance() {
        return manager;
    }

    public void print(){
        System.out.println("This is ConnectManager!");
    }
}
