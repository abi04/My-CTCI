package CtCILibrary;

import java.util.EmptyStackException;

public class StackNode<T> {

	public static class MyStackNode<T> {

		private MyStackNode<T> node;
		private T data;

		public MyStackNode(T data) {
			this.data = data;
		}

	}

	private MyStackNode<T> top;

	public T peek() {
		if (top == null)
			throw new EmptyStackException();
		return top.data;
	}

	public void push(T data) {
		MyStackNode<T> n = new MyStackNode<T>(data);
		n.node = top;
		top = n;
	}

	public T pop() {
		if (top == null)
			throw new EmptyStackException();
		T value = top.data;
		top = top.node;
		return value;
	}
	public Boolean isEmpty(){
		return top == null;
	}
}
