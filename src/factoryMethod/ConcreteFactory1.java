package factoryMethod;

import simpleFactory.ConcreteProduct1;
import simpleFactory.Product;

public class ConcreteFactory1 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
