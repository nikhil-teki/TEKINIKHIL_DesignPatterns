package com.tekinikhil.design_patterns.creational.abstractfactory;

public class WorkstationLaptop extends Laptop
{
	public WorkstationLaptop(Location location)
	{
		super(LaptopType.WORKSTATION,location);
		construct();
	}
	@Override
	protected void construct()
	{
		System.out.println("Building a workstation laptop");
	}
}
