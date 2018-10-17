package singleton;

/**
 * 懒汉式--线程安全
 */
public class Singleton3 {

    private static Singleton3 uniqueInstance;

    private Singleton3(){

    }

    /**
     * 加锁避免实例化多次
     * 缺点：会造成阻塞，导致性能问题，不推荐使用
     * @return
     */
    public static synchronized Singleton3 getUniqueInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton3();
        }
        return uniqueInstance;
    }
}
