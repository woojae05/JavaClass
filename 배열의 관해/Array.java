package kr.hs.dgsw.java.dept2.d0413;

public class Array {
	public void studyArray() {
		
		//  배열의 선언 
		{
		int[] array1; // 가독성으로 좋다고 생각
		int array2[]; // c언어의 영향을 받음 
		}
		
		// 배열의 정의 
		{
			String[] countries = new String[5]; // 가변적인 데이터를 저장하기에 비효율적임 
			
			countries[0] = "Korea"; // 인덱스의 시작은 0 
			countries[1] = "Germany";
			
//			countries[100] = "Japan"; // 예외가 발생함 
		}
		
		// 배열의 초기값
		{
			int[] intArray = new int[1];
			double[] doubleArray = new double[1];
			boolean[] booleanArray = new boolean[1];
			String[] stringArray = new String[1];
			
			System.out.println("int:" + intArray[0]);
			System.out.println("double:" + doubleArray[0]);
			System.out.println("boolean:" + booleanArray[0]);
			System.out.println("string:" + stringArray[0]);
		}
		
		// 배열의 초기화
		{
			String[] colors = {"red","green","blue","magenta"}; // 초기화를 편하게 사용, JS랑 비교됨 
			int[] numbers = {1,2,3,4,8};
		}
		
		// Loop
		{
			String[] colors = {"red","green","blue","magenta","pink"};
			
			
			for(int i = 0;i<colors.length;i++) { // 배열의 위치가 필요할때 사용 
				System.out.printf("%d - %s\n",i,colors[i]);
			}
			
			for(String color : colors) { // 배열을 위한 for문 
				System.out.println(color);
			}
		}
		
		// 
		{
			int value1 = 3;
			int value2 = value1;
			value2 =10;
			System.out.println("int:"+value1+" "+value2);
			
			int[] array1 = {1,2,3};
			int[] array2 = array1;
			int[] array3 = this.copy(array1);
			array2[1] = 100; 
			array3[1] = 20;
			
			System.out.println("array:"+array1[1]+" "+array2[1]+" "+array3[1]); //array: 100 100 같은 배열을 사용하기 때문이
		}
		
	}
	
	// 배열 값 복사 메서드 
	public int[] copy(int[] src){
		int[] result = new int[src.length];
		
		for(int i = 0; i < src.length; i++) {
			result[i] = src[i];
		}
		
		return result;
	}
	
	// 평균구하기 
	public void findAverage() {
		int[] ages = {18,12,32,41,32,45,31,61,13};
		
		double average = 0;
		
		double total = 0;
		
		for(int age: ages) {
			total +=age;
		}
		
		average = total/(double)ages.length;
		
		System.out.printf("나이 평균 = %.2f\n",average);
	}
	
	public static void main(String[] args) {
		Array array = new Array();
		array.studyArray();
//		array.findAverage();
	}
}
