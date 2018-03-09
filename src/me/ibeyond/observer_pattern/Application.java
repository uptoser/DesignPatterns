package me.ibeyond.observer_pattern;

/**
 * @author Share 2017.9.10
 */
public class Application {
	/*
	 * 观察者模式(依赖，发布-订阅)：Subject Observer ConcreteSubject ConcreteObserver 
	 * 内容：手机店和电脑店都有自己的商品和新闻，新闻有更新时会通知客户，客户可以订阅商品的消息 客户A喜欢看价格，客户B喜欢看等级
	 */
	public static void main(String[] args) {
		// 手机店
		PhoneShop phoneShop = new PhoneShop();
		phoneShop.setPhoneName("Iphone8");
		phoneShop.setPrice(8999);
		phoneShop.setLevel(5);
		// 电脑店
		ComputerShop computerShop = new ComputerShop();
		computerShop.setComputerName("Dell");
		computerShop.setPrice(4999);
		computerShop.setLevel(4);
		// 客户
		new CustomerA(phoneShop, computerShop, "夏天");
		new CustomerB(phoneShop, computerShop, "黄尚");
		// 消息
		computerShop.notifyObservers();
		phoneShop.getMsg();
		computerShop.setPrice(4499);
		computerShop.getMsg();

	}

}
