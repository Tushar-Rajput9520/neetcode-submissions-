class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0; // position to place next non-val element
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i]; // move non-val element forward
                index++;
            }
        }
        return index; // new length of array
    }
}
