package com.java.stack;

public class StackG<T> {

	private Object[] arr;
	int size, top;
	
	public StackG(int size){
		this.size = size;
		arr = new Object[size];
		top = -1;
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public boolean isFull(){
		return top == size-1;
	}
	
	public void push(T obj){
		if(isFull()){
			//System.out.println("Stack is Full");
			return;
		}
		arr[++top] = obj;
	}
	
	public T pop(){
		T obj = null;
		if(isEmpty()){
			//System.out.println("Stack is Empty");
			return obj;
		}
		obj= (T)arr[top--];
		return obj;
	}
	
	public T peek(){
		T obj = null;
		if(isEmpty()){
			//System.out.println("Stack is Empty");
			return obj;
		}
		obj= (T)arr[top];
		return obj;
	}
}
