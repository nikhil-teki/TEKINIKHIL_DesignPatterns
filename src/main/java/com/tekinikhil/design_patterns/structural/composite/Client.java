package com.tekinikhil.design_patterns.structural.composite;

public class Client 
{
	public static void main(String args[])
	{
		Students student=new StudentAccountComposite();
		student.addStudent(new ScholarshipAccount("170040857",0));
		student.addStudent(new NonScholarshipAccount("170040001",150000));
		student.addStudent(new NonScholarshipAccount("170040100",1500));
		student.addStudent(new ScholarshipAccount("170040954",10000));
		float totalDues=student.getDues();
		System.out.println("Total Dues to be paid by all students : "+totalDues);
		//StudentAccountInfo combined=student.getIndividualDues();
	}
}
