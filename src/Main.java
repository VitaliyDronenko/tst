import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(list.stream().reduce((x, y) -> x + y).get());
    }
}