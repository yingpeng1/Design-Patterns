package observer;

/**
 * 观察者的注册功能需要调用主题的registerObserver()方法
 */
public interface Observer {
    void update(float temp,float humidity,float pressure);
}
