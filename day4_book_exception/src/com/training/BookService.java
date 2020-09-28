package com.training;

import java.util.NoSuchElementException;

public class BookService {	
	Book[] bookArray= new Book[100];
	public void getOne(	String bookName) throws NoSuchElementException
	{	
		if(bookName.equals("abc"))
		{	
			throw new NoSuchElementException("No book record found");
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
