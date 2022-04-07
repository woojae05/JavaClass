package kr.hs.dgsw.java.dept2;

public class DataType {
	public void studyInteger() {
		// -128 ~ 127
		byte byteValue = 127;
		// -32768 ~ 32767
		short shortValue = -32767; 
		// -20억 ~ 20억
		int intValue = 2000000000;
		// -800경 ~ 800
		long longValue = 10000000000L;
	}
	
	public void studyReal() {
		float floatValue = 3.1415965124132F;
		double doubleValue = 312312412341234.141592613415;
		
		System.out.println(floatValue);
		System.out.println(doubleValue);
	}
	
	public void studyBoolean() {
		
		// 1byte
		boolean b1 = (4>2);
		boolean b2 = (3 ==2 );
		
		if (4>2) {
			System.out.println("ok");
		}
	}
	
	public void studyChar() {
		// 2byte
		char ch1 = 'a';
		char ch2 = 'a' + 1;
		int ch3 = 65;
		
		char ch4 = 'ㄱ' + 1;
		char ch5 = '天';
		
		System.out.println((int)ch1);
		System.out.println(ch2);
		System.out.println((char)ch3);
		System.out.println(ch4);
		System.out.println((int)ch5);
		
		int countOfHangeulCode = '힣'-'가'+1;
		System.out.println("한글 갯수:"+ countOfHangeulCode);
			
			for (char ch = '가';ch<'고';ch++) {
				System.out.printf("%d - %c\n",(int)ch,ch);
			}
		}
	
	
	public void printAscii() {
		for (int i = 0;i<256;i++ ) {
			System.out.printf("%d - %c\n",i,i);
		}
	}
	
	
	
	public static void main(String[] args) {
			DataType study  = new DataType();
//			study.studyReal();
//			study.studyBoolean();
			study.studyChar();
//			study.printAscii();
	}
	
}
