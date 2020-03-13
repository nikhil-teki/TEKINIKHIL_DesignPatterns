package com.tekinikhil.design_patterns.creational.abstractfactory;

public class DefaultLaptopFactory 
{
	public static Laptop buildLaptop(LaptopType type)
	{
		Laptop laptop=null;
		switch(type)
		{
		case GENERAL:
			laptop=new GeneralLaptop(Location.DEFAULT);
			break;
		case GAMING:
			laptop=new GamingLaptop(Location.DEFAULT);
			break;
		case WORKSTATION:
			laptop=new WorkstationLaptop(Location.DEFAULT);
			break;
		default:break;
		}
		return laptop;
	}
}
