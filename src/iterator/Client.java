package iterator;

/**
 * 组合了Aggregate,为了迭代遍历Aggregate,也需要组合Iterator
 */
public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        Iterator<Integer> iterator = aggregate.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
