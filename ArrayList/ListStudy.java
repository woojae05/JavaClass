package kr.hs.dgsw.java.dept2.d0427;

import java.util.ArrayList;
import java.util.List;

public class ListStudy  {
	public void studyList() {
		List<String> list = new ArrayList<String>();
		
		
		// 값 저장하기 
		list.add("pink");
		list.add("hellow");
		list.add(1,"blue");
		list.add(100,"green"); //배열 크기가 부족 예외 발생 
		System.out.println(list);
		
		// 값 읽어오기 
		String str = list.get(0);
		int size = list.size();
		
		for (int i= 0; i<size;i++) {
			System.out.println(i+" - "+list.get(i));
		}
		
		for(String item : list) {
			System.out.println(item);
		}
		// 삭제 
		String str1 = list.remove(0);
		
	}
	
	public static void main(String[] args) {
		ListStudy ls = new ListStudy();
		ls.studyList();
	}
}
