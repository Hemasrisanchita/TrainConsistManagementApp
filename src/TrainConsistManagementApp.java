import java.util.*;
import java.util.stream.*;

public class TrainConsistManagementApp {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC", 78),
                new Bogie("Sleeper", 60)
        );

        Map<String, List<Bogie>> grouped =
                list.stream().collect(Collectors.groupingBy(b -> b.name));

        System.out.println(grouped);
    }
}