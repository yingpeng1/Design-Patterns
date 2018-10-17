package singleton;

/**
 * 懒汉式---线程不安全
 */
public class Singleton1 {
    /**
     * 被延迟实例化
     * 好处：如果没有用到该类，就不会实例化uniqueInstance，从而节约资源
     */
    private static Singleton1 uniqueInstance;

    private Singleton1(){

    }

    /**
     * 多线程环境下不安全
     * @return
     */
    public static Singleton1 gtetUniqueInstacne(){
        if (uniqueInstance == null){
            /**
             * 多线程条件下，会导致实例化多次uniqueInstance
             */
            uniqueInstance = new Singleton1();
        }
        return uniqueInstance;
    }
}
