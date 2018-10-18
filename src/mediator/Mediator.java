package mediator;

/**
 * 中介者，定义一个接口用于与各同事(Colleague)对象通信
 */
public abstract class Mediator {
    public abstract void doEvent(String eventType);
}
