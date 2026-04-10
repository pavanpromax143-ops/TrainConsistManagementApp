import java.util.ArrayList;

 class TrainConsistApp {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create ArrayList for Passenger Bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Step 3: Add Passenger Bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nPassenger bogies added successfully.");

        // Step 4: Display Bogies (READ)
        System.out.println("\nCurrent Passenger Bogies:");
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }

        // Step 5: Remove a Bogie (DELETE)
        passengerBogies.remove("AC Chair");
        System.out.println("\nAC Chair bogie removed.");

        // Step 6: Check Existence (SEARCH)
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie does NOT exist.");
        }

        // Step 7: Final List State
        System.out.println("\nFinal Passenger Bogies:");
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }

        System.out.println("\nProgram continues...");
    }
}