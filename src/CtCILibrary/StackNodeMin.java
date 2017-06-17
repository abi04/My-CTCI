package CtCILibrary;

public class StackNodeMin extends StackNode<Integer> {

	StackNode<Integer> min;
	
	public StackNodeMin(){
		min = new StackNode<Integer>();
	}
	
	public Integer pop(){
		int value = super.pop();
		if(value == min())
			min.pop();
		
		return value;
	}
	
	public void push(int value){
		if(value <= min())
		{
			min.push(value);
		}
		super.push(value);
	}
	
	public Integer min(){
		if(min.isEmpty())
			return Integer.MAX_VALUE;
		return min.peek();
	}
}
