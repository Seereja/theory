package collection.sber;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PECS {

    static class Item {

    }

    static class Book extends Item {
        String name;
    }

    static class Phone extends Item {
        String model;
    }

    // ? extends DATATYPE - ниже, что наследуюется от этого типа или объекта
    // ? super DATATYPE -нижнаяя граница тип или объект, то есть он насдежуется от чего то
    // копировать можно от подкласса к классу родителю
    //  books --->
    //             \
    //               ---> item ---> object
    //            /
    // phone --->
    public static void copy(List<? extends Item> src, List<? super Item> dst) {
        dst.addAll(src);
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        List<Phone> phones = new ArrayList<>();
        List<Item> items = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        // во второй аргумент мы можем положить все, что выше object
        copy(phones, items);
        copy(books, items);
        copy(items, objects);


    }
}
