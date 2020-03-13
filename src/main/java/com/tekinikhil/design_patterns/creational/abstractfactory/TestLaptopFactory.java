package com.tekinikhil.design_patterns.creational.abstractfactory;

public class TestLaptopFactory 
{
	public static void main(String[] args) 
	{
		System.out.println(LaptopFactory.buildLaptop(LaptopType.GENERAL));
		System.out.println(LaptopFactory.buildLaptop(LaptopType.GAMING));
		System.out.println(LaptopFactory.buildLaptop(LaptopType.WORKSTATION));
	}
}
