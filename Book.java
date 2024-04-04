package com.learningcore.day1session;

public class Book {
	private String book_title ;
	private double book_price;
	
	
	
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}

    public double getBook_price() {
		return book_price;
	}

    public void setBook_price(double book_price) {
		this.book_price = book_price;
	}
 
 public class Main {
	 public static Book createBooks(String title,Double price) {
	 	Book book = new Book();
	 	book.setBook_title(title);
	 	book.setBook_price(price);
	 	return book;
	 }
	
	 public static void showBooks(Book book) {

		  System.out.println("Book_title:"+ book.getBook_title() + "  and price:"+book.getBook_price());

	 	}

	 }
	
  public static void main(String[]args) {
	  String title = "Java Programming";
      double price = 350.00;
	  
	  Book book1 = createBooks(title,price) ;
	  
	  showBooks(book1);
	  
	  
		 	
	
}
private static void showBooks(Book book1) {
	// TODO Auto-generated method stub
	
}
private static Book createBooks(String title, double price) {
	// TODO Auto-generated method stub
	return null;
}
}

