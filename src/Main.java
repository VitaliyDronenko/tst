import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(list.stream().reduce((x, y) -> x + y).get());

        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee(1, "Oleg", 6),
                new Employee(1, "geo", 4),
                new Employee(1, "Ruslan", 11)
        ));

        employees.stream().filter(e -> e.getAge() > 4).toList().forEach(System.out::println);

    }
}