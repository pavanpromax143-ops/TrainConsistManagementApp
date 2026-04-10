import java.util.LinkedList;

 class TrainConsistApp {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create LinkedList for Train Consist
        LinkedList<String> train = new LinkedList<>();

        // Step 3: Add Bogies (Initial Order)
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(train);

        // Step 4: Insert Pantry Car at Position 2
        train.add(2, "Pantry Car");
        System.out.println("\nPantry Car added at position 2.");

        // Step 5: Remove First and Last Bogie
        train.removeFirst();  // Removes Engine
        train.removeLast();   // Removes Guard

        System.out.println("\nFirst and Last bogies removed.");

        // Step 6: Display Final Train Consist
        System.out.println("\nFinal Ordered Train Consist:");
        for (String bogie : train) {
            System.out.println(bogie);
        }

        System.out.println("\nProgram continues...");
    }
}