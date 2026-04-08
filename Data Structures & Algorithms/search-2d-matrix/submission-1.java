class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int start = 0;
        int end = n * m - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int row = mid / m;  // ✅ divide by number of columns
            int col = mid % m;  // ✅ modulo with number of columns

            if (matrix[row][col] > target) {
                end = mid - 1;
            } else if (matrix[row][col] < target) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
