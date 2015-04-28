package Demo.demo;

/**
 * @author : Jay
 * @fileName : Demo.demo.PrintTask.java
 * @date : 2015年4月28日
 */
public class PrintTask implements Runnable {

	String name;

	public PrintTask(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println(name + " is running.");
		
		System.out.println("处理业务逻辑");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " is running again.");
	}

}
