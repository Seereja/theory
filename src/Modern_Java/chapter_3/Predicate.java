package Modern_Java.chapter_3;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
