package flyweight;

/**
 * 享元对象
 */
public interface Flyweight {
    /**
     *
     * @param extrinsicState 外部状态，每个享元对象的外部状态不同
     */
    void doOperation(String extrinsicState);
}
