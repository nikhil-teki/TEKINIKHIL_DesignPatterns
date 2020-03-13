package com.tekinikhil.design_patterns.creational.factory;

public class MetroTrain extends Train
{
	MetroTrain()
	{
		super(TrainType.METRO);
		construct();
	}
	@Override
	protected void construct()
	{
		System.out.println("Building a Metro train");
	}
}
