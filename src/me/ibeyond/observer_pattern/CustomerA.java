package me.ibeyond.observer_pattern;

import java.util.Observable;
import java.util.Observer;

public class CustomerA implements Observer {
	String customerName;
	Observable o1;
	Observable o2;

	CustomerA(Observable o1,Observable o2,String customerName) {
		this.o1 = o1;
		this.o2 = o2;
		this.customerName = customerName;
		o1.addObserver(this);
		o2.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof PhoneShop)
			System.out.println("尊敬的" + customerName + "客户：您关注的手机价格为"
					+ ((PhoneShop) o).getPrice());
		else if(o instanceof ComputerShop)
			System.out.println("尊敬的" + customerName + "客户：您关注的电脑价格为"
					+ ((ComputerShop) o).getPrice());
	}

}
