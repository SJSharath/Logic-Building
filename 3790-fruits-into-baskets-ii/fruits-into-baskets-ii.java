class Solution {
    class SegmentTree {
        int[] tree;
        int n;

        public SegmentTree(int[] baskets) {
            this.n = baskets.length;
            this.tree = new int[4 * n];
            build(0, 0, n - 1, baskets);
        }

        private void build(int node, int start, int end, int[] baskets) {
            if (start == end) {
                tree[node] = baskets[start];
                return;
            }
            int mid = start + (end - start) / 2;
            build(2 * node + 1, start, mid, baskets);
            build(2 * node + 2, mid + 1, end, baskets);
            tree[node] = Math.max(tree[2 * node + 1], tree[2 * node + 2]);
        }

        public int queryAndMark(int node, int start, int end, int val) {
            // If the maximum capacity in this entire segment is less than the fruit size, skip
            if (tree[node] < val) {
                return -1;
            }
            // Leaf node reached: item fits here
            if (start == end) {
                int index = start;
                tree[node] = -1; // Mark basket as consumed
                return index;
            }
            int mid = start + (end - start) / 2;
            int result = -1;
            
            // Prioritize the leftmost side to satisfy the first available basket requirement
            if (tree[2 * node + 1] >= val) {
                result = queryAndMark(2 * node + 1, start, mid, val);
            } else {
                result = queryAndMark(2 * node + 2, mid + 1, end, val);
            }
            
            // Recalculate node max value post-consumption
            tree[node] = Math.max(tree[2 * node + 1], tree[2 * node + 2]);
            return result;
        }
    }

    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        SegmentTree st = new SegmentTree(baskets);
        int unplacedCount = 0;

        for (int fruit : fruits) {
            int basketIdx = st.queryAndMark(0, 0, baskets.length - 1, fruit);
            if (basketIdx == -1) {
                unplacedCount++;
            }
        }
        return unplacedCount;
    }
}
