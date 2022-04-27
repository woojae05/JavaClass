package kr.hs.dgsw.java.dept2.d0406;

import java.util.Scanner;

public class Divisor {
	
	private final Scanner scanner;
	
	private int number;
	
	public Divisor() {
		this.scanner = new Scanner(System.in);
	}
	
	public void execute() {
			number = scanner.nextInt();
			System.out.println(number+"의 약수는 "+findDivisor(number)+number+"입니다.");
			this.scanner.close();
	}
	
	public String findDivisor(int number){
		
		String divisors = "1, ";
		for (int i =2; i<=(number/2);i++) {
			if(number%i == 0) {
				divisors= divisors + i + ", " ;
			}
		}
		
		return divisors;
	}
	
	public static void main(String[] args) {
		Divisor divisor = new Divisor();
		System.out.println("정수를 입력하시오");
		divisor.execute();
		
	}
}
