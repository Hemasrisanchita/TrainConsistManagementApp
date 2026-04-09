import java.util.*;

public class TrainConsistManagementApp {

    static class Goods {
        String type;
        String cargo;

        Goods(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        List<Goods> list = Arrays.asList(
                new Goods("Cylindrical", "Petroleum"),
                new Goods("Box", "Food")
        );

        boolean safe = list.stream().allMatch(g ->
                !g.type.equals("Cylindrical") || g.cargo.equals("Petroleum"));

        System.out.println("Safe: " + safe);
    }
}