package com.tekinikhil.design_patterns.creational.abstractfactory;

public class AsiaLaptopFactory 
{
	public static Laptop buildLaptop(LaptopType type)
	{
		Laptop laptop=null;
		switch(type)
		{
		case GENERAL:
			laptop=new GeneralLaptop(Location.ASIA);
			break;
		case GAMING:
			laptop=new GamingLaptop(Location.ASIA);
			break;
		case WORKSTATION:
			laptop=new WorkstationLaptop(Location.ASIA);
			break;
		default:break;
		}
		return laptop;
	}
}
