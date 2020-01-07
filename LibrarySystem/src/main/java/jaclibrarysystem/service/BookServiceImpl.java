package jaclibrarysystem.service;

import java.util.ArrayList;
import java.util.List;

import jaclibrarysystem.model.Book;

import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{

	public List<Book> getComputerBooks(){
		List<Book> arrBooks = new ArrayList<Book>();
		
		arrBooks.add(new Book("Title1", "Computer", "Author1", 123));
		arrBooks.add(new Book("Title2", "Computer", "Author2", 456));
		arrBooks.add(new Book("Title3", "Computer", "Author3", 789));
		arrBooks.add(new Book("Title4", "Computer", "Author1", 012));
		arrBooks.add(new Book("Title5", "Computer", "Author2", 345));
		arrBooks.add(new Book("Title6", "Computer", "Author1", 678));
		
		return arrBooks;
	}
	
	public List<Book> getNovels(){
		List<Book> arrBooks = new ArrayList<Book>();
		
		arrBooks.add(new Book("Title501", "Novel", "Author357", 901));
		arrBooks.add(new Book("Title502", "Novel", "Author159", 234));
		arrBooks.add(new Book("Title503", "Novel", "Author258", 567));
		arrBooks.add(new Book("Title504", "Novel", "Author852", 890));
		arrBooks.add(new Book("Title505", "Novel", "Author753", 101));
		arrBooks.add(new Book("Title506", "Novel", "Author951", 202));
		
		return arrBooks;
	}
}