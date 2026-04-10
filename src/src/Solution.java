import java.util.HashSet;

 class TrainConsistApp {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create HashSet for Bogie IDs
        HashSet<String> bogieIds = new HashSet<>();

        // Step 3: Add Bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // Duplicate
        bogieIds.add("BG102"); // Duplicate

        System.out.println("\nBogie IDs added (including duplicates).");

        // Step 4: Display Unique Bogie IDs
        System.out.println("\nUnique Bogie IDs in Train:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        System.out.println("\nTotal Unique Bogies: " + bogieIds.size());

        System.out.println("\nProgram continues...");
    }
}