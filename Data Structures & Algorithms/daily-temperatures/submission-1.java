class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // int n=temperatures.length;
        // int res[]=new int[n];
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(temperatures[j]>temperatures[i]){
        //             res[i]=j-i;
        //             break;
        //         }
        //     }
        // }
        // return res;
        int n=temperatures.length;
        int res[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=0;
            }else{
                res[i]=st.peek()-i;
            }
            st.push(i);
        }
        return res;
        
    }
}
