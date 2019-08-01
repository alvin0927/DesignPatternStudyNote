package _6_singleton;

/**
 * Created by Alvin on 2019-08-01.
 */

public class Sample {

    public static void main(String[] args) {
        ConnectionManager.getInstance().setName("MySQL");
        ConnectionManager.getInstance().setName("CouchDB");
        System.out.println(ConnectionManager.getInstance().getName());
    }
}
