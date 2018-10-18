package singleton;

/**
 * 枚举实现
 * jvm保证只会实例化一次，不会出现反射攻击
 */
public enum Singleton6 {

    INSTANCE;

    private String objName;

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public static void main(String[] args) {

        //单例测试
        Singleton6 firstSingleton = Singleton6.INSTANCE;
        firstSingleton.setObjName("firstName");
        System.out.println(firstSingleton.getObjName());
        Singleton6 secondSingleton = Singleton6.INSTANCE;
        secondSingleton.setObjName("secondName");
        System.out.println(firstSingleton.getObjName());
        System.out.println(secondSingleton.getObjName());

        //反射获取实例测试
        try {
            Singleton6[] enumConstants = Singleton6.class.getEnumConstants();
            for (Singleton6 enumConstant : enumConstants){
                System.out.println(enumConstant.getObjName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
