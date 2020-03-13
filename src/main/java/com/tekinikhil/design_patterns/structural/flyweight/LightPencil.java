package com.tekinikhil.design_patterns.structural.flyweight;

public class LightPencil implements Pencil
{
	final Line line=Line.LIGHT;
	private String colour=null;
	public void useColour(String colour)
	{
		this.colour=colour;
	}
	@Override
	public void write(String info)
	{
		System.out.println("Writing Light with "+colour+" colour pencil");
		System.out.println("The Info is : "+info);
	}
}