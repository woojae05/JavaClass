package kr.hs.dgsw.java.dept2.d0427;

import java.util.Scanner;

public abstract class Calculator {
	protected final Scanner scanner;
	
	protected int value1;
	
	protected int value2;
	
	public Calculator() {
		this.scanner = new Scanner(System.in);
		
	}
	
	public void execute() {
		while(true) {
			this.inputValues();
			
			if(isExitCondition()) break;
			
			int result = this.calculate();
			this.showResult(result);
			this.scanner.close();
		}
	}
	
	public void inputValues() {
		System.out.println("두 정수를 입력하세용.");
		this.value1 = this.scanner.nextInt();
		this.value2 = this.scanner.nextInt();
		}
	
	public boolean isExitCondition() {
		return (value1 == 0 && value2 == 0);
	}
	
	public void showResult(int result) {
		System.out.printf("%d %s %d = %d\n",value1,getOperator(),value2,result);
	}
	
	public abstract int calculate();
	
	public abstract String getOperator();
	
}
