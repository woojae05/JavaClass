package kr.hs.dgsw.dnwo0526.dept2.d0525;

public class RunnigMatch{
	
	public static class Athlete implements Runnable{
		private final String name;
		private final double record;
		
		public Athlete(String name,double record) {
			this.name = name ;
			this.record = record;
		}
		
		@Override
		public void run() {
			double distance = 0;
			int times = 0;
			
			while(true) {
				distance = times*(100/record);
				
				System.out.printf("%s 선수가 %f초 동안 %.2f을 달렸습니다.\n",name,record,distance);
				if(distance>100) {
					break;
				}
				times++ ;
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		Athlete bolt = new Athlete("bolt",9.58);
		Athlete korean = new Athlete("korean",10.07);
		Athlete woojae = new Athlete("woojae",12.34);
		Athlete snageun = new Athlete("sangen",14.78);
		
		new Thread(bolt).start();
		new Thread(korean).start();
		new Thread(woojae).start();
		new Thread(snageun).start();
		
		
		
	}
}
