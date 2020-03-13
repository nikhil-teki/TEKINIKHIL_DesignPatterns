package com.tekinikhil.design_patterns.creational.factory;

public class TrainFactory 
{
	public static Train buildTrain(TrainType type)
	{
		Train train=null;
		switch(type)
		{
		case PASSENGER:
			train=new PassengerTrain();
			break;
		case METRO:
			train=new MetroTrain();
			break;
		case GOODS:
			train=new GoodsTrain();
			break;
		default:break;
		}
		return train;
	}
}
