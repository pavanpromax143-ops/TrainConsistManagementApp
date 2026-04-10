import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Step 1: Create Bogie Class
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    @Override
    public String toString() {
        return name + " -> " + capacity + " seats";
    }
}

 class TrainConsistApp {

    public static void main(String[] args) {

        // Step 2: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 3: Create List of Bogies
        List<Bogie> bogies = new ArrayList<>();

        // Step 4: Add Bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("\nBefore Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Step 5: Sort using Comparator (by capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting (Ascending by Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Optional: Descending order
        bogies.sort(Comparator.comparingInt((Bogie b) -> b.capacity).reversed());

        System.out.println("\nAfter Sorting (Descending by Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nProgram continues...");
    }
}