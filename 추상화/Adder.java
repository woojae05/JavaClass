package kr.hs.dgsw.java.dept2.d0427;

public class Adder extends Calculator{

	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		return value1 + value2;
	}

	@Override
	public String getOperator() {
		// TODO Auto-generated method stub
		return "+";
	}
	
	public static void main(String[] args) {
		Calculator adder = new Adder();
		adder.execute();
	}
}
