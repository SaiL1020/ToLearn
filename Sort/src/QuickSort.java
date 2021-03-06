/**
 * Created by sail on 9/19/16.
 * QuickSort
 */
public class QuickSort {
    private void sort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }
    // nArray != null, l < r, pivot = nArray[0]
    private void quickSort(int[] nArray, int ll, int rr) {
        if (ll >= rr) return;
        int pivot = nArray[ll], l = ll, r = rr;
        while (l < r) {
            while (l < r && nArray[r] >= pivot) r--;
            if (l < r) nArray[l++] = nArray[r];
            while (l < r && nArray[l] <= pivot) l++;
            if (l < r) nArray[r--] = nArray[l];
        }
        // System.out.println(l);
        nArray[l] = pivot;
        quickSort(nArray, ll, l - 1);
        quickSort(nArray, l + 1, rr);
    }

    private void run() {
        int[] nums = new int[] {5, 1, 7, 3, 4, 2, 6, 5, 6};
        sort(nums);
        for (int k : nums) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new QuickSort().run();
    }
}
