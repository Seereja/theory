package Modern_Java.chapter_3.functionInterface.supplier;


import Modern_Java.chapter_3.functionInterface.function.Function;

import java.util.ArrayList;
import java.util.List;

public class TestInfo {

    public static List<Car> map(List<String> list, Function<String, Car> function) {
        List<Car> result = new ArrayList<>();
        List<Car> rs = new ArrayList<>();
        for (String elem : list) {
            result.add((Car) function.apply(elem));
        }
        return rs;
    }


}
