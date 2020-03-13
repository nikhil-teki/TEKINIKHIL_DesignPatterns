package com.tekinikhil.design_patterns.behavioural.memento;

public class Journal 
{
	private long ISBN;
	private String heading;
	private String bodyOfJournal;
	public Journal(long ISBN,String heading)
	{
		super();
		this.ISBN=ISBN;
		this.heading=heading;
	}
	public void setBodyOfJournal(String bodyOfJournal)
	{
		this.bodyOfJournal=bodyOfJournal;
	}
	public void setISBN(long ISBN)
	{
		this.ISBN=ISBN;
	}
	public void setHeading(String heading)
	{
		this.heading=heading;
	}
	public JournalMemento generateMemento()
	{
		JournalMemento jm=new JournalMemento(ISBN,heading,bodyOfJournal);
		return jm;
	}
	public void regenerate(JournalMemento jm)
	{
		this.ISBN=jm.getISBN();
		this.heading=jm.getHeading();
		this.bodyOfJournal=jm.getBodyOfJournal();
	}
	@Override
    public String toString() 
	{
        return "Journal [ISBN = "+ISBN+", Heading="+heading+", Body="+bodyOfJournal+"]";
    }
}