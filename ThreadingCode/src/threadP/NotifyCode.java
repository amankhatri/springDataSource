package threadP;

class Data{
	int data;
	
}

class Producer extends Thread{
	Data d;

	public Producer(Data d) {
		super();
		this.d = d;
	}
	
	public void run(){
		while(true){
			synchronized(Data.class)
			{
				d.data++;
				System.out.println(d.data);
				notify();
				
			}
		}
	}
	
	
}

class Consumer extends Thread{
	Data d;

	public Consumer(Data d) {
		super();
		this.d = d;
	}
	
	public void run(){
		while(true){
			synchronized(Data.class)
			{
				d.data--;
				notify();
			}
			System.out.println(d.data);
		}
	}
	
}

public class NotifyCode {

	public static void main(String[] args) throws InterruptedException {
		Data d = new Data();
		
		Thread producer = new Producer(d);
		Thread consumer = new Consumer(d);
		
		producer.start();
		consumer.start();
		

		producer.join();
		consumer.join();
	}

}
