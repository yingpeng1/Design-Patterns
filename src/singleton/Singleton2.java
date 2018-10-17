package singleton;

/**
 * 饿汉式---线程安全
 */
public class Singleton2 {

    /**
     * 直接实例化uniqueInstance就不会产生线程不安全问题
     */
    private static Singleton2 uniqueInstance;

    private Singleton2(){

    }

    public static Singleton2 getUniqueInstance(){
        return uniqueInstance;
    }
}
