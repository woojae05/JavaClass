package kr.hs.dgsw.java.dept2.d0406;

public class Operator {
	public void studyArithmeticOperator() {
		int value;
		
		value = 3 + 4;
		value = 5 - 3;
		value = 4 * 7;
		value = 6 / 3;
		value = 8 % 3;
		
		value += 5; // value = value + 5;
		value -= 3; // value = value - 3;
		value *= 2; // value = value * 2;
		
		
		// 단항 연산
		value++; // value를 리턴 뒤 증가 
		++value;
		value--;
		--value;
		
		for (int i = 0;i<3;++i) {
			System.out.println(i);
		}
		
	}
	
	public void studyCompareOperators() {
		boolean result;
		
		result = 4 > 5;
		result = 4 == 4;
		result = 4 != 6;
		
		result = (2>1) && (5>7);
		result = (2>1) || (3>5);
		
		String str = "woojae";
		if((str != null) && (str.length()>0)) {
			System.out.println("ok");
		}
		
	}
	
	public void studyBitwiseOperator() {
		int value1 = 3;
		int value2 = 2;
		
		int value = value1 & value2;
		System.out.println(value);
		
		 value = value1 | value2;
		System.out.println(value);
			
		value = value1 ^ value2;
		System.out.println(value);
		
		value1 = 120;
		value = value1 << 1;
		System.out.println(value);
		
		value1 = 120;
		value = value1 >> 1;
		System.out.println(value);
		
		byte byteValue = -128;
		value = byteValue >> 1; // 최상위 비트값을 채움 
		System.out.println(value);

		byteValue = -128;
		value = byteValue >>> 1; // 0을 채
		System.out.println(value);

	}
	
	
	public static void main(String[] args) {
		Operator operator = new Operator();
		operator.studyArithmeticOperator();
		
		operator.studyBitwiseOperator();
	}
}
