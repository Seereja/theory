package Modern_Java.chapter_3.functionInterface.predicate;

import Modern_Java.chapter_3.Predicate;

import java.util.ArrayList;
import java.util.List;

public class TestInfo {


    public <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T element : list) {
            if (p.test(element)) {
                result.add(element);
            }
        }
        return result;
    }

}
