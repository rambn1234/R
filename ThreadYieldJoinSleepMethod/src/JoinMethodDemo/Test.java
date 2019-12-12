package JoinMethodDemo;

public class Test {

public static void main(String[] args) throws InterruptedException {
	
	JoinMethod t=new JoinMethod();
	t.start();
	t.join();
	for(int i=0;i<=10;i++)
	{
		System.out.println("Main Method");
	}
	
}
}
