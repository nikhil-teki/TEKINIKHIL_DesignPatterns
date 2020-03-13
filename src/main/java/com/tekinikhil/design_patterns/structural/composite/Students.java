package com.tekinikhil.design_patterns.structural.composite;
import java.util.List;
import java.util.ArrayList;
public abstract class Students 
{
	StudentAccountInfo stuAcc;
	protected List<Students> StudentList=new ArrayList<>();
	public abstract float getDues();
	public abstract StudentAccountInfo getIndividualDues();
	public void addStudent(Students g)
	{
		StudentList.add(g);
	}
	public void removeStudent(Students g)
	{
		StudentList.remove(g);
	}
	public Students getStudent(int index)
	{
		return (Students)StudentList.get(index);
	}
}
