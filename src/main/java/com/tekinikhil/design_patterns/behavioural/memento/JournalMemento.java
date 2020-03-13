package com.tekinikhil.design_patterns.behavioural.memento;

public final class JournalMemento 
{
	private long ISBN;
	private String heading;
	private String bodyOfJournal;
	public JournalMemento(long ISBN,String heading,String bodyOfJournal)
	{
		super();
		this.ISBN=ISBN;
		this.heading=heading;
		this.bodyOfJournal=bodyOfJournal;
	}
	public long getISBN()
	{
		return ISBN;
	}
	public String getHeading()
	{
		return heading;
	}
	public String getBodyOfJournal()
	{
		return bodyOfJournal;
	}
}