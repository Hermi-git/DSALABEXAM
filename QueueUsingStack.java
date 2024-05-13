package TEST3;

public class QueueUsingStack {

	public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack(5);
        queue.push(1);
        queue.push(2);
        queue.push(3);	

        System.out.println(queue.pop());
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.isEmpty());
        
    }
         int[] stack1;
	     int[] stack2;
	     int top1;
	     int top2;
	     int capacity;
	     int size;
        public QueueUsingStack(int capacity) {
	        this.capacity = capacity;
	        this.stack1 = new int[capacity];
	        this.stack2 = new int[capacity];
	        this.top1 = -1;
	        this.top2 = -1;
	        this.size = 0;
	    }

	    public void push(int item) {
	        if (size == capacity) {
	            System.out.println("Queue is full.");
	            return;
	        }
	        while (top1 >= 0) {
	            stack2[++top2] = stack1[top1--];
	        }
	        stack1[++top1] = item;
	        while (top2 >= 0) {
	            stack1[++top1] = stack2[top2--];
	        }
	        size++;
	    }

	    public int pop() {
	        if (size == 0) {
	            System.out.println("Queue is empty.");
	            return -1;
	        }
	        int item = stack1[top1--];
	        size--;
	        return item;
	    }

	    public int peek() {
	        if (size == 0) {
	         
	            return -1;
	        }
	        return stack1[top1];
	    }

	    public boolean isEmpty() {
	        return size == 0;
	    }

}
