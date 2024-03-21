package a0Hashing.a18_03_24;

import java.util.HashMap;

// Check if the given array contains duplicate elements within k distance
//  from each other || Hashing Tutorials || Part - 7
public class P7 {
    static boolean containsDuplicate(int numbers[], int k) {
        int i = 0;
        int j = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (j < numbers.length) {
            if (map.getOrDefault(numbers[j], 0) != 0)
                return true;
            map.put(numbers[j], 1);
            if (j - i + 1 < k) {
                j++;
                continue;
            }
            map.put(numbers[i], map.get(numbers[i]) - 1);
            j++;
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 4, 9, 1, 5, 0 };
        int k = 3;
        System.out.println(containsDuplicate(numbers, k));

    }
}
