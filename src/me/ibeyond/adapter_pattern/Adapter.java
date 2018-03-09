package me.ibeyond.adapter_pattern;

public class Adapter implements Target{
	Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public void connect() {
		adaptee.connect();
	}

}
