import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== UC3: Unique Bogie IDs ===");

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("B1");
        bogieIds.add("B2");
        bogieIds.add("B1");

        System.out.println("Unique Bogie IDs: " + bogieIds);
    }
}