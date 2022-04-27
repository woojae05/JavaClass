package kr.hs.dgsw.java.dept2.d0406;

public class AccessModifiler {
	public int publicValue; // 외부에서 접근 가능 
	private int privateValue; // 상속, 외부에서 접근 불가 오직 내부에서 접근 가능
	protected int protectedValue; // 상속에서만 접근 가능 외부에서 접근 불가능  
	int defaultValue; // 같은 패키지 내에서만 접근 가능 

}
