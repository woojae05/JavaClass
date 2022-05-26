package kr.hs.dgsw.dnwo0526.dept2.d0525;

public class SecondThread implements Runnable{
	
	private final String name;
	private int delay;
	
	public SecondThread(String name,int delay) {
		this.name = name;
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
			System.out.println(name + ":"+ i);
		}
		
	}
	
	public static void main(String[] args) {
		SecondThread t1 = new SecondThread("T1", 500);
		SecondThread t2 = new SecondThread("T2", 900);
		
		new Thread(t1).start();
		new Thread(t2).start();
	}

}
