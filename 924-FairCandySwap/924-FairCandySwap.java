// Last updated: 7/9/2026, 9:48:48 AM
class Solution {
    static int bS(int arr[], int t) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l - (l - r) / 2;
            if (arr[mid] < t)
                l = mid + 1;
            else if (arr[mid] > t)
                r = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    static int sumArr(int[] arr) {
        int sum = 0;
        for (int n : arr)
            sum += n;
        return sum;
    }

    public int[] swapper(int[] giver, int G, int[] taker, int T) {
        for (int give: giver) {
            int take = T-G + 2*give;
            if(take %2 !=0) continue;

            int takeIndex = bS(taker, take/2);
            if (takeIndex != -1) return new int[]{give, taker[takeIndex]};
        }
        return new int[]{-1,-1};
    }

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int asum = sumArr(aliceSizes);
        int bsum = sumArr(bobSizes);
        Arrays.sort(bobSizes);
        return swapper(aliceSizes, asum, bobSizes, bsum);
    }
}