package threadsDemo;

class MyThread extends Thread
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
public class SingleThread {
	public static void main(String[] args) {
		MyThread job = new MyThread();
		Thread t1 = new Thread(job);
		t1.setName("Alpha");
		t1.start();
		
		
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