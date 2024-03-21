package a1BinarySearch;

public class UpperBound {
    static int upperBound(int arr[], int low, int high, int target) {
        if (low > high)
            return -1;
        int mid = (high - low) / 2 + low;
        if (arr[mid] <= target)
            return upperBound(arr, mid + 1, high, target);
        else {
            if (mid == 0)
                return 0;
            if (arr[mid - 1] <= target)
                return mid;
            else
                return upperBound(arr, low, mid, target);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 4, 5, 6 };
        System.out.println(upperBound(arr, 0, arr.length - 1, 6));
    }
}
