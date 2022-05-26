package kr.hs.dgsw.dnwo0526.dept2.d0525;

import java.util.Scanner;

public class ComplexCalcuator {
	private final Scanner scanner;
	
	public ComplexCalcuator() {
		this.scanner = new Scanner(System.in);
	}
	
	public void execute() {
		while(true) {
			System.out.println("두 정수를 입력하시요");
			int value1 = scanner.nextInt();
			int value2 = scanner.nextInt();
			
			if(value1==0 && value2==0) {
				break;
			}
			
			CaculateThread calulate = new CaculateThread(value1, value2);
			new Thread(calulate).start();
		
		}
		System.out.println("프로그램을 종료합니다");
	}
	
	public class CaculateThread implements Runnable{
		
		private final int value1;
		private final int value2;
		
		public CaculateThread(int value1,int value2) {
			this.value1 = value1;
			this.value2 = value2;
		}
		
		public void run() {
			
			try {
				Thread.sleep(1000*15);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			int result = value1 + value2;
			System.out.printf("%d + %d = %d\n",value1,value2, result);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		ComplexCalcuator complexCalcuator = new ComplexCalcuator();
		complexCalcuator.execute();
	}
}
