import java.util.Arrays;
class ThreeSum {
    int[] arr;
    int size;
    ThreeSum(int[] arr1, int n) {
        arr = arr1;
        size = n;

    }
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
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int k = BinarySearch(a, (a[i] + a[j]));
                if (k > j) {
                    count++;
                }
            }
        }
        return count;
    }
} 
