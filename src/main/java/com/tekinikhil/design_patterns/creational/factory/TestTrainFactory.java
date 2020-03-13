package com.tekinikhil.design_patterns.creational.factory;

public class TestTrainFactory 
{
	public static void main(String args[])
	{
		System.out.println(TrainFactory.buildTrain(TrainType.PASSENGER));
		System.out.println(TrainFactory.buildTrain(TrainType.METRO));
		System.out.println(TrainFactory.buildTrain(TrainType.GOODS));
	}
}
