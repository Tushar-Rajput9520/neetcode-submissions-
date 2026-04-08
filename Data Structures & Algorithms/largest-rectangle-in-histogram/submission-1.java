class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int ns[] = findNextSmaller(heights);
        int ps[] = findPrevSmaller(heights);
        int max = 0;

        for (int i = 0; i < n; i++) {
            int h = heights[i];
            int width = ns[i] - ps[i] - 1;
            int area = h * width;
            max = Math.max(max, area);
        }
        return max;
    }

    // Find Next Smaller Element (to the right)
    public static int[] findNextSmaller(int heights[]) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int res[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = n;
            } else {
                res[i] = st.peek();
            }
            st.push(i);
        }
        return res;
    }

    // Find Previous Smaller Element (to the left)
    public static int[] findPrevSmaller(int heights[]) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int res[] = new int[n];

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(i);
        }
        return res;
    }
}
