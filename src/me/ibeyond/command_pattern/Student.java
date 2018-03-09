package me.ibeyond.command_pattern;

public class Student {
	private String name;
	private boolean state;//true为已上交作业

	public Student(String name) {
		this.name = name;
		state = false;
	}

	public void handup() {
		if(!state){
			state = !state;
			System.out.println(name+"上交了作业");
		}
	}

	public void takeback() {
		if(state){
			state = !state;
			System.out.println(name+"取回了作业");
		}
	}
	
	public void printState(){
		System.out.println(name);
	}

	public void setState(boolean state) {
		this.state = state;
	}
	

}
