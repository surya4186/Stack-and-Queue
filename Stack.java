package stack;

import java.util.Scanner;

public class Stack<T> {
	int size;
	T[] stackArray;
	int top;

	Stack(int s) {
		this.size = s;
		this.stackArray = (T[]) new Object[size];
		top = -1;
	}

	void push(T val) {
		if (isFull()) {
			System.out.println("stack is full");

		} else {

			stackArray[++top] = val;

		}
	}

	void pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");

		} else {

			System.out.println(stackArray[top--]);
		}

	}

	void display() {

		for (int i = top; i >= 0; i--) {
			System.out.println(stackArray[i]);
		}
		System.out.println("-------------");

	}

	public void peek() {
		if (top == -1) {
			System.out.println("stack is empty");
		} else {
			System.out.println(stackArray[top]);
		}

	}

	boolean isEmpty() {

		if (top == -1) {

			return true;
		}
		return false;
	}

	boolean isFull() {
		if (top == size - 1) {
			return true;
		}
		return false;
	}

	int search(T num) {
		for (int i = top; i >= 0; i--) {
			if (stackArray[i].equals(num)) {
				return i;
			}

		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the data type:\n 1.Integer \n 2.String \n 3.Double");
		int type = scan.nextInt();
		System.out.println("enter the stack size");
		int n = scan.nextInt();
		Stack<Integer> st = new Stack<Integer>(n);
		Stack<String> str = new Stack<>(n);
		Stack<Double> doubl = new Stack<>(n);

		while (true) {

			System.out.println("-------stack menu-------");
			System.out.println("1.Add(push)");
			System.out.println("2.Remove(pop)");
			System.out.println("3.display");
			System.out.println("4.search position");
			System.out.println("5.peek");
			System.out.println("6.check empty");
			System.out.println("7.Exit");
			System.out.println("Enter your choice:\t");
			int choice;

			choice = scan.nextInt();
			switch (choice) {
			case 1:
				if (type == 1) {
					System.out.println("Enter the Number");
					int val = scan.nextInt();
//			 scan.next();
					st.push(val);

					break;
				} else if (type == 2) {
					System.out.println("Enter the Number");
					String val = scan.next();
					str.push(val);
					break;
				} else if (type == 3) {
					System.out.println("Enter the Number");
					Double val = scan.nextDouble();
					doubl.push(val);
					break;
				}
			case 2:
				if (type == 1) {
					st.pop();
					break;
				}
				if (type == 2) {
					str.pop();
					break;
				}
				if (type == 3) {
					doubl.pop();
					break;
				}
			case 3:
				if (type == 1) {
					st.display();
					break;
				} else if (type == 2) {
					str.display();
					break;
				} else if (type == 3) {
					doubl.display();
					break;
				}
			case 4:
				if (type == 1) {
					System.out.println("Enter the search element");
					int search = scan.nextInt();
					System.out.println("position is :" + st.search(search));
					break;
				} else if (type == 2) {
					System.out.println("Enter the search element");
					String search = scan.next();
					System.out.println("position is :" + str.search(search));
					break;
				} else if (type == 3) {
					System.out.println("Enter the search element");
					Double search = scan.nextDouble();
					System.out.println("position is :" + doubl.search(search));
					break;
				}
			case 5:
				if (type == 1) {
					st.peek();
					break;
				} else if (type == 2) {
					str.peek();
					break;
				} else if (type == 3) {
					doubl.peek();
					break;
				}
			case 6:
				if (type == 1) {
					System.out.println("stack is empty : " + st.isEmpty());
					break;
				}
				if (type == 2) {
					System.out.println("stack is empty : " + str.isEmpty());
					break;
				}
				if (type == 3) {
					System.out.println("stack is empty : " + doubl.isEmpty());
					break;
				}
			case 7:
				System.exit(0);
			default: {
				System.out.println("invalid choice");
			}

			}

		}

	}
}
