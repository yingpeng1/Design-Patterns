package iterator;

/**
 * 主要定义了hasNext()和next()方法
 * @param <Item>
 */
public interface Iterator<Item> {

    Item next();

    boolean hasNext();
}
