package com.tekinikhil.design_patterns.behavioural.memento;

public class JournalTestClient 
{
	public static void main(String args[])
	{
		Journal journal=new Journal(12345678,"Gang of four");
		journal.setBodyOfJournal("Creational - Behavioural - Structural");
		System.out.println(journal);
		JournalMemento memento=journal.generateMemento();
		journal.setBodyOfJournal("1.Creational - 2.Behavioural - 3.Structural");
		journal.setISBN(87654321);
		journal.setHeading("Gang4");
		System.out.println(journal);
		journal.regenerate(memento);
		System.out.println(journal);
	}
}