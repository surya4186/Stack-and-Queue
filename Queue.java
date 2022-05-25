package queue;

import java.util.Scanner;

public class Queue<T> {
	int size;
	T[] array;
	int front, rear;

	Queue(int n) {
		this.size = n;
		array = (T[]) new Object[size];
		this.front = -1;
		this.rear = -1;
	}

	void enqueue(T num) {
		if (isFull()) {

			Capacity();

		} else {
			array[++rear] = num;
		}
		if (front == -1) {
			front++;
		}

	}

	void dequeue() {
		if (isEmpty()) {

			System.out.println("queue is empty");
		} else {

			System.out.println(array[front++]);
		}

	}

	void peek() {
		if (isEmpty()) {
			System.out.println("queue is empty");
		} else {
			System.out.println(array[front]);
		}
	}

	void Capacity() {
		T[] newStack = (T[]) new Object[this.size * 2];
		for (int i = 0; i < size; i++) {
			newStack[i] = array[i];
		}
		array = newStack;
		size = size * 2;
	}

	void show() {
		System.out.println("----------------");

		for (int i = front; i <= rear; i++) {
			System.out.println(array[i]);
		}
		System.out.println("----------------");
	}

	boolean isEmpty() {
		if (front == -1 || front > rear) {
			return true;
		}
		return false;
	}

	boolean isFull() {
		if (rear == size - 1 || front > size) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the data type:\n 1.Integer \n 2.String \n 3.Double");
		int type = scan.nextInt();

		Queue<Integer> in = new Queue<Integer>(5);
		Queue<String> str = new Queue<>(5);
		Queue<Double> doubl = new Queue<>(5);

		while (true) {

			System.out.println("-------stack menu-------");
			System.out.println("1.enqueue(push)");
			System.out.println("2.dequeue(pop)");
			System.out.println("3.show");
			System.out.println("4.check isfull");
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

					in.enqueue(val);

					break;
				} else if (type == 2) {
					System.out.println("Enter the value");
					String val = scan.next();
					str.enqueue(val);
					break;
				} else if (type == 3) {
					System.out.println("Enter the value");
					Double val = scan.nextDouble();
					doubl.enqueue(val);
					break;
				}
			case 2:
				if (type == 1) {
					in.dequeue();
					break;
				}
				if (type == 2) {
					str.dequeue();
					break;
				}
				if (type == 3) {
					doubl.dequeue();
					break;
				}
			case 3:
				if (type == 1) {
					in.show();
					break;
				} else if (type == 2) {
					str.show();
					break;
				} else if (type == 3) {
					doubl.show();
					break;
				}
			case 4:
				if (type == 1) {

					System.out.println(in.isFull());
					break;
				} else if (type == 2) {

					System.out.println(str.isFull());
					break;
				} else if (type == 3) {

					System.out.println(doubl.isFull());
					break;
				}
			case 5:
				if (type == 1) {
					in.peek();
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
					System.out.println("queue is empty : " + in.isEmpty());
					break;
				}
				if (type == 2) {
					System.out.println("queue is empty : " + str.isEmpty());
					break;
				}
				if (type == 3) {
					System.out.println("queue is empty : " + doubl.isEmpty());
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
