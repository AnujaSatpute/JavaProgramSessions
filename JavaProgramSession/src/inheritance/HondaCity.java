package inheritance;

public class HondaCity extends Car {

	int milegae;

	public void setMilegae(int milegae) {
		this.milegae = milegae;
	}

	public int getMilegae() {
		return milegae;

	}
    public void airbags() {
    	System.out.println("Honda City has air bags for safty...");
    }
   public void display() {
	   System.out.println("Color: "+color+" Price :"+price);
   }
}
