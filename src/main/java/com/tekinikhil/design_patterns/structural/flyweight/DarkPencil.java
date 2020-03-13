package com.tekinikhil.design_patterns.structural.flyweight;

public class DarkPencil implements Pencil
{
	final Line line=Line.DARK;
	private String colour=null;
	public void useColour(String colour)
	{
		this.colour=colour;
	}
	@Override
	public void write(String info)
	{
		System.out.println("Writing Dark with "+colour+" colour pencil");
		System.out.println("The Info is : "+info);
	}
}
