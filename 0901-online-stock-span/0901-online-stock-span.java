class StockSpanner {
    ArrayList<Integer> prices;
    Stack<Integer> st;
    int index;
    
    public StockSpanner() {
        st=new Stack<>();
        prices=new ArrayList<>();
        index=0;
    }
    
    public int next(int price) {
        prices.add(price);

        while(!st.isEmpty() && prices.get(st.peek())<=price){
            st.pop();
        }
        int ans;

        if(st.isEmpty()){
            ans=index+1;
        }
        else{
            ans=index-st.peek();
        }
        st.push(index);
        index++;

        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */