package Modern_Java.chapter_3.functionInterface.function;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {


        List<Integer> list = TestInfo.map(Arrays.asList("привет", "пока", "пумпурумпум "), s -> s.length());
        System.out.println(list);
    }
}
