// Ceiling of a number in a sorted array(smallest number grater that or equal to the target)
public class bsq1 {
    public static void main(String[] args) {
        int[] arr = {-20, -18, -10, -3, 0, 1, 5, 6, 9, 10, 16, 27, 78, 109, 2055};
        int ans = binarysearch(arr, 11);
        System.out.println(ans); // Output will be 16 (or return index 'start' if you want index)
    }

    // Returns the ceiling element (or return -1 if ceiling doesn't exist)
    static int binarysearch(int[] arr, int target) {
        // If target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid]; // Found exact match
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // When while loop terminates, start = end + 1
        // arr[start] is the smallest element >= target
        return arr[start];
    }
}