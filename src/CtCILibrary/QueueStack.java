package CtCILibrary;


import CtCILibrary.StackNode;

public class QueueStack<T> {

	StackNode<T> newStack, oldStack;

	public QueueStack() {
		newStack = new StackNode<T>();
		oldStack = new StackNode<T>();
	}

	public void add(T item) {
		newStack.push(item);

	}

	public T remove() {
		shiftStacks();
		T value = oldStack.pop();
		return value;
	}

	public void shiftStacks() {
		if (oldStack.isEmpty()) {
			while (!newStack.isEmpty()) {
				oldStack.push(newStack.pop());
			}
		}
	}

	public T peek() {
		shiftStacks();
		return oldStack.peek();
	}

	public Boolean isEmpty() {

		return false;
	}

}
