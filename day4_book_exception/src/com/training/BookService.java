package com.training;

import java.util.NoSuchElementException;

public class BookService {	
	Book[] bookArray= new Book[100];
	public void getOne(	String bookName) throws NoSuchElementException
	{	
		if(bookName==null)
		{
			throw new NoSuchElementException();
		}
	}
	public void add(Book book,int index)
	{
		bookArray[index-1]=book;
	}
	public Book[] getAll()
	{
		return bookArray;
	}
}
