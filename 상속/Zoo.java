package kr.hs.dgsw.java.dept2.d0427;

public class Zoo {
	public void bread(Animal animal) { // 다향성을 이용해 중복을 줄인다. 
		animal.move();
	}
	
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		
		zoo.bread(new Dog());
		zoo.bread(new Pig());
		zoo.bread(new Horse());
	}
}
