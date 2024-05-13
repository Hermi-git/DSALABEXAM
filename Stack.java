package TEST2;

public class Stack {

	  int[] numbers;
	  int top;
	  int arrayLength;
	  
		public Stack(int size) {
		numbers = new int[size];
		top = -1;
		arrayLength =0;
		}
		public int size() {
		return arrayLength;
		}
		public void push(int value) {
		if (top < numbers.length - 1) {
		numbers[++top] = value;
		arrayLength++;
		}
		else {
		System.out.println("Full");
		}
		}
		public int pop() {
		if (top >= 0) {
		   int popedElement = numbers[top--];
		   arrayLength--;
		return popedElement;
		}

		return -1;
		}
		public static void main(String[] args) {
		Stack num = new Stack(5);
		num.push(1);
		num.push(2);
		num.push(3);
		num.push(4);
		num.pop();
		num.pop();
		for (int i = 0; i < num.arrayLength; i++) {
			System.out.println(num.numbers[i]);
			}
	 


 }
}


		
	

	


