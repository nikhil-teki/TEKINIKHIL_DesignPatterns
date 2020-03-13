package com.tekinikhil.design_patterns.behavioural.command;

public class SwitchOffCommand implements Command
{
	SmartLight light;
	public SwitchOffCommand(SmartLight light)
	{
		super();
		this.light=light;
	}
	public void runCommand()
	{
		System.out.println("Light switching off.....");
		light.switchOff();
	}
}