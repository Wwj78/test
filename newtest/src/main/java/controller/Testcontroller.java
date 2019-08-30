package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.Book_Service;
import Service.Impl.Book_Service_Impl;

@Controller
public class Testcontroller {
	@Autowired 
	 Book_Service_Impl service;
@RequestMapping("index")
public void index(String txt,ModelMap m)
{
	String where1 ="";
	if(txt!=null) {	where1="where book.name like '%"+txt+"%'";}
	m.put("list", service.select(where1));
 
}

}
