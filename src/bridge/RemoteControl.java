package bridge;

/**
 * 定义抽象类的接口
 */
public abstract class RemoteControl {

    protected TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public abstract void on();

    public abstract void off();

    public abstract void tuneChannel();
}
