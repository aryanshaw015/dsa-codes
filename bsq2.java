//floor of a number in a sorted array(greatest number smaller or equal to the target)
public class bsq2 {
    public static void main(String[] args) {
        int[] arr = {-20, -18, -10, -3, 0, 1, 5, 6, 9, 10, 16, 27, 78, 109, 2055};
        int ans = binarysearch(arr, 11);
        System.out.println(ans); // Output will be 10 (or return index 'end' if you want index)
    }

    // Returns the floor element (or return -1 if floor doesn't exist)
    static int binarysearch(int[] arr, int target) {
        // If target is smaller than the smallest number in the array
        if (target < arr[0]) {
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
        // arr[end] is the gratest element <= target
        return arr[end];
    }
}