package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1000, "Dronenko");
        map.put(1010, "Petrov");
        map.put(2010, "Sidor");

        System.out.println(map.entrySet().stream().filter(e -> e.getKey() > 1010).collect(Collectors.toList()));
    }
}
