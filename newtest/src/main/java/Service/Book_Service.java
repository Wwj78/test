package Service;

import java.util.List;

import model.Book;

public interface Book_Service {
	public List<Book> select(String txt);
	
	public Book selectById(int id);


}
