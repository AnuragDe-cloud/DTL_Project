import java.util.Scanner;
public class e {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    books[] b = new books[10];
		
		b[0] = new books();
		b[0].title = "Ikigai";
		b[0].edition = "3rd";
		b[0].price = 250.00f;
		
    b[1] = new books();
		b[1].title = "Think Like A Monk";
		b[1].edition = "2nd";
		b[1].price = 300.00f;
		
		b[2] = new books();
		b[2].title = "Subtle Art of Not Giving a F***";
		b[2].edition = "3rd";
		b[2].price = 200.50f;
		
		b[3] = new books();
		b[3].title = "DO EPIC SH*T";
		b[3].edition = "1st";
		b[3].price = 150.00f;
		
		b[4] = new books();
		b[4].title = "The Alchemist";
		b[4].edition = "3rd";
		b[4].price = 200.00f;
		
		b[5] = new books();
		b[5].title = "Atomic Habits";
		b[5].edition = "3rd";
		b[5].price = 250.00f;
		
		b[6] = new books();
		b[6].title = "The Silent Patient";
		b[6].edition = "4th";
		b[6].price = 200.00f;
		
		b[7] = new books();
		b[7].title = "Irodov";
		b[7].edition = "3rd";
		b[7].price = 450.00f;
		
		b[8] = new books();
		b[8].title = "The Secret Seven";
		b[8].edition = "5th";
		b[8].price = 500.00f;
		
		b[9] = new books();
		b[9].title = "Goosebumps";
		b[9].edition = "Latest";
		b[9].price = 350.00f;
		
		while(true) {
		  System.out.println("ENTER A CHOICE : 1. ISSUE A BOOK    2. RETURN A BOOK    3.EXIT");
		  int choice = scan.nextInt();
		  switch(choice) {
		    case 1 :
		      b[0].issueBook(b);
		      System.out.println("Percentage of books borrowed = " + b[0].calcPercentage(books.count));
		      break;
		    case 2 :
		      b[0].returnBook(b);
		      System.out.println("Percentage of books borrowed = " + b[0].calcPercentage(books.count));
		      break;
		    case 3 :
		      return;
		  }
		}
  }
}

class books {
  String title;
  String edition;
  float price;
  boolean isBorrowed = false;
  static int count = 0;
  int num = -1;
  
  boolean issueBook(books b[]) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Which book do you want to issue?");
    displayBooks(b);
		num = scan.nextInt() - 1;
		if(num >= 0 && num < 10) {
    if(b[num].isBorrowed) {
      System.out.println("This book is already borrowed.");
      return false;
      }
      b[num].isBorrowed = true;
      System.out.println("Enjoy your book!");
      count++;
      return true;
      }
      else {
        System.out.println("Failed to enter a valid number!");
        return false; 
      }
  }
  
  boolean returnBook(books b[]) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Which book do you want to return?");
    displayBooks(b);
    num = scan.nextInt() - 1;
    if(num >= 0 && num < 10) {
    if(!b[num].isBorrowed) {
      System.out.println("This book is already present in library.");
      return false;
    }
    b[num].isBorrowed = false;
    System.out.println("Hope you enjoyed the book!");
    count--;
    return true;
    }
    else {
        System.out.println("Failed to enter a valid number!");
        return false;
    }
  }
  
  int calcPercentage(int count) {
    return (count*100)/10;
  }
  
  void displayBooks(books[] b) {
    for(int i = 0; i < 10; i++) {
		        System.out.println("Book " + (i + 1));
            System.out.println("Title: " + b[i].title);
            System.out.println("Edition: " + b[i].edition);
            System.out.println("Price: " + b[i].price);
            System.out.println();
		}
  }
}
