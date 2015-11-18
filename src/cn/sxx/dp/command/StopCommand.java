package cn.sxx.dp.command;

public class StopCommand implements Command{

	private AudioPlayer receiver;
	
	public StopCommand(AudioPlayer receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.stop();
	}

}
