package _11_bridge;

/**
 * Created by Alvin on 2019-09-11.
 */

public class Sample {

    public static void main(String[] args) {
        SonyTV sonyTv = SonyTV.getInstance("KD-55X8000G");
        MasterRemoteControl remoteControl = MasterRemoteControl.getInstance(sonyTv);
        remoteControl.powerOn();
        remoteControl.switchChannel();
        remoteControl.getTvnfo();
        remoteControl.powerOff();
    }
}
