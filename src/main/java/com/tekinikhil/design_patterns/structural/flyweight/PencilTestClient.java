package com.tekinikhil.design_patterns.structural.flyweight;

public class PencilTestClient 
{
	public static void main(String args[])
	{
		Pencil greenDarkPencil_1=PencilFactory.getDarkPencil("GREEN");
		greenDarkPencil_1.write("This is written using green colour DARK pencil");
		Pencil greenDarkPencil_2=PencilFactory.getDarkPencil("GREEN");
		greenDarkPencil_2.write("This is written using green colour DARK pencil");
		Pencil RedNormalPencil=PencilFactory.getNormalPencil("RED");
		RedNormalPencil.write("This is written using red colour NORMAL pencil");
		Pencil GreyLightPencil=PencilFactory.getLightPencil("GREY");
		GreyLightPencil.write("This is written using grey colour LIGHT pencil");
	}
}
