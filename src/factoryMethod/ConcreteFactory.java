package factoryMethod;

import simpleFactory.ConcreteProduct;
import simpleFactory.Product;

public class ConcreteFactory extends Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
