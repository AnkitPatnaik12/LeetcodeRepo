class MinStack {
     Stack<Integer> st;
     Stack<Integer> mt;
    public MinStack() {
        st=new Stack<Integer>();
        mt=new Stack<Integer>();
    }
    
    public void push(int val) {
        if(st.isEmpty())
        {
            st.push(val);
            mt.push(val);
            return;
        }
        if(val<mt.peek())
            mt.push(val);
        else
            mt.push(mt.peek());
        st.push(val);
            
    }
    
    public void pop() {
       st.pop();
       mt.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return mt.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */