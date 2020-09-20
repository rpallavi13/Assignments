package com.training;

import java.util.NoSuchElementException;

import com.training.exception.MyCustomException;
import com.training.exception.RangeCheckException;

public class Application {
	public void printArray(Book[] array, int index)
	{
		for(int i=0;i<index;i++)
		{
			System.out.println(array[i].getBookId()+" "+array[i].getAuthor()+" "+array[i].getBookName()+" "+array[i].getPrice());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			Book book1=new Book(11,"Paula Morris","Ruined",600.00);
			book1.setPrice(400);
			book1.setBookName(null);
			BookService bookService=new BookService();
			bookService.add(book1,1);
			bookService.getOne("abc");
			Book[] array=new Book[100];
			array=bookService.getAll();
			Application application=new Application();
			application.printArray(array,1);
			
		}
		catch(RangeCheckException e)
		{
			System.out.println("exception ");
		}
		catch(MyCustomException e)
		{
			System.out.println(e);
		}
		catch(NoSuchElementException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("There were errors in the code");
		}
		
		

	}

}
