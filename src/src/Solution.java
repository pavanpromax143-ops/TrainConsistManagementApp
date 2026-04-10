
// Custom Exception Class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie Class
class PassengerBogie {
    String type;
    int capacity;

    // Constructor with validation
    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " -> Capacity: " + capacity;
    }
}

// Main Application
 class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        try {
            // Valid Bogies
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC Chair", 56);

            System.out.println("\nValid Bogies Created:");
            System.out.println(b1);
            System.out.println(b2);

            // Invalid Bogie (Uncomment to test exception)
            PassengerBogie b3 = new PassengerBogie("First Class", 0);

        } catch (InvalidCapacityException e) {
            System.out.println("\nERROR: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }
}
