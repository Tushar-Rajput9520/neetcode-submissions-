class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        Set<Integer> store=new HashSet<>();
        for(int num:nums){
            store.add(num);
        }
        for(int num:nums){
            int count=0;
            int curr=num;
            while(store.contains(curr)){
                count++;
                curr++;
            }
            max=Math.max(max,count);
        }
        return max;
        
    }
}
