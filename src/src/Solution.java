import java.util.Scanner;

 class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Step 2: Take input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        // Step 3: Perform Linear Search
        boolean found = false;

        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                found = true;
                System.out.println("Bogie found at position: " + i);
                break; // Early termination
            }
        }

        // Step 4: Display result
        if (found) {
            System.out.println("Result: Bogie ID exists in the train.");
        } else {
            System.out.println("Result: Bogie ID not found.");
        }

        scanner.close();
    }
}