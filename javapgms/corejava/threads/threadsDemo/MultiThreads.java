package threadsDemo;

class MyThread1 implements Runnable
{
	public void run()
	{
		displayEvenNums();
	}
	
	static void displayEvenNums()
	{
		try {
			for(int i=0;i<=20;i++)
			{
				if((i%2)==0)
				{
					Thread.sleep(2000);
					System.out.println("Even Num's: "+i+" "+Thread.currentThread().getName());
				}
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
public class MultiThreads {
	public static void main(String[] args) {
		MyThread1 job = new MyThread1();
		Thread t1 = new Thread(job);
		Thread t2 = new Thread(job);
		Thread t3 = new Thread(job);
		t1.setName("Alpha");
		t2.setName("Beta");
		t3.setName("Gamma");
		t1.start();
		t2.start();
		t3.start();
		
		
		for(int i=0;i<=20;i++)
		{
			if((i%2)==1)
			{
				try {
					Thread.sleep(2000);
				} catch (Exception e){
					e.printStackTrace();
				}
				System.out.println("Odd Num's: "+i+" "+Thread.currentThread().getName());
			}
		}
	}
}