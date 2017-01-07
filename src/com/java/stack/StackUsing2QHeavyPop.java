package com.java.stack;

public class StackUsing2QHeavyPop<T> {
	private int size;
	private  QueueG<T> q1;// = new QueueG(size);
	private  QueueG<T> q2;// = new QueueG(size);
	
	public StackUsing2QHeavyPop(int size){
		this.size = size;
		 q1 = new QueueG(size);
		 q2 = new QueueG(size);
	}

	public boolean isEmpty(){
		return q1.isEmpty();
	}
	
	public boolean isFull(){
		return q1.isFull();
	}
	
	public void push(T obj){
		if(!isFull()){
			q1.enqueue(obj);
		}
	}
	
	public T pop(){
		T obj = null;
		
		while(!isEmpty()){
			obj = q1.dequeue();
			if(isEmpty()){
				break;
			}
			q2.enqueue(obj);
		}
		
		while(!q2.isEmpty()){
			q1.enqueue(q2.dequeue());
		}
		return obj;
	}
	
	public T peek(){
		T temp = null;
		if(!isEmpty()){
			temp = q1.methodForPeek();
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		StackUsing2QHeavyPop<Integer> stack = new StackUsing2QHeavyPop(10);
		
		System.out.println("\nPushing/Peeking test\n");
		for(int i = 0; i<12; i++){
			System.out.println("Peeking :"+stack.peek());
			stack.push(i);
		}
		
		System.out.println("\nPopping test\n");
		for(int i=0;i<12;i++){
			System.out.println(stack.pop());
		}

	}

}
