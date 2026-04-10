
import java.util.Arrays;
import java.util.Scanner;

class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create bogie array (try empty {} to test exception)
        String[] bogieIds = {"BG101", "BG205", "BG309"};

        // Step 2: Take input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = scanner.nextLine();

        try {
            // Step 3: Validate state (FAIL-FAST)
            if (bogieIds.length == 0) {
                throw new IllegalStateException("No bogies available in the train to search.");
            }

            // Step 4: (Optional) Sort before binary search
            Arrays.sort(bogieIds);

            // Step 5: Perform Binary Search
            boolean found = binarySearch(bogieIds, key);

            // Step 6: Display result
            if (found) {
                System.out.println("Result: Bogie ID exists in the train.");
            } else {
                System.out.println("Result: Bogie ID not found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    // Binary Search Method
    public static boolean binarySearch(String[] arr, String key) {

        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int cmp = arr[mid].compareTo(key);

            if (cmp == 0) return true;
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }

        return false;
    }
}
