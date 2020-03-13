package com.tekinikhil.design_patterns.structural.composite;

public class ScholarshipAccount extends Students
{
	private String idNumber;
	private float dues;
	private StudentAccountInfo current;
	public ScholarshipAccount(String idNumber,float dues)
	{
		super();
		this.idNumber=idNumber;
		this.dues=dues;
	}
	public String getIdNumber()
	{
		return idNumber;
	}
	public float getDues()
	{
		return dues;
	}
	public StudentAccountInfo getIndividualDues()
	{
		return current;
	}
}
