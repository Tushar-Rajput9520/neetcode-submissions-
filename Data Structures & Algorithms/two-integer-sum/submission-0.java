class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];  // complement needed
            if (map.containsKey(comp)) {
                return new int[] { map.get(comp), i }; // return stored index and current index
            }
            map.put(nums[i], i); // store value -> index
        }
        
        return new int[] {}; // not found
    }
}
