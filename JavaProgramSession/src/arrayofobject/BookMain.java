package arrayofobject;

import java.util.Arrays;
import java.util.Scanner;

public class BookMain {
	Scanner sc = new Scanner(System.in);

	void addData(Book b[]) {
		b[0] = new Book(101, "The advanture", 200, 10);
		b[1] = new Book(102, "The Jungle book", 450, 30);
		b[2] = new Book(103, "Harry poter 1", 100, 5);
		b[3] = new Book(104, "Harry poter 2", 400, 10);
		b[4] = new Book(105, "Harry poter 3", 200, 50);
		b[5] = new Book(106, "Harry poter 4", 450, 60);
		b[6] = new Book(107, "Private life of an indian prince", 360, 10);
		b[7] = new Book(108, "Harry poter 5", 200, 10);
		b[8] = new Book(109, "Craft book", 50, 10);
		b[9] = new Book(110, "The thrill comedy", 300, 50);

	}

	void addNewData(Book b[]) {
		for (int i = 0; i < b.length; i++) {
			if (b[i] == null) {
				System.out.println("Enter Book id,name ,price and number of copy :");
				int id = sc.nextInt();
				sc.nextLine();
				String name = sc.nextLine();
				int price = sc.nextInt();
				int copynumber = sc.nextInt();

				Book b1 = new Book(id, name, price, copynumber);
				b[i] = b1;
				break;
			}
		}
		System.out.println(Arrays.toString(b));
	}
	void searchData(Book b[]) {
		System.out.println("Enter the id of book :");
		int id = sc.nextInt();
		for(Book bk: b) {
			if(bk != null) {
				if(bk.id == id) {
					System.out.println(bk);
				}
			}
		}
	}
	void update(Book b[]) {
		System.out.println("1. Price "+"\n"+" 2.Copy no");
		int ch=sc.nextInt();
		
		if(ch==1)
		{
			System.out.println(" enter the id :");
			int id= sc.nextInt();
			System.out.println("enter the new price: ");
			int pr=sc.nextInt();
			
			for(Book bk:b)
			{
				if(bk!=null)
				{
					if(bk.id==id)
					{
						bk.price=pr;
					}
				}
			}
		}
		else if(ch==2)
		{
			System.out.println("Enter the id :");
			int id = sc.nextInt();
			System.out.println("Enter the new copy number :");
			int copynumber = sc.nextInt();
			
			for(Book bk : b) {
				if(bk != null) {
					if(bk.id == id) {
						bk.copynumber = copynumber;
					}
				}
			}
		}

	}
void delete(Book b[]) {
	System.out.println("Enter id to be deleted :");
	int id = sc.nextInt();
	for(int i =0;i<b.length;i++) {
		if(b[i] != null) {
			if(b[i].id == id) {
				b[i] = null;
				break;
			}
		}
	}
}
	void display(Book b[]) {
		System.out.println(Arrays.toString(b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1[] = new Book[15];
		BookMain bk = new BookMain();
		bk.addData(b1);
		//bk.searchData(b1);
		bk.update(b1);
		bk.delete(b1);
		bk.display(b1);
		System.out.println("--------------------------------\n");
		//bk.addNewData(b1);
	}

}
