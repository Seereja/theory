package Modern_Java.chapter_5.transaction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class PuttingIntoPractice {
    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)


        );
        //Найти все транзакции за 2011 год и отсортировать их по сумме (от меньшей к большей)
        System.out.println("        //Найти все транзакции за 2011 год и отсортировать их по сумме (от меньшей к большей)\n");
        transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        //2. Вывести список неповторяющихся городов, в которых работают трейдеры.
        System.out.println("        //2. Вывести список неповторяющихся городов, в которых работают трейдеры.\n");
        List<String> cities = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(toList());
        System.out.println(cities);

        //3. Найти всех трейдеров из Кембриджа и отсортировать их по именам.
        System.out.println("        //3. Найти всех трейдеров из Кембриджа и отсортировать их по именам.\n");
        List<Trader> cambridge = transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .toList();

        System.out.println(cambridge);


        //Вернуть строку со всеми именами трейдеров, отсортированными в алфавитном порядке.
        System.out.println("        //Вернуть строку со всеми именами трейдеров, отсортированными в алфавитном порядке.\n");
        String traderStr = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (n1, n2) -> n1 + " " + n2);
        System.out.println(traderStr);

        System.out.println("        //5. Выяснить, существует ли хоть один трейдер из Милана.");
        boolean traderOfMilan = transactions.stream()
                .anyMatch(transaction
                        -> transaction
                        .getTrader()
                        .getCity().equals("Milan"));
        System.out.println(traderOfMilan);

        //6. Вывести суммы всех транзакций трейдеров из Кембриджа.
        System.out.println("        //6. Вывести суммы всех транзакций трейдеров из Кембриджа.\n");
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        System.out.println("7. Какова максимальная сумма среди всех транзакций?");

        int maxTransaction = transactions.stream()
                .map(Transaction::getValue)
                .reduce(0, Integer::max);
        System.out.println(maxTransaction);

        System.out.println("8. Найти транзакцию с минимальной суммой.");
        Optional<Transaction> minTransaction = transactions.stream()
                .min(comparing(Transaction::getValue));

        System.out.println(minTransaction.map(String::valueOf).orElse("No transactions found"));





    }
}
