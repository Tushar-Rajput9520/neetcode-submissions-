class Solution {
    public int trap(int[] height) {
        if(height==null || height.length==0) return 0;
        int n=height.length;
        int maxArea=0;
        for(int i=0;i<n;i++){
            int leftMax=height[i];
            int rightMax=height[i];
            for(int j=0;j<i;j++){
                leftMax=Math.max(height[j],leftMax);
            }
            for(int j=i+1;j<n;j++){
                rightMax=Math.max(rightMax,height[j]);
            }
            maxArea+=Math.min(leftMax,rightMax)-height[i];
        }
        return maxArea;
        
    }
}
