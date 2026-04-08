class Solution {
    public int removeDuplicates(int[] nums) {
        // int k=1;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]!=nums[i-1]){
        //         nums[k]=nums[i];
        //         k++;
        //     }
            
            
        // }
        // return k;.
        TreeSet<Integer> unique = new TreeSet<>();
        for (int num : nums) {
            unique.add(num);
        }
        int i = 0;
        for (int num : unique) {
            nums[i++] = num;
        }
        return unique.size();
        
    }
}