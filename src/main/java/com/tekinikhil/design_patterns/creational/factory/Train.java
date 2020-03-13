package com.tekinikhil.design_patterns.creational.factory;

public abstract class Train 
{
	public Train(TrainType type)
	{
		this.type=type;
	}
	protected abstract void construct();
	private TrainType type=null;
	public TrainType getType()
	{
		return type;
	}
	public void setType(TrainType type)
	{
		this.type=type;
	}
}
