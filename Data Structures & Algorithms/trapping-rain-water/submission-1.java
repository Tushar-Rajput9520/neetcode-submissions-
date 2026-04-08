class Solution {
    public int trap(int[] height) {
        // if(height==null || height.length==0) return 0;
        // int n=height.length;
        // int maxArea=0;
        // for(int i=0;i<n;i++){
        //     int leftMax=height[i];
        //     int rightMax=height[i];
        //     for(int j=0;j<i;j++){
        //         leftMax=Math.max(height[j],leftMax);
        //     }
        //     for(int j=i+1;j<n;j++){
        //         rightMax=Math.max(rightMax,height[j]);
        //     }
        //     maxArea+=Math.min(leftMax,rightMax)-height[i];
        // }
        // return maxArea;
        int n=height.length;
        if(n==0) return 0;
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);

        }
        int maxArea=0;
        for(int i=0;i<n;i++){
            maxArea+=Math.min(leftmax[i],rightmax[i])-height[i];
        }
        return maxArea;
        
    }
}
