package com.tekinikhil.design_patterns.behavioural.command;

public class SwitchOnCommand implements Command
{
	SmartLight light;
	public SwitchOnCommand(SmartLight light)
	{
		super();
		this.light=light;
	}
	public void runCommand()
	{
		System.out.println("Light switching on......");
		light.switchOn();
	}
}