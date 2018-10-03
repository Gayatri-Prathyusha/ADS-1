class Merge {
    Merge() {

    }
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

    public void sort(final Comparable[] a) {
        Comparable[] auxiliary = a.clone();
        sort(auxiliary, a, 0, a.length - 1);
    }

    public void insertionSort(final Comparable[] a, final int low, final int high) {
        for (int i = low; i <= high; i++) {
            for (int j = i; j > low && less(a[j], a[j - 1]); j--) {
                exchange(a, j, j - 1);
            }
        }
    }
    public void exchange(final Comparable[] a, final int i, final int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public boolean less(final Comparable a, final Comparable b) {
        return a.compareTo(b) < 0;
    }

    public boolean isSorted(final Comparable[] a) {
        return isSorted(a, 0, a.length - 1);
    }
    public boolean isSorted(final Comparable[] a,
        final int low, final int high) {
        for (int i = low + 1; i <= high; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

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