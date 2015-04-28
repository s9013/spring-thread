package Demo.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author : Jay
 * @fileName : Demo.demo.PrintTask.java
 * @date : 2015年4月28日
 */
@Component  
@Scope("prototype")  
public class PrintTask2 implements Runnable {

	String name;

	public PrintTask2(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println(name + " is running.");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " is running again.");
	}

}
