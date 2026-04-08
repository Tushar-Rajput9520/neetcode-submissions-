class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int left = i;
            int right = i;

            // move left until smaller height found
            while (left > 0 && heights[left - 1] >= heights[i]) {
                left--;
            }

            // move right until smaller height found
            while (right < n - 1 && heights[right + 1] >= heights[i]) {
                right++;
            }

            // width = (right - left + 1)
            int width = right - left + 1;
            int area = width * heights[i];

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}
