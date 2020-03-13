package com.tekinikhil.design_patterns.creational.abstractfactory;

public class GeneralLaptop extends Laptop
{
	public GeneralLaptop(Location location)
	{
		super(LaptopType.GENERAL,location);
		construct();
	}
	@Override
	protected void construct()
	{
		System.out.println("Building a general laptop");
	}
}
