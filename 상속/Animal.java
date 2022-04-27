package kr.hs.dgsw.java.dept2.d0420;

public class Animal {
	public void move() {
		System.out.println("움직 입니다.");
	}
	
	public void eat(String food) {
		System.out.println(food+"를 먹습니다.");
	}
	
	public void birth() {
		System.out.println("새끼를 놓습니다.");
	}
	
	
	
	public static void main(String[] args) {
		Dog happy = new Dog();
		happy.birth();
		happy.bark();
		
		Animal puppy = new Dog(); // 다향성, 여러가지 형태를 지니고 있다.
		puppy.birth();
//		puppy.bark(); // Animal클래스에 존재하지 않음 => 에러
	}
}
