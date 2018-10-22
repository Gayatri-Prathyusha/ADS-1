/**
 * Class for binary search tree.
 */
class BinarySearchTree {
    /**
     * variable declaration.
     */
    private Node root;
    /**
     * Class for node.
     */
    private final class Node {
        /**
         * variable declaration.
         */
        private BookDetails key;
        /**
         * variable declaration.
         */
        private int value;
        /**
         * variable declaration.
         */
        private Node left;
        /**
         * variable declaration.
         */
        private Node right;
        /**
         * variable declaration.
         */
        private int size;
        /**
         * Constructs the object.
         *
         * @param      key1   The key
         * @param      value1  The value
         * @param s int size
         */
        private Node(final BookDetails key1, final int value1, final int s) {
            this.key = key1;
            this.value = value1;
            this.size = s;
            left = null;
            right = null;
        }
    }
    /**
     * Constructs the object.
     */
    BinarySearchTree() {
        root = null;
    }
    /**
     * size method.
     *
     * @return size.
     */
    public int size() {
        return size(root);
    }
    /**
     * size overloaded method.
     *
     * @param      x Node
     *
     * @return size.
     */
    private int size(final Node x) {
        if (x == null) {
            return 0;
        } else {
            return x.size;
        }
    }
    /**
     * get method.
     *time complexity is O(logN)
     * @param      key   The key
     *
     * @return  integer.
     */
    public int get(final BookDetails key) {
        Node x = root;
        while (x != null) {
            int cmp = key.compareTo(x.key);
            if (cmp < 0) {
                x = x.left;
            } else if (cmp > 0) {
                x = x.right;
            } else if (cmp == 0) {
                return x.value;
            }
        }
        return -1;
    }
    /**
     * put method to insert the key, value.
     *time complexity is O(1)
     * @param      key   The key
     * @param      value   The value
     */
    public void put(final BookDetails key, final int value) {
        root = put(root, key, value);
    }
    /**
     * overloaded constructor.
     * time complexity is O(logN)
     * @param      x   root node.
     * @param      key   The key
     * @param      value   The value
     *
     * @return root
     */
    private Node put(final Node x, final BookDetails key, final int value) {
        if (x == null) {
            return new Node(key, value, 1);
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = put(x.left, key, value);
        } else if (cmp > 0) {
            x.right = put(x.right, key, value);
        } else if (cmp == 0) {
            x.value = value;
        }
        return x;
    }
    /**
     * min element.
     * time complexity is O(1)
     * @return minimum.
     */
    public BookDetails min() {
        return min(root).key;
    }
    /**
     * overloaded constructor.
     * time complexity is O(logN)
     * @param      x Node
     *
     * @return minimum.
     */
    private Node min(final Node x) {
        if (x.left == null) {
            return x;
        } else {
            return min(x.left);
        }
    }
    /**
     * maximum element.
     * time complexity is O(1)
     * @return maximum.
     */
    public BookDetails max() {
        return max(root).key;
    }
    /**
     * overloaded constructor.
     * time complexity is O(logN)
     * @param      x Node
     *
     * @return maximum.
     */
    private Node max(final Node x) {
        if (x.right == null) {
            return x;
        } else {
            return max(x.right);
        }
    }
    /**
     * floor method.
     * time complexity is O(1)
     * @param      key   The key
     *
     * @return  key
     */
    public BookDetails floor(final BookDetails key) {
        Node x = floor(root, key);
        if (x == null) {
            return null;
        } else {
            return x.key;
        }
    }
    /**
     *
     *overloaded constructor.
     *time complexity is O(logN)
     * @param      x Node
     * @param      key   The key
     *
     * @return floor.
     */
    private Node floor(final Node x, final BookDetails key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp == 0) {
            return x;
        }
        if (cmp <  0) {
            return floor(x.left, key);
        }
        Node t = floor(x.right, key);
        if (t != null) {
            return t;
        } else {
            return x;
        }
    }
    /**
     * ceiling method.
     * time complexity is O(1)
     * @param      key   The key
     *
     * @return key.
     */
    public BookDetails ceiling(final BookDetails key) {
        Node x = ceiling(root, key);
        if (x == null) {
            return null;
        } else {
            return x.key;
        }
    }
    /**
     * overloaded constructor.
     * time complexity is O(logN)
     * @param      x Node
     * @param      key   The key
     *
     * @return     { description_of_the_return_value }
     */
    private Node ceiling(final Node x, final BookDetails key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp == 0) {
            return x;
        }
        if (cmp < 0) {
            Node t = ceiling(x.left, key);
            if (t != null) {
                return t;
            } else {
                return x;
            }
        }
        return ceiling(x.right, key);
    }
    /**
     * {Select Method}.
     * Time complexity of this method is O(1).
     * @param      k     {Integer}
     *
     * @return     {BookDetails Object}
     */
    public BookDetails select(final int k) {
        Node x = select(root, k);
        return x.key;
    }
    /**
     * {Select method}
     * Time complexity of this method is O(log(N)).
     * @param      x     {Node}
     * @param      k     {Integer}
     *
     * @return     {Node}
     */
    private Node select(final Node x, final int k) {
        if (x == null) {
            return null;
        }
        int t = size(x.left);
        if (t > k) {
            return select(x.left,  k);
        } else if (t < k) {
            return select(x.right, k - t - 1);
        } else {
            return x;
        }
    }
    /**
     * {Rank}.
     * Time complexity of this method is O(1).
     * @param      key   The key
     *
     * @return     {Integer}
     */
    public int rank(final BookDetails key) {
        return rank(key, root);
    }
    /**
     * {Method of rank}.
     * Time complexity of this method is O(log(N)).
     * @param      key   The key
     * @param      x     {Node}
     *
     * @return     {Integer}
     */
    private int rank(final BookDetails key, final Node x) {
        if (x == null) {
            return 0;
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return rank(key, x.left);
        } else if (cmp > 0) {
            return 1 + size(x.left) + rank(key, x.right);
        } else {
            return size(x.left);
        }
    }
}