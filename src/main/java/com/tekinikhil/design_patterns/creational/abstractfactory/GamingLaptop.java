package com.tekinikhil.design_patterns.creational.abstractfactory;

public class GamingLaptop extends Laptop
{
	public GamingLaptop(Location location)
	{
		super(LaptopType.GAMING,location);
		construct();
	}
	@Override
	protected void construct()
	{
		System.out.println("Building a gaming laptop");
	}
}
