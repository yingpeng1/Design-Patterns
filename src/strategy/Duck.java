package strategy;

/**
 * 使用该算法族的类，定义一个方法调用公共方法，set方法可以动态地改变使用的算法
 */
public class Duck {

    private QuackBehavior quackBehavior;

    public void performQuack(){
        if (quackBehavior != null){
            quackBehavior.quack();
        }
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
