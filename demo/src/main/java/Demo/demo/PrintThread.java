package Demo.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *  @author   :   Jay
 *  @fileName :   Demo.demo.PrintThread.java
 *	@date	  :	  2015年4月28日
 */


@Component
@Scope("prototype")
public class PrintThread extends Thread{
	@Override
	public void run() {
		System.out.println(getName() + " 运行.");
	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(getName() + " 再次运行."); 
	}
}
