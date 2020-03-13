package com.tekinikhil.design_patterns.creational.abstractfactory;

public abstract class Laptop 
{
	public Laptop(LaptopType type,Location location)
	{
		this.type=type;
		this.location=location;
	}
	protected abstract void construct();
	private LaptopType type=null;
	private Location location=null;
	public LaptopType getType()
	{
		return type;
	}
	public void setType(LaptopType type)
	{
		this.type=type;
	}
	@Override
	public String toString()
	{
		return "Type- "+type+" made in "+location;
	}
}
