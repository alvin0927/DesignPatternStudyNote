package _9_objectAdapter;

/**
 * Created by Alvin on 2019-08-22.
 */

public class TraditionalStore implements ModernService {

    private String name;
    private String location;

    public TraditionalStore(String name) {
        this.name = name;
    }

    /**
     * @return the {@link #location}
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the {@link #location} to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void executeTakkyubinService() {
        System.out.println(
                this.getClass().getSimpleName() +
                        "  " + name + " can execute Takkyubin Service. ");
    }

    @Override
    public void executePrintService() {
        System.out.println(
                this.getClass().getSimpleName() +
                        "  " + name + " can execute Print Service. ");
    }
}
