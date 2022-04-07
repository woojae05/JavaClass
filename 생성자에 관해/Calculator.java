package kr.hs.dgsw.d0330;

import java.util.Scanner;

public class Calculator {
	private String operator;
	
	private int operand1;
	
	private int operand2;
	
	private final Scanner scanner;
	
	private int result;
	
	public Calculator(String operator) {
		// this는 생략이 가능하지만 매개변수를 받을 때 무언을 가까운 곳을 참조하기때문에 값이 잘못들어 가지는 오류가 생긴
		this.operator = operator;
		this.scanner = new Scanner(System.in);
	}
	
	public void execute() {
		while (true) {
			operand1 = scanner.nextInt();
			operand2 = scanner.nextInt();
			
			if (operand1 == 0 && operand2 == 0) {
				break;
			}
			
			switch (operator) {
			case "+": {
				result = operand1 + operand2;
				System.out.printf("%d + %d = %d\n ",operand1,operand2,result);
				break;
			}
			case "-":{
				result = operand1 - operand2;
				System.out.printf("%d - %d = %d\n ",operand1,operand2,result);
				break;
			}case "*":{
				result = operand1 * operand2;
				System.out.printf("%d * %d = %d\n ",operand1,operand2,result);
				break;
			}case "/":{
				System.out.printf("%d / %d = %.2f\n ",operand1,operand2,((operand1*1.0) / operand2));
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + operator);
			}
		}
		this.scanner.close();
	}
	

	public static void main(String[] args) {
		String operator = args.length > 0 ? args[0] : "*";
		System.out.println("두 정수를 입력하세요");
		Calculator calculator = new Calculator(operator);
		calculator.execute();
		System.out.println("종료됨");
	}
}
