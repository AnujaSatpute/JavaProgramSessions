package singletone;

public class ShapeFactor {

	public Shape getShape(String typeshape)
	{
		if(typeshape.equalsIgnoreCase("circle"))
		{
			return new Circle();
		}
		else if(typeshape.equalsIgnoreCase("rect"))
		{
			return new Rect();
		}
		else if(typeshape.equalsIgnoreCase("Square"))
		{
			return new Square();
		}
		return null;
	}
}
