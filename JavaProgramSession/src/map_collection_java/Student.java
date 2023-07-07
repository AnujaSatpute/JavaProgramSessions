package map_collection_java;

public class Student {
	int id;	
    String name,dept;
    Student(int id,String name ,String dept)
    {
    	this.id=id;
    	this.name=name;
    	this.dept=dept;
    }
    public String toString()
    {
    	return id+" "+name+" "+dept;
    }
    public int hashCode()
    {
    	return id;
    }
    public boolean equals(Object o)
    {
    	Student s = (Student) o;
    	if(this.id == s.id)
    	{
    		//s.dept=this.dept;
    		return true;
    	}
    	else
    		return false;
    }

}
