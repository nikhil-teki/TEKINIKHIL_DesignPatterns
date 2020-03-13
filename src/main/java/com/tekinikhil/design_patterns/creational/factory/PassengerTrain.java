package com.tekinikhil.design_patterns.creational.factory;

public class PassengerTrain extends Train
{
	PassengerTrain()
	{
		super(TrainType.PASSENGER);
		construct();
	}
	@Override
	protected void construct()
	{
		System.out.println("Building a passenger train");
	}
}
