package kr.hs.dgsw.dnwo0526.dept2.d0525;

public interface Job { // 전략 패턴을 사용할 때 많이 사용한다.
	public void work(); // 선언만 해주고 상속 바은 클래스가 작성한다.
	
	public int getPrice();
	
}
