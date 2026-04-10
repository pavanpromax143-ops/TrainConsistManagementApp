import java.util.LinkedHashSet;

 class TrainConsistApp {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create LinkedHashSet for Train Formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Step 3: Add Bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Step 4: Attempt to Add Duplicate
        train.add("Sleeper"); // Duplicate (ignored automatically)

        System.out.println("\nBogies added (including duplicate attempt).");

        // Step 5: Display Final Train Formation
        System.out.println("\nFinal Train Formation (Insertion Order Preserved):");
        for (String bogie : train) {
            System.out.println(bogie);
        }

        System.out.println("\nTotal Bogies: " + train.size());

        System.out.println("\nProgram continues...");
    }
}