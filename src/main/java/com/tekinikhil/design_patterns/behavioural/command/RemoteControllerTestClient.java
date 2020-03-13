package com.tekinikhil.design_patterns.behavioural.command;

public class RemoteControllerTestClient 
{
	public static void main(String args[])
	{
		SmartLight light1=new SmartLight();
		SmartLight light2=new SmartLight();
		RemoteController remote=new RemoteController();
		remote.invokeCommand(new SwitchOnCommand(light1));
		remote.pressTheButton();
		remote.invokeCommand(new SwitchOnCommand(light2));
		remote.pressTheButton();
		remote.invokeCommand(new SwitchOffCommand(light2));
		remote.pressTheButton();
		remote.invokeCommand(new SwitchOffCommand(light1));
		remote.pressTheButton();
	}
}