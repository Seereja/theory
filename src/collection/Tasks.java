package collection;

import java.util.*;

public class Tasks {
    public static void main(String[] args) {

        //Как одной строчкой скопировать элементы любой collection в массив?
        Set<Integer> integerSet = new TreeSet<>();
        integerSet.add(123);
        integerSet.add(12);
        integerSet.add(13);
        integerSet.add(133);
        integerSet.add(1331);
        Object[] array = integerSet.toArray();
        System.out.println(Arrays.toString(array));

//Как одним вызовом из List получить
// List со всеми элементами, кроме первых и последних 3-х?

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(list.subList(3, list.size() - 3));

        // Как одной строчкой преобразовать HashSet в ArrayList?
        HashSet<Integer> hashSet = new HashSet<>();
        integerSet.add(123);
        integerSet.add(12);
        integerSet.add(13);
        integerSet.add(133);
        integerSet.add(1331);
//        ArrayList<Integer> arrayList = new ArrayList<>(new HashSet<>(hashSet));
//        System.out.println(arrayList);
//        HashSet<Integer> hashSet1 = new HashSet<>(list);
//        System.out.println(hashSet1);


        //Сделайте HashSet из ключей HashMap.

        HashMap<String, Integer> map = new HashMap<>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);
        map.put("5", 5);
        map.put("6", 6);
        map.put("7", 7);
        map.put("8", 8);

        HashSet<?> integers = new HashSet<>(map.keySet());
        System.out.println(integers);

        //Сделайте HashMap из HashSet<Map.Entry<K, V>>.
//        HashSet<Map.Entry<?, ?>> set = new HashSet<>();
//
//        set.add(2);
//        HashMap<?, ?> map1 = new HashMap<>(set.size());
//        for (Map.Entry<?, ?> entry : hashSet) {
//            map1.put(entry.getKey(), entry.getValue())
//        }
    }
    //Как, используя LinkedHashMap, сделать кэш c «invalidation policy»?

    public class LRUCache<K, V> extends LinkedHashMap<K, V> {
        private static final int MAX_ENTRIES = 10;

        public LRUCache(int initialCapacity) {
            super(initialCapacity, 0.85f, true);
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return size() > MAX_ENTRIES;
        }
    }

    //Реализуйте симметрическую разность двух коллекций используя методы
    // Collection (addAll(...), removeAll(...), retainAll(...)).
    <T> Collection<T> symmetricDifference(Collection<T> a, Collection<T> b) {
        // Объединяем коллекции.
        Collection<T> result = new ArrayList<>(a);
        result.addAll(b);

        // Получаем пересечение коллекций.
        Collection<T> intersection = new ArrayList<>(a);
        intersection.retainAll(b);

        // Удаляем элементы, расположенные в обоих коллекциях.
        result.removeAll(intersection);

        return result;
    }
}

