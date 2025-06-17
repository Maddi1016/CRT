package  xyz;
class lorry implements Runnable{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("Bharat benz lorry moving"+i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
			}
		}
	}
}
class bus implements Runnable{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("volvo bus moving"+i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
			}
		}
	}
}
public class ThreadRunnable {
	public static void main(String [] args){
	     
		Thread loThread=new Thread(new lorry());
		Thread buThread=new Thread(new bus());
		System.out.println("good");
		loThread.start();
		buThread.start();
	}
}