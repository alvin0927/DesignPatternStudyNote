package _11_bridge;

/**
 * Created by Alvin on 2019-09-11.
 */

public class MasterRemoteControl implements RemoteControlImplementation {

    private TvImplementation tv;

    private MasterRemoteControl(TvImplementation tv) {
        this.tv = tv;
    }

    public static MasterRemoteControl getInstance(TvImplementation tv) {
        return new MasterRemoteControl(tv);
    }

    @Override
    public void powerOn() {
        tv.on();
    }

    @Override
    public void powerOff() {
        tv.off();
    }

    @Override
    public void switchChannel() {
        tv.setChannel();
    }

    public void getTvnfo(){
       tv.getCurrentTvName();
    }
}
