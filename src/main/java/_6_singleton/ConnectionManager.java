package _6_singleton;

/**
 * Created by Alvin on 2019-08-01.
 */

public class ConnectionManager {

    private static final ConnectionManager ourInstance = new ConnectionManager();
    private String name;
    public int connectMembers;

    public static ConnectionManager getInstance() {
        return ourInstance;
    }

    private ConnectionManager() {

    }

    /**
     * @return the {@link #name}
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the {@link #name} to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the {@link #connectMembers}
     */
    public int getConnectMembers() {
        return connectMembers;
    }

    /**
     * @param connectMembers the {@link #connectMembers} to set
     */
    public void setConnectMembers(int connectMembers) {
        this.connectMembers = connectMembers;
    }
}
