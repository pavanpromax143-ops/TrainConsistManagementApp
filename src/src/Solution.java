
import java.util.Arrays;

 class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create array of bogie names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Step 2: Display before sorting
        System.out.println("\nBefore Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Step 3: Sort using Arrays.sort()
        Arrays.sort(bogieNames);

        // Step 4: Display after sorting
        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nProgram continues...");
    }
}
