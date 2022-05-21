package kr.hs.dgsw.dnwo0526.dept2.d0518;

import kr.pe.batang.javaClass.exam.commander.Scaner;

public class ExceptionStudy {
	public void method1() throws MyException{
		System.out.println("Method 1 호출됨");
		
		if((System.currentTimeMillis()%2)==1) {
			MyException e = new MyException();
			throw e;
		}
	}
	
	public void method2() throws MyRumtimeException {
		System.out.println("Method 1 호출됨");
		
		if((System.currentTimeMillis()%2)==1) {
			MyRumtimeException e = new MyRumtimeException();
			throw e;
		}
	}
	
	public static void main(String[] args) {
		try {
			ExceptionStudy study = new ExceptionStudy();
//			Scanner scanner = new Scaner(System.in);
//			study.method1();
		}catch (Exception e) { // heap에 함수를 저장 stack을 이용해 저장 
			e.printStackTrace(); // 예외가 어디서 발생헀는지 사용된 함수들을 찾아감
		}
	}
}
