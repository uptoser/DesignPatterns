package me.ibeyond.prototype_pattern;

public class Singleton {
	private String msg;
	private static Singleton uniqueInstance;

	private Singleton() {
		msg = "success";
	}

	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

	public String getMsg() {
		return msg;
	}

}
