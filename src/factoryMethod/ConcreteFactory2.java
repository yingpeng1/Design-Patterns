package factoryMethod;

import simpleFactory.ConcreteProduct2;
import simpleFactory.Product;

public class ConcreteFactory2 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
