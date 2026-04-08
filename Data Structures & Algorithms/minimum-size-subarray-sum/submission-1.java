class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum>=target){
                    res=Math.min(res,j-i+1);
                    break;
                }
            
            }
        }
        if(res==Integer.MAX_VALUE){
            return 0;

        }else{
            return res;
        }
        
    }
}