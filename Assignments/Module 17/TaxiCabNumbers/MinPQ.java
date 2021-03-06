/**.
 * imports comparator class
 */
import java.util.Comparator;
/**
 * imports Iterator class
 */
import java.util.Iterator;
/**
 * Imports no such exception class
 */
import java.util.NoSuchElementException;
/**
 * Class for minimum pq.
 *
 * @param      <Key>  The key
 */
public class MinPQ<Key> implements Iterable<Key> {
    /**
     * store items at indices 1 to n.
     */
    private Key[] pq;
    /**
     * of items on priority queue.
     */
    private int n;
    /**
     * optional comparator.
     */
    private Comparator<Key> comparator;

    /**
     * Initializes an empty priority queue with the given initial capacity.
     *
     * @param  initCapacity the initial capacity of this priority queue
     */
    public MinPQ(final int initCapacity) {
        pq = (Key[]) new Object[initCapacity + 1];
        n = 0;
    }

    /**
     * Initializes an empty priority queue.
     */
    public MinPQ() {
        this(1);
    }

    /**
     * Initializes an empty priority queue with the given initial capacity,
     * using the given comparator.
     *
     * @param  initCapacity the initial capacity of this priority queue
     * @param  comparator2 the order in which to compare the keys
     */
    public MinPQ(final int initCapacity, final Comparator<Key> comparator2) {
        this.comparator = comparator2;
        pq = (Key[]) new Object[initCapacity + 1];
        n = 0;
    }

    /**
     * Initializes an empty priority queue using the given comparator.
     *
     * @param  comparator1 the order in which to compare the keys
     */
    public MinPQ(final Comparator<Key> comparator1) {
        this(1, comparator1);
    }

    /**
     * Initializes a priority queue from the array of keys.
     * Takes time proportional to the number of keys,
     * using sink-based heap construction.
     *
     * @param  keys the array of keys
     */
    public MinPQ(final Key[] keys) {
        n = keys.length;
        pq = (Key[]) new Object[keys.length + 1];
        for (int i = 0; i < n; i++) {
            pq[i + 1] = keys[i];
        }
        for (int k = n / 2; k >= 1; k--) {
            sink(k);
        }
        assert isMinHeap();
    }

    /**
     * Returns true if this priority queue is empty.
     *
     * @return {@code true} if this priority queue is empty;
     *         {@code false} otherwise.
     */
    public boolean isEmpty() {
        return n == 0;
    }

    /**
     * Returns the number of keys on this priority queue.
     *
     * @return the number of keys on this priority queue
     */
    public int size() {
        return n;
    }

    /**
     * Returns a smallest key on this priority queue.
     *
     * @return a smallest key on this priority queue
     * @throws NoSuchElementException if this priority queue is empty
     */
    public Key min() {
        if (isEmpty()) {
            throw new NoSuchElementException("Priority queue underflow");
        }
        return pq[1];
    }

    /**
     * helper function to double the size of the heap array.
     *
     * @param      capacity  The capacity
     */
    private void resize(final int capacity) {
        assert capacity > n;
        Key[] temp = (Key[]) new Object[capacity];
        for (int i = 1; i <= n; i++) {
            temp[i] = pq[i];
        }
        pq = temp;
    }

    /**
     * Adds a new key to this priority queue.
     *
     * @param  x the key to add to this priority queue
     */
    public void insert(final Key x) {
        // double size of array if necessary.
        if (n == pq.length - 1) {
            resize(2 * pq.length);
        }
        // add x, and percolate it up to maintain heap invariant.
        pq[++n] = x;
        swim(n);
        assert isMinHeap();
    }

    /**
     * Removes and returns a smallest key on this priority queue.
     *
     * @return a smallest key on this priority queue.
     * @throws NoSuchElementException if this priority queue is empty.
     */
    public Key delMin() {
        if (isEmpty()) {
            throw new NoSuchElementException("Priority queue underflow");
        }
        Key min = pq[1];
        exch(1, n--);
        sink(1);
        pq[n + 1] = null;
        // to avoid loiterig and help with garbage collection.
        if ((n > 0) && (n == (pq.length - 1) / (2 + 2))) {
            resize(pq.length / 2);
        }
        assert isMinHeap();
        return min;
    }


