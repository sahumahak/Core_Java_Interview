package com.rays.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList  list = new ArrayList(); 
	
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);

		System.out.println("ArrayList Methds");
		System.out.println();
		
		System.out.println("list.get(2) : "+list.get(2));
		System.out.println("list.hashCode() : "+list.hashCode());
		System.out.println("list.indexOf(3) : "+list.indexOf(3));
		System.out.println("list.set(4, 222) : "+list.set(4, 222));
		System.out.println("list.subList(1, 3) : "+list.subList(1, 3));
		System.out.println("list.lastIndexOf(400) : "+list.lastIndexOf(400));
		System.out.println("list.set(2, 55) : "+list.set(2, 55));
		System.out.println(list);
		
		
		System.out.println("----------");
		
		
		LinkedList list1 = new LinkedList();
		
		list1.add(100);
		list1.add(122);
		list1.add(123);
		list1.add(124);
		list1.add(125);
		//list1.push(126);
		list1.offer(129);
		
		System.out.println("LinkedList Methods");
		System.out.println();
		
		System.out.println("list1.element() : "+list1.element());//show first element
		System.out.println("list1.getFirst() : "+list1.getFirst());
		System.out.println("list1.getLast() : "+list1.getLast());
		System.out.println("list1.offer(20) : "+list1.offer(20));
		System.out.println(list1);
		System.out.println("list1.offerFirst(120) : "+list1.offerFirst(120));
		System.out.println("list1.offerLast(124) : "+list1.offerLast(124));
		System.out.println(list1);

		System.out.println("list1.peek() : "+list1.peek());
		System.out.println("list1.peekFirst() : "+list1.peekFirst());
		System.out.println("list1.peekLast() : "+list1.peekLast());
		System.out.println("list1.poll() : "+list1.poll());
		System.out.println("list1.pollFirst() : "+list1.pollFirst());
		System.out.println("list1.pollLast() : "+list1.pollLast());
		System.out.println("list1.pop() : "+list1.pop());
		list1.remove(1);
		
		
		list1.addFirst(1223);
	    list1.addLast(4567);
	    
	    
	    System.out.println("----------->");
	    
	    
	    Stack stack = new Stack();
	    
	    stack.push(100);
	    stack.push(200);
	    stack.push(300);
	    stack.push(400);
	    
	   System.out.println("Stack Methods");
	    
	    System.out.println(stack);
	    System.out.println("stack.empty() : "+stack.empty());
	    System.out.println("stack.peek() : "+stack.peek());
	    System.out.println("stack.search(300) : "+stack.search(300));//search from backward
	    System.out.println("stack.pop() : "+stack.pop());
        System.out.println("-----------");
        
        
        Vector vector = new Vector();
        
        vector.add(100);
        vector.add(200);
        vector.add(300);
        vector.add(400);
        vector.add(500);

        System.out.println("Vector Methods");
        
        System.out.println("vector.elementAt(3) : "+vector.elementAt(3));
        System.out.println("vector.hashCode() : "+vector.hashCode());
        System.out.println("vector.subList(1, 3) : "+vector.subList(1, 3));
	    


	}

}