package singleton;

/**
 * 双重校验锁---线程安全
 * 先判断uniqueInstance是否被实例化，如果没有被实例化，则对实例化语句进行加锁
 */
public class Singleton4 {

    /**volatile禁止JVM的指令重排，执行顺序不会发生变化*/
    private volatile static Singleton4 uniqueInstance;

    private Singleton4(){

    }

    public static Singleton4 getUniqueInstance(){
        if (uniqueInstance == null){
            synchronized (Singleton4.class){
                if (uniqueInstance == null){
                    /**
                     * 分三步执行：
                     * 1.为uniqueInstance分配内存空间
                     * 2.初始化uniqueInstance
                     * 3.将uniqueInstance指向分配的内存地址
                     */
                    uniqueInstance = new Singleton4();
                }
            }
        }
        return uniqueInstance;
    }
}
