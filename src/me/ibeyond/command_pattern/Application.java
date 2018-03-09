package me.ibeyond.command_pattern;

import java.util.ArrayList;

/**
 * @author Share 2017.9.9
 */
public class Application {

	/*
	 * 命令模式(动作，事务)：Receiver Command ConcreteCommand Invoker 
	 * 内容：老师可以让学生上交作业（拿回作业）、可以查看谁交了作业、可以两者都有(批处理)
	 */
	public static void main(String[] args) {
		// 学生
		Student s1 = new Student("小红");
		Student s2 = new Student("小白");
		Student s3 = new Student("小黑");
		// 老师
		Teacher teacher = new Teacher();
		// 作业列表
		ArrayList<Student> studentList = new ArrayList<Student>();
		// 老师让学生上交作业（拿回作业）
		System.out.println("-----------老师让学生上交作业（拿回作业）------------");
		Command command1 = new OperateProject(s1, studentList);
		Command command2 = new OperateProject(s2, studentList);
		Command command3 = new OperateProject(s3, studentList);
		teacher.setCommand(command1);
		teacher.execute();
		teacher.undo();
		teacher.setCommand(command2);
		teacher.execute();
		teacher.setCommand(command3);
		teacher.execute();
		// 老师查看谁交了作业
		System.out.println("-----------老师查看谁交了作业------------");
		Command command4 = new PrintProject(studentList);
		teacher.setCommand(command4);
		teacher.execute();
		// 学生全部上交作业并查看作业列表
		System.out.println("-----------学生全部上交作业并查看作业列表------------");
		ArrayList<Command> commandList = new ArrayList<Command>();
		studentList = new ArrayList<Student>();
		s1.setState(false);
		s2.setState(false);
		s3.setState(false);
		command1 = new OperateProject(s1, studentList);
		command2 = new OperateProject(s2, studentList);
		command3 = new OperateProject(s3, studentList);
		command4 = new PrintProject(studentList);
		commandList.add(command1);
		commandList.add(command2);
		commandList.add(command3);
		commandList.add(command4);
		Command command5 = new MacroCommand(commandList);
		teacher.setCommand(command5);
		teacher.execute();
	}

}
