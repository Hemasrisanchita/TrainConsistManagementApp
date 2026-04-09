import java.util.regex.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        String trainId = "TRN-1234";
        String cargo = "PET-AB";

        Pattern p1 = Pattern.compile("TRN-\\d{4}");
        Pattern p2 = Pattern.compile("PET-[A-Z]{2}");

        System.out.println("Train ID valid: " + p1.matcher(trainId).matches());
        System.out.println("Cargo valid: " + p2.matcher(cargo).matches());
    }
}