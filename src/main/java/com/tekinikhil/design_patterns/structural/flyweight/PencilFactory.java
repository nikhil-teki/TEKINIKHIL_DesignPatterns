package com.tekinikhil.design_patterns.structural.flyweight;

public class PencilFactory 
{
	public static Pencil getDarkPencil(String colour)
	{
		Pencil pencil=null;
		pencil=new DarkPencil();
		pencil.useColour(colour);
		return pencil;
	}
	public static Pencil getLightPencil(String colour)
	{
		Pencil pencil=null;
		pencil=new LightPencil();
		pencil.useColour(colour);
		return pencil;
	}
	public static Pencil getNormalPencil(String colour)
	{
		Pencil pencil=null;
		pencil=new NormalPencil();
		pencil.useColour(colour);
		return pencil;
	}
}
