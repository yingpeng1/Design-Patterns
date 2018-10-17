package singleton;

/**
 * 静态内部类实现
 * 好处：1.延迟初始化
 *      2.JVM提供对线程安全的支持
 */
public class Singleton5 {

    private Singleton5(){

    }

    /**
     * 当类Singleton5加载时，静态内部类SingletonHolder没有被加载进内存
     */
    private static class SingletonHolder{
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    /**
     * 当调用该方法时，静态内部类才被加载，jvm保证INSTANCE只被实例化一次
     * @return
     */
    public static Singleton5 getUniqueInstance(){
        return SingletonHolder.INSTANCE;
    }
}
