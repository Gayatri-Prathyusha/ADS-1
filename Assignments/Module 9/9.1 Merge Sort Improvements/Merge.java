/**
 *  class for Merge.
 */
class Merge {
    /**
     * merge constructor.
     */
    Merge() {
        /**
         * Empty Constructor.
         */
    }
    /**
     * Method to merge two splitted arrays.
     * Time complexity of this method is O(N).
     * @param      array  The array
     * @param      auxiliary  The auxiliary array.
     * @param      low     The lower value
     * @param      mid    The middle value
     * @param      high     The higher value
     */
    public void merge(final Comparable[] array, final Comparable[] auxiliary, final int low, final int mid, final int high) {
        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                auxiliary[k] = array[j++];
            } else if (j > high) {
                auxiliary[k] = array[i++];
            } else if (less(array[j], array[i])) {
                auxiliary[k] = array[j++];
            } else {
                auxiliary[k] = array[i++];
            }
        }
    }

    
    /**
     * Method for sorting the elements in the array.
     * Time complexity of sorting is O(log(N)).
     * @param      array  The array
     * @param      auxiliary    The auxiliary array
     * @param      low     The lower value
     * @param      high     The higher value
     */
    public void sort(final Comparable[] array, final Comparable[] auxiliary, final int low, final int high) {
        if (high <= low + 7) {
            insertionSort(auxiliary, low, high);
            System.out.println("Insertion sort method invoked...");
            return;
        }
        int mid = low + (high - low) / 2;
        sort(auxiliary, array, low, mid);
        sort(auxiliary, array, mid + 1, high);
        if (!less(array[mid + 1], array[mid])) {
            for (int i = low; i <= high; i++) {
                auxiliary[i] = array[i];
            }
            System.out.println("Array is already sorted. So, skipped the call to merge...");
            return;
        }
        merge(array, auxiliary, low, mid, high);
    }

    /**
     * Arranges the array in ascending sorted manner, using the natural order.
     * Time complexity of this method is O(N).
     * @param      a     Comparable array.
     */
    public void sort(final Comparable[] a) {
        Comparable[] auxiliary = a.clone();
        sort(auxiliary, a, 0, a.length - 1);
    }

    /**
     * Method for sorting the elements using insertion sort.
     * sort from a[low] to a[high].
     * Time complexity of insertion sort is O(N^2/2).
     * @param      a     Comparable array.
     * @param      low    The lower value
     * @param      high    The higher value
     */
    public void insertionSort(final Comparable[] a, final int low, final int high) {
        for (int i = low; i <= high; i++) {
            for (int j = i; j > low && less(a[j], a[j - 1]); j--) {
                exchange(a, j, j - 1);
            }
        }
    }
    /**
     * Method to exchange two elements in the array.
     * Time complexity of this method is O(N).
     * @param      a     Array of objects.
     * @param      i     Integer variable iterator i
     * @param      j     Integer variable iterator j
     */
    public void exchange(final Comparable[] a, final int i, final int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    /**
     * Method to check which one is smaller of the two.
     * Time complextiy of this method is O(1).
     * @param      a     Comparable.
     * @param      b     Comparable.
     *
     * @return     Boolean value.
     */
    public boolean less(final Comparable a, final Comparable b) {
        return a.compareTo(b) < 0;
    }

    /**
     * Method to determine if the array is sorted (or) not.
     * Time complexity of this method is O(1).
     * @param      a     Comparable array
     *
     * @return     True if sorted, False otherwise.
     */
    public boolean isSorted(final Comparable[] a) {
        return isSorted(a, 0, a.length - 1);
    }
    
    /**
     * Method to determine if the array is sorted (or) not.
     * Time complexity of this method is O(N).
     * @param      a     Comparable array
     * @param      low    The lower
     * @param      high    The higher
     *
     * @return     True if sorted, False otherwise.
     */
    public boolean isSorted(final Comparable[] a,
        final int low, final int high) {
        for (int i = low + 1; i <= high; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }
    /**
     * Method to print the values of the Comparable array.
     * Time complexity of this method is O(N).
     * @param      a     Name of object array
     *
     * @return     String
     */
    public String show(final Comparable[] a) {
        String s = "[";
        int i;
        for (i = 0; i < a.length - 1; i++) {
            s += a[i] + ", ";
        }
        s += a[i] + "]";
        return s;
    }
}
