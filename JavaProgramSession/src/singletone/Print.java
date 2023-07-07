package singletone;

public class Print {
    
	static Print p=null;
	private Print()
	{
		
	}
	public static Print getInstance() {
		if(p==null)
		{
			p=new Print();
		}
		return p;
	}
}
