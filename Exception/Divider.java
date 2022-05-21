package kr.hs.dgsw.dnwo0526.dept2.d0518;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Divider { // 모든 클래스는 Object 클래스를 상속받는다. 
	private final Scanner scan;
	
	public Divider(){
		this.scan = new Scanner(System.in);
	}
	
	public void execute() {
		System.out.println("두 정수를 입력하시오");
		
		try {
			int value1 = scan.nextInt();
			int value2 = scan.nextInt();
			
			int result = calculate(value1,value2);
			
			System.out.printf("%d / %d = %d\n",value1,value2,result);
			
			saveResult(value1,value2,result);
			
		} catch(InputMismatchException e) { // 모든 예외클래스는 Exceptions을 상속받는다.
											//RuntimeExceptio(unchecked)을 상속받은 exceptoons은 따로 예외처리를 하지 않아도 실행된다.
			System.out.println("문자가 아닌 숫자를 입력하시오");
		}catch(ArithmeticException e) { // 자식클래스를 상단에 위치해야 오류가 나지 않는다.
			System.out.println("0으로 나눌 수 없다");
		} finally { // 예외를 발생하건 안한거 무조건 실행된다.
			this.scan.close();
		}
		
	}
		/*catch (Exception e) {
		e.printStackTrace();
		if(e instanceof InputMismatchException) {
			
		}else if(e instanceof ArithmeticException) {
			System.out.println("0으로 나눌 수 없다");
		}
		
	}*/
	
	public void saveResult(int value1, int value2,int result) {
		String str = value1+" / "+value2 + " = " + result + "\n";
		String path = "/Users/DGSW/Documents/divider.txt";
		
		OutputStream os  = null;
		
		try {
			File file = new File(path);
			os = new FileOutputStream(file);
			os.write(str.getBytes());
			
		}catch(IOException e) {
			System.out.println("파일을 저장하지 못했습니다.");
		}finally {
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		try {
//			FileWriter fw = new FileWriter("/Users/DGSW/Documents/divider.txt");
//			fw.write(msg);
//			fw.close();
//			System.out.println("성공");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//		}
		
	}
	
	public int calculate(int value1, int value2) {
		return value1/value2;
	}
	public static void main(String[] args) {
		Divider divider = new Divider();
		
		divider.execute();
		
	}
}
