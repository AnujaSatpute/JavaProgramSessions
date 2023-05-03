package javaassignment;

import java.util.Scanner;

/*2)Create a class Account containing following methods -
insert () to insert account data
display () to display account information
deposit () to deposit amount
withdraw () to withdraw amount
check_balance() to check balance*/

public class AccountInfo {

	int id ,accnumber;
	String name ,address;
	int balance ;

	public void insert(int id, int accnumber ,String name ,String address, int balance)
	{
		this.id = id;
		this.accnumber = accnumber;
		this.name = name ;
		this.address = address;
		this.balance = balance ;
	}
	
	public void display() {
		System.out.println("Account info :");
		System.out.println("Account id :"+id + "\n"+"Account Number :"+accnumber+"\n"+"Account name :"+name
				+"\n"+"Account address "+address+"\n"+"Account amount :"+balance);
		
	}
	
	public void deposit(int deposite) {
		deposite = deposite + balance;
		System.out.println("After deposite balance is :"+deposite);
	}
	
	public void withdraw(int w) {
		w= balance - w;
		System.out.println("After Withdraw balance is :"+w);
	}
	
	public void check_balance(int balance) {
		if(balance > 500) {
			System.out.println("Valid balance ");
		}
		else {
			System.out.println("Invalid balance ... please add sufficient amount ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Account id :");
		 int id = sc.nextInt();
		 System.out.println("Account Number :");
		 int num = sc.nextInt();
		 System.out.println("Account Name :");
		 String name = sc.next();
		 System.out.println("Account Address :");
		 String address = sc.next();
		 System.out.println("Account balance :");
		 int balance = sc.nextInt();
		 
		 AccountInfo a1 = new AccountInfo();
		 a1.insert(id, num, name, address, balance);
		 a1.display();
		 
		 System.out.println("Amount Withdraw :");
		 int w = sc.nextInt();
		 a1.withdraw(w);
		 System.out.println("deposite amount :");
		 int d = sc.nextInt();
		 a1.deposit(d);
		 a1.check_balance(balance);
		 
		
		 
	}

}
