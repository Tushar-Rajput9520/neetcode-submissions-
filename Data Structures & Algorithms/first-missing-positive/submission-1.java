class Solution {
    public int firstMissingPositive(int[] arr) {
        // codint ie here
        int n=arr.length;
        //first we have fitlter data
        for(int i=0;i<n;i++){
            if(arr[i]<=0 || arr[i]>=(n+1)){
                arr[i]=n+1;
            }
            
        }
        // marked neg
        for(int i=0;i<n;i++){
            int ele=Math.abs(arr[i]);
            if(ele==n+1) continue;
            int seat=ele-1;
            if(arr[seat]>0){
                arr[seat]=-arr[seat];
                
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                return i+1;
            }
        }
        return n+1;
        
    }
}
