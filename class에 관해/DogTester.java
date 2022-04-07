package kr.hs.dgsw.java.dept2;

public class DogTester {
	public static void main(String[] args) { // 메인 함수
		Dog jindo = new Dog();
		Dog chichu = new Dog();
		
		jindo.name = "휜둥이 ";
		jindo.color = "yellow";
		jindo.age = 3;
		
		chichu.name = "blacking";
		chichu.color = "pink";
		chichu.age = 7;
		
		jindo.makeSound();
		jindo.eat("dogGGUm");
		jindo.printInformation();
		
		chichu.makeSound();
		chichu.eat("meal");
		chichu.printInformation();
		
	};
}
