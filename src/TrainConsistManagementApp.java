public class TrainConsistManagementApp {

    static class InvalidCapacityException extends Exception {
        InvalidCapacityException(String msg) {
            super(msg);
        }
    }

    static class Bogie {
        int capacity;

        Bogie(int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Invalid capacity");
            }
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        try {
            Bogie b = new Bogie(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}