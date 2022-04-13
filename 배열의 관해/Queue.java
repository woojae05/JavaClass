package kr.hs.dgsw.java.dept2.d0413;

public class Queue {
	public static final int SIZE = 10;
	
	private final String[] buffer;
	
	private int head;
	private int tail;
	private boolean full;
	
	public Queue() {
		this.buffer = new String[SIZE]; // 배열 
		this.head = 0; //  마지막 들어온 것을 가리킨다 
		this.tail = 0; // 먼저 들어온 값을 가리킨다 
		this.full = false; // 배열이 가득 찼는지 확인하는 변
	}
	
	public void add(String value) {
		if (isFull()) {
			throw new RuntimeException("Full");
		}
		
		this.buffer[this.head] = value;
		this.head = (this.head + 1) % SIZE; // head와 SIZE가 같아지면 head를 0으로 => 리셋시켜주는 연산이다.  환영 큐 
		
		this.full = (this.head == this.tail); 
	}
	
	public String poll() {
		if (isEmpty()) {
			throw new RuntimeException("Empty");
		}
		
		String value = this.buffer[this.tail];
		this.tail = (this.tail + 1) % SIZE; // tail와SIZE가 같아지면 tail를 0으로 => 리셋 시켜주는 연산이다 . 환영 큐 
		
		this.full = false;
		
		return value;
	}
	
	public int getSize() {
		if (this.head == this.tail) {
			if (this.full) {
				return SIZE;
			} else {
				return 0;
			}
		} else if (this.head > this.tail) {
			return this.head - this.tail;
		} else {
			return SIZE - (this.tail - this.head); 
		}
	}
	
	public boolean isFull() {
		return this.full;
	}
	
	public boolean isEmpty() {
		return ((!this.full) && (this.head == this.tail)); // 0 0 일떄 true 
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		
		queue.add("Dog");
		queue.add("Mouse");
		queue.add("Dragonfly");
		
		System.out.println(queue.poll() + "  " + queue.getSize());
		System.out.println(queue.poll() + "  " + queue.getSize());
		System.out.println(queue.poll() + "  " + queue.getSize());

		queue.add("Dog");
		queue.add("Mouse");
		queue.add("Dragonfly");
		
		System.out.println(queue.poll() + "  " + queue.getSize());
		System.out.println(queue.poll() + "  " + queue.getSize());
		System.out.println(queue.poll() + "  " + queue.getSize());

		queue.add("Dog");
		queue.add("Mouse");
		queue.add("Dragonfly");
		
		System.out.println(queue.poll() + "  " + queue.getSize());
		System.out.println(queue.poll() + "  " + queue.getSize());
		System.out.println(queue.poll() + "  " + queue.getSize());

		queue.add("Dog");
		queue.add("Mouse");
		queue.add("Dragonfly");
		
		System.out.println(queue.poll() + "  " + queue.getSize());
		System.out.println(queue.poll() + "  " + queue.getSize());
		System.out.println(queue.poll() + "  " + queue.getSize());

		queue.add("Dog");
		queue.add("Mouse");
		queue.add("Dragonfly");
		
		System.out.println(queue.poll() + "  " + queue.getSize());
		System.out.println(queue.poll() + "  " + queue.getSize());
		System.out.println(queue.poll() + "  " + queue.getSize());

		queue.add("Dog");
		queue.add("Mouse");
		queue.add("Dragonfly");
		
		System.out.println(queue.poll() + "  " + queue.getSize());
		System.out.println(queue.poll() + "  " + queue.getSize());
		System.out.println(queue.poll() + "  " + queue.getSize());

	}
}