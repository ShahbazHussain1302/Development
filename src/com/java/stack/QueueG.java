package com.java.stack;

public class QueueG<T> {
	Object[] arr;
	int top;
	int size;
	
	public QueueG(int size){
		this.size = size;
		arr = new Object[size];
		top = -1;
	}
	
	public void enqueue(T obj){
		if(!isFull()){
			arr[++top] = obj;
		}
	}
	
	public T dequeue(){
		T temp = null;
		if(!isEmpty()){
			temp = (T) arr[0];
			for(int i = 0; i<arr.length-1; i++){
				arr[i] = arr[i+1];
			}
			top--;
		}
		return temp;
	}
	
	public T methodForPeek(){
		T temp = null;
		if(!isEmpty()){
			temp = (T) arr[0];
			/*for(int i = 0; i<arr.length-1; i++){
				arr[i] = arr[i+1];
			}
			top--;*/
		}
		return temp;
	}
	
	public boolean isFull(){
		return top == size-1;
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
}
