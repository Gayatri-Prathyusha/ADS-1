import java.util.Arrays;
class ThreeSum {
    int[] arr;
    int size;
    ThreeSum(int[] arr1, int n) {
        arr = arr1;
        size = n;

    }
    // private boolean containsDuplicates(int[] a) {
    //     for (int i = 1; i < a.length; i++)
    //         if (a[i] == a[i-1]) return true;
    //     return false;
    // }
        public int BinarySearch(int[] array, int element) {
        int low = 0; 
        int high = array.length - 1;

        while (low <= high) {
        int mid = (high + low)/ 2;
         if (array[mid] == element) {
            return element;
         } else if (array[mid] < element) {
            low = mid + 1;
         } else {
            high = mid - 1;
                
        }
    }
         return -1;

    }
    public int count(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        // if (containsDuplicates(a));
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int k = Arrays.binarySearch(a, -(a[i] + a[j]));
                if (k > j) count++;
            }
        }
        return count;
    }
} 
