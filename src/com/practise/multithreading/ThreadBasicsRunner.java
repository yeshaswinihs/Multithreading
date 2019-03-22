package com.practise.multithreading;

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {
		System.out.print("\n Task1 kicked off ");
		// Task3
		// Task1
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start();

		System.out.print("\n Task2 kicked off");
		// Task3
		// Task2
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();

		// wait for task 1 complete
		task1.join();
		task2Thread.join();
		
		System.out.print("\n Task3 kicked off");

		// Task3
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\n Task3 Done");

		System.out.print("\n Main Done");
	}

}

class Task1 extends Thread {
	public void run() {
		System.out.println("\nTask1 started");
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\n Task1 Done");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("\nTask2 started");
		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\n Task2 Done");

	}

}
