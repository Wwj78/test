package Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Service.Book_Service;
import dao.Book_Dao;
import model.Book;
@Service
public class Book_Service_Impl implements Book_Service{
@Autowired
Book_Dao dao;
	public List<Book> select(String txt) {
		return dao.select(txt);
	}

	public Book selectById(int id) {
		return dao.selectById(id);
	}

	public void insert(Book b) {
		dao.insert(b);
	}

	public void update(Book b) {
		dao.update(b);
	}

	public void delete(int id) {
		dao.delete(id);
	}

}
