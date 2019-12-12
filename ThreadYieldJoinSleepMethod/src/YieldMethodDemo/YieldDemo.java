package YieldMethodDemo;

public class YieldDemo extends Thread {
	
	public void run()
	{
		Thread.currentThread().setPriority(10);

		
		for(int i=1;i<=10;i++)
		{
			Thread.yield();
			System.out.println("yes done="+i);
		}
	}

}
