package java8features;

@FunctionalInterface
interface Printable{
	public void showMsg(String msg);
}

public class TestLambdaExpressionWithSinglePara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printable p1=(m)->{
			System.out.println("msg is :"+m);
		};
Printable p2=(String m)->System.out.println("msg: "+m);
	
	//if there is single para we can skip()
	Printable p3 =m->System.out.println("msg from printable :"+m);
	
	p1.showMsg("Welcome");
	p2.showMsg("hi");
	p3.showMsg("java");
	}
}
