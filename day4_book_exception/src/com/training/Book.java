package com.training;

import com.training.exception.MyCustomException;
import com.training.exception.RangeCheckException;

public class Book {
 private int bookId;
 private String author;
 private String bookName;
 private double price;
 
 public Book(int bookId, String author, String bookName, double price)throws RangeCheckException {
		super();
		this.bookId = bookId;
		this.author = author;
		this.bookName = bookName;
		this.price = price;
	}
 
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName)throws MyCustomException {
	try {
			bookName.length();
		}
	catch(NullPointerException e)
	{
		throw new MyCustomException("- You have not entered a book name",e);
	}
}
public double getPrice() {
	return price;
}
public void setPrice(double price) throws RangeCheckException {
	try{
		this.price = price;
		if(price<=100 || price>=500)
		{
				throw new RangeCheckException("Price of the book is not between 100 and 500");
		}
	}
	catch(RangeCheckException e)
	{
		System.out.println("Price of the book is not between 100 and 500");
	}
	
}
}
