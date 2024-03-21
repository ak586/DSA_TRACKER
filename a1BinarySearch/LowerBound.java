package a1BinarySearch;

public class LowerBound {
    static int lowerBound(int arr[], int low, int high, int target) {
        if (low > high)
            return -1;
        int mid = (high - low) / 2 + low;
        if (target <= arr[mid]) {
            if (mid == 0 || arr[mid - 1] < target)
                return mid;
            return lowerBound(arr, low, mid, target);
        } else
            return lowerBound(arr, mid + 1, high, target);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 4, 4, 5 };
        System.out.println(lowerBound(arr, 0, arr.length - 1, 6));
    }
}
