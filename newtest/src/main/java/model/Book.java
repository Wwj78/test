package model;

public class Book {
	public static String[]sexs= {"����","��","Ů"};
	public String getSexname() {
		return sexs[sex];
	}
	private String typename;
 private int id;
 private String name;
 private  int sex;
 private int typeid;
 
public String getTypename() {
	return typename;
}

public void setTypename(String typename) {
	this.typename = typename;
}

public Book() {
	super();
}

public Book(String name) {
	super();
	this.name = name;
}



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSex() {
	return sex;
}
public void setSex(int sex) {
	this.sex = sex;
}
public int getTypeid() {
	return typeid;
}
public void setTypeid(int typeid) {
	this.typeid = typeid;
}

 
}
