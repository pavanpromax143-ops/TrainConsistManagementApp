 class TrainConsistApp {

    // Bubble Sort Method
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for comparison
            for (int j = 0; j < n - i - 1; j++) {

                // Swap if out of order
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create array of capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.print("\nBefore Sorting: ");
        printArray(capacities);

        // Step 2: Apply Bubble Sort
        bubbleSort(capacities);

        // Step 3: Display sorted result
        System.out.print("After Sorting:  ");
        printArray(capacities);

        System.out.println("\nProgram continues...");
    }
}