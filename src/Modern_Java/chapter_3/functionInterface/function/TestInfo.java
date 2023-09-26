package Modern_Java.chapter_3.functionInterface.function;

import java.util.ArrayList;
import java.util.List;

public class TestInfo {

    public static  <T, R> List<R> map(List<T> list, Function<T, R> function) {

        List<R> rs = new ArrayList<>();
        for (T elem : list) {
            function.apply(elem);
        }
        return rs;
    }
}
