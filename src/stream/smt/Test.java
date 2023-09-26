package stream.smt;

import Modern_Java.chapter_6.menu.Dish;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Test {

    public static void main(String[] args) {

        Worker worker1 = new Worker("Сергей", 28, 111000, "Учитель");
        Worker worker7 = new Worker("Сергей", 28, 111000, "Учитель");
        Worker worker2 = new Worker("Саша", 28, 112000, "Учитель");
        Worker worker3 = new Worker("Никита", 27, 113000, "Учитель");
        Worker worker4 = new Worker("Святослав", 27, 114000, "Учитель");
        Worker worker5 = new Worker("Рома", 27, 250400, "Юрист");
        Worker worker6 = new Worker("Дима", 27, 250500, "Юрист");

        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(worker4);
        workers.add(worker5);
        workers.add(worker6);
        workers.add(worker7);

        //1. Группировка списка рабочих по их должности (деление на списки)
        System.out.println(" //1. Группировка списка рабочих по их должности (деление на списки)\n");
        Map<String, List<Worker>> positionOfWorkers = workers
                .stream()
                .sorted(Comparator.comparing(Worker::getSalary))
                .collect(groupingBy(Worker::getPosition));

        for (Map.Entry<String, List<Worker>> entry : positionOfWorkers.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
        System.out.println("//2. Группировка списка рабочих по их должности (деление на множества)\n");
        //2. Группировка списка рабочих по их должности (деление на множества)

        Map<String, Set<Worker>> positionOfWorkers1 = workers
                .stream()
                .sorted(Comparator.comparing(Worker::getSalary))
                .collect(groupingBy(Worker::getPosition, toSet()));

        for (Map.Entry<String, Set<Worker>> entry : positionOfWorkers1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
        //3. Подсчет количества рабочих, занимаемых конкретную должность
        System.out.println("3. Подсчет количества рабочих, занимаемых конкретную должность\n");

        Map<String, Long> countingOfWorkers = workers.stream()
                .collect(groupingBy(Worker::getPosition, counting()));

        for (Map.Entry<String, Long> entry : countingOfWorkers.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
        System.out.println("4. Группировка списка рабочих по их должности, при этом нас интересуют только имена\n");

        Map<String, List<String>> groupOfName = workers.stream()
                .collect(groupingBy(Worker::getPosition, mapping(Worker::getName, toList())));

        for (Map.Entry<String, List<String>> entry : groupOfName.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
        System.out.println("5. Расчет средней зарплаты для данной должности\n");
        Map<String, Double> avgSalary = workers.stream().collect(groupingBy(Worker::getPosition, averagingInt(Worker::getSalary)));
        for (Map.Entry<String, Double> entry : avgSalary.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
        System.out.println("6. Группировка списка рабочих по их должности, рабочие представлены только именами единой строкой\n");

        Map<String, String> groupOfWorkers = workers.stream()
                .collect(groupingBy(
                        Worker::getPosition,
                        mapping(Worker::getName,
                                joining(", "))));

        for (Map.Entry<String, String> entry : groupOfWorkers.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println();
        //7. Группировка списка рабочих по их должности и по возрасту.
        System.out.println("7. Группировка списка рабочих по их должности и по возрасту.\n");

        Map<String, Map<Integer, String>> groupOfAgeAndPosition = workers.stream()
                .collect(groupingBy(Worker::getPosition,
                        groupingBy(Worker::getAge,
                                mapping(Worker::getName,
                                        joining(",")
                                ))));


        for (Map.Entry<String, Map<Integer, String>> entry : groupOfAgeAndPosition.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        String workersStr = workers.stream()
                .map(Worker::getName)
                .collect(joining(", "));

        System.out.println(workersStr);

        Comparator<Worker> workerComparator = Comparator.comparing(Worker::getSalary);
        Optional<Worker> workerOptional = workers.stream().collect(maxBy(workerComparator));
        System.out.println(workerOptional);

        int totalSalary = workers.stream().collect(summingInt(Worker::getSalary));
        System.out.println(totalSalary);

        double avgSalary2 = workers.stream().collect(averagingDouble(Worker::getSalary));
        System.out.println(avgSalary2);
        IntSummaryStatistics summaryStatistics = workers.stream().collect(summarizingInt(Worker::getAge));
        System.out.println(summaryStatistics);

        int totalAgeOfWorkers = workers.stream()
                .collect(reducing(0, Worker::getAge, Integer::sum));

        System.out.println(totalAgeOfWorkers);

        Optional<Worker> theOldestWorkers = workers.stream()
                .collect(reducing((w1, w2) -> w1.getAge() > w2.getAge() ? w1 : w2));
        System.out.println(theOldestWorkers);
        System.out.println();

        String shortWorkers = workers.stream()
                .map(Worker::getName)
                .collect(reducing(String::concat)).get();
        System.out.println(shortWorkers);

        // Группировка
        Set<Map.Entry<String, List<Worker>>> workersOfProf = workers.stream()
                .collect(groupingBy(Worker::getPosition)).entrySet();
        System.out.println(workersOfProf);

        Set<Map.Entry<SalaryCount, List<Worker>>> salaryWorkerList =
                workers.stream()
                        .collect(groupingBy(worker -> {
                            if (worker.getSalary() == 10000) {
                                return SalaryCount.GOOD;
                            } else if (worker.getSalary() > 100000 && worker.getSalary() < 150000) {
                                return SalaryCount.BETTER;
                            } else {
                                return SalaryCount.BEST;
                            }
                        })).entrySet();
        System.out.println(salaryWorkerList);

        // Map<String, Map<Integer, String>>
        //  Map<String, Map<Integer, String>> groupOfAgeAndPosition = workers.stream()
        //                .collect(groupingBy(Worker::getPosition,
        //                        groupingBy(Worker::getAge,
        //                                mapping(Worker::getName,
        //                                        joining(",")
        //                                ))));
        Set<Map.Entry<Integer, Map<Integer, String>>> stringListMap = workers.stream()
                .collect(groupingBy(Worker::getAge,
                        groupingBy(
                                Worker::getSalary,
                                mapping(Worker::getName, joining(", "))))).entrySet();
        System.out.println(stringListMap);


        Map<String, List<Worker>> workerList = workers.stream()
                .collect(groupingBy(Worker::getPosition, filtering(worker -> worker.getSalary() > 200000, toList())));

        for (Map.Entry<String, List<Worker>> entry : workerList.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }

        Map<String, List<String>> listMap = workers.stream()
                .collect(groupingBy(Worker::getPosition, mapping(Worker::getName, toList())));
        for (Map.Entry<String, List<String>> entry : listMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Map<String, Map<SalaryCount, List<Worker>>> stringMapMap = workers.stream()
                .collect(groupingBy(
                        Worker::getPosition,
                        groupingBy(worker -> {
                            if (worker.getSalary() == 10000) {
                                return SalaryCount.GOOD;
                            } else if (worker.getSalary() > 100000 && worker.getSalary() < 150000) {
                                return SalaryCount.BETTER;
                            } else {
                                return SalaryCount.BEST;
                            }
                        })));
        for (Map.Entry<String, Map<SalaryCount, List<Worker>>> entry : stringMapMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Map<String, Long> longMap = workers.stream()
                .collect(groupingBy(Worker::getPosition, counting()));

        for (Map.Entry<String, Long> entry : longMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Set<Map.Entry<String, Optional<Worker>>> stringOptionalMap = workers.stream()
                .collect(groupingBy(Worker::getPosition,
                        maxBy(Comparator.comparingInt(Worker::getSalary)))).entrySet();
        System.out.println(stringOptionalMap);


        Map<Boolean, List<Worker>> booleanListMap = workers.stream()
                .collect(partitioningBy(worker -> worker.getName().startsWith("Р")));
        for (Map.Entry<Boolean, List<Worker>> entry : booleanListMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Map<Boolean, Map<String, List<Worker>>> booleanListMap1 = workers.stream()
                .collect(partitioningBy(worker -> worker.getSalary() > 112000, groupingBy(Worker::getName)));
        for (Map.Entry<Boolean, Map<String, List<Worker>>> entry : booleanListMap1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}
