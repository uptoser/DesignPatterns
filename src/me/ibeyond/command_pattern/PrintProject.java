package me.ibeyond.command_pattern;

import java.util.ArrayList;

public class PrintProject implements Command {
	
	ArrayList<Student> studentList;

	public PrintProject(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public void execute() {
		if(studentList.size()!=0){
			for(Student s : studentList)
				s.printState();
		}
	}

	@Override
	public void undo() {
		System.out.println("这里是撤销操作！！！");
	}

}
