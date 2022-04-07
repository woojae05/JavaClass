package kr.hs.dgsw.java.dept2;

//객체지향 프로그래밍(OOP, Object-Oriented Programming)
// 객체 지향 프로그래밍에서는 모든 데이터를 객체(object)로 취급하며, 이러한 객체가 바로 프로그래밍의 중심이 됩니다.

//객체를 정의하는 설계도
public class Dog { //클래스 첫 글자는 대문자로
	String name; // 필드
	
	String color;
	
	int age;

	// 행동을 나타내는 메서드
	public void makeSound() {
		System.out.println("멍멍 ");
	} // 함수는 동사로
	
	public void eat(String food) {
		System.out.printf("%s 이(가) %s를 먹는다 \n",name,food);
	}
	
	public void printInformation() {
		System.out.printf("name:%s\n",name);
		System.out.printf("color:%s\n",color);
		System.out.printf("age:%s\n",age);
	}
}
