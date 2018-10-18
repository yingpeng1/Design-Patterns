package memento;

/**
 * Memento Interface to Originator
 *
 * This interface allows the originator to restore its state
 *
 * Memento:备忘录，存储原始对象的状态。备忘录实际上有两个接口，一个是提供给Caretaker的窄接口：它只
 * 能将备忘录传递给其他对象；一个是提供给Originator的宽接口，允许它访问到先前状态所需的所有数据。理
 * 想情况是只允许Originator访问本备忘录的内部状态。
 */
public interface PreviousCalculationToOriginator{
    int getFirstNumber();
    int getSecondNumber();
}
