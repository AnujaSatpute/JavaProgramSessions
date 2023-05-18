package containment;

public class Author {
 int id;
 String name;
 
  public void setId(int id) {
	  this.id = id;
  }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

@Override
public String toString() {
	return "Author [id=" + id + ", name=" + name + "]";
}

}
