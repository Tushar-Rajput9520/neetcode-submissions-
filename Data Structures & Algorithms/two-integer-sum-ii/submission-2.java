class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // for(int i=0;i<numbers.length;i++){
        //     for(int j=i;j<numbers.length;j++){
        //         if(numbers[i]+numbers[j]==target){
        //             return new int[]{i+1,j+1};
        //         }
        //     }
        // }
        // return new int[]{};
        int l=0;
        int r=numbers.length-1;
        while(l<r){
            int currSum=numbers[l]+numbers[r];
            if(currSum>target){
                r--;
            }else if(currSum<target){
                l++;
            }else{
                return new int[]{l+1,r+1};
            }
        }
        return new int[0];
        
    }
}
