package com.practise.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {

	private int number;

	public Task(int number) {
		this.number = number;
	}

	public void run() {
		System.out.println("\nTask" + number + "started");
		for (int i = number * 100; i <= number * 100 + 99; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\n Task" + number + "Done");

	}
}

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		// ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(5);

		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));
		executorService.execute(new Task(7));



		/*
		 * System.out.print("\n Task3 kicked off");
		 * 
		 * // Task3 for (int i = 301; i <= 399; i++) { System.out.print(i + " "); }
		 * System.out.print("\n Task3 Done");
		 * 
		 * System.out.print("\n Main Done");
		 */

		executorService.shutdown();
	}

}
