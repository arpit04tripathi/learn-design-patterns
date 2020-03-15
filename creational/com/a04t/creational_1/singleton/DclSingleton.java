package com.a04t.creational_1.singleton;

public class DclSingleton {
	
	private static volatile DclSingleton instance;

	private DclSingleton() {
	}

	public static DclSingleton getInstance() {
		if (instance == null) {
			synchronized (DclSingleton.class) {
				if (instance == null)
					instance = new DclSingleton();
			}
		}
		return instance;
	}
}
