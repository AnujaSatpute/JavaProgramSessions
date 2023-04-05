package controlstatment;

import java.util.Scanner;

public class StateAndCapitals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the State :");
		String state = sc.nextLine();
		state = state.toLowerCase();
		state= state.toUpperCase();

		switch (state) {

		case "ANDHRA PRADESH":
			System.out.println("Amaravati");
			break;

		case "arunachal pradesh":
			System.out.println("Itanagar");
			break;
			
		case "assam":
			System.out.println("Dispur");
			break;

		case "bihar":
			System.out.println("Patna");
			break;
			
		case "chhattisgarh":
			System.out.println("Raipur");
			break;
			
		case "goa":
			System.out.println("Panaji");
			break;
			
		case "gujarat":
			System.out.println("Gandhinagar");
			break;
			
			
		case "haryana":
			System.out.println("Chandigarh");
			break;
			
		case "himachal pradesh":
			System.out.println("Shimla");
			break;
			
		case "jharkhand":
			System.out.println("Ranchi");
			break;
			
		case "karnataka" :
			System.out.println("Bangalore");
			break;
			
		case "kerala":
			System.out.println("Thiruvananthapuram");
			break;
			
		case "madhya pradesh":
			System.out.println("Bhopal");
			break;
			
		case "maharashtra":
			System.out.println("Mumbai");
			break;
			
		case "manipur":
			System.out.println("Imphal");
			break;
			
		case "meghalaya":
			System.out.println("Shillong");
			break;
			
		case "mizoram":
			System.out.println("Aizawl");
			break;
			
		case "nagaland":
			System.out.println("Kohima");
			break;
			
		case "odisha":
			System.out.println("Bhubaneshwar");
			break;
			
		case "punjab":
			System.out.println("Chandigarh");
			break;
			
		case "rajasthan":
			System.out.println("Jaipur");
			break;
			
		case "sikkim":
			System.out.println("Gangtok");
			break;
			
		case "tamil nadu":
			System.out.println("Chennai");
			break;
			
		case "telangana":
			System.out.println("Hyderabad");
			break;
			
		case "tripura":
			System.out.println("Agartala");
			break;
			
		case "uttarakhand":
			System.out.println("Dehradun");
			break;
			
		case "uttar pradesh":
			System.out.println("Lucknow");
			break;
			
		case "west bengal":
			System.out.println("Kolkata");
			break;
			
		default:
			System.out.println("Invalid ......");

		}

	}

}
