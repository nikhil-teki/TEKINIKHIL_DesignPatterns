package com.tekinikhil.design_patterns.creational.abstractfactory;

public class EuropeLaptopFactory 
{
	public static Laptop buildLaptop(LaptopType type)
	{
		Laptop laptop=null;
		switch(type)
		{
		case GENERAL:
			laptop=new GeneralLaptop(Location.EUROPE);
			break;
		case GAMING:
			laptop=new GamingLaptop(Location.EUROPE);
			break;
		case WORKSTATION:
			laptop=new WorkstationLaptop(Location.EUROPE);
			break;
		default:break;
		}
		return laptop;
	}
}
