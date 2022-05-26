package kr.hs.dgsw.dnwo0526.dept2.d0525;

public class FirstThread extends Thread{
	
	private int delay;
	
	public FirstThread(int delay) {
		this.delay = delay;
	}
	
	@Override
	public void run() {
		for(int i = 0;i<10;i++)
		{		
			try {				
				Thread.sleep(this.delay);
			}catch(InterruptedException e ) {				
				e.printStackTrace();
			}
			System.out.println(getName() + ":"+ i);
		}
		
	}

	public static void main(String[] args) {
		FirstThread t1 = new FirstThread(700);
		t1.setName("T1");
		FirstThread t2 = new FirstThread(800);
		t2.setName("T2");
		
		t1.start();
		t2.start();
		
		for(int i = 0;i<10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("메인 스레드:" +i);
		}
		
	}
}
