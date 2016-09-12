package threadCode;

class DoThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i <10; i++){
			System.out.println("Hello..." + i);
			
		}
		
		
	}
	
}


public class ThreadCode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DoThread d = new DoThread();
		Thread t = new Thread(d);
		t.setPriority(newPriority);
		t.start();
		t.join(1000);
		DoThread d1 = new DoThread();
		Thread t1 = new Thread(d1);
		t1.start();

	}

}
