package com.tekinikhil.design_patterns.creational.abstractfactory;

public class LaptopFactory 
{
	private LaptopFactory() {}
	public static Laptop buildLaptop(LaptopType type)
	{
		Laptop laptop=null;
		Location location=Location.EUROPE;
		switch(location)
		{
		case ASIA:
			laptop=AsiaLaptopFactory.buildLaptop(type);
			break;
		case EUROPE:
			laptop=EuropeLaptopFactory.buildLaptop(type);
			break;
		default:
			laptop=DefaultLaptopFactory.buildLaptop(type);
			break;
		}
		return laptop;
	}
}
