package com.practise.multithreading;

class T {
	public Number getObject() {
		System.out.println("parent class");
		return 1;
	}
	public int add(int i, int j) {
		//System.out.println("parent class");
		return i+j;
	}

}

class T1 extends T {
	@Override
	public Integer getObject() {
		System.out.println("subclass class");
		return 1;
	}
	
	public int add(int i, int j,long k) {
		//System.out.println("subclass class");
		return i+j;
	}
}

public class Test {
	public static void main(String[] args) {
		T t = new T1();
		t.add(1, 1);
		//t.getObject();

	}
}