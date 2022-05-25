package kr.hs.dgsw.dnwo0526.dept2.d0525;

public class Devloper  implements Job{
	@Override
	public void work() {
			System.out.println("프로그램 개발자가 열심히 프로그래밍 합니다.");
		
	}
	@Override
	public int getPrice() {
		
		return 100000;
	}
	
}
