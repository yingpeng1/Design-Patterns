package mediator;

/**
 * 同事，相关对象
 */
public abstract class Colleague {
    public abstract void onEvent(Mediator mediator);
}
