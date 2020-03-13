package com.tekinikhil.design_patterns.creational.factory;

public class GoodsTrain extends Train
{
	GoodsTrain()
	{
		super(TrainType.GOODS);
		construct();
	}
	@Override
	protected void construct()
	{
		System.out.println("Building a Goods train");
	}
}
