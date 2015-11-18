package cn.sxx.dp.command;

public class RewindCommand implements Command{

	private AudioPlayer receiver;
	
	public RewindCommand(AudioPlayer receiver) {
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		receiver.rewind();
	}

}
