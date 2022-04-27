package kr.hs.dgsw.java.dept2.d0427;

public class Divider extends Calculator {

	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		return value1 / value2;
	}

	@Override
	public String getOperator() {
		return "/";
	}
	
	@Override
	public boolean isExitCondition() {
		return (value2 == 0);
	}
	
	public static void main(String[] args) {
		Calculator divider = new Divider();
		divider.execute();
	}
}
