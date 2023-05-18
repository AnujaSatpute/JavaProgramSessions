package containment;

public class Book12 {
 int id;
 String name ;
 Author a;
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
public Author getA() {
	return a;
}
public void setA(Author a) {
	this.a = a;
}
@Override
public String toString() {
	return "Book12 [id=" + id + ", name=" + name + ", a=" + a + "]";
}

}
