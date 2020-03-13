package com.tekinikhil.design_patterns.structural.composite;

public class StudentAccountComposite extends Students
{
	private float totalDues;
	private StudentAccountInfo Allstudents,individual;
	public float getDues()
	{
		totalDues=0;
		for (Students s:StudentList)
		{
			totalDues+=s.getDues();
		}
		return totalDues;
	}
	public StudentAccountInfo getIndividualDues()
	{
		for (Students s:StudentList)
		{
			individual=s.getIndividualDues();
			Allstudents.combine(individual);
		}
		return Allstudents;
	}
}
