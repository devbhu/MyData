package dynamic.questions;


import java.util.Stack;

public class MaxHistogramArea {

    public int maxHistogram(int input[]){
        Stack<Integer> stack = new Stack<Integer>();
        int maxArea = 0;
        int area = 0;
        int i;
        for(i=0; i < input.length;){
            if(stack.isEmpty() || input[stack.peek()] <= input[i]){
                stack.push(i++);
            }else{
                int top = stack.pop();
                if(stack.isEmpty()){
                    area = input[top] * i;
                }
                else{
                    area = input[top] * (i - stack.peek() - 1);
                }
                if(area > maxArea){
                    maxArea = area;
                }
            }
        }
        while(!stack.isEmpty()){
        	System.out.println("dec");
            int top = stack.pop();
            if(stack.isEmpty()){
                area = input[top] * i;
            }
           
            else{
                area = input[top] * (i - stack.peek() - 1);
            }
        if(area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
    
    public static void main(String args[]){
    	MaxHistogramArea mh = new MaxHistogramArea();
        int input[] = {1,2,3,4,5};
        int maxArea = mh.maxHistogram(input);
        System.out.println(maxArea);
        assert maxArea == 12;
    }
}
