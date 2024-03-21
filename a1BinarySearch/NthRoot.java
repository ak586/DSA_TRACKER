package a1BinarySearch;

class NthRoot {
    static int helper(int l, int r, int m, int n) {
        if (l > r)
            return -1;
        int mid = (r - l) / 2 + l;
        if (m == Math.pow(mid, n))
            return mid;
        else if (m > Math.pow(mid, n))
            return helper(mid, r, m, n);
        else
            return helper(l, mid, m, n);
    }

    public int nThRoot(int n, int m) {
        return helper(1, m, m, n);
    }
}