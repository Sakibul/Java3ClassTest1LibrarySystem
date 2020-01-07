package jaclibrarysystem.service;

import java.util.List;

import jaclibrarysystem.model.Book;

public interface BookService {
	public List<Book> getComputerBooks();
	public List<Book> getNovels();
}