/**
 * Class for sorted array.
 */
class SortedArray {
    /**
     * {Initializing an integer array1}.
     */
    private int[] array1;
    /**
     * {Size of 1st array}.
     */
    private int arrsize1;
    /**
     * {Initializing an integer array2}.
     */
    private int[] array2;
    /**
     * {Size of 2nd array}.
     */
    private int arrsize2;
    /**
     * {Initializing an integer array3}.
     */
    private int[] array3;
    /**
     * Constructs the object.
     *
     * @param      ar1   The archive 1
     * @param      ar2   The archive 2
     */
    SortedArray(final int[] ar1, final int[] ar2) {
        this.array1 = ar1;
        this.arrsize1 = array1.length;
        this.array2 = ar2;
        this.arrsize2 = array2.length;
        this.array3 = new int[arrsize1 + arrsize2];
    }
    /**
     * {Method to sort the array}.
     *
     * @param      a1    Array 1
     * @param      a2    Array 2
     *
     * @return     {Array}
     */
    public int[] sort(final int[] a1, final int[] a2) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arrsize1 && j < arrsize2) {
            if (a1[i] < a2[j]) {
                this.array3[k++] = a1[i++];
            } else {
                this.array3[k++] = a2[j++];
            }
        }
        while (i < arrsize1) {
            this.array3[k++] = a1[i++];
        }
        while (j < arrsize2) {
            this.array3[k++] = a2[j++];
        }
        return this.array3;
    }
}