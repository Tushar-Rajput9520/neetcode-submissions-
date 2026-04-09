class Solution {
    public int longestConsecutive(int[] nums) {
        // int max=0;
        // Set<Integer> store=new HashSet<>();
        // for(int num:nums){
        //     store.add(num);
        // }
        // for(int num:nums){
        //     int count=0;
        //     int curr=num;
        //     while(store.contains(curr)){
        //         count++;
        //         curr++;
        //     }
        //     max=Math.max(max,count);
        // }
        // return max;
      int n = nums.length;
        if (n == 0) return 0;

        Arrays.sort(nums);

        int lastsmaller = Integer.MIN_VALUE;
        int count = 0;
        int largest = 1;

        for (int i = 0; i < n; i++) {

            if (nums[i] - 1 == lastsmaller) {
                count++;
                lastsmaller = nums[i];
            } 
            else if (nums[i] != lastsmaller) {
                count = 1;
                lastsmaller = nums[i];
            }

            largest = Math.max(largest, count);
        }

        return largest;
        // HashSet<Integer> set=new HashSet<>();
        // for(int num:nums){
        //     set.add(num);
        // }
        // int max=0;
        // for(int num:nums){
        //     if(!set.contains(num-1)){
        //         int length=1;
        //         while(set.contains(num+length)){
        //             length++;
        //         }
        //         max=Math.max(max,length);
        //     }
        // }
        // return max;
        
    }
}
