package cn.sxx.dp.command;

public class PlayCommand implements Command {

	private AudioPlayer receiver;
	
	public PlayCommand(AudioPlayer receiver) {
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		receiver.play();
	}

}
