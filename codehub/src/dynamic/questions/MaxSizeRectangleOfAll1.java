package dynamic.questions;

import java.util.Stack;

public class MaxSizeRectangleOfAll1 {

	// To get  max histogram
	public  int maxHistogram(int input[]){
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
        	//System.out.println("dec");
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
	
	 int  maxSizeRectangleOfAll1(int a[][],int row ,int col){
		int temp[] = new int[col];
		for(int j = 0 ; j < col ; j++)
			temp[j]=a[0][j];
		int area=0;
		int maxArea=0;
		area = maxHistogram(temp);
		if(area > maxArea)
			maxArea = area ;
		for(int i=1 ; i<row ;i++){
			for(int j=0 ; j < col ; j++){
				if(a[i][j] == 0)
					temp[j]=a[i][j];
				else
					temp[j] += a[i][j]; 
			}
			area = maxHistogram(temp);
			if(area > maxArea)
				maxArea = area ;
		}
		return maxArea;
		
	}
    
	public static void main(String[] args) {
		MaxSizeRectangleOfAll1 m = new MaxSizeRectangleOfAll1();
		int matrix[][] ={{1,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}};
		System.out.println("Max Size Rectangle Of All 1's   "+m.maxSizeRectangleOfAll1(matrix,3,4));
	}

}
