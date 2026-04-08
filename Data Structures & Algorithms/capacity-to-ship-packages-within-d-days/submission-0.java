class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int minCap=0;
        int maxCap=0;
        for(int w:weights){
            minCap=Math.max(minCap,w);//min cap is the maxi of weight
            maxCap+=w; //max capacity is sum of all the weight
        }
        while(minCap<maxCap){
            int mid=minCap+(maxCap-minCap)/2;
            if(canShip(weights,days,mid)){
                maxCap=mid;
            }else{
                minCap=mid+1;
            }
        }
        return minCap;
        
    }
    public boolean canShip(int weights[],int days,int cap){
        int curr=0;
        int newDays=1;
        for(int w:weights){
            if(curr+w>cap){
                newDays++;
                curr=0;
            }
            curr+=w;
        }
        return newDays<=days;
    }
}