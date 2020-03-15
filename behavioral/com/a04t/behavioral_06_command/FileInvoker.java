package com.a04t.behavioral_06_command;

public class FileInvoker {
	public Command command;

	public FileInvoker(Command c) {
		this.command = c;
	}

	public void execute() {
		this.command.execute();
	}
}