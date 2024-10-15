public class MergeSort {
    // Function to display the array
    static void displayArr(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    // Merge two sorted subarrays into one
    static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        // Create temporary arrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) left[i] = arr[l + i];
        for (int j = 0; j < n2; j++) right[j] = arr[mid + 1 + j];

        // Merge the temporary arrays back into arr[l..r]
        int i = 0, j = 0, k = l;

        // Merge the two arrays
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy the remaining elements of left[], if any
        while (i < n1) {
            arr[k++] = left[i++];
        }

        // Copy the remaining elements of right[], if any
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }

    // Function to perform merge sort
    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;

            // Sort first and second halves
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            // Merge the sorted halves
            merge(arr, l, mid, r);
        }
    }

    public static void main(String[] args) {
            int[] arr = {4, 1, 3, 5, 2};
            int n = arr.length;

            System.out.println("Array before sorting:");
            displayArr(arr); // Output: 4 1 3 5 2

            mergeSort(arr, 0, n - 1); // Sort the array

            System.out.println("\nArray after sorting:");
            displayArr(arr); // Output: 1 2 3 4 5
    }
}
