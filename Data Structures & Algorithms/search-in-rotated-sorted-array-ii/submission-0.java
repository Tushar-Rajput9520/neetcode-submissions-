class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return true;

            // If we can’t decide due to duplicates
            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
            }
            // Left half sorted
            else if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // target in left
                } else {
                    left = mid + 1; // target in right
                }
            }
            // Right half sorted
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // target in right
                } else {
                    right = mid - 1; // target in left
                }
            }
        }
        return false;
    }
}
