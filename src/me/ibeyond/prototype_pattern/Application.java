package me.ibeyond.prototype_pattern;

/**
 * @author Share 2017.9.10
 */
public class Application {
	/*
	 * 单件模式
	 */
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		System.out.println(s.getMsg());
		
	}

}
