package kr.hs.dgsw.dnwo0526.dept2.d0525;

import java.util.Iterator;

public class Playground {
	
	public void work(Job job,int hours) {
		for(int i = 0; i<hours; i++) {
			job.work();
		}
		System.out.println("금료: " + (hours * job.getPrice()));
	}
	public static void main(String[] args) {
		Playground ground = new Playground();
		
		Job bts = new Bts();
		Job student = new Student();
		Job developer = new Devloper();
		
		ground.work(student, 10);
		ground.work(developer, 2);
	}
}
