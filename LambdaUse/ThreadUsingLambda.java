package LambdaUse;

public class ThreadUsingLambda {

	public static void main(String[] args) {
		Runnable r=()->{
			for(int i=1;i<=10;i++)
			{
				System.out.println("Value of i = "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t=new Thread(r);
		t.setName("thread1");
		t.start();
		

	}

}
