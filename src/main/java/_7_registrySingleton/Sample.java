package _7_registrySingleton;

/**
 * Created by Alvin on 2019-08-12.
 */

public class Sample {

    public static void main(String[] args) {

        ConnectManager connectManager = (ConnectManager) SingletonRegistry
                .getInstance(ConnectManager.class.getName());
        connectManager.print();
    }
}
