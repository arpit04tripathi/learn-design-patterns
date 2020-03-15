package com.a04t.creational_1_singleton;

public class LazyInitializedSingleton {
	private static LazyInitializedSingleton instance;

	private LazyInitializedSingleton() {}

	public static LazyInitializedSingleton getInstance() {
		if (instance == null)
			instance = new LazyInitializedSingleton();
		return instance;
	}
}
