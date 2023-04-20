package examsession2;

import java.util.Scanner;

/*
 * 3.	Create class Box and calculate the volume of box 
volume=length x width x height

 */

public class volumeOfBox {
	
	void volume() {
		int l , w,h;
	    int volume;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter length, width, and height :");
	    l = sc.nextInt();
	    w= sc.nextInt();
	    h=sc.nextInt();
	    
	    volume = l*w*h;
	    System.out.println("Volume of box :"+volume);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		volumeOfBox b1 = new volumeOfBox();
		b1.volume();
	}

}
