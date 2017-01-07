package com.java.stack;

public class StackUsing2QHeavyPush<T> {
	private int size;
	private  QueueG<T> q1;// = new QueueG(size);
	private  QueueG<T> q2;// = new QueueG(size);
	
	public StackUsing2QHeavyPush(int size){
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
	
	public  void push(T i){
		if(isEmpty()){
			q1.enqueue(i);
		}else if(!isFull()){
			while(!isEmpty()){
				q2.enqueue(q1.dequeue());
			}
			
			q1.enqueue(i);
			
			while(!q2.isEmpty()){
				q1.enqueue(q2.dequeue());
			}
		}		
	}
	
	public T pop(){
		T temp = null;
		if(!isEmpty()){
			temp = q1.dequeue();
		}
		
		return temp;
	}
	
	public T peek(){
		T temp = null;
		if(!isEmpty()){
			temp = q1.methodForPeek();
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		StackUsing2QHeavyPush<Integer> stack = new StackUsing2QHeavyPush(10);
		
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
