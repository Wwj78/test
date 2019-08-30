package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.Impl.Book_Service_Impl;
import model.Book;

@Controller
public class Testcontroller {
	@Autowired 
	 Book_Service_Impl service;
	@Autowired
	Service.Impl.Type_Service_Impl tservice;
@RequestMapping("index")
public String index(String txt,ModelMap m)
{
	String where1 ="";
	if(txt!=null) {	where1="where book.name like '%"+txt+"%'";}
	m.put("list", service.select(where1));
	return "index";
}
@RequestMapping("add")
public String  add(ModelMap m) {
	m.put("sexs", Book.sexs);
	m.put("typelist", tservice.select());
	return "edit";
}

@RequestMapping("edit")
public String  edit(int id,ModelMap m) {
	m.put("info", service.selectById(id));
	return add(m);
}

@RequestMapping("insert")
public String  insert(Book b,ModelMap m) {
	service.insert(b);
	return index(null,m);
}
@RequestMapping("update")
public String  update(Book b,ModelMap m) {
	service.update(b);
	return index(null,m);
}
@RequestMapping("delete")
public String  delete(int id,ModelMap m) {
	service.delete(id);
	return index(null,m);
}

}
