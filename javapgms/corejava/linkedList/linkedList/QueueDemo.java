package linkedList;

import java.util.LinkedList;
import java.util.Queue;
//methods are add(), remove(),
//peek() - to see the top element,returns  null if Queue is empty
//element()-to get top element, same as peek() but it returns Exception
// poll() and remove() are used to remove the values, but poll() returns null , remove() returns exception
public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> oList = new LinkedList<>();
		oList.add("A");
		oList.add("B");
		oList.add("C");
		oList.add("D");
		oList.add("E");
		System.out.println(oList);
		
		oList.remove();
		System.out.println(oList);
	}
}


/* -----------Queue Notes---------------------------
-Linkedlist can inherit the both List and Queue interfaces
-Queue is a interface
-Most commnly used classes of Queue is LinkedList and PriorityQueue

Methods in Queue:

add()- This method is used to add elements at the tail of queue. 
More specifically, at the last of linkedlist if it is used, or according to the priority in case of priority queue implementation.

peek()- This method is used to view the head of queue without removing it. 
It returns Null if the queue is empty.

element()- This method is similar to peek(). It throws NoSuchElementException when the queue is empty.

remove()- This method removes and returns the head of the queue. It throws NoSuchElementException when the queue is impty.

poll()- This method removes and returns the head of the queue. It returns null if the queue is empty.
  


*/