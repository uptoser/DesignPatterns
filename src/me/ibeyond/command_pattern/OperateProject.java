package me.ibeyond.command_pattern;

import java.util.ArrayList;

public class OperateProject implements Command {
	ArrayList<Student> studentList;
	private Student student;
	
	/**
	 * 
	 * @param student
	 * @param studentList
	 */
	public OperateProject(Student student, ArrayList<Student> studentList) {
		this.studentList = studentList;
		this.student = student;
	}

	@Override
	public void execute() {
		if(!studentList.contains(student)){
			studentList.add(student);
			student.handup();
		}
	}

	@Override
	public void undo() {
		if(studentList.contains(student)){
			studentList.remove(student);
			student.takeback();
		}
	}
	

}
