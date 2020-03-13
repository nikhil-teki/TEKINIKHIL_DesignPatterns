package com.tekinikhil.design_patterns.structural.flyweight;

public class NormalPencil implements Pencil
{
	final Line line=Line.NORMAL;
	private String colour=null;
	public void useColour(String colour)
	{
		this.colour=colour;
	}
	@Override
	public void write(String info)
	{
		System.out.println("Writing Normal with "+colour+" colour pencil");
		System.out.println("The Info is : "+info);
	}
}