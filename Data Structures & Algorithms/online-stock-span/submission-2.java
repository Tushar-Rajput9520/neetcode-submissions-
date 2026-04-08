class StockSpanner {
    Stack<Integer> st;
    List<Integer> arr;

    public StockSpanner() {
        arr=new ArrayList<>();
        st=new Stack<>();

        
    }
    
    public int next(int price) {
        // arr.add(price);
        // int span=1;
        // for(int i=arr.size()-2;i>=0;i--){
        //     if(arr.get(i)<=price){
        //         span++;
        //     }else{
        //         break;
        //     }
        // }
        // return span;
        arr.add(price);
        int span;
        int i=arr.size()-1;
        while(!st.isEmpty() && arr.get(st.peek())<=price){
            st.pop();
        }
        if(st.isEmpty()){
            span=i+1;
        }else{
        span=i-st.peek();
        }
        st.push(i);
        return span;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */