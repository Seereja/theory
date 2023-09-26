package Modern_Java.chapter_3.functionInterface.predicate;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);

}

