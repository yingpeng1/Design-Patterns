package visitor;

/**
 * 访问者，为每一个ConcreteElement声明一个visit操作
 */
public interface Visitor {

    void visit(Customer customer);

    void visit(Order order);

    void visit(Item item);
}
