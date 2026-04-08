class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        // int res=Integer.MAX_VALUE;
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
        //         sum+=nums[j];
        //         if(sum>=target){
        //             res=Math.min(res,j-i+1);
        //             break;
        //         }
            
        //     }
        // }
        // if(res==Integer.MAX_VALUE){
        //     return 0;

        // }else{
        //     return res;
        // }
        int l=0;
      
        int minLen=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            while(sum>=target){
                minLen=Math.min(minLen,i-l+1);
                sum-=nums[l];
                l++;
            }
        }
        return minLen==Integer.MAX_VALUE?0:minLen;

        
    }
}