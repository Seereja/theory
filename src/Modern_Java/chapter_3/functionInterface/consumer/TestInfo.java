package Modern_Java.chapter_3.functionInterface.consumer;

import java.util.List;

public class TestInfo {


    public <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T element : list) {
            consumer.accept(element);
        }

    }

}
