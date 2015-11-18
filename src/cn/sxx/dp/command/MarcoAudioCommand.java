package cn.sxx.dp.command;

import java.util.ArrayList;
import java.util.List;

public class MarcoAudioCommand implements MacroCommand{

	private List<Command> commandList = new ArrayList<Command>();
	
	@Override
	public void execute() {
		for (Command command : commandList) {
			command.execute();
		}
	}

	@Override
	public void add(Command command) {
		commandList.add(command);
	}

	@Override
	public void remove(Command command) {
		commandList.remove(command);
	}

}
