package Modern_Java.chapter_3;

import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rider<T> {


    Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
    private List<String> listOfStrings = Arrays.asList("фыв", "фыв");
    List<String> nonEmpty = filter(listOfStrings, nonEmptyStringPredicate);

    public <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> resultList = new ArrayList<>();
        for (T element : list) {
            if (predicate.test(element)) {
                resultList.add(element);
            }
        }
        return resultList;
    }


    public Rider() throws IOException {
    }

    String oneLine = processFile(BufferedReader::readLine);


    public String processFile(BufferReaderProcess b) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            return b.process(br);
        }
    }


}


