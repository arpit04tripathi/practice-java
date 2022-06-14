package com.a04t.designpatterns.behavioral.behavioral_06_command;

public class WriteFileCommand implements Command {
	private FileSystemReceiver fileSystem;

	public WriteFileCommand(FileSystemReceiver fs) {
		this.fileSystem = fs;
	}

	@Override
	public void execute() {
		this.fileSystem.writeFile();
	}
}
