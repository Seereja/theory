package Modern_Java.chapter_3.functionInterface.consumer;

public interface Consumer<T> {
    //Consumer<T> описан абстрактный метод accept, принимающий на входе объект обобщенного типа
    // T и не возвращающий ничего (возвращающий void).
    // Он обычно применяется для доступа к объекту типа T и выполнению над ним каких-либо операций.
    void accept(T t);
}
