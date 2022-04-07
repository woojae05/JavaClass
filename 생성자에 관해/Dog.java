package kr.hs.dgsw.d0330;

public class Dog { //  생성자를 지정하지 않으면 자바에서 기본생성자를 제공해 객체를 만들 수 있게한다. 
	
	private final String name; // final 한번 값을 할당하면 그게 마지막이다. 여기나 생성자에서 만 선언할 수 있다.
	
	private int age;
	
	public Dog(String name) { // 생성자 함수는 클래스와 이름이 같아야 한다. 리턴타입이 없다.
		this(name, 0); // 생성자를 호출하려면 첫줄에 있어야 한다.
	}
	
	public Dog(String name,int age) { // 생성자 함수는 클래스와 이름이 같아야 한다. 리턴타입이 없다.
		this.name = name;
		this.age = age;
		System.out.println("constructor");
	}
	
	public void print() {
		System.out.printf("%s %d\n",this.name,this.age);
	}
	
	
	// 하나의 클래스에서 같은 메소드이름을 가지는 것을 오브로딩이라고 한다.  자바는 허용하고 Js는 허용하지 않는다.
	public void print(String name) {
		System.out.println("hi"+ name);
	}
	
	public String getName() {
		return this.name;
	}  
	
	
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		System.out.println("before");
		Dog happy = new Dog("happy");
		happy.print();
		System.out.println("after");
		Dog puppy = new Dog("happy");
		
	}
}
