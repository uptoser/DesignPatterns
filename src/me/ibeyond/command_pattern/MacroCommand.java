package me.ibeyond.command_pattern;

import java.util.ArrayList;

public class MacroCommand implements Command {
	ArrayList<Command> commandList;
	
	public MacroCommand(ArrayList<Command> commandList) {
		this.commandList = commandList;
	}

	@Override
	public void execute() {
		if(commandList.size()!=0){
			for(Command command:commandList)
				command.execute();
		}
	}

	@Override
	public void undo() {
		if(commandList.size()!=0){
			for(Command command:commandList)
				command.undo();
		}
	}

}
