package VectorsandStacks;

import LinkedLists.MyLinkedList;

public class MyStack <E> {
	
	private MyLinkedList<E> ll = new MyLinkedList();
	
	
	void push (E e) {
		ll.add(e);
		 
		
	}
   E pop() throws Exception {
	   if(ll.isEmpty()) {
		   throw new Exception("popping from empty stack is not allowed");
		  
	   }
	return    ll.removeLast1();
	   
	
}
	E peek() throws Exception {
		if(ll.isEmpty()) {
			   throw new Exception("peeking from empty stack is not allowed");
		}
		return ll.getLast();
	}
	
}
