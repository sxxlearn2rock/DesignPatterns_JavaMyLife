package cn.sxx.dp.command;

public class Keypad {
	private Command playCommand;
	private Command rewindCommand;
	private Command stopCommand;
	
	public void setPlayCommand(Command playCommand) {
		this.playCommand = playCommand;
	}
	public void setRewindCommand(Command rewindCommand) {
		this.rewindCommand = rewindCommand;
	}
	public void setStopCommand(Command stopCommand) {
		this.stopCommand = stopCommand;
	}
	
	void play(){
		playCommand.execute();
	}
	
	void rewind(){
		rewindCommand.execute();
	}
	
	void stop(){
		stopCommand.execute();
	}

}
