import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Bogie class (same as UC7)
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " -> " + capacity + " seats";
    }
}

class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("\nOriginal Bogie List:");
        bogies.forEach(System.out::println);

        // Step 2: Define capacity threshold
        int threshold = 60;

        // Step 3: Stream filtering
        List<Bogie> filteredBogies =
                bogies.stream()
                        .filter(b -> b.capacity > threshold)
                        .collect(Collectors.toList());

        // Step 4: Display filtered bogies
        System.out.println("\nFiltered Bogies (Capacity > " + threshold + "):");
        filteredBogies.forEach(System.out::println);

        System.out.println("\nProgram continues...");
    }
}