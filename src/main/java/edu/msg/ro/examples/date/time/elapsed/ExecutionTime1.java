package edu.msg.ro.examples.date.time.elapsed;

import java.util.concurrent.TimeUnit;
 
public class ExecutionTime1 {

	public static void main(String[] args) throws InterruptedException {
		// start
		long lStartTime = System.nanoTime();

		// task
		calculation();

		// end
		long lEndTime = System.nanoTime();

		// time elapsed
		long output = lEndTime - lStartTime;

		System.out.println("Elapsed time in milliseconds: " + output / 1000000);

	}

	private static void calculation() throws InterruptedException {
		// Sleep 2 seconds
		TimeUnit.SECONDS.sleep(2);
	}
}