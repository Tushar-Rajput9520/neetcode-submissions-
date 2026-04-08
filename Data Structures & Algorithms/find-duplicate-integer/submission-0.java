class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        
        // Step 1: Find the intersection point in the cycle
        while (true) {
            slow = nums[slow];        // move 1 step
            fast = nums[nums[fast]];  // move 2 steps
            if (slow == fast) break;  // intersection found
        }
        
        // Step 2: Find entrance to the cycle (duplicate)
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return slow;
    }
}