   /***************************************************************************
    * Helper functions to restore the heap invariant.
    ***************************************************************************/
    /**
     * swim function it generally moves the element to upwards.
     * Time complixity is N because of while loop
     * @param      k     { key type}
     */
    private void swim(final int k) {
        int x1 = k;
        while (x1 > 1 && greater(x1 / 2, x1)) {
            exch(x1, x1 / 2);
            x1 = x1 / 2;
        }
    }
    /**
     * sink function it generally moves the elements to downwards.
     * Time complexity is N because of while loop.
     * @param      k     int.
     */
    private void sink(final int k) {
        int x = k;
        while (2 * x <= n) {
            int j = 2 * x;
            if (j < n && greater(j, j + 1)) {
                j++;
            }
            if (!greater(x, j)) {
                break;
            }
            exch(x, j);
            x = j;
        }
    }

   /***************************************************************************
    * Helper functions for compares and swaps.
    ***************************************************************************/
   /**
    * compares two objects and returns true or false.
    * time complexity is 1 because all the statements are executed only once
    * @param      i     int.
    * @param      j     int.
    *
    * @return     { returns true if condition is satified or false }
    */
    private boolean greater(final int i, final int j) {
        if (comparator == null) {
            return ((Comparable<Key>) pq[i]).compareTo(pq[j]) > 0;
        } else {
            return comparator.compare(pq[i], pq[j]) > 0;
        }
    }
    /**
     * swaps the two elements of the pq.
     * Time complexity is 1 because only once the statements are executed
     * @param      i     { index of comparable array}
     * @param      j     { index of comparable array}
     */
    private void exch(final int i, final int j) {
        Key swap = pq[i];
        pq[i] = pq[j];
        pq[j] = swap;
    }
    /**
     * Determines if minimum heap.
     * is pq[1..N] a min heap?
     * @return     True if minimum heap, False otherwise.
     */
    private boolean isMinHeap() {
        return isMinHeap(1);
    }

    /**
     * Determines if minimum heap.
     * is subtree of pq[1..n] rooted at k a min heap?
     * @param      k    int.
     *
     * @return     True if minimum heap, False otherwise.
     */
    private boolean isMinHeap(final int k) {
        if (k > n) {
            return true;
        }
        int left = 2 * k;
        int right = 2 * k + 1;
        if (left  <= n && greater(k, left)) {
            return false;
        }
        if (right <= n && greater(k, right)) {
            return false;
        }
        return isMinHeap(left) && isMinHeap(right);
    }


    /**
     * Returns an iterator that iterates over the keys on this priority queue
     * in ascending order.
     * <p>
     * The iterator doesn't implement {@code remove()} since it's optional.
     *
     * @return an iterator that iterates over the keys in ascending order
     */
    public Iterator<Key> iterator() {
        return new HeapIterator();
    }
    /**
     * Class for heap iterator.
     */
    private class HeapIterator implements Iterator<Key> {
        /**
         * create a new pq.
         */
        private MinPQ<Key> copy;
        /**
         * Constructs the object.
         * add all items to copy of heap.
         * takes linear time since already in heap order so no keys move.
         */
        protected HeapIterator() {
            if (comparator == null) {
                copy = new MinPQ<Key>(size());
            } else {
                copy = new MinPQ<Key>(size(), comparator);
            }
            for (int i = 1; i <= n; i++) {
                copy.insert(pq[i]);
            }
        }

        /**
         * Determines if it has next.
         *
         * @return     True if has next, False otherwise.
         */
        public boolean hasNext() {
            return !copy.isEmpty();
        }
        /**
         * remove function.
         */
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /**
         * next function.
         * to find the next.
         *
         * @return     Key value.
         */
        public Key next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return copy.delMin();
        }
    }

}
