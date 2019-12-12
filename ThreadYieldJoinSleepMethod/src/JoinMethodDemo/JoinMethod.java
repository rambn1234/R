package JoinMethodDemo;

public class JoinMethod extends Thread {
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(" Chield Thread ="+i);
		}
	}

}
