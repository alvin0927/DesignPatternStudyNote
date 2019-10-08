package _11_bridge;

/**
 * Created by Alvin on 2019-09-11.
 */

public class SonyTV implements TvImplementation {

    private String name;

    private SonyTV(String name) {
        this.name = name;
    }

    public static SonyTV getInstance(String name) {
        return new SonyTV(name);
    }

    @Override
    public void on() {
        System.out.println(this.getClass().getSimpleName() + " is on. ");
    }

    @Override
    public void off() {
        System.out.println(this.getClass().getSimpleName() + " is off. ");
    }

    @Override
    public void setChannel() {
        System.out.println(this.getClass().getSimpleName() + " is current channel 5. ");
    }

    @Override
    public void getCurrentTvName() {
        System.out.println("Current Tv is " + name);
    }
}
