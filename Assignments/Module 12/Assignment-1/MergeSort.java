import java.util.Arrays;

/**
 * Class for merge sort : Descending order.
 */
public class MergeSort {

    public static boolean more(Comparable x, Comparable y) {
        return x.compareTo(y) > 0;
    }

    public static void merge(Comparable[] a, Comparable[] auxiliary,
                             int low, int mid, int high) {

        for (int i = low; i <= high; i++) {
            auxiliary[i] = a[i];
        }

        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                a[k] = auxiliary[j++];
            } else if (j > high) {
                a[k] = auxiliary[i++];
            } else if (more(auxiliary[j], auxiliary[i])) {
                a[k] = auxiliary[j++];
            } else {
                a[k] = auxiliary[i++];
            }
        }
    }
    public static void sort(Comparable[] a, Comparable[] auxiliary, int low, int high) {
        if (high <= low) return;
        int mid = low + (high - low) / 2;
        sort(a, auxiliary, low, mid);
        sort(a, auxiliary, mid + 1, high);
        merge(a, auxiliary, low, mid, high);
    }

    public static void sort(Comparable[] a) {
        Comparable[] auxiliary = new Comparable[a.length];
        sort(a, auxiliary, 0, a.length - 1);
    }

}
