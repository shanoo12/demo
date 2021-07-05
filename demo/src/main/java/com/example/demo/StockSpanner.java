package com.example.demo;

import java.util.Stack;

public class StockSpanner {

    Stack<Integer[]> st=new Stack<Integer[]>();
public StockSpanner() {
    
    
}

public int next(int price) {
    int count=1;
    while(!st.isEmpty()&&st.peek()[0]<price)
    {
        count+=st.pop()[1];
    }
        Integer[] arr={price,count};
   
        st.push(arr);
    return count;
}
public static void main(String[] args) {
	StockSpanner obj = new StockSpanner();
	  int param_1 = obj.next(100);
}
}
