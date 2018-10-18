package iterator;

/**
 * 聚合类，其中createIterator()方法可以产生一个Iterator
 */
public interface Aggregate {
    Iterator createIterator();
}
