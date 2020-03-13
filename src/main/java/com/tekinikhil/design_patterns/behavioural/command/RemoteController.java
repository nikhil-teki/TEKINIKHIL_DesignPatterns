package com.tekinikhil.design_patterns.behavioural.command;

public class RemoteController 
{
	Command command;
	public void invokeCommand(Command command)
	{
		this.command=command;
	}
	public void pressTheButton()
	{
		command.runCommand();
	}
}