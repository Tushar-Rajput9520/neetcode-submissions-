class Solution {

    public boolean canSplit(int[] nums, int k, int lar) {
        int subarray = 1;
        int currSum = 0;

        for (int num : nums) {
            if (currSum + num > lar) {
                subarray++;
                if (subarray > k) {
                    return false;
                }
                currSum = num; // start new subarray
            } else {
                currSum += num; // continue adding
            }
        }
        return true;
    }

    public int splitArray(int[] nums, int k) {
        int min = 0;
        int max = 0;

        for (int w : nums) {
            min = Math.max(min, w); // at least the largest element
            max += w;               // at most the sum of all
        }

        while (min < max) {
            int mid = min + (max - min) / 2;
            if (canSplit(nums, k, mid)) {
                max = mid; // try smaller max sum
            } else {
                min = mid + 1; // need larger max sum
            }
        }
        return min; // min == max == answer
    }
}
